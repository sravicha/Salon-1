/**
 * @author Matthew Meyer
 */

import java.sql.*;
import java.util.*;
import java.util.Date;

public class DatabaseManager {

    private final static String DatabaseDriver   = "org.sqlite.JDBC";
    private final static String SalonDatabase    = "jdbc:sqlite:Salon.db";
    private final static String EmployeeTable    = "EMPLOYEE";
    private final static String InventoryTable   = "INVENTORY";
    private final static String AppointmentTable = "APPOINTMENT";

    /**
     * The purpose of this function is to create the database and initialize the tables.
     * It should only be called once in the lifetime of the entire program during installation.
     */
    public static void Create() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName(DatabaseDriver);
            c = DriverManager.getConnection(SalonDatabase);
            try {
                stmt = c.createStatement();
                String sql = "CREATE TABLE " + EmployeeTable +
                        "(ID             INT PRIMARY KEY NOT NULL," +
                        " FIRST_NAME     VARCHAR(10)     NOT NULL," +
                        " LAST_NAME      VARCHAR(10)     NOT NULL," +
                        " ADDRESS        VARCHAR(50)," +
                        " CITY           VARCHAR(10)," +
                        " STATE          VARCHAR(2)," +
                        " PHONE          VARCHAR(10)," +
                        " EMAIL          VARCHAR(20)," +
                        " SALARY         INT," +
                        " MANAGER        VARCHAR(5))";
                stmt.executeUpdate(sql);
                sql = "CREATE TABLE " + InventoryTable +
                        "(ID             INT PRIMARY KEY NOT NULL," +
                        " ITEM_NAME      VARCHAR(20)," +
                        " PRICE          INT," +
                        " STOCK          INT," +
                        " CATEGORY       VARCHAR (20)," +
                        " SUPPLIER       VARCHAR (20))";
                stmt.executeUpdate(sql);
                sql = "CREATE TABLE " + AppointmentTable +
                        "(ID             INT PRIMARY KEY NOT NULL," +
                        " APPT_DATE      VARCHAR (30)," +
                        " CLIENT         VARCHAR (20)," +
                        " EMPLOYEE       VARCHAR (20)," +
                        " SERVICE        VARCHAR (20))";
                stmt.executeUpdate(sql);

                ///// CREATE TABLE FOR CUSTOMER

                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //// EMPLOYEE ////
    /**
     * Find all the employees in the database
     * @return ArrayList of all employees
     */
    public static ArrayList<Employee> AllEmployees() {
        return LookupEmployee("","");
    }
    /**
     * Get employee info from database
     * @param attribute attribute of employee(s) that we are looking for; can be int or string
     * @param field column of database to find attribute
     * @return Arraylist of all employees who have the specified attribute of the specified field
     */
    public static ArrayList<Employee> LookupEmployee(int attribute, String field) {
        return LookupEmployee(Integer.toString(attribute), field);
    }
    public static ArrayList<Employee> LookupEmployee(String attribute, String field) {
        return Get(attribute, field, EmployeeTable, new Employee());
    }

    /**
     * Adds an employee to the database
     * @param worker employee to be added
     */
    public static void AddEmployee(Employee worker) {
        Add(worker.toString(), EmployeeTable);
    }

    /**
     * Makes the employee die with respect to the company
     * @param burntToACrisp THROW HIM TO THE DOGS!
     */
    public static void FireEmployee(Employee burntToACrisp) {
       Delete(burntToACrisp, EmployeeTable);
    }

    /**
     * Need a raise? Need to change address? Look no further!
     * This employee is already in the table, but its attribute have been changed.
     * @param worker Employee that has been modified
     */
    public static void UpdateEmployee(Employee worker) {
        FireEmployee(worker);
        AddEmployee(worker);
    }

    // INVENTORY //
    public static ArrayList<Inventory> AllInventory() {
        return LookupInventory("","");
    }
    public static ArrayList<Inventory> LookupInventory(int attr, String field) {
        return LookupInventory(Integer.toString(attr), field);
    }
    public static ArrayList<Inventory> LookupInventory(String attribute, String field) {
       return Get(attribute, field, InventoryTable, new Inventory());
    }

    public static void AddInventory(Inventory product) {
        Add(product.toDBString(), InventoryTable);
    }

    public static void RemoveInventory(Inventory item) {
        Delete(item, InventoryTable);
    }

    public static void UpdateInventory(Inventory item) {
        RemoveInventory(item);
        AddInventory(item);
    }

    // APPOINTMENT //
    public static ArrayList<Appointment> AllAppointments() {
        return LookupAppointment("","");
    }

    public static ArrayList<Appointment> LookupAppointment(Date date, String field) {
        return LookupAppointment(date.toString(), field);
    }

    public static ArrayList<Appointment> LookupAppointment(String attr, String field) {
        return Get(attr, field, AppointmentTable, new Appointment());
    }

    public static void AddAppointment(Appointment appt) {
        String apptString = Integer.toString(appt.getId()) + ", '" +
                appt.getDate().toString() + "', '" +
                appt.getClientName() + "', '" +
                appt.getStylistName() + "', '" +
                appt.getService() + "'";
        Add(apptString, AppointmentTable);
    }

    public static void RemoveAppointment (Appointment appt) {
        Delete(appt, AppointmentTable);
    }

    public static void UpdateAppointment (Appointment appt) {
        RemoveAppointment(appt);
        AddAppointment(appt);
    }

    private static void Add(String values, String table) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName(DatabaseDriver);
            c = DriverManager.getConnection(SalonDatabase);
            c.setAutoCommit(false);
            try {
                stmt = c.createStatement();
                String sql = "INSERT INTO " + table +
                        " VALUES (" + values + ");";
                stmt.executeUpdate(sql);
                stmt.close();
            } catch (SQLException E) {
                E.printStackTrace();
            }
            c.commit();
            c.close();
        } catch (ClassNotFoundException E) {
            E.printStackTrace();
        } catch (SQLException E) {
            E.printStackTrace();
        }
    }

    private static <T> ArrayList<T> Get(String attribute, String field, String table, T obj) {
        // check for empty args
        if (attribute.equals("") && !field.equals("")) return null;
        if (!attribute.equals("") && field.equals("")) return null;
        // if both are empty, then select everything
        String selector = (field.equals("") && attribute.equals("")) ?
                "" : " WHERE " + field + "='" + attribute + "'";
        ArrayList<T> tableItems = new ArrayList<T>();
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName(DatabaseDriver);
            c = DriverManager.getConnection(SalonDatabase);
            c.setAutoCommit(false);
            try {
                stmt = c.createStatement();
                String sql = "SELECT * FROM " + table + selector;
                ResultSet rs = stmt.executeQuery(sql);

                if (obj instanceof Employee) {
                    while (rs.next()) {
                        ((Employee) obj).setId(rs.getInt("id"));
                        ((Employee) obj).setFirstName(rs.getString("first_name"));
                        ((Employee) obj).setLastName(rs.getString("last_name"));
                        ((Employee) obj).setAddress(rs.getString("address"));
                        ((Employee) obj).setCity(rs.getString("city"));
                        ((Employee) obj).setState(rs.getString("state"));
                        ((Employee) obj).setPhone(rs.getString("phone"));
                        ((Employee) obj).setEmail(rs.getString("email"));
                        ((Employee) obj).setSalary(rs.getInt("salary"));
                        ((Employee) obj).setManager((rs.getString("manager")).equals("true"));
                        tableItems.add(obj);
                    }
                }
                else if (obj instanceof Inventory) {
                    while (rs.next()) {
                        ((Inventory) obj).setId(rs.getInt("id"));
                        ((Inventory) obj).setName(rs.getString("item"));
                        ((Inventory) obj).setStock(rs.getInt("stock"));
                        tableItems.add(obj);
                    }
                }
                rs.close();
                stmt.close();
            } catch (SQLException E) {
                E.printStackTrace();
            }
            c.close();
        } catch (SQLException E) {
            E.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tableItems;
    }

    private static <T> void Delete(T obj, String table) {
        String ID = "";
        if (obj instanceof Employee) {
            ID = Integer.toString(((Employee) obj).getId());
        }
        else if (obj instanceof Inventory) {
            ID = Integer.toString(((Inventory) obj).getId());
        }
        else if (obj instanceof Appointment) {
            ID = Integer.toString(((Appointment) obj).getId());
        }
        if (ID.isEmpty()) return;
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName(DatabaseDriver);
            c = DriverManager.getConnection(SalonDatabase);
            c.setAutoCommit(false);
            try {
                stmt = c.createStatement();
                String sql = "DELETE FROM " + table +
                        " WHERE ID=" + ID;
                stmt.executeUpdate(sql);
                stmt.close();
            } catch (SQLException E) {
                E.printStackTrace();
            }
            c.commit();
            c.close();
        } catch (ClassNotFoundException E) {
            E.printStackTrace();
        } catch (SQLException E) {
            E.printStackTrace();
        }
    }
}
