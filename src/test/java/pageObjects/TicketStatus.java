package pageObjects;

import org.openqa.selenium.WebDriver;

import driverUtilities.WebDriverUtilities;
import generalUtilities.ReadTestData;

public class TicketStatus
{
	WebDriver driver ;
	WebDriverUtilities driverUtils;
	ReadTestData readTestData;
	public TicketStatus(WebDriver driver)//1234
	{
		System.out.println("Constructor of login pageobject class");
		this.driver = driver; //a=a  //1234
		driverUtils = new WebDriverUtilities(driver); //1234
		readTestData = new ReadTestData("Dev");
	}
	String fromCityXpath = "//*[@id='fromPlaceName']";
	public void navigateToTicketStatus()
	{
		System.out.println("RC : Navigate to Ticket Status");
	}
	
	public void checkTicketStatus()
	{
		System.out.println("RC : Check Bus Ticket Status");
	}


}
