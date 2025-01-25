package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Utils extends BaseClass {

	public static void selectProducts(List<WebElement> plist,int a)
	{
		for(int i=1; i<=a; i++)
		{
			plist.get(i).click();
		}

	}
}
