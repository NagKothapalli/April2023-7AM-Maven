package testScenarios;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.CancelTicket;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.TicketStatus;
import pageObjects.TrackService;

public class TestCases
{
	WebDriver driver;//null
	Login login ;
	Home home ;
	CancelTicket cancelTicket ;
	TicketStatus ticketStatus ;
	TrackService trackService ;
	public TestCases()
	{
		System.out.println("Constructor of TestCases class");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
		login = new Login(driver);//1234
		home = new Home(driver); //1234
		cancelTicket = new CancelTicket(driver);//1234
		ticketStatus = new TicketStatus(driver);//1234
		trackService = new TrackService(driver);//1234
	}	
	@Test
	public void bookBusTicketAndPrint() //Engineer1
	{
		System.out.println("TestCase : BookBusTicketAndPrint");
		//launch , login , bookTicket , printTicket , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHomePage();
		home.bookBusTicket();
		home.printBusTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketAndCancel() //Engineer2
	{
		System.out.println("TestCase : BookBusTicketAndCancel");
		//launch , login , bookTicket , cancelTicket , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHomePage();
		home.bookBusTicket();
		cancelTicket.navigateToCancelTicket();
		cancelTicket.cancelTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketAndCheckStatus() //Engineer3
	{
		System.out.println("TestCase : BookBusTicketAndCheckStatus");
		//launch , login , bookTicket , checkStatus , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHomePage();
		home.bookBusTicket();
		ticketStatus.navigateToTicketStatus();
		ticketStatus.checkTicketStatus();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketAndTrackService() //Engineer4
	{
		System.out.println("TestCase : BookBusTicketAndTrackService");
		//launch , login , bookTicket , trackService , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHomePage();
		home.bookBusTicket();
		trackService.navigateToTrackService();
		trackService.trackBusService();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketPrintAndCancel() //Engineer1
	{
		System.out.println("TestCase : BookBusTicketPrintAndCancel");
		//launch , login , bookTicket , print , cancel, logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHomePage();
		home.bookBusTicket();
		home.printBusTicket();
		cancelTicket.navigateToCancelTicket();
		cancelTicket.cancelTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	
	
	
	
	
	
	
	
	
}
