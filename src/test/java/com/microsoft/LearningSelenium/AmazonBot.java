

// it will directly goes to the amazon website
// and in search box it will search jackets for men
// and then it will click enter

package com.microsoft.LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBot 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ACER\\eclipse-workspace\\SeleniumBasics\\Binaries\\chromedriver.exe ");

	WebDriver driver= new ChromeDriver();

	driver.get("https://www.amazon.com");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("jackets for men");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	driver.quit();
}
}
