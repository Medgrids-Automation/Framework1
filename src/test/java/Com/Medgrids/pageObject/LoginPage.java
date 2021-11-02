package Com.Medgrids.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement clickButt;
	
	@FindBy(xpath="//input[@id='email_login']")
	private WebElement usernameEdt;
	
	@FindBy(xpath="//input[@id='password_login']")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//input[@id='userLoginSubmitBtn']")
	private WebElement signBtn;
	
	public WebElement getClickButt() {
		return clickButt;
	}
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getSignBtn() {
		return signBtn;
	}
	
	public void clickOn()
	{
		clickButt.click();
	}
	
	public void setUsername(String username) 
	{
		usernameEdt.sendKeys(username);
	}
	
	
	public void setPassword(String password) 
	{
	    passwordEdt.sendKeys(password);
	    
	}
	public void clickBtn()
	{
		signBtn.click();
	}
}
