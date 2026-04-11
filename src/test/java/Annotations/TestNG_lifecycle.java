package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_lifecycle {
	@BeforeSuite
	public void beforesuit() {
		System.out.println("beforesuit will execute 1");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest will execute 2");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass will execute 3");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethos will execute 4");
	}

	@Test
	public void attest() {
		System.out.println("attest will execute 5");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod will execute 6");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("afterclass will execute 7");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("aftertest will execute 8");
	}

	@AfterSuite
	public void aftersuit() {
		System.out.println("aftersuit will execute 9");
	}
}
