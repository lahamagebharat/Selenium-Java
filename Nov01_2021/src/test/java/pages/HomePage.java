package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	public HomePage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack") WebElement btnAddtoCart;

	
	
	public void clickOnAddtocartMethod()
	{
		btnAddtoCart.click();
	}
	
	
}
