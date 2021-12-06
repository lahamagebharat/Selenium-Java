package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage  {

	
	public LoginPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="user-name") WebElement txtusername;
	@FindBy(name="password") WebElement txtpassword;
	@FindBy(xpath="//input[@id='login-button']") WebElement btnLogin;
	@FindBy(xpath="//div[@class='login_logo']") public WebElement imgLogo;
	
	
	public void loginMethod(String uname,String Pwd)
	{
		txtusername.clear();
		txtusername.sendKeys(uname);
		
		txtpassword.clear();
		txtpassword.sendKeys(Pwd);
		
		btnLogin.click();
	}
	public void enterUsername(String uname)
	{
		txtusername.clear();
		txtusername.sendKeys(uname);
	}
	public void enterPassword(String Pwd)
	{
		txtpassword.clear();
		txtpassword.sendKeys(Pwd);
	
	}
	public void clickOnLoginButton()
	{
		btnLogin.click();
	}
		
		
	
	
}
