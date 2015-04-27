import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class RegisterGUI 
{
	public RegisterGUI ( int newDefaultClose )
	{
		defaultClose = newDefaultClose;

		// Window
			JFrame windowFrame = new JFrame ( );
			windowFrame.setDefaultCloseOperation ( defaultClose );
			GridBagLayoutManager windowManager = new GridBagLayoutManager ( windowFrame );
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
					JPanel inventoryPanel = new JPanel ( );
					inventoryPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
					GridBagLayoutManager inventoryManager = new GridBagLayoutManager ( inventoryPanel );
		// ... ... ... Services
		// ... ... ... ... Haircut Button
							JButton haircutButton = new JButton ( "Haircut" );
							haircutButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed ( ActionEvent event )
									{
										windowManager.remove ( inventoryPanel, windowFrame );
										JPanel haircutOptionsPanel = new JPanel ( );
										haircutOptionsPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
										GridBagLayoutManager haircutOptionsManager = new GridBagLayoutManager ( haircutOptionsPanel );
		// ... ... ... ... ... ... ... Haircut Options
		// ... ... ... ... ... ... ... ... Long Haircut Button
											JButton longHaircutButton = new JButton ( "Long" );
											longHaircutButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a long haircut item to transaction
														windowManager.remove ( haircutOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Medium Haircut Button
											JButton mediumHaircutButton = new JButton ( "Medium" );
											mediumHaircutButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a medium haircut item to transaction
														windowManager.remove ( haircutOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Short Haircut Button
											JButton shortHaircutButton = new JButton ( "Short" );
											shortHaircutButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a short haircut item to transaction
														windowManager.remove ( haircutOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Kids Haircut Button
											JButton kidsHaircutButton = new JButton ( "Kids" );
											kidsHaircutButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a kids haircut item to transaction
														windowManager.remove ( haircutOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... Haircut Options Panel
										haircutOptionsManager.addWithConstraints ( longHaircutButton, 2, 0, 4, 2, 0, 1 );
										haircutOptionsManager.addWithConstraints ( mediumHaircutButton, 6, 0, 4, 2, 0, 1 );
										haircutOptionsManager.addWithConstraints ( shortHaircutButton, 10, 0, 4, 2, 0, 1 );
										haircutOptionsManager.addWithConstraints ( kidsHaircutButton, 14, 0, 4, 2, 0, 1 );
										windowManager.addWithConstraints ( haircutOptionsPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
									}
								}
							);
		// ... ... ... ... Style Button
							JButton styleButton = new JButton ( "Style" );
							styleButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed ( ActionEvent event )
									{
										windowManager.remove ( inventoryPanel, windowFrame );
										JPanel styleOptionsPanel = new JPanel ( );
										styleOptionsPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
										GridBagLayoutManager styleOptionsManager = new GridBagLayoutManager ( styleOptionsPanel );
		// ... ... ... ... ... ... ... Style Options
		// ... ... ... ... ... ... ... ... Long Style Button
											JButton longStyleButton = new JButton ( "Long" );
											longStyleButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a long style item to transaction
														windowManager.remove ( styleOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Medium Style Button
											JButton mediumStyleButton = new JButton ( "Medium" );
											mediumStyleButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a medium style item to transaction
														windowManager.remove ( styleOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Short Style Button
											JButton shortStyleButton = new JButton ( "Short" );
											shortStyleButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a short style item to transaction
														windowManager.remove ( styleOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Kids Style Button
											JButton kidsStyleButton = new JButton ( "Kids" );
											kidsStyleButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a kids style item to transaction
														windowManager.remove ( styleOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... Style Options Panel
											styleOptionsManager.addWithConstraints ( longStyleButton, 2, 0, 4, 2, 0, 1 );
											styleOptionsManager.addWithConstraints ( mediumStyleButton, 6, 0, 4, 2, 0, 1 );
											styleOptionsManager.addWithConstraints ( shortStyleButton, 10, 0, 4, 2, 0, 1 );
											styleOptionsManager.addWithConstraints ( kidsStyleButton, 14, 0, 4, 2, 0, 1 );
											windowManager.addWithConstraints ( styleOptionsPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
									}
								}
							);
		// ... ... ... ... Color Button
							JButton colorButton = new JButton ( "Color" );
							colorButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed ( ActionEvent event )
									{
										windowManager.remove ( inventoryPanel, windowFrame );
										JPanel colorOptionsPanel = new JPanel ( );
										colorOptionsPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
										GridBagLayoutManager colorOptionsManager = new GridBagLayoutManager ( colorOptionsPanel );
		// ... ... ... ... ... ... ... Color Options
		// ... ... ... ... ... ... ... ... Solid Color Button
											JButton solidColorButton = new JButton ( "Solid" );
											solidColorButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a solid color item to transaction
														windowManager.remove ( colorOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Ombre Color Button
											JButton ombreColorButton = new JButton ( "Ombre" );
											ombreColorButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a ombre color item to transaction
														windowManager.remove ( colorOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Highlights Color Button
											JButton highlightsColorButton = new JButton ( "Highlights" );
											highlightsColorButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a highlights color item to transaction
														windowManager.remove ( colorOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Fashion Color Button
											JButton fashionColorButton = new JButton ( "Fashion" );
											fashionColorButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a fashion color item to transaction
														windowManager.remove ( colorOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... Color Options Panel
											colorOptionsManager.addWithConstraints ( solidColorButton, 2, 0, 4, 2, 0, 1 );
											colorOptionsManager.addWithConstraints ( ombreColorButton, 6, 0, 4, 2, 0, 1 );
											colorOptionsManager.addWithConstraints ( highlightsColorButton, 10, 0, 4, 2, 0, 1 );
											colorOptionsManager.addWithConstraints ( fashionColorButton, 14, 0, 4, 2, 0, 1 );
											windowManager.addWithConstraints ( colorOptionsPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
									}
								}
							);
		// ... ... ... ... Perm Button
							JButton permButton = new JButton ( "Perm" );
							permButton.addActionListener 
							( 
									new ActionListener ( )
									{	
										@Override
										public void actionPerformed ( ActionEvent event )
										{
											windowManager.remove ( inventoryPanel, windowFrame );
											JPanel permOptionsPanel = new JPanel ( );
											permOptionsPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
											GridBagLayoutManager permOptionsManager = new GridBagLayoutManager ( permOptionsPanel );
			// ... ... ... ... ... ... ... Perm Options
			// ... ... ... ... ... ... ... ... Long Perm Button
												JButton longPermButton = new JButton ( "Long" );
												longPermButton.addActionListener 
												( 
													new ActionListener ( )
													{	
														@Override
														public void actionPerformed ( ActionEvent event )
														{
															// Register should add a long perm item to transaction
															windowManager.remove ( permOptionsPanel, windowFrame );
															windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
														}
													}
												);
			// ... ... ... ... ... ... ... ... Medium Perm Button
												JButton mediumPermButton = new JButton ( "Medium" );
												mediumPermButton.addActionListener 
												( 
													new ActionListener ( )
													{	
														@Override
														public void actionPerformed ( ActionEvent event )
														{
															// Register should add a medium perm item to transaction
															windowManager.remove ( permOptionsPanel, windowFrame );
															windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
														}
													}
												);
			// ... ... ... ... ... ... ... ... Short Perm Button
												JButton shortPermButton = new JButton ( "Short" );
												shortPermButton.addActionListener 
												( 
													new ActionListener ( )
													{	
														@Override
														public void actionPerformed ( ActionEvent event )
														{
															// Register should add a short perm item to transaction
															windowManager.remove ( permOptionsPanel, windowFrame );
															windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
														}
													}
												);
			// ... ... ... ... ... ... ... ... Kids Perm Button
												JButton kidsPermButton = new JButton ( "Kids" );
												kidsPermButton.addActionListener 
												( 
													new ActionListener ( )
													{	
														@Override
														public void actionPerformed ( ActionEvent event )
														{
															// Register should add a kids perm item to transaction
															windowManager.remove ( permOptionsPanel, windowFrame );
															windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
														}
													}
												);
			// ... ... ... ... ... ... ... Perm Options Panel
												permOptionsManager.addWithConstraints ( longPermButton, 2, 0, 4, 2, 0, 1 );
												permOptionsManager.addWithConstraints ( mediumPermButton, 6, 0, 4, 2, 0, 1 );
												permOptionsManager.addWithConstraints ( shortPermButton, 10, 0, 4, 2, 0, 1 );
												permOptionsManager.addWithConstraints ( kidsPermButton, 14, 0, 4, 2, 0, 1 );
												windowManager.addWithConstraints ( permOptionsPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
										}
									}
								);
		// ... ... ... ... Shampoo Button
							JButton shampooButton = new JButton ( "Shampoo" );
							shampooButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed ( ActionEvent event )
									{
										windowManager.remove ( inventoryPanel, windowFrame );
										JPanel shampooOptionsPanel = new JPanel ( );
										shampooOptionsPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
										GridBagLayoutManager shampooOptionsManager = new GridBagLayoutManager ( shampooOptionsPanel );
		// ... ... ... ... ... ... ... Shampoo Options
		// ... ... ... ... ... ... ... ... Long Shampoo Button
											JButton longShampooButton = new JButton ( "Long" );
											longShampooButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a long shampoo item to transaction
														windowManager.remove ( shampooOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Medium Shampoo Button
											JButton mediumShampooButton = new JButton ( "Medium" );
											mediumShampooButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a medium shampoo item to transaction
														windowManager.remove ( shampooOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Short Shampoo Button
											JButton shortShampooButton = new JButton ( "Short" );
											shortShampooButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a short shampoo item to transaction
														windowManager.remove ( shampooOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Kids Shampoo Button
											JButton kidsShampooButton = new JButton ( "Kids" );
											kidsShampooButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a kids shampoo item to transaction
														windowManager.remove ( shampooOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... Shampoo Options Panel
											shampooOptionsManager.addWithConstraints ( longShampooButton, 2, 0, 4, 2, 0, 1 );
											shampooOptionsManager.addWithConstraints ( mediumShampooButton, 6, 0, 4, 2, 0, 1 );
											shampooOptionsManager.addWithConstraints ( shortShampooButton, 10, 0, 4, 2, 0, 1 );
											shampooOptionsManager.addWithConstraints ( kidsShampooButton, 14, 0, 4, 2, 0, 1 );
											windowManager.addWithConstraints ( shampooOptionsPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
									}
								}
							);
		// ... ... ... ... Condition Button
							JButton conditionButton = new JButton ( "Condition" );
							conditionButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed ( ActionEvent event )
									{
										windowManager.remove ( inventoryPanel, windowFrame );
										JPanel conditionOptionsPanel = new JPanel ( );
										conditionOptionsPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
										GridBagLayoutManager conditionOptionsManager = new GridBagLayoutManager ( conditionOptionsPanel );
		// ... ... ... ... ... ... ... Condition Options
		// ... ... ... ... ... ... ... ... Long Condition Button
											JButton longConditionButton = new JButton ( "Long" );
											longConditionButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a long condition item to transaction
														windowManager.remove ( conditionOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Medium Condition Button
											JButton mediumConditionButton = new JButton ( "Medium" );
											mediumConditionButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a medium condition item to transaction
														windowManager.remove ( conditionOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Short Condition Button
											JButton shortConditionButton = new JButton ( "Short" );
											shortConditionButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a short condition item to transaction
														windowManager.remove ( conditionOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Kids Condition Button
											JButton kidsConditionButton = new JButton ( "Kids" );
											kidsConditionButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a kids condition item to transaction
														windowManager.remove ( conditionOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... Condition Options Panel
											conditionOptionsManager.addWithConstraints ( longConditionButton, 2, 0, 4, 2, 0, 1 );
											conditionOptionsManager.addWithConstraints ( mediumConditionButton, 6, 0, 4, 2, 0, 1 );
											conditionOptionsManager.addWithConstraints ( shortConditionButton, 10, 0, 4, 2, 0, 1 );
											conditionOptionsManager.addWithConstraints ( kidsConditionButton, 14, 0, 4, 2, 0, 1 );
											windowManager.addWithConstraints ( conditionOptionsPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
									}
								}
							);
		// ... ... ... ... Deep Condition Button
							JButton deepConditionButton = new JButton ( "Deep Condition" );
							deepConditionButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed ( ActionEvent event )
									{
										windowManager.remove ( inventoryPanel, windowFrame );
										JPanel deepConditionOptionsPanel = new JPanel ( );
										deepConditionOptionsPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
										GridBagLayoutManager deepConditionOptionsManager = new GridBagLayoutManager ( deepConditionOptionsPanel );
		// ... ... ... ... ... ... ... Deep Condition Options
		// ... ... ... ... ... ... ... ... Long Deep Condition Button
											JButton longDeepConditionButton = new JButton ( "Long" );
											longDeepConditionButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a long deep condition item to transaction
														windowManager.remove ( deepConditionOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Medium Deep Condition Button
											JButton mediumDeepConditionButton = new JButton ( "Medium" );
											mediumDeepConditionButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a medium deep condition item to transaction
														windowManager.remove ( deepConditionOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Short Deep Condition Button
											JButton shortDeepConditionButton = new JButton ( "Short" );
											shortDeepConditionButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a short deep condition item to transaction
														windowManager.remove ( deepConditionOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... ... Kids Deep Condition Button
											JButton kidsDeepConditionButton = new JButton ( "Kids" );
											kidsDeepConditionButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a kids deep condition item to transaction
														windowManager.remove ( deepConditionOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... Deep Condition Options Panel
											deepConditionOptionsManager.addWithConstraints ( longDeepConditionButton, 2, 0, 4, 2, 0, 1 );
											deepConditionOptionsManager.addWithConstraints ( mediumDeepConditionButton, 6, 0, 4, 2, 0, 1 );
											deepConditionOptionsManager.addWithConstraints ( shortDeepConditionButton, 10, 0, 4, 2, 0, 1 );
											deepConditionOptionsManager.addWithConstraints ( kidsDeepConditionButton, 14, 0, 4, 2, 0, 1 );
											windowManager.addWithConstraints ( deepConditionOptionsPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
									}
								}
							);
		// ... ... ... ... Other Services Button
							JButton otherServicesButton = new JButton ( "Other Services" );
							otherServicesButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed ( ActionEvent event )
									{
										windowManager.remove ( inventoryPanel, windowFrame );
										JPanel otherServicesOptionsPanel = new JPanel ( );
										otherServicesOptionsPanel.setBorder ( BorderFactory.createEtchedBorder ( EtchedBorder.LOWERED ) );
										GridBagLayoutManager otherServicesOptionsManager = new GridBagLayoutManager ( otherServicesOptionsPanel );
		// ... ... ... ... ... ... ... Other Services Options
		// ... ... ... ... ... ... ... ... Other Services Trim Button
											JButton otherServicesTrimButton = new JButton ( "Trim" );
											otherServicesTrimButton.addActionListener 
											( 
												new ActionListener ( )
												{	
													@Override
													public void actionPerformed ( ActionEvent event )
													{
														// Register should add a long deep condition item to transaction
														windowManager.remove ( otherServicesOptionsPanel, windowFrame );
														windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
													}
												}
											);
		// ... ... ... ... ... ... ... Other Services Options Panel
											otherServicesOptionsManager.addWithConstraints ( otherServicesTrimButton, 2, 0, 4, 2, 0, 1 );
											windowManager.addWithConstraints ( otherServicesOptionsPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
									}
								}
							);
		// ... ... ... Products
		// ... ... ... ... Shampoos Button
							JButton shampoosButton = new JButton ( "Shampoos" );
							shampoosButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// Register should add a shampoo item to transaction
									}
								}
							);
		// ... ... ... ... Conditioners Button
							JButton conditionersButton = new JButton ( "Conditioners" );
							conditionersButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// Register should add a conditioner item to transaction
									}
								}
							);
		// ... ... ... ... Styling Gels Button
							JButton stylingGelsButton = new JButton ( "Styling Gels" );
							stylingGelsButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// Register should add a styling gel item to transaction
									}
								}
							);
		// ... ... ... ... Styling Tools Button
							JButton stylingToolsButton = new JButton ( "Styling Tools" );
							stylingToolsButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// Register should add a styling tool item to transaction
									}
								}
							);
		// ... ... ... ... Dry Shampoos Button
							JButton dryShampoosButton = new JButton ( "Dry Shampoos" );
							dryShampoosButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// Register should add a dry shampoo item to transaction
									}
								}
							);
		// ... ... ... ... Deep Conditioners Button
							JButton deepConditionersButton = new JButton ( "Deep Conditioners" );
							deepConditionersButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// Register should add a deep conditioner item to transaction
									}
								}
							);
		// ... ... ... ... Hair Sprays Button
							JButton hairSpraysButton = new JButton ( "Hair Sprays" );
							hairSpraysButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// Register should add a hair spray item to transaction
									}
								}
							);
		// ... ... ... ... Other Products Button
							JButton otherProductsButton = new JButton ( "Other Products" );
							otherProductsButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// Register should add an other products item to transaction
									}
								}
							);
		// ... ... ... Inventory Panel
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
							JButton newTransactionButton = new JButton ( "New Transaction" );
							newTransactionButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										@SuppressWarnings("unused")
										RegisterGUI registerGUI = new RegisterGUI ( JFrame.EXIT_ON_CLOSE );	
										windowFrame.setVisible ( false );
									}
								}
							);
		// ... ... ... ... Add Product/Service to Transaction Button
							JButton addToTransactionButton = new JButton ( "Add Product/Service to Transaction" );
							addToTransactionButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// AddPSToTransactionGUI constructor call here
//										windowFrame.setVisible ( false );
									}
								}
							);
		// ... ... ... ... Complete Transaction Button
							JButton completeTransactionButton = new JButton ( "Complete Transaction" );
							completeTransactionButton.addActionListener 
							( 
								new ActionListener ( )
								{	
									@Override
									public void actionPerformed(ActionEvent event) {
										// CompleteTransactionGUI constructor call here
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
						footerManager.addWithConstraints ( newTransactionButton, 2, 0, 3, 1, 1, 0 );
						footerManager.addWithConstraints ( addToTransactionButton, 6, 0, 4, 1, 1, 0 );
						footerManager.addWithConstraints ( completeTransactionButton, 13, 0, 3, 1, 1, 0 );
						footerManager.addWithConstraints ( returnHomeButton, 20, 0, 4, 1, 1, 0 );
		// ... Window Frame
				windowManager.addWithConstraints ( titlePanel, windowFrame, 11, 0, 19, 1, 0, 0 );
				windowManager.addWithConstraints ( inventoryPanel, windowFrame, 8, 5, 16, 8, 0, 1 );
				windowManager.addWithConstraints ( receiptPanel, windowFrame, 24, 5, 6, 8, 0, 1 );
				windowManager.addWithConstraints ( footerPanel, windowFrame, 11, 20, 19, 1, 0, 0 );
				windowFrame.pack ( );
				windowFrame.setVisible ( true );
				windowFrame.setLocationRelativeTo ( null );
	}

	private static int defaultClose;

}
