/**
 * @author Matthew Meyer
 */

import java.sql.*;
import java.util.ArrayList;

public class DatabaseManager {



    private final static String DatabaseDriver = "org.sqlite.JDBC";
    private final static String SalonDatabase  = "jdbc:sqlite:Salon.db";
    private final static String EmployeeTable  = "EMPLOYEE";
    private final static String InventoryTable = "INVENTORY";

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
                        " ITEM           VARCHAR(20)," +
                        " STOCK          INT)";
                stmt.executeUpdate(sql);
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
        // check for empty args
        if (attribute.equals("") && !field.equals("")) return null;
        if (!attribute.equals("") && field.equals("")) return null;
        // if both are empty, then select everything
        String selector = (field.equals("") && attribute.equals("")) ?
                "" : " WHERE " + field + "='" + attribute + "'";
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName(DatabaseDriver);
            c = DriverManager.getConnection(SalonDatabase);
            c.setAutoCommit(false);

            try {
                stmt = c.createStatement();
                String sql = "SELECT * FROM " + EmployeeTable + selector;
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    employees.add(new Employee(
                            rs.getInt("id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("address"),
                            rs.getString("city"),
                            rs.getString("state"),
                            rs.getString("phone"),
                            rs.getString("email"),
                            rs.getInt("salary"),
                            ((rs.getString("manager")).equals("true"))));

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
        return employees;
    }

    /**
     * Adds an employee to the database
     * @param worker employee to be added
     */
    public static void AddEmployee(Employee worker) {
        String values = worker.toString();
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName(DatabaseDriver);
            c = DriverManager.getConnection(SalonDatabase);
            c.setAutoCommit(false);
            try {
                stmt = c.createStatement();
                String sql = "INSERT INTO " + EmployeeTable +
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

    /**
     * Makes the employee die with respect to the company
     * @param burntToACrisp THROW HIM TO THE DOGS!
     */
    public static void FireEmployee(Employee burntToACrisp) {
        String ID = Integer.toString(burntToACrisp.getId());
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName(DatabaseDriver);
            c = DriverManager.getConnection(SalonDatabase);
            c.setAutoCommit(false);
            try {
                stmt = c.createStatement();
                String sql = "DELETE FROM " + EmployeeTable +
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

    /**
     * Need a raise? Need to change address? Look no further!
     * This employee is already in the table, but its attribute have been changed.
     * @param worker Employee that has been modified
     */
    public static void UpdateEmployee(Employee worker) {
        FireEmployee(worker);
        AddEmployee(worker);
    }
}
