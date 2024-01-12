
/*
package com.microsoft.LearningSelenium;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormBot {
public static void main(String[] args) throws InterruptedException {
	// 
//System.setProperty("webdriver.chrome.driver", 
//		"C:\\Users\\ACER\\eclipse-workspace\\SeleniumBasics\\Binaries\\chromedriver.exe");

	System.setProperty("webdriver.chrome.driver", "./Binaries/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.get("https://form-bot-anvsystems.pages.dev/");
	Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("rani");		
		driver.findElement(By.name("lastname")).sendKeys("mukherjee");
		driver.findElement(By.name("email")).sendKeys("raniii086@gmail.com");
//		driver.findElement(By.name("gender")).click();
		
		//  Absolute xpath
		//	driver.findElement(By.xpath("/html/body/div/div/form/label[4]/label[2]")).click();
		
		// 	Relative xpath
		driver.findElement(By.xpath("//input[@value='female']")).click();
		driver.findElement(By.name("phone")).sendKeys("8847853541");
		
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("India");
		
//		driver.findElement(By.name("programming")).click();

		driver.findElement(By.xpath("//input[@value='Python']")).click();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
}
}
*/