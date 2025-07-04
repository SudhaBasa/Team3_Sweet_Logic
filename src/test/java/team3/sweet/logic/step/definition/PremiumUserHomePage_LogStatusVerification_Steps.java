package team3.sweet.logic.step.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.page.objects.PremiumUserHomePage;

public class PremiumUserHomePage_LogStatusVerification_Steps {
	
	PremiumUserHomePage premiumUser_HPobj=new PremiumUserHomePage();
	
	@Given("User is in dashboard page")
	public void user_is_in_dashboard_page() {
		premiumUser_HPobj.Loginbtn();
		premiumUser_HPobj.SignIn();
		premiumUser_HPobj.logButtonClick();
		premiumUser_HPobj.dashboardPage();
	}

	@When("User clicks home tab after logging emotional state in dashboard")
	public void user_clicks_home_tab_after_logging_emotional_state_in_dashboard() {
		premiumUser_HPobj.logEmotionalState();
	}

	@Then("User should see emoji and mood text is changed")
	public void user_should_see_emoji_and_mood_text_is_changed() {
		premiumUser_HPobj.emojiDisplay();
	}

}
