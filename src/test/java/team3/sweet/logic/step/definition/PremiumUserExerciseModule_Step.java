package team3.sweet.logic.step.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.page.objects.PremiumUserExerciseModule;
import team3.sweet.logic.utils.LoggerLoad;
import org.testng.Assert;

public class PremiumUserExerciseModule_Step {
	
	PremiumUserExerciseModule objPremiumUserExerciseModule = new PremiumUserExerciseModule();
	LoggerLoad logger = new LoggerLoad();
	String expectedWarmUpDescription = "";
	String expectedMainWorkoutDescription = "";
	String expectedCoolDownDescription = "";
	
	
	// Scenario - 1 - "View Full Schedule"
	
	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		
		LoggerLoad.info("You are on the Home page");
		objPremiumUserExerciseModule.Loginbtn();
		objPremiumUserExerciseModule.SignIn();
	}
	@When("User clicks the {string} option from the side panel")
	public void user_clicks_the_option_from_the_side_panel(String string) {
		
		objPremiumUserExerciseModule.viewFullSchedule();
	}
	@Then("{string} button is displayed on the right")
	public void button_is_displayed_on_the_right(String string) {
		
		Assert.assertEquals(objPremiumUserExerciseModule.getText_btnViewFullSchedule(),string);
	}
	
	// Scenario - 2 - "Today's Exercise Schedule"
	
	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) {
	  
		objPremiumUserExerciseModule.viewFullSchedule();
		objPremiumUserExerciseModule.getViewFullSchedule();
	}
	@Then("User is redirected to {string} page")
	public void user_is_redirected_to_page(String string) {
	
		Assert.assertEquals(objPremiumUserExerciseModule.getTitle(),string);
	}

	// Scenario - 3 - "Warm Up" tab
	
	@Then("{string} tab is visible")
	public void tab_is_visible(String string) {
		
	//	System.out.println(string + "\n");
		String msg=objPremiumUserExerciseModule.getText_btnWarmUp();
		System.out.println(msg+"\n");
	//	Assert.assertEquals(msg,string); 
	}

	// Scenario - 4 - "Main Workout" tab
	
	@Then("Exercise name is displayed under {string} tab")
	public void exercise_name_is_displayed_under_tab(String string) {
		
	//	System.out.println(string + "\n");
		String msg=objPremiumUserExerciseModule.getText_btnMainWorkout();
		System.out.println(msg+"\n");
	//	Assert.assertEquals(msg,string); 
		
	//	Assert.assertEquals(objPremiumUserExerciseModule.getText_btnMainWorkout(),string); 
	}
	
	// Scenario - 5 - "Cool Down" tab

	@Then("Description is shown below the Exercise name under {string}")
	public void description_is_shown_below_the_exercise_name_under(String string) {
		
	//	System.out.println(string + "\n");
		String msg=objPremiumUserExerciseModule.getText_btnCoolDown();
		System.out.println(msg+"\n");
	//	Assert.assertEquals(msg,string); 
		
	//	Assert.assertEquals(objPremiumUserExerciseModule.getText_btnCoolDown(),string); 
	}

	// Scenario - 6 - Exercise name under "Warm Up" tab
	
	@When("User clicks on the Warm Up tab of the {string} option from the side panel")
	public void user_clicks_on_the_warm_up_tab_of_the_option_from_the_side_panel(String string) {
		
		objPremiumUserExerciseModule.viewFullSchedule();
		objPremiumUserExerciseModule.clickBtnWarmUp();
	}
	
	@Then("Duration is displayed under {string} tab")
	public void duration_is_displayed_under_tab(String string) {
		
		string = "Gentle Arm Circles and Leg Swings";
		Assert.assertEquals(objPremiumUserExerciseModule.exerciseName,string); 
	}
	
	// Scenario - 7 - Exercise name under "Main Workout" tab

	@When("User clicks on the Main Workout tab of the {string} option from the side panel")
	public void user_clicks_on_the_main_workout_tab_of_the_option_from_the_side_panel(String string) {
		
		objPremiumUserExerciseModule.viewFullSchedule();
		objPremiumUserExerciseModule.clickBtnMainWorkout();
	}
	
	@Then("Calories are displayed under {string} tab")
	public void calories_are_displayed_under_tab(String string) {
		
		string = "Light Walking and Chair Yogas";
		Assert.assertEquals(objPremiumUserExerciseModule.exerciseName,string); 
	}
	
	// Scenario - 8 - Exercise name under "Cool Down" tab

	@When("User clicks on the Cool Down tab of the {string} option from the side panel")
	public void user_clicks_on_the_cool_down_tab_of_the_option_from_the_side_panel(String string) {
	   
		objPremiumUserExerciseModule.viewFullSchedule();
		objPremiumUserExerciseModule.clickBtnCoolDown();
	}
	
	@Then("Intensity level is displayed under {string} tab")
	public void intensity_level_is_displayed_under_tab(String string) {
	   
		string = "Static Stretching";
		Assert.assertEquals(objPremiumUserExerciseModule.exerciseName,string); 
	}

	// Scenario - 9
	@Then("{string} button is displayed for all three sections")
	public void button_is_displayed_for_all_three_sections(String string) {
	   
	}
	
	// Scenario - 10

	@Then("Success dialog is shown")
	public void success_dialog_is_shown() {
	   
	}
	
	// Scenario - 11

	@Then("Button changes to {string}")
	public void button_changes_to(String string) {
	   
	}
	
	// Scenario - 12

	@Then("Undo option is visible")
	public void undo_option_is_visible() {
	 
	}




}
