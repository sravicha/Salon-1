import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Matthew Meyer
 */
public class Installation {

    private static final int managerID = 1001;
    private static String managerFirst;
    private static String managerLast;
    private static String managerAddress;
    private static String managerCity;
    private static String managerState;
    private static String managerPhone;
    private static String managerEmail;
    private static int managerSalary;

    Installation() {
        final JFrame frame = new JFrame("Nests Salon System Installation");
        frame.setLayout(new BorderLayout());
        JTextArea welcome = new JTextArea(
                "Welcome to the NESTS Salon Management System!\n " +
                "We see it is your first time here!\n + " +
                "You will be the first Manager added to the system\n" +
                "and will have full access to everything. You will \n" +
                "be able to add your employees, manage your inventory,\n" +
                "and manage your finances. Your employees will be able\n" +
                "to set appointments and check customers out."
        );

        final JFrame bye = new JFrame("Nests Salon System Installed");
        bye.setLayout(new FlowLayout());
        JLabel leave = new JLabel("Thanks! Restart System to continue using.\n Your Employee Number is 1001");

        JLabel first   = new JLabel("First Name:");
        JLabel last    = new JLabel("Last Name: ");
        JLabel address = new JLabel("Address:   ");
        JLabel city    = new JLabel("City:      ");
        JLabel state   = new JLabel("State:     ");
        JLabel phone   = new JLabel("Phone:     ");
        JLabel email   = new JLabel("Email:     ");
        JLabel salary  = new JLabel("Salary:    ");

        final JTextField fillFirst   = new JTextField(20);
        final JTextField fillLast    = new JTextField(20);
        final JTextField fillAddress = new JTextField(20);
        final JTextField fillCity    = new JTextField(20);
        final JTextField fillState   = new JTextField(20);
        final JTextField fillPhone   = new JTextField(20);
        final JTextField fillEmail   = new JTextField(20);
        final JTextField fillSalary  = new JTextField(20);

        JButton confirm = new JButton("Done");
        confirm.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        managerFirst = fillFirst.getText();
                        managerLast = fillLast.getText();
                        managerAddress = fillAddress.getText();
                        managerCity = fillCity.getText();
                        managerState = fillState.getText();
                        managerPhone = fillPhone.getText();
                        managerEmail = fillEmail.getText();
                        managerSalary = Integer.parseInt(fillSalary.getText()) * 100;

                        Employee Manager = new Employee(managerID, managerFirst, managerLast, managerAddress,
                                managerCity, managerState, managerPhone, managerEmail, managerSalary, true);
                        DatabaseManager.Create();
                        DatabaseManager.AddEmployee(Manager);
                        frame.dispose();
                        bye.setVisible(true);
                    }
                }
        );

        JButton restart = new JButton("Restart");
        restart.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        SignIn s = new SignIn();
                        bye.dispose();
                    }
                }
        );

        frame.setSize(100, 800);
        welcome.setVisible(true);

        JPanel holder = new JPanel();
        holder.setLayout(new GridLayout(8,2));
        holder.setSize(100, 800);

        holder.add(first);
        holder.add(fillFirst);
        holder.add(last);
        holder.add(fillLast);
        holder.add(address);
        holder.add(fillAddress);
        holder.add(city);
        holder.add(fillCity);
        holder.add(state);
        holder.add(fillState);
        holder.add(phone);
        holder.add(fillPhone);
        holder.add(email);
        holder.add(fillEmail);
        holder.add(salary);
        holder.add(fillSalary);

        frame.add(welcome, BorderLayout.NORTH);
        frame.add(holder, BorderLayout.CENTER);
        frame.add(confirm, BorderLayout.SOUTH);

        bye.add(leave);
        bye.add(restart);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        bye.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bye.pack();
        bye.setVisible(false);
    }
}
