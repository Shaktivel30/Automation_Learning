package Constructor;

public class cons_prmg1 {
	
	private String username;
	private String password;
	
	cons_prmg1(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	
	public void displayUser()
	{
//		System.out.println(username);
//		System.out.println(password);
		System.out.println("Hello how are you");
	}

	public static void main(String[] args) {
		
		cons_prmg1 c = new cons_prmg1("shakthi","123");
		c.displayUser();
		
		cons_prmg1 c1 = new cons_prmg1("CM","1234");
		c1.displayUser();
	}

}
