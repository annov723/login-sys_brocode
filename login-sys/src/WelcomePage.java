import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {	

	JFrame frame = new JFrame();
	JLabel wl = new JLabel( "Hello!" );
	
	WelcomePage(){
		
		wl.setBounds( 0, 0, 200, 35 );
		wl.setFont( new Font( null, Font.PLAIN, 25 ) );
		
		frame.add( wl );
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 420, 420 );
		frame.setLayout( null );
		frame.setVisible( true );
	}
	
}
