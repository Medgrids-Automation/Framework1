package Com.Medgrids.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Medgrids.pageObject.LoginPage;
import Com.medgrid.genricLibrary.WebDriverUtility;

public class TC_LoginPage_01 extends BaseClass {
	
	@Test
	public void loginTest() throws Throwable
	{
		WebDriverUtility wdu = new WebDriverUtility();
		wdu.pageMaximize(driver);
		
		driver.get(URL);
		logger.info("Open Url");
		LoginPage lp = new LoginPage(driver);
		lp.clickOn();
		logger.info("Click on profile");
		
		lp.setUsername(USERNAME);
		logger.info("Enter the username");
		
		lp.setPassword(PASSWORD);
		logger.info("Enter the pasword");
		
		lp.clickBtn();
		logger.info("Click on button");
		
		if(driver.getTitle().equals("medGrids"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
