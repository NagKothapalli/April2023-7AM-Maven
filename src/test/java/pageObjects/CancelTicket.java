package pageObjects;

import org.openqa.selenium.WebDriver;

import driverUtilities.WebDriverUtilities;
import generalUtilities.ReadTestData;

public class CancelTicket 
{
	WebDriver driver ;
	WebDriverUtilities driverUtils;
	ReadTestData readTestData;
	public CancelTicket(WebDriver driver)//1234
	{
		System.out.println("Constructor of login pageobject class");
		this.driver = driver; //a=a  //1234
		driverUtils = new WebDriverUtilities(driver); //1234
		readTestData = new ReadTestData("Dev");
	}
	String cancelXpath = "//a[@title='Cancel Ticket']";
	
	String tktNumberXpath = "//input[@name='id']";
	public void navigateToCancelTicket()
	{
		System.out.println("RC : Navigate to Cancel Ticket");
		driverUtils.clickElement(cancelXpath);
	}
	
	public void cancelTicket()
	{
		System.out.println("RC : Cancel Bus Ticket");
		driverUtils.enterText(tktNumberXpath, readTestData.getData("TicketNumber"));
	}

}
