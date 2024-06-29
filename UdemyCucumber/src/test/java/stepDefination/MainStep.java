package stepDefination;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainStep {
	
	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {
	    System.out.println("setup the entries in database");
	    
	}
	@When("launch the browser from config variable")
	public void launch_the_browser_from_config_variable() {
	    System.out.println("launch the browser from config variable");
	}
	@When("hit the Home page url of banking site")
	public void hit_the_home_page_url_of_banking_site() {
	    System.out.println("hit the Home page url of banking site");
	}
	@Given("user is on NetBanking landing Page")
	public void user_is_on_net_banking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("user is on NetBanking landing Page");
	}

	/*
	 * @When("user login into Appliaction") public void
	 * user_login_into_appliaction() { // Write code here that turns the phrase
	 * above into concrete actions //throw new io.cucumber.java.PendingException();
	 * System.out.println("user login into Appliaction"); }
	 */
	// @When("user login into Appliaction with {string} and password {string}")
	@When("^user login into Appliaction with (.+) and password (.+)$")
	public void user_login_into_appliaction_with_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println(username + " and password is " + password);
	}

	@Given("user is on Practice landing Page")
	public void user_is_on_practice_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is on Practice landing Page");

	}

	@When("user signup into Appliaction")
	public void user_signup_into_appliaction(List<String> data) {
		// driver.findElement(sendKeys(data.get(0)));
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("Home Page is displayed");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Cards are displayed");
		
		
		
		
		
	}

}
