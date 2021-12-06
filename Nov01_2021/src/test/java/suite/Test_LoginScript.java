package suite;


import base.Common;

import org.testng.annotations.*;

import pages.LoginPage;

public class Test_LoginScript extends Common {

	
	@Test
	void loginScript() throws InterruptedException
	{
		d.get("https://www.saucedemo.com/");
	
	LoginPage objLoginPage=new LoginPage(d);

	objLoginPage.loginMethod("standard_user", "secret_sauce");
	
	 Thread.sleep(2000);
	
}


}
