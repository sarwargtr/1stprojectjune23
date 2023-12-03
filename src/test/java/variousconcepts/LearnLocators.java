package variousconcepts;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	static WebDriver driver;
	 
	
	public void setup() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarwa\\Selenium\\sHworkone\\dr\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void xtest() {
		driver.findElement(By.linkText("http://objectspy.com/os_api_prod/"))
		driver.navigate().back();
		driver.findElement(By.partialLinkText(null)).click();/	}
}
