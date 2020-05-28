package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import genericLib.Base;

public class LoginStepDefinition extends Base
{
	@Given("^user is in login page$")
	public void user_is_in_login_page()
	{
		openBrowser();
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password()
	{
		login();
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button()
	{
	    System.out.println("Login page is displayed");	    
	}

}
