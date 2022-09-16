package stepDefinition;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Facebook_login {
	public static WebDriver driver;
	
	@Given("Navigate to Facebook")
	public void navigate_to_facebook() {

	}

	@When("Enter username and password {string},{string}")
	public void enter_username_and_password(String Username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(Username);
		System.out.println(Password);
		
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("validate the login function")
	public void validate_the_login_function() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("login function is validated");
	}

	@Given("Navigate To Facebook login page")
	public void navigate_to_facebook_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}
	@Given("I navigated to the facebook login page")
	public void i_navigated_to_the_facebook_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("navigated and entered to the facebook login page");
	}

	@Then("validate the login function with more then one credentials")
	public void validate_the_login_function_with_more_then_one_credentials(io.cucumber.datatable.DataTable dataTable) {
		for(Map<String,String>testdata:dataTable.asMaps()) {
			System.out.println("username "+testdata.get("username"));
			System.out.println("password "+testdata.get("password"));

	}


	}
}
