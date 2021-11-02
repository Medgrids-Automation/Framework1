package Com.Medgrids.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.medgrid.genricLibrary.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='userName pl-2']")
	private WebElement mouseOver;
	
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement SignOut;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMouseOver() {
		return mouseOver;
	}

	public void clickProfile()
	{
		mouseOver(driver, mouseOver);
		SignOut.click();
	}
	
	public WebElement getSignOut() {
		return SignOut;
	}

}
