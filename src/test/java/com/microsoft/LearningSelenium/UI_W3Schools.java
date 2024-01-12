
/*
package com.microsoft.LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class UI_W3Schools 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Binaries/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		driver.findElement(By.id("search2")).sendKeys("html");
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Tutorials and References'] ")))
		.build().perform();
		Thread.sleep(3000);
		
		// javascriptExecutor is predefined Interface in selenium, it is used to run the javascript
		// -code in selenium automation script.
		 * 
		JavascriptExecutor js= ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].scrollIntoView(true)", 
//				driver.findElement(By.xpath("//h5[text()='Get Certified']")));

		//	ex - 2 
				js.executeScript("window.scrollBy(0,11700)");
		Thread.sleep(10000);
		driver.quit();
	}
}

*/

