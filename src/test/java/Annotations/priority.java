package Annotations;

import org.testng.annotations.Test;

public class priority {

@Test (priority = 3)
public void A()
{
	System.out.println("login successfull");
}
@Test (priority = 2)
public void B()
{
	System.out.println("Dashboard navigate successfull");
}
@Test (priority = 1)
public void C()
{
	System.out.println("Logout successfull");
}
		

	}


