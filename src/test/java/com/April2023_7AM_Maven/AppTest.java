package com.April2023_7AM_Maven;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	String expectedTitle = "Gmail";
	WebDriver driver; //null
	
	public AppTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234 //it will open an empty chrome browser
	}
	
	@Test // method tagged with before annotation will be executed before every test method
	public void launchApplication()
	{
		System.out.println("TestCase : Launch Application");
		//open an empty browser -> In selenium s/w we have a class called ChromeDriver ,if we call its constructor 
		   //it will open an empty chrome browser
		//ChromeDriver driver = new ChromeDriver();					
		//call gmail url in the above browser - https://gmail.com
		driver.get("https://gmail.com"); //1234
		String sessionID = driver.getWindowHandle();
		System.out.println("The Session ID of the Window :" + sessionID);
		String actualTitle = driver.getTitle();
		System.out.println("Application Title :" + actualTitle);
		String myCurl = driver.getCurrentUrl();
		System.out.println("My Current URL : " +myCurl );
		//Assert.assertEquals(expectedTitle, actualTitle);
		boolean result = false;//default
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("LaunchApplication is PASSED");
			result = true;
		}
		else
		{
			System.out.println("LaunchApplication is FAILED");
		}
		System.out.println("We came out of if condition");
		//Assert myassert = new Assert();
		Assert.assertTrue(result);
		
		/*
		 * WebElement emailObj = driver.findElement(By.name("identifier"));
		 * emailObj.click(); emailObj.sendKeys("dsfdsfsfsdfs"); emailObj.clear();
		 * emailObj.sendKeys("nag022@gmail.com");
		 */	
	}
}
