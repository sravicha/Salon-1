import java.awt.*;

import javax.swing.*;

public class GridBagLayoutManager 
{
	public GridBagLayoutManager ( JComponent newComponent ) 
	{
		component = newComponent;

		component.setLayout ( new GridBagLayout ( ) );

		constraints = new GridBagConstraints ( );
		constraints.fill = GridBagConstraints.BOTH;
		constraints.insets = new Insets ( 5, 5, 5, 5 );
	}

	public GridBagLayoutManager ( JFrame newFrame ) 
	{ 
		frame = newFrame;

		frame.setLayout ( new GridBagLayout ( ) );

		constraints = new GridBagConstraints ( );
		constraints.fill = GridBagConstraints.BOTH;
		constraints.insets = new Insets ( 5, 5, 5, 5 );
	}

	public void addWithConstraints ( 
									 JComponent addComponent, 
									 int gridX, 
									 int gridY, 
									 int gridWidth, 
									 int gridHeight, 
									 int weightX, 
									 int weightY 
								   ) 
	{
		constraints.gridx = gridX;
		constraints.gridy = gridY;
		constraints.gridwidth = gridWidth;
		constraints.gridheight = gridHeight;
		constraints.weightx = weightX;
		constraints.weighty = weightY;
		component.add ( addComponent, constraints );
	}

	public void addWithConstraints ( 
									 JComponent addComponent, 
									 JFrame addToFrame, 
									 int gridX, 
									 int gridY, 
									 int gridWidth, 
									 int gridHeight, 
									 int weightX, 
									 int weightY 
								   ) 
	{
		constraints.gridx = gridX;
		constraints.gridy = gridY;
		constraints.gridwidth = gridWidth;
		constraints.gridheight = gridHeight;
		constraints.weightx = weightX;
		constraints.weighty = weightY;
		addToFrame.add ( addComponent, constraints );
	}

	public void remove ( JComponent removeComponent, JFrame removeFromFrame )
	{
		removeFromFrame.remove ( removeComponent );
	}


	private static JComponent component;
	private static JFrame frame;
	private static GridBagConstraints constraints;
}