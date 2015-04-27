import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class PeopleGUI
{
	public PeopleGUI ( /*String newPeopleType,*/ int newDefaultClose )
	{
//		peopleType = newPeopleType;
		defaultClose = newDefaultClose;

		// Window
			JFrame windowFrame = new JFrame ( );
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
		// ... ... Product Table
							String [ ] productColumnNames = { "Employee ID", "Name", "Manager?", "Phone Number", "Email", "Address" };
							String [ ] [ ] productTableData = 
								{ 
									// For product in Inventory, make a row in the table
									{ "Employee ID 1 Here", "Name 1 Here", "Manager? 1 Here", "Phone Number 1 Here", "Email 1 Here", "Address 1 Here" },
									{ "Employee ID 2 Here", "Name 2 Here", "Manager? 2 Here", "Phone Number 2 Here", "Email 2 Here", "Address 2 Here" }
								};
							JTable productTable = new JTable ( productTableData, productColumnNames );
		// ... ... ... Product Panel
						JPanel productPanel = new JPanel ( );
						productPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager productManager = new GridBagLayoutManager ( productPanel );
						productManager.addWithConstraints ( productTable.getTableHeader ( ), 0, 0, 6, 1, 0, 0 );
						productManager.addWithConstraints ( productTable, 0, 1, 6, 2, 0, 1 );
		// ... ... Footer
		// ... ... ... Footer Components
		// ... ... ... ... New Transaction Button
							JButton addEmployeeButton = new JButton ( "Add Employee" );
							addEmployeeButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// AddEmployeeGUI constructor call here
									}
								}
							);
		// ... ... ... ... Delete Transaction Button
							JButton removeEmployeeButton = new JButton ( "Remove Employee" );
							removeEmployeeButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// RemoveEmployeeGUI constructor call here
									}
								}
							);
		// ... ... ... ... Return Home Button
							JButton returnHomeButton = new JButton ( "Return Home" );
							returnHomeButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										@SuppressWarnings("unused")
										HomeGUI homeGUI = new HomeGUI ( JFrame.EXIT_ON_CLOSE );
										windowFrame.setVisible ( false );
									}
								}
							);
		// ... ... ... Footer Panel
							JPanel footerPanel = new JPanel ( );
							footerPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager footerManager = new GridBagLayoutManager ( footerPanel );
							footerManager.addWithConstraints ( addEmployeeButton, 2, 0, 3, 1, 1, 0 );
							footerManager.addWithConstraints ( removeEmployeeButton,10, 0, 3, 1, 1, 0 );
							footerManager.addWithConstraints ( returnHomeButton, 20, 0, 3, 1, 1, 0 );
		// ... Window Frame
		GridBagLayoutManager windowManager = new GridBagLayoutManager ( windowFrame );
		windowManager.addWithConstraints ( titlePanel, windowFrame, 0, 0, 24, 1, 0, 0 );
		windowManager.addWithConstraints ( productPanel, windowFrame, 0, 1, 24, 20, 0, 1 );
		windowManager.addWithConstraints ( footerPanel, windowFrame, 0, 22, 24, 1, 0, 0 );
		windowFrame.pack ( );
		windowFrame.setVisible ( true );
		windowFrame.setLocationRelativeTo ( null );
	}

//	public static String peopleType;
	public static int defaultClose;
}
