import java.awt.event.*;
import javax.swing.*;

public class JButtonListener implements ActionListener
{
	public JButtonListener ( )
	{
	}

	@Override
	public void actionPerformed ( ActionEvent event )
	{
		JButton button = ( JButton ) event.getSource ( );
		String label = button.getText ( );
		if ( label == "Exit" )
		{
			System.exit ( 0 );
		}
	}
}