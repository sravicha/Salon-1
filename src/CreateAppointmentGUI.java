import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.*;

public class CreateAppointmentGUI
{
	@SuppressWarnings("unused")
	public CreateAppointmentGUI ( int newDefaultClose, final Employee user )
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
								JLabel date = new JLabel ( "Date ( DD-MM-YYYY ) :  " );
		// ... ... ... ... ... Date Entry Fields
		// ... ... ... ... ... ... Day
									final JTextField fillDay = new JTextField ( 6 );
		// ... ... ... ... ... ... Month
									final JTextField fillMonth = new JTextField ( 6 );
		// ... ... ... ... ... ... Year
									final JTextField fillYear = new JTextField ( 6 );
		// ... ... ... ... Time Line
		// ... ... ... ... ... Time Label
								JLabel time = new JLabel ( "Time ( HH:MM AM/PM ) : " );
		// ... ... ... ... ... Time Entry Fields
		// ... ... ... ... ... ... Hour
									final JTextField fillHour = new JTextField ( 6 );
		// ... ... ... ... ... ... Minute
									final JTextField fillMinute = new JTextField ( 6 );
		// ... ... ... ... ... ... Am/PM\
									final JTextField fillAMPM = new JTextField ( 6 );
		// ... ... ... ... Customer Line
		// ... ... ... ... ... Customer Label
									JLabel customer = new JLabel ( "Customer :             " );
		// ... ... ... ... ... Customer Entry Field
								final JTextField fillCustomer = new JTextField ( 18 );
		// ... ... ... ... Stylist Line
		// ... ... ... ... ... Stylist Label
								JLabel stylist = new JLabel ( "Stylist :              " );
		// ... ... ... ... ... Stylist Entry Field
								final JTextField fillStylist = new JTextField ( 18 );
		// ... ... ... ... Service Line
		// ... ... ... ... ... Service Label
								JLabel service = new JLabel ( "Service :              " );
		// ... ... ... ... ... Service Entry Field
								final JTextField fillService = new JTextField ( 18 );
		// ... ... ... Form Panel
						JPanel formPanel = new JPanel ( );
						formPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager formManager = new GridBagLayoutManager ( formPanel );
						formManager.addWithConstraints ( date, 0, 0, 6, 1, 1, 0 );
						formManager.addWithConstraints ( fillDay, 6, 0, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillMonth, 12, 0, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillYear, 18, 0, 6, 1, 0, 0 );
						formManager.addWithConstraints ( time, 0, 1, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillHour, 6, 1, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillMinute, 12, 1, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillAMPM, 18, 1, 6, 1, 0, 0 );
						formManager.addWithConstraints ( customer, 0, 2, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillCustomer, 6, 2, 18, 1, 0, 0 );
						formManager.addWithConstraints ( stylist, 0, 3, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillStylist, 6, 3, 18, 1, 0, 0 );
						formManager.addWithConstraints ( service, 0, 4, 6, 1, 0, 0 );
						formManager.addWithConstraints ( fillService, 6, 4, 18, 1, 0, 0 );
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
										ArrayList<Appointment> appointments = DatabaseManager.AllAppointments();
										Appointment appt = new Appointment(appointments.size()+719%10000007,
												new Date(Integer.parseInt(fillYear.getText()), Integer.parseInt(fillMonth.getText()),
														Integer.parseInt(fillDay.getText()), Integer.parseInt(fillHour.getText()),
														Integer.parseInt(fillMinute.getText()),0),
												fillCustomer.getText(), fillStylist.getText(), fillService.getText());
										DatabaseManager.AddAppointment(appt);
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
				windowManager.addWithConstraints ( formPanel, windowFrame, 0, 1, 24, 5, 0, 1 );
				windowManager.addWithConstraints ( footerPanel, windowFrame, 0, 22, 24, 1, 0, 0 );
				windowFrame.pack ( );
				windowFrame.setVisible ( true );
				windowFrame.setLocationRelativeTo ( null );
	}

}
