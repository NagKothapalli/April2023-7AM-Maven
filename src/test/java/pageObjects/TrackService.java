package pageObjects;

import org.openqa.selenium.WebDriver;

import driverUtilities.WebDriverUtilities;
import generalUtilities.ReadTestData;

public class TrackService
{
	WebDriver driver ;
	WebDriverUtilities driverUtils;
	ReadTestData readTestData;
	public TrackService(WebDriver driver)//1234
	{
		System.out.println("Constructor of login pageobject class");
		this.driver = driver; //a=a  //1234
		driverUtils = new WebDriverUtilities(driver); //1234
		readTestData = new ReadTestData("Dev");
	}
	String fromCityXpath = "//*[@id='fromPlaceName']";
	public void navigateToTrackService()
	{
		System.out.println("RC : Navigate to Track Service");
	}
	
	public void trackBusService()
	{
		System.out.println("RC : Track the Bus Service");
	}

}
