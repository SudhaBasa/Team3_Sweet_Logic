package team3.sweet.logic.step.definition;

import static org.testng.Assert.assertEquals;


import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import team3.sweet.logic.driver.factory.DriverFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import team3.sweet.logic.page.objects.CommonFeatureforHomePage_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.utils.LoggerLoad;
import team3.sweet.logic.utils.ConfigReader;

public class CommonFeatureforHomePage_Step {
	
	WebDriver driver = DriverFactory.getdriver();
	
	CommonFeatureforHomePage_Page CFHP = new CommonFeatureforHomePage_Page(driver);
		
		private WebDriverWait wait;
			
	@Given("User is in password auth page")
	public void user_is_in_password_auth_page() {
		driver.get( ConfigReader.getProperty("url"));
		CFHP.LoginPage();
		
	}

	@When("User clicks sign in after entering password")
	public void user_clicks_sign_in_after_entering_password() {
		CFHP.Login();
	}

	@Then("User should see SweetBalance text  on the left side of the page.")
	public void user_should_see_sweet_balance_text_on_the_left_side_of_the_page() {
		String expectedText = "SweetBalance";
		String actualText = CFHP.getAppNameText().trim();
		assertEquals(expectedText,actualText ); 
		
	}

	@Then("User should see name displayed at the top-right corner of the home page.")
	public void user_should_see_name_displayed_at_the_top_right_corner_of_the_home_page() {
		
		    String expectedName = ConfigReader.getProperty("Freeusername");
		    String actualName = CFHP.getLoggedInUserName().trim();
		    LoggerLoad.info("User Name is:" + actualName);
		    assertEquals(expectedName, actualName);
		}

	@Then("User should see Logout link in the top-right corner.")
	public void user_should_see_logout_link_in_the_top_right_corner() {
		CFHP.isLogoutButtonVisible();
		LoggerLoad.info("LogoutLink Visible");
	}

	@Then("User should see top navigation bar on the page.")
	public void user_should_see_top_navigation_bar_on_the_page() {
		Assert.assertTrue("Nutrition tab should be visible", CFHP.isNavigationBarVisible());
		LoggerLoad.info("Nutrition Tab is Visible");
	}
	
	@Then("User should see Home tab in the top navigation bar.")
	public void user_should_see_home_tab_in_the_top_navigation_bar() {
		Assert.assertTrue("Home Tab is vissible",CFHP.isHomeTabVisible()); 
		LoggerLoad.info("Home Tab is Visible"); 
	}


	@Then("User should see Dashboard tab in the top navigation bar.")
	public void user_should_see_dashboard_tab_in_the_top_navigation_bar() {
		Assert.assertTrue("Dashboard Tab is vissible",CFHP.isDashboradTabVisible()); 
		LoggerLoad.info("Dashboard Tab is Visible");  
	}
	
	@Then("User should see Education tab in the top navigation bar.")
	public void user_should_see_education_tab_in_the_top_navigation_bar() {
		Assert.assertTrue("Education Tab is vissible",CFHP.isEducationTabVisible());  
		LoggerLoad.info("Education Tab is Visible"); 
	}
	
	@Then("User should see Current Status section heading on the home page.")
	public void user_should_see_current_status_section_heading_on_the_home_page() {
		Assert.assertTrue("Current Status is vissible",CFHP.iscurrentStatusVisible());  
		LoggerLoad.info("Current Status is vissible");  
	}

	@Then("User should see Last updated label below Current Status.")
	public void user_should_see_last_updated_label_below_current_status() {
		Assert.assertTrue("Last Updated Lable is vissible",CFHP.isLastupdatedVisible());  
		LoggerLoad.info("Last Updated Lable is vissible");   
	}
	
	@Then("User should see timestamp displayed next to the Last updated label.")
	public void user_should_see_timestamp_displayed_next_to_the_last_updated_label() {
		Assert.assertTrue("Time stamp next to Last Updated is vissible",CFHP.isTimenextcurrentstatusVisible());  
		LoggerLoad.info("Time stamp next to Last Updated is vissible");     
	}


	@Then("User should see last updated timestamp in {int}-hour format as hh:mm:ss or relative format like {string} or {string}.")
	public void user_should_see_last_updated_timestamp_in_hour_format_as_hh_mm_ss_or_relative_format_like_or(Integer int1, String string, String string2) {
	 
		String timeOnly = CFHP.getLastUpdatedTimestampText();
	    System.out.println("Extracted relative time: " + timeOnly);

	    boolean is12HourTime = timeOnly.matches("\\b(0?[1-9]|1[0-2]):[0-5][0-9]:[0-5][0-9]\\b");
	    boolean isRelativeTime = timeOnly.matches("\\b\\d+\\s*(min|hr|hours|h|secs|sec)\\s*ago\\b");

	    Assert.assertTrue("Timestamp should be in hh:mm:ss or relative format like '3 min ago'. "
	            + "Actual: " + timeOnly, is12HourTime || isRelativeTime);
	}
	
	
	@Then("User should see {int}-hour clock indicator with AM or PM.")
	public void user_should_see_hour_clock_indicator_with_am_or_pm(Integer int1) {
		Assert.assertTrue("Expected 12-hour clock indicator to be visible", CFHP.isTimenextcurrentstatusVisible());
	    Assert.assertTrue("Clock indicator should show time in 12-hour format with AM/PM. Found: " 
	            + CFHP.getLastUpdatedTimestampText(),
	            CFHP.hasAMorPM());  
	}

	@Then("User should see Latest HbA1C label.")
	public void user_should_see_latest_hb_a1c_label() {
		Assert.assertTrue("Latest HbA1C Lable is vissible",CFHP.isHbA1CVisible());  
		LoggerLoad.info("Latest HbA1C Lable is vissible");     
	}

	@Then("User should see BMI label.")
	public void user_should_see_bmi_label() {
		Assert.assertTrue("BMI Lable is vissible",CFHP.isBMILableVisible());  
		LoggerLoad.info("BMI Lable is vissible");       
	}

	
	@Then("User should see Average Blood Sugar value.")
	public void user_should_see_average_blood_sugar_value() {
		Assert.assertTrue("Average Blood Sugar Value is vissible",CFHP.AvgBloodSugarvalueVisible());  
		LoggerLoad.info("Average Blood Sugar Value is vissible");
	}

	@Then("User should see Normal as the condition text.")
	public void user_should_see_normal_as_the_condition_text() {
	    
	}

	@Then("User should see Pre-Diabetic as the condition text.")
	public void user_should_see_pre_diabetic_as_the_condition_text() {
	    
	}

	@Then("User should see Diabetic as the condition text.")
	public void user_should_see_diabetic_as_the_condition_text() {
	    
	}

	@Then("User should see Underweight as the BMI category.")
	public void user_should_see_underweight_as_the_bmi_category() {
	    
	}

	@Then("User should see Normal as the BMI category.")
	public void user_should_see_normal_as_the_bmi_category() {
	    
	}

	@Then("User should see Overweight as the BMI category.")
	public void user_should_see_overweight_as_the_bmi_category() {
	    
	}

	@Then("User should see Obese as the BMI category.")
	public void user_should_see_obese_as_the_bmi_category() {
	    
	}


	@Then("User should see mg\\/dL unit below Average Blood Sugar.")
	public void user_should_see_mg_d_l_unit_below_average_blood_sugar() {
		Assert.assertTrue("Expected mg/dL unit below Average Blood Sugar to be visible",
				CFHP.isAverageBloodSugarUnitVisible());

	    assertEquals("mg/dL",CFHP.getAverageBloodSugarUnitText()); 
	}

	@Then("User should see {string} title.")
	public void user_should_see_title(String string) {
		Assert.assertTrue("Today's Meal Plan is vissible",CFHP.isTodaymealplanVisible());  
		LoggerLoad.info("Today's Meal Plan is vissible"); 
	}

	@Then("User should see tabs {string}")
	public void user_should_see_tabs(String expectedText) {
		LoggerLoad.debug("Validating expected text in the Mentioned Tab: " + expectedText);

		switch (expectedText) {
		case "Breakfast":
			Assert.assertTrue(CFHP.isBreakfastElement("Breakfast"));
			break;

		case "Lunch":
			Assert.assertTrue(CFHP.isLunchElement("Lunch"));
			break;
		
		case "Dinner":
			Assert.assertTrue(CFHP.isDinnerElement("Dinner"));
			break;
		case "Snacks":
			Assert.assertTrue(CFHP.isSnackElement("Snacks"));
			break;
				
		default:
			Assert.fail("Unexpected element: " + expectedText);
		}  
	}

	@Then("{string} tab should be selected by default")
	public void tab_should_be_selected_by_default(String string) {
		Assert.assertTrue("Expected 'Breakfast' tab to be selected by default",
				CFHP.isBreakfastTabSelected());  
	}

	@Then("User should see sidebar tab container within the flex layout.")
	public void user_should_see_sidebar_tab_container_within_the_flex_layout() {
		Assert.assertTrue("Expected Flex container Tab is visible",
				CFHP.isFlexTabSelected());  
	}

	@Then("User should see Meal Plan label in the sidebar section.")
	public void user_should_see_meal_plan_label_in_the_sidebar_section() {
		Assert.assertTrue("Expected 'Meal plan' label to be visible in the sidebar inside flex container",
				CFHP.isMealPlanLabelVisible());  
	}
	
	@Then("User should see Exercise label in the sidebar section.")
	public void user_should_see_exercise_label_in_the_sidebar_section() {
		Assert.assertTrue("Expected 'Excercise' label to be visible in the sidebar inside flex container",
				CFHP.isExcerciseLabelVisible());  
	}


	@Then("User should see utensil icon \\(crossed fork and knife) in the Meal Plan tab.")
	public void user_should_see_utensil_icon_crossed_fork_and_knife_in_the_meal_plan_tab() {
		Assert.assertTrue("Expected 'MealPlan' Icon image to be visible in the sidebar inside flex container",
				CFHP.isMealplanIconVisible());  
	}

	@Then("User should see dumbbell icon in the Exercise tab.")
	public void user_should_see_dumbbell_icon_in_the_exercise_tab() {
		Assert.assertTrue("Expected 'Excercise' Icon image to be visible in the sidebar inside flex container",
				CFHP.isExcerciseIconVisible());  
	}

	@Then("User should see {string} button in the Meal Plan section.")
	public void user_should_see_button_in_the_meal_plan_section(String string) {
		Assert.assertTrue("Expected 'View Full Plan' Button to be visible ",
				CFHP.isViewfullplanBtnVisible());  
	}

	@Given("User is in home page")
	public void user_is_in_home_page() {
		CFHP.Login();  
	}

	@When("User clicks on the {string} section")
	public void user_clicks_on_the_section(String string) 
	throws InterruptedException {
		CFHP.BreakfastPage(); 
		Thread.sleep(2000);
	}

	@Then("Breakfast details  become visible")
	public void breakfast_details_become_visible() {
		Assert.assertTrue("Expected Breakfast section to be visible", CFHP.isBreakfastSectionVisible());

	    String text = CFHP.getBreakfastSectionText();
	    Assert.assertTrue("Expected Breakfast section text to contain 'Breakfast', but found: " + text,
	               text.contains("Breakfast"));  
	}
	@When("User clicks on the Lunch section")
	public void user_clicks_on_the_lunch_section() 
	throws InterruptedException {		
		CFHP.LunchPage(); 
		Thread.sleep(2000);
	}


	@Then("Lunch details  become visible")
	public void lunch_details_become_visible() {
		Assert.assertTrue("Expected Lunch section to be visible", CFHP.isLunchSectionVisible());

	    String text = CFHP.getLunchSectionText();
	    Assert.assertTrue("Expected Lunch section text to contain 'Lunch', but found: " + text,
	               text.contains("Lunch"));   
	}
	@When("User clicks on the Dinner section")
	public void user_clicks_on_the_dinner_section() 
	throws InterruptedException {
		CFHP.DinnerPage(); 
		Thread.sleep(2000);
	}

	@Then("Dinner details  become visible")
	public void dinner_details_become_visible() {
		Assert.assertTrue("Expected Dinner section to be visible", CFHP.isDinnerSectionVisible());

	    String text = CFHP.getDinnerSectionText();
	    Assert.assertTrue("Expected Dinner section text to contain 'Dinner', but found: " + text,
	               text.contains("Dinner"));      
	}
	
	@When("User clicks on the Snacks section")
	public void user_clicks_on_the_snacks_section() 
	throws InterruptedException {
		CFHP.SnackPage(); 
		Thread.sleep(2000); 
	}


	@Then("Snacks details  become visible")
	public void snacks_details_become_visible() {
		Assert.assertTrue("Expected Snacks section to be visible", CFHP.isSnackSectionVisible());

	    String text = CFHP.getSnackSectionText();
	    Assert.assertTrue("Expected Dinner section text to contain 'Snacks', but found: " + text,
	               text.contains("Snacks"));         
	}

	@When("User clicks meal section")
	public void user_clicks_meal_section() 
	throws InterruptedException {
		CFHP.BreakfastPage(); 
		Thread.sleep(2000); 
	}

	@Then("User should see dish title")
	public void user_should_see_dish_title() {
		Assert.assertTrue("Expected Dish Title' to be visible ",
				CFHP.isDishTitleVisible());   
	}

	@Then("User should see description for the dish")
	public void user_should_see_description_for_the_dish() {
		Assert.assertTrue("Expected Dish Description' to be visible ",
				CFHP.isDishDescVisible());   
	}

	@Then("User should see the pre-meal item name")
	public void user_should_see_the_pre_meal_item_name() {
		Assert.assertTrue("Expected Pre_Meal Item' to be visible ",
				CFHP.isPremealItemVisible());  
	}

	@Then("User should see the pre-meal calorie value")
	public void user_should_see_the_pre_meal_calorie_value() {
		Assert.assertTrue("Expected Pre_Meal Calories' to be visible ",
				CFHP.isPremealCaloriesVisible());  
	}
	@When("User clicks  Breakfast meal section")
	public void user_clicks_breakfast_meal_section() 
	throws InterruptedException {
		CFHP.BreakfastPage(); 
		Thread.sleep(2000);   
	}

	@Then("User should see indicator {string} for breakfast pre-meal")
	public void user_should_see_indicator_for_breakfast_pre_meal(String expectedIndicator) {
		String actualText = CFHP.getMealIndicatorText();
	    Assert.assertTrue("Expected indicator text to contain '" + expectedIndicator + "', but was: " + actualText,
	               actualText.contains(expectedIndicator));  
	}
	@When("User clicks  Lunch meal section")
	public void user_clicks_lunch_meal_section() 
	throws InterruptedException {		
			CFHP.LunchPage(); 
			Thread.sleep(2000);  
	}
	@Then("User should see indicator {string} for lunch  pre-meal")
	public void user_should_see_indicator_for_lunch_pre_meal(String expectedIndicator) {
		String actualText = CFHP.getMealIndicatorText();
	    Assert.assertTrue("Expected indicator text to contain '" + expectedIndicator + "', but was: " + actualText,
	               actualText.contains(expectedIndicator));    
	}
	@When("User clicks  Dinner meal section")
	public void user_clicks_dinner_meal_section() 
	throws InterruptedException {
			CFHP.DinnerPage(); 
			Thread.sleep(2000); 
	}

	@Then("User should see indicator {string} for dinner  pre-meal")
	public void user_should_see_indicator_for_dinner_pre_meal(String expectedIndicator) {
		String actualText = CFHP.getDinnerTimeFormat();
	    Assert.assertTrue("Expected indicator text to contain '" + expectedIndicator + "', but was: " + actualText,
	               actualText.contains(expectedIndicator));  
	}
	@When("User clicks  Snasks meal section")
	public void user_clicks_snasks_meal_section() 
	throws InterruptedException {
			CFHP.SnackPage(); 
			Thread.sleep(2000);   
	}

	@Then("User should see  {string} based time in pre-meal \\(eg : {int}:{int})")
	public void user_should_see_based_time_in_pre_meal_eg(String string, Integer int1, Integer int2) {
		String timeText = CFHP.getSnackTimeFormat();
		String timePart = timeText.split("\\s+")[0];
		Assert.assertTrue("Expected time in hh:mm format but found: " + timePart,
		           timePart.matches("\\d{1,2}:\\d{2}"));
	}
	

	@Then("User should see {string} oclock prebreakfast")
	public void user_should_see_oclock_prebreakfast(String hour) {
		String timeText = CFHP.getMealIndicatorText();
	    Assert.assertTrue("Expected time to start with '" + hour + ":' but found: " + timeText,
	               timeText.startsWith(hour));
	}

	@Then("User should see {string} oclock prelunch")
	public void user_should_see_oclock_prelunch(String hour) {
		String timeText = CFHP.getMealIndicatorText();
	    Assert.assertTrue("Expected time to start with '" + hour + ":' but found: " + timeText,
	               timeText.startsWith(hour));  
	}

	@Then("User should see {string} oclock predinner")
	public void user_should_see_oclock_predinner(String hour) {
		String timeText = CFHP.getDinnerTimeFormat();
	    Assert.assertTrue("Expected time to start with '" + hour + ":' but found: " + timeText,
	               timeText.startsWith(hour)); 
	}

	@Then("User should see green color for Carbs")
	public void user_should_see_green_color_for_carbs() {
		String color = CFHP.getCarbsBarBackgroundColor();
	    Assert.assertTrue("Expected Carbs bar to be green but found: " + color,
	               color.contains("34, 197, 94, 1"));  // very basic RGB check  
	}

	@Then("User should see purple color for Fat")
	public void user_should_see_purple_color_for_fat() {
		String color = CFHP.getFatBarBackgroundColor();
	    Assert.assertTrue("Expected Fat bar to be Purple but found: " + color,
	               color.contains("168, 85, 247, 1"));  // very basic RGB check    
	}

	@Then("User should see pink color for Protein")
	public void user_should_see_pink_color_for_protein() {
		String color = CFHP.getProtiesBarBackgroundColor();
	    Assert.assertTrue("Expected Protien bar to be Pink but found: " + color,
	               color.contains("168, 85, 247, 1"));  // very basic RGB check     
	}

	@Then("Measurement for Carbs should display the unit as {string}")
	public void measurement_for_carbs_should_display_the_unit_as(String expectedUnit) {
		String measurementText = CFHP.getCarbsMeasurementText();
	    Assert.assertTrue("Expected Carbs measurement to contain unit '" + expectedUnit + "' but was: " + measurementText,
	               measurementText.contains(expectedUnit));
	}
	@Then("Measurement for Protein should display the unit as {string}")
	public void measurement_for_protein_should_display_the_unit_as(String expectedUnit) {
		String measurementText = CFHP.getProtienMeasurementText();
	    Assert.assertTrue("Expected Carbs measurement to contain unit '" + expectedUnit + "' but was: " + measurementText,
	               measurementText.contains(expectedUnit)); 
	}
	@Then("Measurement for Fat should display the unit as {string}")
	public void measurement_for_fat_should_display_the_unit_as(String expectedUnit) {
		String measurementText = CFHP.getFatMeasurementText();
	    Assert.assertTrue("Expected Carbs measurement to contain unit '" + expectedUnit + "' but was: " + measurementText,
	               measurementText.contains(expectedUnit));  
	}

	@Then("User should see text {string} after the calorie value in pre meal")
	public void user_should_see_text_after_the_calorie_value_in_pre_meal(String string) {
		Assert.assertTrue("Expected Meal Calories to be visible", CFHP.isMealCaloriesVisible());

	    String text = CFHP.getMealCaloriesText();
	    Assert.assertTrue("Expected Meal Calories text to contain 'calories', but found: " + text,
	               text.contains("calories"));      
	}

	
}
