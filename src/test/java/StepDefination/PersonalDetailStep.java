package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.PersonalDetail;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalDetailStep extends BaseClass {

	
	static PersonalDetail personalDetailsPage;
@When("user should click on checkout button")
public void user_should_click_on_checkout_button() {
	 personalDetailsPage = new PersonalDetail();
	 
	 personalDetailsPage.clickOnCheckOut();
}
@When("user should enter fname as {string} and lname as {string} and pcode as {string}")
public void user_should_enter_fname_as_and_lname_as_and_pcode_as(String Firstname, String LastName, String ZipCode) {
	personalDetailsPage.enterPersonalDetail(Firstname, LastName, ZipCode);
}
@Then("user shold click on continue button")
public void user_shold_click_on_continue_button() {
	personalDetailsPage.clickOnContinuebtn();
}
}
