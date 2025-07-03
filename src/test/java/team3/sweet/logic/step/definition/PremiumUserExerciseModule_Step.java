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

		Assert.assertEquals(objPremiumUserExerciseModule.getText_btnViewFullSchedule(), string);
	}

	// Scenario - 2 - "Today's Exercise Schedule"

	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) {

		objPremiumUserExerciseModule.viewFullSchedule();
		objPremiumUserExerciseModule.getViewFullSchedule();
	}

	@Then("User is redirected to {string} page")
	public void user_is_redirected_to_page(String string) {

		Assert.assertEquals(objPremiumUserExerciseModule.getTitle(), string);
	}

	// Scenario - 3

	@Then("user should see tabs {string}")
	public void user_should_see_tabs(String string) {

		Assert.assertTrue(objPremiumUserExerciseModule.areExerciseTabsVisible(), "Expected all tabs to be visible.");
		LoggerLoad.debug("Verified all Exercise tabs are visible.");
	}

	// Scenario - 4

	@Then("user should see {string}")
	public void user_should_see(String expectedName) {

		switch (expectedName) {

		case "Gentle Arm Circles & Leg Swings":
			String actualWarmUp_ExerciseName = objPremiumUserExerciseModule.exerciseName_Warmup();
			LoggerLoad.debug("Actual text found for Exercise Name: " + actualWarmUp_ExerciseName);
			Assert.assertEquals(expectedName, actualWarmUp_ExerciseName);
			break;

		case "Light Walking & Gentle Stretching":
			String actualMainWorkOut_ExerciseName = objPremiumUserExerciseModule.exerciseName_MainWorkout();
			LoggerLoad.debug("Actual text found for Height: " + actualMainWorkOut_ExerciseName);
			Assert.assertEquals(expectedName, actualMainWorkOut_ExerciseName);
			break;

		case "Seated Breathing & Gentle Twists":
			String actualCoolDown_ExerciseName = objPremiumUserExerciseModule.exerciseName_CoolDown();
			LoggerLoad.debug("Actual text found for Weight: " + actualCoolDown_ExerciseName);
			Assert.assertEquals(expectedName, actualCoolDown_ExerciseName);
			break;

		default:
			Assert.fail("Unexpected element: " + expectedName);
		}
	}

	// Scenario - 5

	@Then("{string} is shown under the Exercise tab")
	public void is_shown_under_the_exercise_tab(String expectedName) {

		switch (expectedName) {

		case "Light arm circles forward and backward, followed by gentle leg swings forward and sideways to improve circulation and prepare muscles for activity. Focus on controlled movements.":
			String actualWarmUp_ExerciseDescription = objPremiumUserExerciseModule.exerciseDescription_Warmup();
			LoggerLoad.debug("Actual text found for Exercise Name: " + actualWarmUp_ExerciseDescription);
			Assert.assertEquals(expectedName, actualWarmUp_ExerciseDescription);
			break;

		case "A combination of slow-paced walking and gentle stretching exercises. Start with 20 minutes of walking at a comfortable pace, followed by static stretches like hamstring stretches, calf stretches, and shoulder stretches. Hold each stretch for 20-30 seconds.":
			String actualMainWorkOut_ExerciseDescription = objPremiumUserExerciseModule.exerciseDescription_MainWorkout();
			LoggerLoad.debug("Actual text found for Height: " + actualMainWorkOut_ExerciseDescription);
			Assert.assertEquals(expectedName, actualMainWorkOut_ExerciseDescription);
			break;

		case "Seated deep breathing exercises to lower heart rate and relax the body. Followed by gentle spinal twists to improve flexibility. Inhale deeply, exhale slowly.":
			String actualCoolDown_ExerciseDescription = objPremiumUserExerciseModule.exerciseDescription_CoolDown();
			LoggerLoad.debug("Actual text found for Weight: " + actualCoolDown_ExerciseDescription);
			Assert.assertEquals(expectedName, actualCoolDown_ExerciseDescription);
			break;

		default:
			Assert.fail("Unexpected element: " + expectedName);
		}
	}

	// Scenario - 6

	@Then("{string},{string},{string} is displayed under {string} tab")
	public void is_displayed_under_tab(String expectedDuration, String expectedCalories, String expectedIntensityLevel,
			String exerciseTab) {

		if (exerciseTab.equals("Warm Up")) {

			objPremiumUserExerciseModule.warnUpExerciseDetails();
			
		} else if (exerciseTab.equals("Main Workout")) {

			objPremiumUserExerciseModule.mainWorkoutExerciseDetails();
			
		} else {

			objPremiumUserExerciseModule.coolDownExerciseDetails();
		}

		String actualDuration = objPremiumUserExerciseModule.exerciseDuration;
		String actualCalories = objPremiumUserExerciseModule.exerciseCalories;
		String actualIntensityLevel = objPremiumUserExerciseModule.exerciseIntensity;
		Assert.assertEquals(expectedDuration, actualDuration);
		Assert.assertEquals(expectedCalories, actualCalories);
		Assert.assertEquals(expectedIntensityLevel, actualIntensityLevel);
	}
	
	@Then("{string} button is displayed for all three {string} sections")
	public void button_is_displayed_for_all_three_sections(String expectedResultMarkAsCompleted, String exerciseTab) {
		
		objPremiumUserExerciseModule.checkMarkAsCompleted(exerciseTab);
		String actualResultMarkAsCompleted = objPremiumUserExerciseModule.actaulResultMarkAsCompleted;
		System.out.println(expectedResultMarkAsCompleted+":");
		Assert.assertEquals(expectedResultMarkAsCompleted, actualResultMarkAsCompleted);
	}
	
	@When("User clicks the {string} button for all three {string} sections")
	public void user_clicks_the_button_for_all_three_sections(String string, String exerciseTab) {
		
		objPremiumUserExerciseModule.viewFullSchedule();
		objPremiumUserExerciseModule.checkSuccessDialog(exerciseTab);
	}

	@Then("Success dialog is shown for all three {string} sections")
	public void success_dialog_is_shown_for_all_three_sections(String exerciseTab) {
		
		String actualResultSuccessDialog= objPremiumUserExerciseModule.actualResultSuccessDialog;
		Assert.assertEquals("Success!", actualResultSuccessDialog);
	}

	@Then("Button changes to {string} all three {string} sections")
	public void button_changes_to_all_three_sections(String string, String string2) {
	    
	}

	@Then("Undo option is visible for all three {string} sections")
	public void undo_option_is_visible_for_all_three_sections(String string) {
	   
	}

	

}