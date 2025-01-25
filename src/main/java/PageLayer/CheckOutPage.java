package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class CheckOutPage extends BaseClass{
	
	@FindBy(id="finish")
	private WebElement finishButton;
	
	
	@FindBy(id="back-to-products")
	private WebElement BacktoHomeButton;
	
	public CheckOutPage()
	{
		PageFactory.initElements(driver, this);

	}
	
	public void finishButtonFunction()
	{
		WebElementHelper.clickOnWebElement(finishButton);
	}
	
	public void backToHomefunction()
	{
		WebElementHelper.clickOnWebElement(BacktoHomeButton);
	}
}
