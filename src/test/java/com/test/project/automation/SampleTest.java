package com.test.project.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup(); // setup driver

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='u4Uk3c']")).click();
		Thread.sleep(3000);
		
		// driver.quit();
	}

}
