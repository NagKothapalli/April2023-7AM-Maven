package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverUtilities.WebDriverUtilities;
import generalUtilities.ReadTestData;

public class Home 
{
	WebDriver driver ;
	WebDriverUtilities driverUtils;
	ReadTestData readTestData;
	public Home(WebDriver driver)//1234
	{
		System.out.println("Constructor of login pageobject class");
		this.driver = driver; //a=a  //1234
		driverUtils = new WebDriverUtilities(driver); //1234
		readTestData = new ReadTestData("Dev");
	}
	String fromCityXpath = "//*[@id='fromPlaceName']";
	String toCityXpath = "//input[@name='destination']";	
	String openCalendarXpath = "//input[@name='txtJourneyDate']";
	String selectDateXpath = "//a[text()='28']";
	String searchBtnXpath = "//input[@value='Check Availability']";
	String applyNowXpath = "//div[@id='returnDiscountModal-content']//input[@title='Apply Now']";	
	String timeTableXpath = "//a[@title='TimeTable / Track']";
	String allServicesXpath = "//a[text()='All services Time Table & Tracking']";
	String homeXpath = "//a[@title='Home']";
	public void navigateToHomePage()
	{
		System.out.println("RC : Navigate to Home Page");
		driverUtils.clickElement(homeXpath);
	}
	public void bookBusTicket()
	{
		System.out.println("RC : Book Bus Ticket");
		driverUtils.enterText(fromCityXpath,readTestData.getData("FromCity")); 
		driverUtils.fixedWait(1);
		driverUtils.clickEnter();		
		//Step2: Enter to City wait one sec and click enter button
		driverUtils.enterText(toCityXpath,readTestData.getData("ToCity"));
		driverUtils.fixedWait(1);
		driverUtils.clickEnter();		
		//Step3:Open Calendar
		driverUtils.clickElement(openCalendarXpath);
		//Step4:Select Journey date and click search button
		//clickElement(selectDateXpath);
		selectJourneyDate(readTestData.getData("JDate"));
		driverUtils.clickElement(searchBtnXpath);
		//Step5: click Apply Now in the return journey modal popup
		driverUtils.clickElement(applyNowXpath);
	}
	public void selectJourneyDate(String jDate)
	{
		                              //a[text()='28']
		// Today is my 10 th birthday - "Today is my" +year+  " th birthday"
		driver.findElement(By.xpath("//a[text()='"+jDate+"']")).click();
	}
	
	public void printBusTicket()
	{
		System.out.println("RC : Print the Ticket");
	}

}
