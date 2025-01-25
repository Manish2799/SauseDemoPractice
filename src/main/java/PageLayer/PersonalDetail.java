package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class PersonalDetail extends BaseClass {
	
	@FindBy(name="checkout")
	private WebElement checkbtn;
	
	@FindBy(id="first-name")
	private WebElement fname;
	
	@FindBy(id="last-name")
	private WebElement lname;
	
	@FindBy(id="postal-code")
	private WebElement pcode;
	
	@FindBy(id="continue")
	private WebElement conti;
	
	
	
	public PersonalDetail()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCheckOut()
	{
		WebElementHelper.clickOnWebElement(checkbtn);
	}
	
	public void enterPersonalDetail(String Fname, String Lname, String Code)
	{
		WebElementHelper.sendKeys(fname, Fname);
		
		WebElementHelper.sendKeys(lname, Lname);
		
		WebElementHelper.sendKeys(pcode, Code);
	}
	
	
	public void clickOnContinuebtn()
	{
		WebElementHelper.clickOnWebElement(conti);
	}
	
	
	

}
