
public class Main {

	public static void main(String[] args) {
		
		Passwords pass = new Passwords();
		
		LoginPage login = new LoginPage( pass.getlogininfo() ); //sends HashMap to LoginPage
	}

}
