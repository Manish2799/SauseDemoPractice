Feature: Sauce Demo Application

  Scenario: Validate LoginPage Functionality
    Given user should open browser
    When user enter valid Username as "standard_user" and Password as "secret_sauce"
    Then user click on login button

   Scenario: Validate ProductPage Functionality
   When user should sort the product as "Price (high to low)"
   And user should select 3 products
   Then user should click on shopping Cart Trolly
   
   Scenario: Validate PersonalPage Functionality
   When user should click on checkout button
   And user should enter fname as "Swara" and lname as "Patil" and pcode as "112233"
   Then user shold click on continue button
   
   Scenario: Validate finish button and BackToHome button Functionality
   When user should click on  finish button
   And user should click on backto home button