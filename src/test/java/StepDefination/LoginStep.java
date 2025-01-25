package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass{

	static LoginPage loginPage;

@Given("user should open browser")
public void user_should_open_browser() {
   
	BaseClass.intialization();
}

@When("user enter valid Username as {string} and Password as {string}")
public void user_enter_valid_username_as_and_password_as(String Username, String Password) {

	 loginPage = new LoginPage();
	
	loginPage.loginFunctioanlity(Username, Password);
}

@Then("user click on login button")
public void user_click_on_login_button() {
    
	loginPage.loginButtonFunctionality();
}
}
