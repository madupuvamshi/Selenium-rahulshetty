package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.*;

public class MainSteps {
	@Given("user is on NetBanking login page")
	public void user_is_on_net_banking_login_page() {
		System.out.println("user is on NetBanking login page");
	}


	/*@When("user login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String username, String password) {
	System.out.println(username + " and password is " + password);
	}*/

	// regex method 
	@When("^user login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) {
		System.out.println(username + " and password is " + password);
	}
	
	@Given("user is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    System.out.println("user is on Practice landing page");
	}
	@When("user Signup into application")
	public void user_signup_into_application(List<String> data) {
	   System.out.println(data.get(0));
	   System.out.println(data.get(1));
	   System.out.println(data.get(2));
	   System.out.println(data.get(3));
	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home Page is displayed");
	}

	@Then("cards are displayed")
	public void cards_are_displayed() {
		System.out.println("cards are displayed");
	}
	 
	@Given("setup entries in database")
	public void setupEntries() {
		System.out.println("**************");
		System.out.println("setup entries in database");
	}
	
	@When("launch the browser from config variables")
	public void launchBrowser() {
		System.out.println("launch the browser from config variables");
	}
	
	@When("hit the homepage url of banking site")
	public void hitUrl() {
		System.out.println("hit the homepage url of banking site");
	}
		
}
