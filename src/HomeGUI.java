import javax.swing.*;
import javax.swing.border.EtchedBorder;

import java.awt.event.*;

public class HomeGUI
{

	public HomeGUI ( int newDefaultClose, final Employee user )
	{
		// Window
			final JFrame windowFrame = new JFrame ( );
			windowFrame.setDefaultCloseOperation (newDefaultClose);
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
		// ... ... Options
		// ... ... ... Options Components
		// ... ... ... ... Calendar Button
							JButton calendarButton = new JButton ( "Calendar" );
							calendarButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										@SuppressWarnings("unused")
										CalendarGUI calendarGUI = new CalendarGUI ( JFrame.DISPOSE_ON_CLOSE, user );

									}
								}
							);
		// ... ... ... ... Register Button
							JButton registerButton = new JButton ( "Register" );
							registerButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										@SuppressWarnings("unused")
										RegisterGUI registerGUI = new RegisterGUI ( JFrame.DISPOSE_ON_CLOSE, user );

									}
								}
							);
		// ... ... ... ... Inventory Button
							JButton inventoryButton = new JButton ( "Inventory" );
							inventoryButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										@SuppressWarnings("unused")
										InventoryGUI inventoryGUI = new InventoryGUI ( JFrame.DISPOSE_ON_CLOSE, user );

									}
								}
							);
		// ... ... ... ... Financial Button
							JButton financialButton = new JButton ( "Financial" );
							financialButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// FinancialGUI constructor call here
//
									}
								}
							);
		// ... ... ... ... People Button
							JButton peopleButton = new JButton ( "People" );
							peopleButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										@SuppressWarnings("unused")
										PeopleGUI peopleGUI = new PeopleGUI ( JFrame.DISPOSE_ON_CLOSE, user );

									}
								}
							);
		// ... ... ... ... Sign Out Button
							JButton signOutButton = new JButton ( "Sign Out" );
							signOutButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										SignIn s = new SignIn();
										windowFrame.dispose();
									}
								}
							);
		// ... ... ... ... Exit Button
							JButton exitButton = new JButton ( "Exit" );
							exitButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										System.exit ( 0 );
									}
								}
							);
		// ... ... ... Options Panel
						JPanel optionsPanel = new JPanel ( );
						optionsPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager optionsManager = new GridBagLayoutManager ( optionsPanel );
						optionsManager.addWithConstraints ( calendarButton, 0, 0, 9, 3, 1, 1 );
						optionsManager.addWithConstraints ( registerButton, 0, 3, 9, 3, 1, 1 );
						optionsManager.addWithConstraints ( inventoryButton, 0, 6, 9, 3, 1, 1 );
						optionsManager.addWithConstraints ( financialButton, 0, 9, 9, 3, 1, 1 );
						optionsManager.addWithConstraints ( peopleButton, 0, 12, 9, 3, 1, 1 );
						optionsManager.addWithConstraints ( signOutButton, 0, 15, 9, 3, 1, 1 );
						optionsManager.addWithConstraints ( exitButton, 0, 18, 9, 3, 1, 1 );
		// ... Window Frame
				GridBagLayoutManager windowManager = new GridBagLayoutManager ( windowFrame );
				windowManager.addWithConstraints ( titlePanel, windowFrame, 0, 0, 24, 1, 0, 0 );
				windowManager.addWithConstraints ( optionsPanel, windowFrame, 0, 22, 24, 1, 1, 1 );
				windowFrame.pack ( );
				windowFrame.setVisible ( true );
				windowFrame.setLocationRelativeTo ( null );
	}

}