package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages_POM.LoginPage;

public class LoginTest {

	WebDriver driver;

	@BeforeMethod
	public void testLogin() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@Test
	public void testlogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("student", "Password123");
	}

	@AfterMethod
	public void teardown() {
		System.out.println("hello hiii");
		driver.quit();
	}
}
