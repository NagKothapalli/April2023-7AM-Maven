package pageObjects;

import org.openqa.selenium.WebDriver;

import generalUtilities.ReadTestData;
public class Login
{
	WebDriver driver ;//null
	ReadTestData readTestData;
	public Login(WebDriver driver)//1234
	{
		System.out.println("Constructor of login pageobject class");
		this.driver = driver; //a=a  //1234
		readTestData = new ReadTestData("Dev");
	}
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		driver.get(readTestData.getData("URL")); //1234
	}
	
	public void loginToApplication()
	{
		System.out.println("RC : Login to Application");
	}
	
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	
	public void closeApplication()
	{
		System.out.println("RC : Close Application");
	}

}
