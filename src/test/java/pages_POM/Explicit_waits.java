package pages_POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_waits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		

		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().minimize();
		
		
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement username = waits.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		username.sendKeys("student");
		
		
	}

}
