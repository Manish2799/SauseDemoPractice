package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class DropdownHandle extends BaseClass{

	public static void HandleDropdown(WebElement wb,String ExpectedValue)
	{
		Select sel= new Select(wb);
		
		sel.selectByVisibleText(ExpectedValue);
	}
	public static void HandleDropdownByValue(WebElement wb,String Value)
	{
		Select sel= new Select(wb);
		
		sel.selectByValue(Value);
	}
	public static void HandleDropdownByIndex(WebElement wb,int indexposition)
	{
		Select sel= new Select(wb);
		
		sel.selectByIndex(indexposition);
	}
}
