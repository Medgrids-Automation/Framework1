package Com.Medgrids.testCase;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Com.Medgrids.pageObject.HomePage;
import Com.medgrid.genricLibrary.ExcelUtility;
import Com.medgrid.genricLibrary.PropertyUtility;
import Com.medgrid.genricLibrary.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	
	public PropertyUtility pu= new PropertyUtility();
	
	public String URL=pu.getApplicationURL();
	public String USERNAME=pu.getUserName();
	public String PASSWORD = pu.getPassWord();
	public String BROWSER = pu.getBrowser();
	
    public static WebDriver driver;
    public HomePage hp= new HomePage(driver);
	public static Logger logger;
	
	
	//@Parameters("browser")
    @BeforeClass
    public void setup(String br)
    {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		logger= Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("Log4j.properties");
    	
//		if(br.equals("chrome"))
//		{
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//    }
//		else if(br.equals("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}
//		
//		else if(br.equals("ie"))
//		{
//			WebDriverManager.iedriver().setup();;
//			driver = new EdgeDriver();
//		}
		
    }	
    @AfterClass
	public void tearDown()
	{
//    	hp.clickProfile();
//    	hp.getSignOut();
		driver.close();
	}

}

