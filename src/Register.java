import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Register 
{
	public Register ( int newDefaultClose )
	{
		defaultClose = newDefaultClose;

		// Button Listener
		JButtonListener buttonListener = new JButtonListener ( );

		// Window
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
		// ... ... Inventory
		// ... ... ... Services
		// ... ... ... ... Haircut Button
							JButton haircutButton = buttonFunction("------Haircut------", new JButtonListener());
		// ... ... ... ... Style Button
							JButton styleButton = buttonFunction("-------Style-------", new JButtonListener());
		// ... ... ... ... Color Button
							JButton colorButton = buttonFunction("-------Color-------", new JButtonListener());
		// ... ... ... ... Perm Button
							JButton permButton = buttonFunction("--------Perm-------", new JButtonListener());
		// ... ... ... ... Shampoo Button
							JButton shampooButton = buttonFunction("------Shampoo------", new JButtonListener());
		// ... ... ... ... Condition Button
							JButton conditionButton = buttonFunction("-----Condition-----", new JButtonListener());
		// ... ... ... ... Deep Condition Button
							JButton deepConditionButton = buttonFunction("--Deep Condition--", new JButtonListener());
		// ... ... ... ... Other Services Button
							JButton otherServicesButton = buttonFunction("---Other Services--", new JButtonListener());
		// ... ... ... Products
		// ... ... ... ... Shampoos Button
							JButton shampoosButton = buttonFunction("------Shampoos-----", new JButtonListener());
		// ... ... ... ... Conditioners Button
							JButton conditionersButton = buttonFunction("----Conditioners---", new JButtonListener());
		// ... ... ... ... Styling Gels Button
							JButton stylingGelsButton = buttonFunction("----Styling Gels---", new JButtonListener());
		// ... ... ... ... Styling Tools Button
							JButton stylingToolsButton = buttonFunction("---Styling Tools---", new JButtonListener());
		// ... ... ... ... Dry Shampoos Button
							JButton dryShampoosButton = buttonFunction("----Dry Shampoos---", new JButtonListener());
		// ... ... ... ... Deep Conditioners Button
							JButton deepConditionersButton = buttonFunction("-Deep Conditioners-", new JButtonListener());
		// ... ... ... ... Hair Sprays Button
							JButton hairSpraysButton = buttonFunction("----Hair Sprays----", new JButtonListener());
		// ... ... ... ... Other Products Button
							JButton otherProductsButton = buttonFunction("---Other Products--", new JButtonListener());
		// ... ... ... Inventory Panel
						JPanel inventoryPanel = new JPanel ( );
						inventoryPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager inventoryManager = new GridBagLayoutManager ( inventoryPanel );
						inventoryManager.addWithConstraints ( haircutButton, 2, 0, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( styleButton, 6, 0, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( colorButton, 10, 0, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( permButton, 14, 0, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( shampooButton, 2, 4, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( conditionButton, 6, 4, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( deepConditionButton, 10, 4, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( otherServicesButton, 14, 4, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( shampoosButton, 2, 6, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( conditionersButton, 6, 6, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( stylingGelsButton, 10, 6, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( stylingToolsButton, 14, 6, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( dryShampoosButton, 2, 8, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( deepConditionersButton, 6, 8, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( hairSpraysButton, 10, 8, 4, 2, 0, 1 );
						inventoryManager.addWithConstraints ( otherProductsButton, 14, 8, 4, 2, 0, 1 );
		// ... ... Receipt
		// ... ... ... Receipt Table
							String [ ] ReceiptColumnNames = { "Purchases", "Charges" };
							String [ ] [ ] receiptTableData = 
								{ 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" }, 
									{ " ", "0.00" } 
								};
							JTable receiptTable = new JTable ( receiptTableData, ReceiptColumnNames );
		// ... ... ... Receipt Panel
						JPanel receiptPanel = new JPanel ( );
						receiptPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
						GridBagLayoutManager receiptManager = new GridBagLayoutManager ( receiptPanel );
						receiptManager.addWithConstraints ( receiptTable.getTableHeader ( ), 0, 0, 2, 1, 0, 0 );
						receiptManager.addWithConstraints ( receiptTable, 0, 1, 2, 2, 0, 1 );
		// ... ... Footer
		// ... ... ... Footer Components
		// ... ... ... ... New Transaction Button
							JButton newTransactionButton = buttonFunction("-----------New Transaction----------", new JButtonListener());
		// ... ... ... ... Add Product/Service to Transaction Button
							JButton addToTransactionButton = buttonFunction("-Add Product/Service to Transaction-", new JButtonListener());
		// ... ... ... ... Complete Transaction Button
							JButton completeTransactionButton = buttonFunction("--------Complete Transaction--------", new JButtonListener());
		// ... ... ... ... Return Home Button
							JButton returnHomeButton = buttonFunction("-------------Return Home------------", new JButtonListener());
		// ... ... ... Footer Panel
							JPanel footerPanel = new JPanel ( );
							footerPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
							GridBagLayoutManager footerManager = new GridBagLayoutManager ( footerPanel );
							footerManager.addWithConstraints ( newTransactionButton, 2, 0, 3, 1, 1, 0 );
							footerManager.addWithConstraints ( addToTransactionButton, 6, 0, 4, 1, 1, 0 );
							footerManager.addWithConstraints ( completeTransactionButton, 13, 0, 3, 1, 1, 0 );
							footerManager.addWithConstraints ( returnHomeButton, 20, 0, 4, 1, 1, 0 );
		// ... Window Frame
		JFrame windowFrame = new JFrame ( );
		windowFrame.setDefaultCloseOperation ( defaultClose );
		GridBagLayoutManager windowManager = new GridBagLayoutManager ( windowFrame );
		windowManager.addWithConstraints ( titlePanel, windowFrame, 11, 0, 19, 1, 0, 0 );
		windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
		windowManager.addWithConstraints ( receiptPanel, windowFrame, 24, 5, 6, 8, 0, 1 );
		windowManager.addWithConstraints ( footerPanel, windowFrame, 11, 20, 19, 1, 0, 0 );
		windowFrame.pack ( );
		windowFrame.setVisible ( true );
		windowFrame.setLocationRelativeTo ( null );
	}
	public static int defaultClose;

	private JButton buttonFunction (String name, JButtonListener buttonListener) {
		JButton button = new JButton(name);
		button.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		button.addActionListener(buttonListener);
		return button;
	}
}/**		private int total; // Current total at register.
		final JTextArea receipt;
		final JTextArea sum;

		public Register() {
			total = 0;
			receipt = new JTextArea("Receipt");
			sum = new JTextArea("Total: ");
		}

		public void GUI() {
			JFrame frame = new JFrame("Register");
			JPanel services = new JPanel(new GridLayout(4,3));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.add(serviceButton("Haircut", 1000));
			services.setVisible(true);
			sum.setEditable(false);
			receipt.setEditable(false);
			frame.setLayout(new BorderLayout());
			frame.add(services, BorderLayout.WEST);
			frame.add(sum, BorderLayout.SOUTH);
			frame.add(receipt, BorderLayout.EAST);
			frame.setVisible(true);
			frame.pack();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}


		public JButton serviceButton(final String name, final int price) { // can change to icon later for lovely display
			JButton button = new JButton(name);
			button.addActionListener(
					new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent actionEvent) {
							total += price;
							String dollar = Integer.toString(total / 100);
							String cents = Integer.toString(total % 100);
							cents += (cents.length() == 2) ? "" : "0";
							sum.setText("Total: $" + dollar + "." + cents);
							receipt.setText(receipt.getText() + "\n" + name + "\t\t$" + dollar + "." + cents);
						}
					});
			return button;
		}
	}
}
**/

