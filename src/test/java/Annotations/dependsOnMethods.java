package Annotations;

import org.testng.annotations.Test;

public class dependsOnMethods {
	
//	@Test
//	public void cricket()
//	{
//		System.out.println("need to watch ipl ");
//	}
//	@Test (dependsOnMethods = "cricket")
//	public void hotstart()
//	{
//		System.out.println("connect with hostal and watch cricket");
//	}
	

@Test
    public void loginTest() {
        System.out.println("Login successful");
        // Try failing this test using Assert.fail();
    }

    @Test(dependsOnMethods = "loginTest")
    public void homePageTest() {
        System.out.println("Home Page loaded");
    }


}
