package suite;


import base.Common;
import org.testng.annotations.*;

import pages.HomePage;
import pages.LoginPage;

public class Test_AddFirtEelementInCart extends Common {

	
	@Test
	void loginScript() throws InterruptedException
	{
		d.navigate().to("https://www.saucedemo.com/");
	
	LoginPage objLoginPage=new LoginPage(d);
	HomePage objHomePage=new HomePage(d);
	
	objLoginPage.loginMethod("standard_user", "secret_sauce");
	
	objHomePage.clickOnAddtocartMethod();
	

	 Thread.sleep(2000);
	
}


}
