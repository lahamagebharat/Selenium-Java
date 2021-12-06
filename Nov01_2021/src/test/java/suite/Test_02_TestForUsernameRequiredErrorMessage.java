package suite;


import base.Common;

import org.testng.Assert;
import org.testng.annotations.*;

import pages.LoginPage;

public class Test_02_TestForUsernameRequiredErrorMessage extends Common {

	
	@Test
	void loginScript() throws InterruptedException
	{
		d.get("https://www.saucedemo.com/");
	
	LoginPage objLoginPage=new LoginPage(d);

	objLoginPage.clickOnLoginButton();
	
	Assert.assertTrue(d.getPageSource().contains(" Username is required"));
	
	 Thread.sleep(2000);
	
}


}
