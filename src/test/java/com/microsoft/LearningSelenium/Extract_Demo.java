
// To check or to extract the element text we have to use List and for loop
// Method -1
/*
package com.microsoft.LearningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Extract_Demo 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Binaries/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://form-bot-anvsystems.pages.dev/");
	driver.manage().window().maximize();
	List<WebElement> elements=driver.findElements(By.xpath("//form/label[7]/label"));
	for(int i=0;i<elements.size();i++)
	{
		String text= elements.get(i).getText();
		System.out.println(text);
	}
	
	// 2nd Method
//	for(WebElement e2:elements) {
//		System.out.println(e2.getText());
//	}
	
	driver.quit();
}
}
*/

// Method -2
// To check that the given element Text is existing or not using list loop and if/else

/*
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Extract_Demo 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Binaries/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://form-bot-anvsystems.pages.dev/");
	driver.manage().window().maximize();
	List<WebElement> elements=driver.findElements(By.xpath("//form/label[7]/label"));
	for(int i=0;i<elements.size();i++)
	{
		String text= elements.get(i).getText();
		
		if(text.contains("JavaScript")) {
			System.out.println("PASSED !");
			break;
		}
	}
	driver.quit();
}
}
*/


// Method -3
// to know the select options we will use List 

/*
	import java.util.List;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Extract_Demo
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Binaries/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		driver.manage().window().maximize();
		List<WebElement> element= driver.findElements(By.xpath("//select[@name='country']/option"));
		for(WebElement we: element)
		{
			System.out.println(we.getText());
		}
		driver.quit();
	}
}

*/