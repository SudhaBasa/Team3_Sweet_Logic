package team3.sweet.logic.step.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.page.objects.PremiumUserHomePage;
import team3.sweet.logic.utils.LoggerLoad;

public class PremiumUserHomePage_ValidationForRegisteredUser_Steps {

	PremiumUserHomePage premiumUser_HPobj = new PremiumUserHomePage();

	/*@Given("User is Logged into the app")
	 public void user_is_logged_into_the_app() {


		premiumUser_HPobj.Loginbtn();
		premiumUser_HPobj.SignIn();
	 }
	 
	 @Given("User is on the homepage")
	 public void user_is_on_the_homepage() {
	  
	  LoggerLoad.info("You are on the Home Page");
	 }
*/
	@Then("User should see the navigation bar displaying items in the order: Home,Logbook,Dashboard,Education")
	public void user_should_see_the_navigation_bar_displaying_items_in_the_order_home_logbook_dashboard_education() {
		premiumUser_HPobj.getNavigationSequence();

	}

	@Then("User should see flashing challenge yourself button")
	public void user_should_see_flashing_challenge_yourself_button() {
		premiumUser_HPobj.getFlashingChallengeButton();
	}

	@Then("Flashes in {int}.2s")
	public void flashes_in_2s(Integer int1) {
		premiumUser_HPobj.getFlashingChallengeButton();
	}

	@Then("User should see a  {string} button")
	public void user_should_see_a_button(String string) {
		premiumUser_HPobj.getFlashingChallengeButton();
	}

	@Then("User should see a gender-specific image based on the gender selected during the onboarding process")
	public void user_should_see_a_gender_specific_image_based_on_the_gender_selected_during_the_onboarding_process() {
		premiumUser_HPobj.genderImg();
	}

	@Then("User should see an emoji displayed on the top-right corner of the gender image")
	public void user_should_see_an_emoji_displayed_on_the_top_right_corner_of_the_gender_image() {
		premiumUser_HPobj.genderImgEmoji();
	}

	@Then("User should see label {string} below the gender image")
	public void user_should_see_label_below_the_gender_image(String string) {
		premiumUser_HPobj.genderImgLable();
	}

	@Then("User should see log button under gender image")
	public void user_should_see_log_button_under_gender_image() {
		premiumUser_HPobj.getLogButton();
	}

	@Then("User should see mood text based on the emoji")
	public void user_should_see_mood_text_based_on_the_emoji() {
		premiumUser_HPobj.genderImgLable();
	}

	@Then("User should see Week plan button")
	public void user_should_see_week_plan_button() {
		premiumUser_HPobj.getWeeklyPlanButton();
	}

	@Then("User should see \"Record New Data' text")
	public void user_should_see_record_new_data_text() {
		premiumUser_HPobj.getRecordNewData();
	}

	@Then("User should see {int} button options")
	public void user_should_see_button_options(Integer int1) {
		premiumUser_HPobj.allButtonOptionsPresence();
	}

	
	  @Then("User should see {string}") public void user_should_see(String string)
	  { premiumUser_HPobj.buttonOrder(string);
	  
	  }
	  
	  @When("When User clicks sign in after entering password") public void
	  when_user_clicks_sign_in_after_entering_password() {
	  premiumUser_HPobj.SignIn(); }
	  
	  @Then("User should see all the fields under {string} below Record New Data")
	 public void user_should_see_all_the_fields_under_below_record_new_data(String
	  string) { premiumUser_HPobj.buttonOrder(string); }
	  
	  
	  @Then("Activity icon should be present in blood glucose") public void
	  activity_icon_should_be_present_in_blood_glucose() {
	  premiumUser_HPobj.bloodGlucoseIcon(); }
	  
	  @Then("Running icon should be present in Physical activity") public void
	  running_icon_should_be_present_in_physical_activity() {
	  premiumUser_HPobj.physicalActivityIcon(); }
	  
	  @Then("Pizza icon should be present in food intake") public void
	  pizza_icon_should_be_present_in_food_intake() {
	  premiumUser_HPobj.foodIntakeIcon(); }
	  
	  @Then("Pill icon should be present in medication") public void
	  pill_icon_should_be_present_in_medication() {
	 premiumUser_HPobj.medicationIcon(); }
	 

}
