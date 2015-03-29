import java.io.File;
import java.util.ArrayList;

/**
 * @author Matthew Meyer
 */
public class TestDatabaseManager {
    public static void main(String[] args) {
        File f = new File("Salon.db");
        if (!f.exists()) {
            DatabaseManager.Create();

            Employee E = new Employee(57, "matt", "meyer", "1234_ABC_St", "St_Louis", "MO", "3148675309", "mattchainsaw@gmail.com", 5000000, true);
            Employee e = new Employee(51, "emily", "hunt", "1234_ABC_St", "St_Louis", "MO", "6666666666", "M_LAY@gmail.com", 5, false);
            DatabaseManager.AddEmployee(E);
            DatabaseManager.AddEmployee(e);
            System.out.println(E.toString());
            System.out.println(e.toString());
        } else {
            ArrayList<Employee> list1 = DatabaseManager.LookupEmployee("matt", "first_name");
            ArrayList<Employee> list2 = DatabaseManager.LookupEmployee("MO", "state");
            ArrayList<Employee> list3 = DatabaseManager.LookupEmployee(5, "salary");
            ArrayList<Employee> list4 = DatabaseManager.AllEmployees();

            System.out.println("Employee(s) with the first name of Matt:");
            for (Employee em : list1)
                System.out.println(em.getFirstName());
            System.out.println("Employee(s) who live in MO:");
            for (Employee em : list2)
                System.out.println(em.getFirstName());
            System.out.println("Employee(s) who make 5 dollars a year:");
            for (Employee em : list3)
                System.out.println(em.getFirstName());
            System.out.println("All Employees:");
            for (Employee em : list4)
                System.out.println(em.getFirstName());
            System.out.println("All Employees after firing matt:");
            DatabaseManager.FireEmployee(list1.get(0));
            list4 = DatabaseManager.AllEmployees();
            for (Employee em : list4)
                System.out.println(em.toString());
            Employee winner = list4.get(0);
            winner.setSalary(5000000);
            DatabaseManager.UpdateEmployee(winner);
            System.out.println("The winner:");
            for (Employee em : list4)
                System.out.println(em.toString());
        }
    }
}
