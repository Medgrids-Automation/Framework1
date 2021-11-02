package Com.medgrid.genricLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseClassess {
	
	public WebDriver driver;
	public WebDriverUtility wLib = new WebDriverUtility();
	public PropertyUtility pu= new PropertyUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public static WebDriver rdriver;
	
	public static WebDriver sdriver;
	
	@BeforeSuite
	public void configBS()
	{
		System.out.println("Connect to Database");
	}
//	@BeforeClass
//	public void configBC() throws Throwable
//	{
//		String browsername = pu.getPropertyKeyValue("browser");
//		if(browsername.equalsIgnoreCase("firefox"))
//		{
//			driver= new FirefoxDriver();
//		}
//		else if(browsername.equalsIgnoreCase("chrome"))
//		{
//			driver=new ChromeDriver();
//		}
//	}
//	
//	@BeforeMethod
//	public void setUp() throws Throwable
//	{
//		
//		String USERNAME = pu.getPropertyKeyValue("username");
//		String PASSWORD = pu.getPropertyKeyValue("password");
//		String URL = pu.getPropertyKeyValue("url");
//		driver.get(URL);	
//		
//		// Login to the application
//		
////		LoginPage lp = new LoginPage(driver);
////		//lp.clickOn();
////		lp.login(USERNAME, PASSWORD);
//	}
//	
//	@AfterMethod
//	public void tearDown()
//	{
//		//hp.clickProfile();
//	}
//	@AfterClass
//	public void configAC()
//	{
//		driver.close();
//	}
	
	@AfterSuite
	public void configAS()
	{
		System.out.println("Close the connection from Database");
	}

}
