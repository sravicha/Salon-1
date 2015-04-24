import javax.swing.*;
import javax.swing.border.*;

public class Calendar
{
	public Calendar ( int newDefaultClose )
	{
		defaultClose = newDefaultClose;

		// Button Listener
		JButtonListener buttonListener = new JButtonListener ( );

		// Window
		// ... Window Components
		// ... ... Title
		// ... ... ... Title Components
		// ... ... ... ... Title Text Area
							JTextArea titleTextArea = new JTextArea ( "Nests Salon System" );
							titleTextArea.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		// ... ... ... Title Panel
							JPanel titlePanel = new JPanel ( );
							titlePanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager titleManager = new GridBagLayoutManager ( titlePanel );
							titleManager.addWithConstraints ( titleTextArea, 0, 0, 1, 1, 0, 0 );
		// ... ... Header
		// ... ... ... Header Components
		// ... ... ... ... Previous Button
							JButton prevButton = new JButton ( "<- Prev" );
							prevButton.addActionListener ( buttonListener );
							prevButton.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		// ... ... ... ... "Week of Day Month Year" Text Area
							JTextArea weekOfTextArea = new JTextArea ( "Week of Day Month Year" );
							weekOfTextArea.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		// ... ... ... ... Next Button
							JButton nextButton = new JButton ( "Next ->" );
							nextButton.addActionListener ( buttonListener );
							nextButton.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		// ... ... ... Header Panel
						JPanel headerPanel = new JPanel ( );
						headerPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager headerManager = new GridBagLayoutManager ( headerPanel );
						headerManager.addWithConstraints ( prevButton, 0, 0, 1, 1, 0, 0 );
						headerManager.addWithConstraints ( weekOfTextArea, 1, 0, 2, 1, 0, 0 );
						headerManager.addWithConstraints ( nextButton, 3, 0, 1, 1, 0, 0 );
		// ... ... Week
		// ... ... ... Week Components
		// ... ... ... ... Time Table
							String [ ] timeTableTitle = { "Time" };
							String [ ] [ ] timeTableData = 
								{ 
									{ " 8:00 AM" }, 
									{ " 8:30 AM" }, 
									{ " 9:00 AM" }, 
									{ " 9:30 AM" }, 
									{ "10:00 AM" }, 
									{ "10:30 AM" }, 
									{ "11:00 AM" }, 
									{ "11:30 AM" }, 
									{ "12:00 PM" }, 
									{ "12:30 PM" }, 
									{ " 1:00 PM" }, 
									{ " 1:30 PM" }, 
									{ " 2:00 PM" }, 
									{ " 2:30 PM" }, 
									{ " 3:00 PM" }, 
									{ " 3:30 PM" }, 
									{ " 4:00 PM" }, 
									{ " 4:30 PM" }, 
									{ " 5:00 PM" }, 
									{ " 5:30 PM" } 
								};
							JTable timeTable = new JTable ( timeTableData, timeTableTitle);
							JPanel timePanel = new JPanel ( );
							timePanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager timeManager = new GridBagLayoutManager ( timePanel );
							timeManager.addWithConstraints ( timeTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
							timeManager.addWithConstraints ( timeTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... Day Tables
		// ... ... ... ... Sunday Table
							String [ ] sundayTableTitle = { "Sunday" };
							String [ ] [ ] sundayTableData = 
								{ 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " } 
								};
							JTable sundayTable = new JTable ( sundayTableData, sundayTableTitle );
							JPanel sundayPanel = new JPanel ( );
							sundayPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager sundayManager = new GridBagLayoutManager ( sundayPanel );
							sundayManager.addWithConstraints ( sundayTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
							sundayManager.addWithConstraints ( sundayTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... ... Monday Table
							String [ ] mondayTableTitle = { "Monday" };
							String [ ] [ ] mondayTableData = 
								{ 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " } 
								};
							JTable mondayTable = new JTable ( mondayTableData, mondayTableTitle );
							JPanel mondayPanel = new JPanel ( );
							mondayPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager mondayManager = new GridBagLayoutManager ( mondayPanel );
							mondayManager.addWithConstraints ( mondayTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
							mondayManager.addWithConstraints ( mondayTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... ... Tuesday Table
							String [ ] tuesdayTableTitle = { "Tuesday" };
							String [ ] [ ] tuesdayTableData = 
								{ 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " } 
								};
							JTable tuesdayTable = new JTable ( tuesdayTableData, tuesdayTableTitle );
							JPanel tuesdayPanel = new JPanel ( );
							tuesdayPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager tuesdayManager = new GridBagLayoutManager ( tuesdayPanel );
							tuesdayManager.addWithConstraints ( tuesdayTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
							tuesdayManager.addWithConstraints ( tuesdayTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... ... Wednesday Table
							String [ ] wednesdayTableTitle = { "Wednesday" };
							String [ ] [ ] wednesdayTableData = 
								{ 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " } 
								};
							JTable wednesdayTable = new JTable ( wednesdayTableData, wednesdayTableTitle );
							JPanel wednesdayPanel = new JPanel ( );
							wednesdayPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager wednesdayManager = new GridBagLayoutManager ( wednesdayPanel );
							wednesdayManager.addWithConstraints ( wednesdayTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
							wednesdayManager.addWithConstraints ( wednesdayTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... ... Thursday Table
							String [ ] thursdayTableTitle = { "Thursday" };
							String [ ] [ ] thursdayTableData = 
								{ 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " } 
								};
							JTable thursdayTable = new JTable ( thursdayTableData, thursdayTableTitle );
							JPanel thursdayPanel = new JPanel ( );
							thursdayPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager thursdayManager = new GridBagLayoutManager ( thursdayPanel );
							thursdayManager.addWithConstraints ( thursdayTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
							thursdayManager.addWithConstraints ( thursdayTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... ... Friday Table
							String [ ] fridayTableTitle = { "Friday" };
							String [ ] [ ] fridayTableData = 
								{ 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " } 
								};
							JTable fridayTable = new JTable ( fridayTableData, fridayTableTitle );
							JPanel fridayPanel = new JPanel ( );
							fridayPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager fridayManager = new GridBagLayoutManager ( fridayPanel );
							fridayManager.addWithConstraints ( fridayTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
							fridayManager.addWithConstraints ( fridayTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... ... Saturday Table
							String [ ] saturdayTableTitle = { "Saturday" };
							String [ ] [ ] saturdayTableData = 
								{ 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " }, 
									{ " " } 
								};
							JTable saturdayTable = new JTable ( saturdayTableData, saturdayTableTitle );
							JPanel saturdayPanel = new JPanel ( );
							saturdayPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager saturdayManager = new GridBagLayoutManager ( saturdayPanel );
							saturdayManager.addWithConstraints ( saturdayTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
							saturdayManager.addWithConstraints ( saturdayTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... Week Panel
						JPanel weekPanel = new JPanel ( );
						weekPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager weekManager = new GridBagLayoutManager ( weekPanel );
						weekManager.addWithConstraints ( timePanel, 0, 0, 1, 1, 0, 0 );
						weekManager.addWithConstraints ( sundayPanel, 1, 0, 1, 1, 0, 0 );
						weekManager.addWithConstraints ( mondayPanel, 2, 0, 1, 1, 0, 0 );
						weekManager.addWithConstraints ( tuesdayPanel, 3, 0, 1, 1, 0, 0 );
						weekManager.addWithConstraints ( wednesdayPanel, 4, 0, 1, 1, 0, 0 );
						weekManager.addWithConstraints ( thursdayPanel, 5, 0, 1, 1, 0, 0 );
						weekManager.addWithConstraints ( fridayPanel, 6, 0, 1, 1, 0, 0 );
						weekManager.addWithConstraints ( saturdayPanel, 7, 0, 1, 1, 0, 0 );
		// ... ... Footer
		// ... ... ... Footer Components
		// ... ... ... ... Create Appointment Button
							JButton createAppointmentButton = new JButton ( "Create Appointment" );
							createAppointmentButton.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							createAppointmentButton.addActionListener ( buttonListener );
		// ... ... ... ... Create Employee Shift Button
							JButton createEmployeeShiftButton = new JButton ( "Create Employee Shift" );
							createEmployeeShiftButton.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							createEmployeeShiftButton.addActionListener ( buttonListener );
		// ... ... ... ... View Employee Schedule Button
							JButton viewEmployeeScheduleButton = new JButton ( "View Employee Schedule" );
							viewEmployeeScheduleButton.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							viewEmployeeScheduleButton.addActionListener ( buttonListener );
		// ... ... ... ... Return Home Button
							JButton returnHomeButton = new JButton ( "Return Home" );
							returnHomeButton.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							returnHomeButton.addActionListener ( buttonListener );
		// ... ... ... Footer Panel
							JPanel footerPanel = new JPanel ( );
							footerPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager footerManager = new GridBagLayoutManager ( footerPanel );
							footerManager.addWithConstraints ( createAppointmentButton, 0, 0, 1, 1, 0, 0 );
							footerManager.addWithConstraints ( createEmployeeShiftButton, 1, 0, 1, 1, 0, 0 );
							footerManager.addWithConstraints ( viewEmployeeScheduleButton, 2, 0, 1, 1, 0, 0 );
							footerManager.addWithConstraints ( returnHomeButton, 3, 0, 1, 1, 0, 0 );
		// ... Window Frame
				JFrame windowFrame = new JFrame ( );
				windowFrame.setDefaultCloseOperation ( defaultClose );
				GridBagLayoutManager windowManager = new GridBagLayoutManager ( windowFrame );
				windowManager.addWithConstraints ( titlePanel, windowFrame, 0, 0, 1, 1, 0, 0 );
				windowManager.addWithConstraints ( headerPanel, windowFrame, 0, 1, 1, 1, 0, 0 );
				windowManager.addWithConstraints ( weekPanel, windowFrame, 0, 2, 1, 1, 0, 1 );
				windowManager.addWithConstraints ( footerPanel, windowFrame, 0, 3, 1, 1, 0, 0 );
				windowFrame.pack ( );
				windowFrame.setVisible ( true );
				windowFrame.setLocationRelativeTo ( null );
	}
	public static int defaultClose;
}
