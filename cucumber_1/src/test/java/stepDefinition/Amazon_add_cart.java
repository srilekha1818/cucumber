package stepDefinition;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_add_cart {
	@Given("I landed on Amazon Page")
	public void i_landed_on_amazon_page() {
		System.out.println("amazon page");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("{string} message is displayed")
	public void message_is_displayed(String text) {
		System.out.println(text);
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("I landed on Amazon add to cart")
	public void i_landed_on_amazon_add_to_cart() {
		System.out.println("landed on amazon cart page");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Logged in with username {string} and password {string}")
	public void logged_in_with_username_and_password(String email, String password) {
		System.out.println(email);
		System.out.println(password);

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


@Then("added to cart")
public void added_to_cart() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("added to the cart");
}

	@Given("I landed on cart page")
	public void i_landed_on_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I landed on cart page");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Logged in with username {int}@gmail.com and password {int}")
	public void logged_in_with_username_gmail_com_and_password(io.cucumber.datatable.DataTable dataTable) {
		for(Map<String,String>testdata:dataTable.asMaps()) {
			System.out.println("username "+testdata.get("username"));
			System.out.println("password "+testdata.get("password"));

		}
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	
	
	}


