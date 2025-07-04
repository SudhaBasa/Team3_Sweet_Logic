package team3.sweet.logic.step.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.page.objects.PremiumUserHomePage;
import team3.sweet.logic.utils.LoggerLoad;

public class PremiumUserHomePage_ChallengeButtonFunctionality_Steps {

	PremiumUserHomePage premiumUser_HPobj=new PremiumUserHomePage();
//	
//	@Given("User is Logged into the app")
//	 public void user_is_logged_into_the_app() {
//
//
//		premiumUser_HPobj.Loginbtn();
//		premiumUser_HPobj.SignIn();
//	 }
//	 
//	 @Given("User is on the homepage")
//	 public void user_is_on_the_homepage() {
//	  
//	  LoggerLoad.info("You are on the Home Page");
//	 }

@When("User clicks Challenge button")
public void user_clicks_challenge_button() {
	premiumUser_HPobj.challengeButtonClick();
    
}

@Then("User should get pop window")
public void user_should_get_pop_window() {
	premiumUser_HPobj.challengePopWindow();
    
}
@Then("User should the see title {string}")
public void user_should_the_see_title(String string) {
	premiumUser_HPobj.challengePopWindowTitle();
}

@Then("user should see sub text {string}")
public void user_should_see_sub_text(String string) {
	premiumUser_HPobj.challengePopWindowSubTitle();
    
}

@Then("User should see two options for challenge option")
public void user_should_see_two_options_for_challenge_option() {
	premiumUser_HPobj.popWindowChallengeButtonOption();
    
}

@Then("User should see {string}  as first option")
public void user_should_see_as_first_option(String string) {
	premiumUser_HPobj.popWindowChallengeFirstButton();
    
}
@Then("User should see {string}  as second option")
public void user_should_see_as_second_option(String string) {
	premiumUser_HPobj.popWindowChallengeSecondButton();
    
}

}
