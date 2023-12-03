package sHworkone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")).click();
		driver.findElement(By.id("account")).sendKeys("murad");
	    driver.findElement(By.id("description")).sendKeys("savings account");
	    driver.findElement(By.id("balance")).sendKeys("100");
	    driver.findElement(By.id("account_number")).sendKeys("123456");
	    driver.findElement(By.id("contact_person")).sendKeys("sarwar");
	    driver.findElement(By.id("contact_phone")).sendKeys("7861234123");
	    driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).click();
		
		
		
	}

}
