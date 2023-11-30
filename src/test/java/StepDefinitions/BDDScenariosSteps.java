package StepDefinitions;
import cucumber.api.java.en.Then;
import Amin.CapstoneWebAutomationProject.CastoneWebAutomationMainFile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
public class BDDScenariosSteps {
	
	CastoneWebAutomationMainFile NewCastoneWebAutomationMainFile;
	 
	
	@Given("User is navigating to {string}")
	public void user_is_navigating_to(String url) {
		
		NewCastoneWebAutomationMainFile = new CastoneWebAutomationMainFile(url, "", "", "");
	   
		System.out.println("URL" +NewCastoneWebAutomationMainFile.getURL());
		
	    
	}

	@When("User is adding {string} and {string}")
	public void user_is_adding_and(String email , String admin) {
		System.out.println("Email" +NewCastoneWebAutomationMainFile.getEmail() +"\nPassword"+NewCastoneWebAutomationMainFile.getPassword());
	    
	    
		
	}

	@When("User is clicking on {string} button")
	public void user_is_clicking_on_button(String string) {
	    System.out.println("LoggedIn"+NewCastoneWebAutomationMainFile.getLoggedIn());
	    
		
	}

	@Then("User is logged into Admin Application")
	public void user_is_logged_into_admin_application() {
	    // Write code here that turns the phrase above into concrete actions
	   
		
	}

}
