import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginb = new JButton( "login" );
	JButton resetb = new JButton( "reset" );
	JTextField idf = new JTextField();
	JPasswordField passf = new JPasswordField();
	JLabel idl = new JLabel( "user ID:" );
	JLabel passl = new JLabel( "password:" );
	JLabel messl = new JLabel();
	
	
	HashMap<String, String> info = new HashMap<String, String>(); //globally available for LoginPage
	
	LoginPage( HashMap<String, String> infooriginal ){
		info = infooriginal;
		
		idl.setBounds( 50, 100, 75, 25 );
		passl.setBounds( 50, 150, 75, 25 );
		
		messl.setBounds( 125, 250, 250, 35 );
		messl.setFont( new Font( null, Font.ITALIC, 25 ) );
		
		idf.setBounds( 125, 100, 200, 25 );
		passf.setBounds( 125, 150, 200, 25 );
		
		loginb.setBounds( 125, 200, 100, 25 );
		loginb.addActionListener( this );
		loginb.setFocusable( false );
		
		resetb.setBounds( 225, 200, 100, 25 );
		resetb.addActionListener( this );
		resetb.setFocusable( false );
		
		frame.add( idl );
		frame.add( passl );
		frame.add( messl );
		frame.add( idf );
		frame.add( passf );
		frame.add( loginb );
		frame.add( resetb );
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 420, 420 );
		frame.setLayout( null );
		frame.setVisible( true );
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if( e.getSource()==resetb ) {
			idf.setText( "" );
			passf.setText( "" );
		}
		
		if( e.getSource()==loginb ) {
			String uidS = idf.getText(); //pobieramy login do string'a
			String passS = String.valueOf(passf.getPassword() ); //jako, ¿e to z PasswordField to pobieramy przez valueOf
		
			//sprawedzamy czy login i has³o siê zgadzaj¹ z data w HashMap
			if( info.containsKey( uidS ) ){
				if( info.get( uidS ).equals( passS ) ) {
					messl.setForeground( Color.green );
					messl.setText( "login successful" );
					
					frame.dispose(); //znika LoginPage
					
					WelcomePage welcome = new WelcomePage( uidS ); //otwieramy nowe okno jak oba elementy HashMap pasuj¹
				}
				else {
					messl.setForeground( Color.red );
					messl.setText( "wrong password" );
				}
			}
			else {
				messl.setForeground( Color.red );
				messl.setText( "wrong username" );
			}
		}
		
	}

}
