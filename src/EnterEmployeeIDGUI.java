import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;
import javax.xml.crypto.Data;

public class EnterEmployeeIDGUI
{
	@SuppressWarnings("unused")
	public EnterEmployeeIDGUI ( int newDefaultClose )
	{

		// Window
			final JFrame windowFrame = new JFrame ( );
			windowFrame.setDefaultCloseOperation ( newDefaultClose );
		// ... Window Components
		// ... ... Title
		// ... ... ... Title Text Area
						JTextArea titleTextArea = new JTextArea ( "Nests Salon System" );
						titleTextArea.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		// ... ... ... Title Panel
						JPanel titlePanel = new JPanel ( );
						titlePanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager titleManager = new GridBagLayoutManager ( titlePanel );
						titleManager.addWithConstraints ( titleTextArea, 0, 0, 6, 1, 0, 0 );
		// ... ... Form
		// ... ... ... Employee ID Line
		// ... ... ... ... Employee ID Label
							JLabel employee = new JLabel ( "Employee ID:                 " );
		// ... ... ... ... Employee ID Entry Field
							final JTextField fillEmployee = new JTextField ( 18 );
		// ... ... ... Form Panel
						JPanel formPanel = new JPanel ( );
						formPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager formManager = new GridBagLayoutManager ( formPanel );
						formManager.addWithConstraints ( employee, 0, 3, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillEmployee, 6, 3, 18, 1, 0, 0 );
		// ... ... Footer
		// ... ... ... Footer Components
		// ... ... ... ... Cancel Button
							JButton cancelButton = new JButton ( "Cancel" );
							cancelButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										CalendarGUI calendarGUI = new CalendarGUI ( JFrame.EXIT_ON_CLOSE, new Employee ( ) );
										windowFrame.setVisible ( false );
									}
								}
							);
		// ... ... ... ... View Schedule Button
							JButton viewScheduleButton = new JButton ( "View Schedule" );
							viewScheduleButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										ArrayList<Employee> employee = DatabaseManager.LookupEmployee(fillEmployee.getText(), "ID");
										if (employee.size() == 1) {
											EmployeeScheduleGUI employeeScheduleGUI = new EmployeeScheduleGUI ( JFrame.DISPOSE_ON_CLOSE, employee.get(0) );
										    windowFrame.setVisible ( false );
										}
										else {
											final JFrame invalid = new JFrame();
											final JTextArea textArea = new JTextArea("Invalid Employee Number");
											JButton invalidButton = new JButton("Retry");
											invalidButton.addActionListener(new ActionListener() {
												@Override
												public void actionPerformed(ActionEvent actionEvent) {
													fillEmployee.setText("");
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
								}
							);
		// ... ... ... Footer Panel
						JPanel footerPanel = new JPanel ( );
						footerPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager footerManager = new GridBagLayoutManager ( footerPanel );
						footerManager.addWithConstraints ( cancelButton, 2, 0, 3, 1, 1, 0 );
						footerManager.addWithConstraints ( viewScheduleButton,10, 0, 3, 1, 1, 0 );
		// ... Window Frame
				GridBagLayoutManager windowManager = new GridBagLayoutManager ( windowFrame );
				windowManager.addWithConstraints ( titlePanel, windowFrame, 0, 0, 24, 1, 0, 0 );
				windowManager.addWithConstraints ( formPanel, windowFrame, 0, 1, 24, 20, 0, 1 );
				windowManager.addWithConstraints ( footerPanel, windowFrame, 0, 22, 24, 1, 0, 0 );
				windowFrame.pack ( );
				windowFrame.setVisible ( true );
				windowFrame.setLocationRelativeTo ( null );
	}

	public static int employeeID;
}
