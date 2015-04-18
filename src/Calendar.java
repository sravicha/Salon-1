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
						{ " 8:00 AM" },	{ " 8:30 AM" },
						{ " 9:00 AM" },	{ " 9:30 AM" },
						{ "10:00 AM" },	{ "10:30 AM" },
						{ "11:00 AM" },	{ "11:30 AM" },
						{ "12:00 PM" },	{ "12:30 PM" },
						{ " 1:00 PM" },	{ " 1:30 PM" },
						{ " 2:00 PM" },	{ " 2:30 PM" },
						{ " 3:00 PM" },	{ " 3:30 PM" },
						{ " 4:00 PM" },	{ " 4:30 PM" },
						{ " 5:00 PM" },	{ " 5:30 PM" }
				};
		JTable timeTable = new JTable ( timeTableData, timeTableTitle);
		JPanel timePanel = new JPanel ( );
		timePanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		GridBagLayoutManager timeManager = new GridBagLayoutManager ( timePanel );
		timeManager.addWithConstraints ( timeTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
		timeManager.addWithConstraints ( timeTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... Day Tables
		JPanel sundayPanel    = day("Sunday");
		JPanel mondayPanel    = day("Monday");
		JPanel tuesdayPanel   = day("Tuesday");
		JPanel wednesdayPanel = day("Wednesday");
		JPanel thursdayPanel  = day("Thursday");
		JPanel fridayPanel    = day("Friday");
		JPanel saturdayPanel  = day("Saturday");

		// ... ... ... Week Panel
		JPanel weekPanel = new JPanel ( );
		weekPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
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
		JButton createAppointmentButton = functionButton("Create Appointment", buttonListener);
		// ... ... ... ... Create Employee Shift Button
		JButton createEmployeeShiftButton = functionButton("Create Employee Shift", buttonListener);
		// ... ... ... ... View Employee Schedule Button
		JButton viewEmployeeScheduleButton = functionButton ("View Employee Schedule", buttonListener);
		// ... ... ... ... Return Home Button
		JButton returnHomeButton = functionButton ("Return Home", buttonListener);

		// ... ... ... Footer Panel
		JPanel footerPanel = new JPanel ( );
		headerPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		GridBagLayoutManager footerManager = new GridBagLayoutManager ( footerPanel );
		footerManager.addWithConstraints ( createAppointmentButton, 0, 0, 1, 1, 0, 0 );
		footerManager.addWithConstraints ( createEmployeeShiftButton, 1, 0, 1, 1, 0, 0 );
		footerManager.addWithConstraints ( viewEmployeeScheduleButton, 2, 0, 1, 1, 0, 0 );
		footerManager.addWithConstraints(returnHomeButton, 3, 0, 1, 1, 0, 0);
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

	private static JPanel day(String dayOfWeek) {
		String [ ] TableTitle = { dayOfWeek };
		String [ ] [ ] TableData = emptyDay();
		JTable Table = new JTable ( TableData, TableTitle );
		JPanel Panel = new JPanel ( );
		Panel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		GridBagLayoutManager Manager = new GridBagLayoutManager ( Panel );
		Manager.addWithConstraints ( Table.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
		Manager.addWithConstraints ( Table, 0, 1, 1, 2, 0, 1 );
		return Panel;
	}

	private static String[][] emptyDay() {
		return new String[][]{
				{ " " }, { " " }, { " " }, { " " },	{ " " }, { " " },
				{ " " }, { " " }, { " " }, { " " }, { " " }, { " " },
				{ " " }, { " " }, { " " }, { " " },	{ " " }, { " " },
				{ " " }, { " " }};
	}

	private static JButton functionButton(String name, JButtonListener action) {
		JButton Button = new JButton ( name );
		Button.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		Button.addActionListener ( action );
		return Button;
	}

	public static int defaultClose;

}