import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class CreateEmployeeShiftGUI
{
	public CreateEmployeeShiftGUI ( int newDefaultClose )
	{
		defaultClose = newDefaultClose;

		// Window
			final JFrame windowFrame = new JFrame ( );
			windowFrame.setDefaultCloseOperation ( defaultClose );
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
		// ... ... ... ... ... Date Entry Fields
		// ... ... ... ... ... ... Day
		// ... ... ... ... ... ... Month
		// ... ... ... ... ... ... Year
		// ... ... ... ... Start Time Line
		// ... ... ... ... ... Start Time Label
		// ... ... ... ... ... Start Time Entry Fields
		// ... ... ... ... ... ... Start Hour
		// ... ... ... ... ... ... Start Minute
		// ... ... ... ... ... ... Start Am/PM
		// ... ... ... ... End Time Line
		// ... ... ... ... ... End Time Label
		// ... ... ... ... ... End Time Entry Fields
		// ... ... ... ... ... ... End Hour
		// ... ... ... ... ... ... End Minute
		// ... ... ... ... ... ... End Am/PM
		// ... ... ... ... Employee Line
		// ... ... ... ... ... Employee Label
		// ... ... ... ... ... Employee Entry Field
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
										@SuppressWarnings("unused")
										CalendarGUI calendarGUI = new CalendarGUI ( JFrame.EXIT_ON_CLOSE );
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
//				windowManager.addWithConstraints ( formPanel, windowFrame, 0, 1, 24, 20, 0, 1 );
				windowManager.addWithConstraints ( footerPanel, windowFrame, 0, 22, 24, 1, 0, 0 );
				windowFrame.pack ( );
				windowFrame.setVisible ( true );
				windowFrame.setLocationRelativeTo ( null );
	}

	public static int defaultClose;
}
