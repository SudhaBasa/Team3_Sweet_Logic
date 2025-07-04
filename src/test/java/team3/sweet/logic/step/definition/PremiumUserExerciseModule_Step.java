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
	

	@Given("User is Logged into the app")
	public void user_is_logged_into_the_app() {

		objPremiumUserExerciseModule.Loginbtn();
		objPremiumUserExerciseModule.SignIn();
	}
	
	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		
		LoggerLoad.info("You are on the Home Page");
	}

	@When("User clicks the {string} option from the side panel")
	public void user_clicks_the_option_from_the_side_panel(String string) {

		objPremiumUserExerciseModule.viewFullSchedule();
	}

	@Then("{string} button is displayed on the right")
	public void button_is_displayed_on_the_right(String string) {

		Assert.assertEquals(objPremiumUserExerciseModule.getText_btnViewFullSchedule(), string);
	}

	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) {

		objPremiumUserExerciseModule.viewFullSchedule();
		objPremiumUserExerciseModule.getViewFullSchedule();
	}

	@Then("User is redirected to {string} page")
	public void user_is_redirected_to_page(String string) {

		Assert.assertEquals(objPremiumUserExerciseModule.getTitle(), string);
	}

	@Then("user should see Excercise tabs {string}")
	public void user_should_see_Excercise_tabs(String string) {

		Assert.assertTrue(objPremiumUserExerciseModule.areExerciseTabsVisible(), "Expected all tabs to be visible.");
		LoggerLoad.debug("Verified all Exercise tabs are visible.");
	}

	@Then("user should see {string} for all tabs")
	public void user_should_see_for_all_tabs(String expectedName) {

		switch (expectedName) {

		case "Gentle Arm Circles & Leg Swings":
			String actualWarmUp_ExerciseName = objPremiumUserExerciseModule.exerciseName_Warmup();
			LoggerLoad.debug("Actual text found for Exercise Name: " + actualWarmUp_ExerciseName);
			Assert.assertEquals(expectedName, actualWarmUp_ExerciseName);
			break;

		case "Light Walking & Gentle Yoga":
			String actualMainWorkOut_ExerciseName = objPremiumUserExerciseModule.exerciseName_MainWorkout();
			LoggerLoad.debug("Actual text found for Height: " + actualMainWorkOut_ExerciseName);
			Assert.assertEquals(expectedName, actualMainWorkOut_ExerciseName);
			break;

		case "Static Stretching":
			String actualCoolDown_ExerciseName = objPremiumUserExerciseModule.exerciseName_CoolDown();
			LoggerLoad.debug("Actual text found for Weight: " + actualCoolDown_ExerciseName);
			Assert.assertEquals(expectedName, actualCoolDown_ExerciseName);
			break;

		default:
			Assert.fail("Unexpected element: " + expectedName);
		}
	}

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
	
	@When("User clicks the {string} button for all three sections")
	public void user_clicks_the_button_for_all_three_sections(String exerciseTab) {
	    
		objPremiumUserExerciseModule.viewFullSchedule();
		objPremiumUserExerciseModule.checkBtnCompleted(exerciseTab);
	}

	@Then("Button changes to {string} all three {string} sections")
	public void button_changes_to_all_three_sections(String expectedCompletedMsg, String exerciseTab) {
	    
		String actualCompletedMsg = objPremiumUserExerciseModule.actualSuccessMsg;
		Assert.assertEquals("expectedCompletedMsg", actualCompletedMsg);
	}
	
	@Then("{string} option is visible for all three {string} sections")
	public void option_is_visible_for_all_three_sections(String expectedUndoMsg, String exerciseTab) {
		
		String actualUndoMsg = objPremiumUserExerciseModule.actualUndoMsg;
		Assert.assertEquals("Undo", actualUndoMsg);
	}
	
	@Given("User is in the Exercise section")
	public void user_is_in_the_exercise_section() {
		
		objPremiumUserExerciseModule.viewFullSchedule();
	}

	@When("User clicks Undo after marking Exercise as completed")
	public void user_clicks_undo_after_marking_exercise_as_completed() {
		
		objPremiumUserExerciseModule.checkUndobtnBack();
	}

	@Then("Button changes back to {string}")
	public void button_changes_back_to(String expectedResultMarkAsCompleted) {
		
		String actualResultMarkAsCompleted = objPremiumUserExerciseModule.actaulResultMarkAsCompleted;
		Assert.assertEquals(expectedResultMarkAsCompleted, actualResultMarkAsCompleted);
	}
	
	@When("User clicks {string}")
	public void user_clicks(String string) {
		
		objPremiumUserExerciseModule.viewFullSchedule();
		objPremiumUserExerciseModule.getViewFullSchedule();
	}

	@Then("User should see title {string}")
	public void user_should_see_title(String expectedTitle) {
	
		Assert.assertEquals(expectedTitle, objPremiumUserExerciseModule.getTitle());
	}
	@Then("User should see {string} button in Today's Exercise schedule page")
	public void user_should_see_button_in_today_s_exercise_schedule_page(String expectedResult) {
	   
		Assert.assertEquals(expectedResult, objPremiumUserExerciseModule.getText_btnBacktoHome());
	}
	
	@Then("{string} section should be visible")
	public void section_should_be_visible(String expectedResult) {
		
		Assert.assertEquals(expectedResult, objPremiumUserExerciseModule.getText_warmUpSectionElement());
	   
	}
	@Then("{string} should be visible")
	public void should_be_visible(String expectedExerciseName) {
		
		switch (expectedExerciseName) {

		case "Gentle Arm Circles & Leg Swings":
			String actualWarmUp_ExerciseName = objPremiumUserExerciseModule.getText_warmUpExerciseNameElement();
			Assert.assertEquals(expectedExerciseName, actualWarmUp_ExerciseName);
			break;

		case "Light Walking & Gentle Yoga":
			String actualMainWorkOut_ExerciseName = objPremiumUserExerciseModule.getText_mainWorkoutExerciseNameElement();
			Assert.assertEquals(expectedExerciseName, actualMainWorkOut_ExerciseName);
			break;

		case "Static Stretching":
			String actualCoolDown_ExerciseName = objPremiumUserExerciseModule.getText_coolDownExerciseNameElement();
			Assert.assertEquals(expectedExerciseName, actualCoolDown_ExerciseName);
			break;

		default:
			Assert.fail("Unexpected element: " + expectedExerciseName);
		}
	   
		
	}
	@Then("{string} should be visible for all three sections")
	public void should_be_visible_for_all_three_sections(String expectedExerciseDescription) {
		
		switch (expectedExerciseDescription) {

		case "Improves blood flow and joint mobility, preparing the body for light activity. Arm circles warm up the shoulders, while leg swings activate the hip flexors and hamstrings.":
			String actualWarmUp_ExerciseDescription = objPremiumUserExerciseModule.getText_warmUpDescriptionElement();
			Assert.assertEquals(expectedExerciseDescription, actualWarmUp_ExerciseDescription);
			break;

		case "Combines low-impact cardiovascular exercise with flexibility and balance work. Walking helps improve insulin sensitivity and blood sugar control, while yoga enhances circulation and reduces stress. Given the low glucose level of 4mg/dL, it's CRUCIAL to consume a fast-acting carbohydrate source (e.g., glucose tablets or juice) BEFORE starting this workout and monitor blood glucose frequently.":
			String actualMainWorkOut_ExerciseDescription = objPremiumUserExerciseModule.getText_mainWorkoutDescriptionElement();
			Assert.assertEquals(expectedExerciseDescription, actualMainWorkOut_ExerciseDescription);
			break;

		case "Slowly and gently stretch major muscle groups, holding each stretch for 20-30 seconds. Focus on hamstrings, quads, calves, chest, and shoulders. Improves flexibility and reduces muscle soreness.":
			String actualCoolDown_ExerciseDescription = objPremiumUserExerciseModule.getText_coolDownDescriptionElement();
			Assert.assertEquals(expectedExerciseDescription, actualCoolDown_ExerciseDescription);
			break;

		default:
			Assert.fail("Unexpected element: " + expectedExerciseDescription);
		}
	   
	}
	
	@Then("{string} should be visible for all sections")
	public void should_be_visible_for_all_sections(String expectedDuration) {
		
		switch (expectedDuration) {

		case "Duration: 5 minutes":
			String actualWarmUp_ExerciseDuration = objPremiumUserExerciseModule.getText_warmUpDurationElement();
			Assert.assertEquals(expectedDuration, actualWarmUp_ExerciseDuration);
			break;

		case "Duration: 30 minutes":		
			String actualMainWorkOut_ExerciseDuration = objPremiumUserExerciseModule.getText_mainWorkoutDurationElement();
			Assert.assertEquals(expectedDuration, actualMainWorkOut_ExerciseDuration);
			break;

		case "Duration: 10 minutes":		
			String actualCoolDown_ExerciseDuration = objPremiumUserExerciseModule.getText_coolDownDurationElement();
			Assert.assertEquals(expectedDuration, actualCoolDown_ExerciseDuration);
			break;

		default:
			Assert.fail("Unexpected element: " + expectedDuration);
		}
		
	    
	}
	
	@Then("user should see {string} for all sections")
	public void user_should_see_for_all_sections(String expectedCalories) {
		
		switch (expectedCalories) {

		case "Calories: 25":
			String actualWarmUp_ExerciseCalories = objPremiumUserExerciseModule.getText_warmUpCaloriesElement();
			Assert.assertEquals(expectedCalories, actualWarmUp_ExerciseCalories);
			break;

		case "Calories: 175":		
			String actualMainWorkOut_ExerciseCalories = objPremiumUserExerciseModule.getText_mainWorkoutCaloriesElement();
			Assert.assertEquals(expectedCalories, actualMainWorkOut_ExerciseCalories);
			break;

		case "Calories: 50":		
			String actualCoolDown_ExerciseCalories = objPremiumUserExerciseModule.getText_coolDownCaloriesElement();
			Assert.assertEquals(expectedCalories, actualCoolDown_ExerciseCalories);
			break;

		default:
			Assert.fail("Unexpected element: " + expectedCalories);
		}
	    
	}
	

	@Then("user should see {string} as per {string}")
	public void user_should_see_as_per(String expectedIntensity,String exptectedTab) {
		
		if (exptectedTab.equals("Warm Up")) {

			String actualWarmUp_ExerciseIntensity = objPremiumUserExerciseModule.getText_warmUpIntensityElement();
			Assert.assertEquals(expectedIntensity, actualWarmUp_ExerciseIntensity);
			
		} else if (exptectedTab.equals("Main Workout")) {

			String actualMainWorkOut_ExerciseIntensity = objPremiumUserExerciseModule.getText_mainWorkoutIntensityElement();
			Assert.assertEquals(expectedIntensity, actualMainWorkOut_ExerciseIntensity);
			
		} else {

			String actualCoolDown_ExerciseIntensity = objPremiumUserExerciseModule.getText_coolDownIntensityElement();
			Assert.assertEquals(expectedIntensity, actualCoolDown_ExerciseIntensity);
		}
	
	}
	
	@Then("{string} should be displayed")
	public void should_be_displayed(String expectedtotalDuration) {
	
		Assert.assertTrue(objPremiumUserExerciseModule.areTotalDurationVisible(), "Expected Total Duration is visible.");
	   
	}
	
	

	
	

	
	
	
	
	

	
	
	

	

}