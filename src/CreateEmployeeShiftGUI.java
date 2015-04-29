import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class CreateEmployeeShiftGUI
{
	@SuppressWarnings("unused")
	public CreateEmployeeShiftGUI ( int newDefaultClose, final Employee user )
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
		// ... ... ... Form Components
		// ... ... ... ... Date Line
		// ... ... ... ... ... Date Label
								JLabel date = new JLabel ( "Date ( DD-MM-YYYY ) :        " );
		// ... ... ... ... ... Date Entry Fields
		// ... ... ... ... ... ... Day
									final JTextField fillDay = new JTextField ( 6 );
		// ... ... ... ... ... ... Month
									final JTextField fillMonth = new JTextField ( 6 );
		// ... ... ... ... ... ... Year
									final JTextField fillYear = new JTextField ( 6 );
		// ... ... ... ... Start Time Line
		// ... ... ... ... ... Start Time Label
								JLabel startTime = new JLabel ( "Start Time ( HH:MM AM/PM ) : " );
		// ... ... ... ... ... Start Time Entry Fields
		// ... ... ... ... ... ... Hour
									final JTextField fillStartHour = new JTextField ( 6 );
		// ... ... ... ... ... ... Minute
									final JTextField fillStartMinute = new JTextField ( 6 );
		// ... ... ... ... ... ... Am/PM\
									final JTextField fillStartAMPM = new JTextField ( 6 );
		// ... ... ... ... End Time Line
		// ... ... ... ... ... End Time Label
								JLabel endTime = new JLabel ( "End Time ( HH:MM AM/PM ) :   " );
		// ... ... ... ... ... Time Entry Fields
		// ... ... ... ... ... ... Hour
									final JTextField fillEndHour = new JTextField ( 6 );
		// ... ... ... ... ... ... Minute
									final JTextField fillEndMinute = new JTextField ( 6 );
		// ... ... ... ... ... ... Am/PM\
									final JTextField fillEndAMPM = new JTextField ( 6 );
		// ... ... ... ... Employee Line
		// ... ... ... ... ... Employee Label
								JLabel employee = new JLabel ( "Employee ID:                 " );
		// ... ... ... ... ... Employee Entry Field
								final JTextField fillEmployee = new JTextField ( 18 );
		// ... ... ... Form Panel
						JPanel formPanel = new JPanel ( );
						formPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager formManager = new GridBagLayoutManager ( formPanel );
						formManager.addWithConstraints ( date, 0, 0, 6, 1, 1, 0 );
						formManager.addWithConstraints ( fillDay, 6, 0, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillMonth, 12, 0, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillYear, 18, 0, 6, 1, 0, 0 );
						formManager.addWithConstraints ( startTime, 0, 1, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillStartHour, 6, 1, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillStartMinute, 12, 1, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillStartAMPM, 18, 1, 6, 1, 0, 0 );
						formManager.addWithConstraints ( endTime, 0, 2, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillEndHour, 6, 2, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillEndMinute, 12, 2, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillEndAMPM, 18, 2, 6, 1, 0, 0 );
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
										CalendarGUI calendarGUI = new CalendarGUI ( JFrame.EXIT_ON_CLOSE, user );
										windowFrame.setVisible ( false );
									}
								}
							);
		// ... ... ... ... Create Button
							JButton createButton = new JButton ( "Create" );
							createButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// addEmployeeShift method here
										// should add employee shift to database
										// should then call constructor for EmployeeScheduleGUI
//										windowFrame.setVisible ( false );
									}
								}
							);
		// ... ... ... Footer Panel
						JPanel footerPanel = new JPanel ( );
						footerPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager footerManager = new GridBagLayoutManager ( footerPanel );
						footerManager.addWithConstraints ( cancelButton, 2, 0, 3, 1, 1, 0 );
						footerManager.addWithConstraints ( createButton,10, 0, 3, 1, 1, 0 );
		// ... Window Frame
				GridBagLayoutManager windowManager = new GridBagLayoutManager ( windowFrame );
				windowManager.addWithConstraints ( titlePanel, windowFrame, 0, 0, 24, 1, 0, 0 );
				windowManager.addWithConstraints ( formPanel, windowFrame, 0, 1, 24, 20, 0, 1 );
				windowManager.addWithConstraints ( footerPanel, windowFrame, 0, 22, 24, 1, 0, 0 );
				windowFrame.pack ( );
				windowFrame.setVisible ( true );
				windowFrame.setLocationRelativeTo ( null );
	}

}
