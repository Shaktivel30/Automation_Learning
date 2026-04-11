package pages_POM;
import Constructor.cons_prmg1;
import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Encapsulation_practise.prmg1;

public class LoginPage{

	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver; // this.driver = Class variable , driver = Value coming from test
	}

	// Locators
	private By txtUsername = By.id("username");
	private By txtPassword = By.id("password");
	private By btnLogin = By.id("submit");
	
	// private By btnLogin1 = By.xpath(""); we can write xpath 
	
	
	// Actions
	public void enterUsername(String username) {
		driver.findElement(txtUsername).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btnLogin).click();
	}

	// Business Logic
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}

}
