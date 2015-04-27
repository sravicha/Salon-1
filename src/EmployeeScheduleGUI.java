import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class EmployeeScheduleGUI
{
	public EmployeeScheduleGUI ( int newEmployeeID, int newDefaultClose )
	{
		employeeID = newEmployeeID;
		defaultClose = newDefaultClose;

		// Window
			final JFrame windowFrame = new JFrame ( );
			windowFrame.setDefaultCloseOperation ( defaultClose );
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
							prevButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// View previous week method here	
									}
								}
							);
		// ... ... ... ... "Week of Day Month Year" Text Area
							JTextArea weekOfTextArea = new JTextArea ( "Week of Day Month Year" /*+ todayDate + " " + todayMonth + " " + todayYear*/ );
							weekOfTextArea.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
		// ... ... ... ... Next Button
							JButton nextButton = new JButton ( "Next ->" );
							nextButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// View next week method here	
									}
								}
							);
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
							// This [ ] [ ] will eventually hold items of type EmployeeShift associated with employeeID, which is why it is separate from the String [ ] [ ] used for timeTable
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
						weekManager.addWithConstraints ( timePanel, 0, 0, 4, 1, 0, 0 );
						weekManager.addWithConstraints ( daysPanel, 1, 0, 4, 1, 1, 0 );
		// ... ... Footer
		// ... ... ... Footer Components
		// ... ... ... ... Create Employee Shift Button
							JButton createEmployeeShiftButton = new JButton ( "Create Employee Shift" );
							createEmployeeShiftButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										@SuppressWarnings("unused")
										CreateEmployeeShiftGUI createEmployeeShiftGUI = new CreateEmployeeShiftGUI ( JFrame.EXIT_ON_CLOSE );
									}
								}
							);
		// ... ... ... ... Remove Employee Shift Button
							JButton removeEmployeeShiftButton = new JButton ( "Remove Employee Shift" );
							removeEmployeeShiftButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// RemoveEmployeeShiftGUI constructor call here
//										windowFrame.setVisible ( false );
									}
								}
							);
		// ... ... ... ... Return Button
							JButton returnButton = new JButton ( "Return" );
							returnButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										@SuppressWarnings("unused")
										CalendarGUI calendarGUI = new CalendarGUI ( JFrame.EXIT_ON_CLOSE );
										windowFrame.setVisible ( false );
									}
								}
							);
		// ... ... ... Footer Panel
							JPanel footerPanel = new JPanel ( );
							footerPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager footerManager = new GridBagLayoutManager ( footerPanel );
							footerManager.addWithConstraints ( createEmployeeShiftButton, 0, 0, 1, 1, 0, 0 );
							footerManager.addWithConstraints ( removeEmployeeShiftButton, 1, 0, 1, 1, 0, 0 );
							footerManager.addWithConstraints ( returnButton, 3, 0, 1, 1, 0, 0 );
		// ... Window Frame
				GridBagLayoutManager windowManager = new GridBagLayoutManager ( windowFrame );
				windowManager.addWithConstraints ( titlePanel, windowFrame, 0, 0, 1, 1, 0, 0 );
				windowManager.addWithConstraints ( headerPanel, windowFrame, 0, 1, 1, 1, 0, 0 );
				windowManager.addWithConstraints ( weekPanel, windowFrame, 0, 2, 1, 1, 1, 1 );
				windowManager.addWithConstraints ( footerPanel, windowFrame, 0, 3, 1, 1, 0, 0 );
				windowFrame.pack ( );
				windowFrame.setVisible ( true );
				windowFrame.setLocationRelativeTo ( null );
	}

	private static int employeeID;
	private static int defaultClose;
}
