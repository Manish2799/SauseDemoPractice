package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class WebElementHelper extends BaseClass{

	public static void clickOnWebElement(WebElement wb)
	{
		wb.click();
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
		wb.sendKeys(value);
	}
	
	
	
}
