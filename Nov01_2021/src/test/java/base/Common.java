package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Common {
	public WebDriver d;

	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","/Users/santoshbhise/Desktop/ChromeDriver");	
		d=new ChromeDriver();
		d.manage().window().maximize();
	}
	
	@AfterMethod
	public void killBrowser() throws InterruptedException
	{
		 Thread.sleep(5000);
		 d.quit();
	}
}
