import java.util.HashMap;

public class Passwords {
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	Passwords(){ //constructor
		
		logininfo.put( "Unicorn", "horn" );
		logininfo.put( "Pegasus", "wings" );
		logininfo.put( "Alicorn", "horn&wings" );
	}

}
