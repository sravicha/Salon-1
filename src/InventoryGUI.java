import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class InventoryGUI
{
	public InventoryGUI ( int newDefaultClose )
	{
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
							String [ ] productColumnNames = { "Product Number", "Product Name", "Price", "Number In Stock", "Category", "Supplier" };
							String [ ] [ ] productTableData = 
								{ 
									// For product in Inventory, make a row in the table
									{ "Product Number 1 Here", "Product Name 1 Here", "Price 1 Here", "Number In Stock 1 Here", "Category 1 Here", "Supplier 1 Here" },
									{ "Product Number 2 Here", "Product Name 2 Here", "Price 2 Here", "Number In Stock 2 Here", "Category 2 Here", "Supplier 2 Here" }
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
							JButton newItemButton = new JButton ( "New Item" );
							newItemButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// NewItemGUI constructor call here
//										windowFrame.setVisible ( false );
									}
								}
							);
		// ... ... ... ... Delete Transaction Button
							JButton deleteItemButton = new JButton ( "Delete Item" );
							deleteItemButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										//DeleteItemGUI constructor call here
//										windowFrame.setVisible ( false );
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
						footerManager.addWithConstraints ( newItemButton, 2, 0, 3, 1, 1, 0 );
						footerManager.addWithConstraints ( deleteItemButton,10, 0, 3, 1, 1, 0 );
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

	public static int defaultClose;
}
