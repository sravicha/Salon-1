import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Matthew Meyer
 */
public class Register {

    private int total; // Current total at register.
    final JTextArea receipt;
    final JTextArea sum;

    public Register() {
        total = 0;
        receipt = new JTextArea("Receipt");
        sum = new JTextArea("Total: ");
    }

    public void GUI() {
        JFrame frame = new JFrame("Register");
        JPanel services = new JPanel(new GridLayout(4,3));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.add(serviceButton("Haircut", 1000));
        services.setVisible(true);
        sum.setEditable(false);
        receipt.setEditable(false);
        frame.setLayout(new BorderLayout());
        frame.add(services, BorderLayout.WEST);
        frame.add(sum, BorderLayout.SOUTH);
        frame.add(receipt, BorderLayout.EAST);
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public JButton serviceButton(final String name, final int price) { // can change to icon later for lovely display
        JButton button = new JButton(name);
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        total += price;
                        String dollar = Integer.toString(total/100);
                        String cents = Integer.toString(total%100);
                        cents += (cents.length() == 2) ? "" : "0";
                        sum.setText("Total: $" + dollar + "." + cents);
                        receipt.setText(receipt.getText() + "\n" + name + "\t\t$" + dollar + "." + cents);
                    }
                });
        return button;
    }
}
