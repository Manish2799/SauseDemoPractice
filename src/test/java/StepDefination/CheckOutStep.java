package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.CheckOutPage;
import io.cucumber.java.en.When;

public class CheckOutStep extends BaseClass{

	static CheckOutPage check;
	@When("user should click on  finish button")
	public void user_should_click_on_finish_button() {
		 check = new CheckOutPage();
		
		check.finishButtonFunction();
	}
	@When("user should click on backto home button")
	public void user_should_click_on_backto_home_button() {
	   
		check.backToHomefunction();
	}
}
