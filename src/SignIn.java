import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author Matthew Meyer
 */
public class SignIn {

    private JFrame signin;
    private static JTextArea employeeNumber;
    private JPanel numberPad;

    public SignIn () {
        signin = new JFrame();
        signin.setLayout(new BorderLayout());

        employeeNumber = new JTextArea("");
        employeeNumber.setEditable(false);

        numberPad = new JPanel();
        numberPad.setLayout(new GridLayout(4, 3));

        JButton erase = new JButton("<-");
        erase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String oldNum = employeeNumber.getText();
                if (oldNum.length() > 0)
                    employeeNumber.setText(oldNum.substring(0, oldNum.length()-1));
            }
        });

        JButton okay = new JButton("Enter");
        okay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArrayList<Employee> employee = DatabaseManager.LookupEmployee(Integer.parseInt(employeeNumber.getText()), "ID");
                if (employee.size() == 1) {
                    HomeGUI salon = new HomeGUI(JFrame.EXIT_ON_CLOSE, employee.get(0));
                    signin.dispose();
                }
                else {
                    final JFrame invalid = new JFrame();
                    final JTextArea textArea = new JTextArea("Invalid Employee Number");
                    JButton invalidButton = new JButton("Retry");
                    invalidButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            employeeNumber.setText("");
                            invalid.dispose();
                        }
                    });
                    invalid.add(textArea);
                    invalid.add(invalidButton);
                    invalid.pack();
                    invalid.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    invalid.setVisible(true);
                }
            }
        });

        numberPad.add(numberButton("1"));
        numberPad.add(numberButton("2"));
        numberPad.add(numberButton("3"));
        numberPad.add(numberButton("4"));
        numberPad.add(numberButton("5"));
        numberPad.add(numberButton("6"));
        numberPad.add(numberButton("7"));
        numberPad.add(numberButton("8"));
        numberPad.add(numberButton("9"));
        numberPad.add(erase);
        numberPad.add(numberButton("0"));
        numberPad.add(okay);

        signin.setLayout(new BorderLayout());
        signin.add(employeeNumber, BorderLayout.NORTH);
        signin.add(numberPad, BorderLayout.CENTER);

        signin.pack();
        signin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signin.setVisible(true);
    }

    private static JButton numberButton (final String num) {
        JButton button = new JButton(num);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String old = employeeNumber.getText();
                if (old.length() < 4)
                    employeeNumber.setText(old + num);
            }
        });
        return button;
    }
}
