package team3.sweet.logic.step.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.page.objects.PremiumUserHomePage;
import team3.sweet.logic.utils.LoggerLoad;

public class PremiumUserHomePage_ButtonNavigationVerification_Steps {
	PremiumUserHomePage premiumUser_HPobj=new PremiumUserHomePage();
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
	 
	@When("User clicks Weekly plan")
	public void user_clicks_weekly_plan() {
		//premiumUser_HPobj.Loginbtn();
		//premiumUser_HPobj.SignIn();
		premiumUser_HPobj.weeklyPlanButtonClick();
	   
	}

	@Then("User should get pdf download of weekly plan")
	public void user_should_get_pdf_download_of_weekly_plan() {
		premiumUser_HPobj.pdfDownload();
	   
	}

	@When("User clicks on Blood glucose button")
	public void user_clicks_on_blood_glucose_button() {
		premiumUser_HPobj.bloodGlucoseButtonClick();
	   
	}

	@Then("User should redirect to Blood Glucose popup window")
	public void user_should_redirect_to_blood_glucose_popup_window() {
		premiumUser_HPobj.bloodGlucosepPopup();
	   
	}

	@When("User clicks on physical activity button")
	public void user_clicks_on_physical_activity_button() {
		premiumUser_HPobj.physicalActivityButtonClick();
	   
	}

	@Then("User should redirect to physical activity popup window")
	public void user_should_redirect_to_physical_activity_popup_window() {
		premiumUser_HPobj.physicalGlucosepPopup();
	   
	}

	@When("User clicks on food intake button")
	public void user_clicks_on_food_intake_button() {
		premiumUser_HPobj.foodIntakeButtonClick();
	   
	}

	@Then("User should redirect to food intake popup window")
	public void user_should_redirect_to_food_intake_popup_window() {
		premiumUser_HPobj.foodIntakePopup();
	   
	}

	@When("User clicks on medication button")
	public void user_clicks_on_medication_button() {
		premiumUser_HPobj.medicationButtonClick();
	   
	}

	@Then("User should redirect to medication popup window")
	public void user_should_redirect_to_medication_popup_window() {
		premiumUser_HPobj.medicationPopup();
	   
	}

	@When("User clicks log button")
	public void user_clicks_log_button() {
		premiumUser_HPobj.logButtonClick();
	   
	}

	@Then("User should redirected to dashboard page")
	public void user_should_redirected_to_dashboard_page() {
		premiumUser_HPobj.dashboardPage();
	   
	}

}
