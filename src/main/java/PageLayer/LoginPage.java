package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class LoginPage extends BaseClass{

	@FindBy(name="user-name")
	private WebElement Userame;
	
	
	@FindBy(name="password")
	private WebElement Password;
	
	
	@FindBy(name="login-button")
	private WebElement loginBtn;
	

	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunctioanlity(String Usname,String Pass)
	{
		WebElementHelper.sendKeys(Userame, Usname);
		WebElementHelper.sendKeys(Password, Pass);
	}
	
	public void loginButtonFunctionality()
	{
		WebElementHelper.clickOnWebElement(loginBtn);
	}
}
