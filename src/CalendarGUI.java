import javax.swing.*;
import javax.swing.border.*;
import java.util.Date;
import java.util.Calendar;

public class CalendarGUI
{
	public CalendarGUI ( int newDefaultClose )
	{
		defaultClose = newDefaultClose;

		String [ ] daysAbbreviated = 
			{
				"Sun", 
				"Mon", 
				"Tue", 
				"Wed", 
				"Thu", 
				"Fri", 
				"Sat" 
			};
		String [ ] days = 
			{
				"Sunday", 
				"Monday", 
				"Tuesday", 
				"Wednesday", 
				"Thursday", 
				"Friday", 
				"Saturday" 
			};
		String [ ] monthsAbbreviated = 
			{ 
				"Jan", 
				"Feb", 
				"Mar", 
				"Apr", 
				"May", 
				"Jun", 
				"Jul", 
				"Aug", 
				"Sep", 
				"Oct", 
				"Nov", 
				"Dec" 
			};
		String [ ] months = 
			{ 
				"January", 
				"February", 
				"March", 
				"April", 
				"May", 
				"June", 
				"July", 
				"August", 
				"September", 
				"October", 
				"November", 
				"December" 
			};
		Calendar calendar = Calendar.getInstance ( );
		
		Date today = new Date ( );
		String todayString = today.toString ( );
		String [ ] todayArray = todayString.split ( " " );
		String todayDayAbbreviated = todayArray [ 0 ];
		String todayMonthAbbreviated = todayArray [ 1 ];
		String todayDate = todayArray [ 2 ];
//		String todayTime = todayArray [ 3 ];
//		String todayTimeZone = todayArray [ 4 ];
		String todayYear = todayArray [ 5 ];
		String todayDay = "";
		for ( int i = 0; i < 7; i++ ) 
		{
			if ( daysAbbreviated [ i ].equals ( todayDayAbbreviated ) ) 
			{
				todayDay = days [ i ];
			}
		}
		String todayMonth = "";
		for ( int i = 0; i < 12; i++ ) 
		{
			if ( monthsAbbreviated [ i ].equals ( todayMonthAbbreviated ) ) 
			{
				todayMonth = months [ i ];
			}
		}
//		String weekOfDay = new String ( );
//		if ( todayDay.equals ( "Sunday" ) )
//		{
//			weekOfDay = todayString;
//		}
//		else if ( todayDay.equals ( "Monday" ) ) 
//		{
//			weekOfDay = 
//		}

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
							JButton prevButton = buttonFunction ( "<- Prev", new JButtonListener ( ) );
		// ... ... ... ... "Week of Day Month Year" Text Area
							JTextArea weekOfTextArea = new JTextArea ( "Week of " + todayDate + " " + todayMonth + " " + todayYear );
							weekOfTextArea.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		// ... ... ... ... Next Button
							JButton nextButton = buttonFunction ( "Next ->", new JButtonListener ( ) );
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
							String [ ] timeTableColumnName = { "Time" };
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
							JTable timeTable = new JTable ( timeTableData, timeTableColumnName );
							JPanel timePanel = new JPanel ( );
							GridBagLayoutManager timeManager = new GridBagLayoutManager ( timePanel );
							timeManager.addWithConstraints ( timeTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
							timeManager.addWithConstraints ( timeTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... ... Days Table
							String [ ] daysTableColumnNames = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
							// This [ ] [ ] will eventually hold items of type Appointment, which is why it is separate from the String [ ] [ ] used for timeTable
							String [ ] [ ] daysTableData = 
								{ 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " }, 
									{ " ", " ", " ", " ", " ", " ", " " } 
								};
							JTable daysTable = new JTable ( daysTableData, daysTableColumnNames /*( todayDate, todayMonth, todayYear )*/ );
							JPanel daysPanel = new JPanel ( );
							GridBagLayoutManager daysManager = new GridBagLayoutManager ( daysPanel );
							daysManager.addWithConstraints ( daysTable.getTableHeader ( ), 0, 0, 1, 1, 0, 0 );
							daysManager.addWithConstraints ( daysTable, 0, 1, 1, 2, 0, 1 );
		// ... ... ... Week Panel
						JPanel weekPanel = new JPanel ( );
						weekPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager weekManager = new GridBagLayoutManager ( weekPanel );
						weekManager.addWithConstraints ( timePanel, 0, 0, 1, 1, 0, 0 );
						weekManager.addWithConstraints ( daysPanel, 1, 0, 1, 1, 0, 0 );
		// ... ... Footer
		// ... ... ... Footer Components
		// ... ... ... ... Create Appointment Button
							JButton createAppointmentButton = buttonFunction ( "Create Appointment", new JButtonListener ( ) );
		// ... ... ... ... Create Employee Shift Button
							JButton createEmployeeShiftButton = buttonFunction ( "Create Employee Shift", new JButtonListener ( ) );
		// ... ... ... ... View Employee Schedule Button
							JButton viewEmployeeScheduleButton = buttonFunction ( "View Employee Schedule", new JButtonListener ( ) );
		// ... ... ... ... Return Home Button
							JButton returnHomeButton = buttonFunction ( "Return Home", new JButtonListener ( ) );
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

//	private String [ ] daysTableColumnNames ( String date, String month, String year )
//	{
//		String [ ] daysTableColumnNames = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
//	}

	private JButton buttonFunction ( String name, JButtonListener buttonListener )
	{
		JButton button = new JButton ( name );
		button.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		button.addActionListener ( buttonListener );
		return button;
	}

	public static int defaultClose;
}
