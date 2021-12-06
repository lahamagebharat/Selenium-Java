package suite;


import base.Common;

import org.testng.Assert;
import org.testng.annotations.*;

import pages.LoginPage;

public class Test_01_LogoPresetInLoginPage extends Common {

	
	@Test
	void loginScript() throws InterruptedException
	{
		d.get("https://www.saucedemo.com/");
	
	LoginPage objLoginPage=new LoginPage(d);

	Assert.assertTrue(objLoginPage.imgLogo.isDisplayed());
	
	 Thread.sleep(2000);
	
}


}
