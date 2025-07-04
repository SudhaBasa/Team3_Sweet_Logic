package team3.sweet.logic.step.definition;

import static org.testng.Assert.assertEquals;


import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import team3.sweet.logic.driver.factory.DriverFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.assertions.Assertions;

import team3.sweet.logic.page.objects.CommonFeatureDashBoardPage_Page;
import team3.sweet.logic.page.objects.CommonFeatureforHomePage_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.utils.LoggerLoad;
import team3.sweet.logic.utils.ConfigReader;

public class CommonFeatureDashBoradPage_Step {
	
WebDriver driver = DriverFactory.getdriver();
	
CommonFeatureDashBoardPage_Page CFDP = new CommonFeatureDashBoardPage_Page(driver);
CommonFeatureforHomePage_Page CFHP = new CommonFeatureforHomePage_Page(driver);		
private WebDriverWait wait;
	
	@Given("User is in Home page for FreeUser")
	public void user_is_in_home_page_for_free_user() {
		driver.get( ConfigReader.getProperty("url"));
		CFHP.LoginPage();
		
	}


	@When("User clicks the Dashboard on the navigation bar")
	public void user_clicks_the_dashboard_on_the_navigation_bar() {
		CFHP.Login();
		CFDP.NavigatetoDashBoardPage();
	}
	
	@Then("User should see the {string} message in Homepage common User")
	public void user_should_see_the_message_in_homepage_common_user(String string) {
		String actualWelcomeText = CFDP.WelcomeMsgWithUserName(); 
	    String expectedUsername = ConfigReader.getProperty("Freeusername");

	    Assert.assertTrue("Expected welcome message to contain username '" + expectedUsername +
	               "' but found: " + actualWelcomeText,
	               actualWelcomeText.toLowerCase().contains(expectedUsername.toLowerCase()));     
	}
	
	@Then("User should see the text {string} in Homepage common User")
	public void user_should_see_the_text_in_homepage_common_user(String expectedText) {
		String actualText = CFDP.WelcomeMsgText();
	    System.out.println("Actual welcome sub text: " + actualText);
	    assertEquals(expectedText, actualText);
	}

	@Then("User should see Upgrade to Premium button")
	public void user_should_see_upgrade_to_premium_button() {
		CFDP.isUpgradeToPremiumBtnVisible();
		LoggerLoad.info("Upgrade To Premium Button is Visible");
	}


	@Then("User should see the header {string} with correct spelling")
	public void user_should_see_the_header_with_correct_spelling(String expectedText) {
		String actualText = CFDP.AccoununInfoText();
	    System.out.println("Actual Account Information Text: " + actualText);
	    assertEquals(expectedText, actualText);  
	}
		
	@Then("User should see Save Changes button in commanfeature dashborad")
	public void user_should_see_save_changes_button_in_commanfeature_dashborad() {
		CFDP.isSavechangesBtnVisible();
		LoggerLoad.info("Save Changes Button is Visible");  
	}

	@Then("User should see all the fields under {string} section in commanfeature dashborad")
	public void user_should_see_all_the_fields_under_section_in_commanfeature_dashborad(String expectedText) {
		LoggerLoad.debug("Validating expected text in the Batch Page: " + expectedText);

		switch (expectedText) {
		    case "Age":
		        String actualAge = CFDP.isAgeElement();
		        LoggerLoad.debug("Actual text found for Age: " + actualAge);
		        Assert.assertEquals("Text mismatch for Age", expectedText, actualAge);
		        break;

		    case "Height (cm)":
		        String actualHeight = CFDP.isHeightElement();
		        LoggerLoad.debug("Actual text found for Height: " + actualHeight);		        
		        Assert.assertEquals("Text mismatch for Height", expectedText, actualHeight);
		        break;

		    case "Weight (kg)":
		        String actualWeight = CFDP.isWeightElement();
		        LoggerLoad.debug("Actual text found for Weight: " + actualWeight);		        
		        Assert.assertEquals("Text mismatch for Weight", expectedText, actualWeight);
		        break;

		    case "Exercise Routine Level":
		        String actualExercise = CFDP.isExcerciseroutineElement();
		        LoggerLoad.debug("Actual text found for Exercise Routine Level: " + actualExercise);
		        Assert.assertEquals("Text mismatch for Exercise Routine Level", expectedText, actualExercise);
		        break;

		    case "Cuisine Preferences":
		        String actualCuisine = CFDP.isCusinepreferenceElement();
		        LoggerLoad.debug("Actual text found for Cuisine Preferences: " + actualCuisine);
		        Assert.assertEquals("Text mismatch for Cuisine Preferences", expectedText, actualCuisine);
		        break;

		    case "Food Allergies":
		        String actualAllergies = CFDP.isFoodAllergiesElement();
		        LoggerLoad.debug("Actual text found for Food Allergies: " + actualAllergies);
		        Assert.assertEquals("Text mismatch for Food Allergies", expectedText, actualAllergies);
		        break;

		    default:
		        Assert.fail("Unexpected element: " + expectedText);
		}
	}
	
	@Given("User is in Dashboard page for FreeUser")
	public void user_is_in_dashboard_page_for_free_user() {
		CFHP.Login();
		CFDP.NavigatetoDashBoardPage();  
	}

	@Given("User is in Home page for FreeUser after logged in")
	public void user_is_in_home_page_for_free_user_after_logged_in() {
		CFHP.Login();
		CFDP.NavigatetoDashBoardPage();
	}
	@When("User edit age field with valid data")
	public void user_edit_age_field_with_valid_data() {
		CFDP.EditAge();
		CFDP.ClickSavechanges();
	}

	@Then("User should see that entered age is displayed in that Age field in commonfeature Dashboard page")
	public void user_should_see_that_entered_age_is_displayed_in_that_age_field_in_commonfeature_dashboard_page() {
		String actualAge = CFDP.GetAgeValue();
	    LoggerLoad.debug("Actual age value in field: " + actualAge);

//	    assertEquals("Expected age field to show entered value.", "45", actualAge);
	    Assert.assertTrue("Expected only numeric value but found: " + actualAge, actualAge.matches("\\d+")); 
	}
	
	@When("User Edit height field with valid data")
	public void user_edit_height_field_with_valid_data() {
		CFDP.EditHeight();
		CFDP.ClickSavechanges();
	}

	@Then("User should see that entered height is displayed in Height field")
	public void user_should_see_that_entered_height_is_displayed_in_height_field() {
		String actualHeight = CFDP.GetHeightValue();
	    LoggerLoad.debug("Actual Height value in field: " + actualHeight);

//	    assertEquals("Expected Height field to show entered value.", "160", actualHeight);
	    Assert.assertTrue(actualHeight, actualHeight.matches("\\d+"));   
	}

	@When("User Edit Weight field with valid data")
	public void user_edit_weight_field_with_valid_data() {
		CFDP.EditWeight();
		CFDP.ClickSavechanges(); 
	}

	@Then("User should see that entered weight is displayed  in Weight field")
	public void user_should_see_that_entered_weight_is_displayed_in_weight_field() {
		String actualWeight = CFDP.GetWeightValue();
	    LoggerLoad.debug("Actual Weight value in field: " + actualWeight);

	    Assert.assertTrue(actualWeight, actualWeight.matches("\\d+"));   
	}

	@When("User clicks the dropdown of Exercise Routine Level")
	public void user_clicks_the_dropdown_of_exercise_routine_level() {
		CFDP.ClickDrpdownExcerciseroutine();
	}
	@Then("User should see the dropdown with options {string} in common feature Dashboard page")
	public void user_should_see_the_dropdown_with_options_in_common_feature_dashboard_page(String expectedText) {
		LoggerLoad.debug("Validating expected DropDown Options in Excercise Routine Level: " + expectedText);

		switch (expectedText) {
		    case "Easy":
		        String actualEasy = CFDP.GetEasyText();
		        LoggerLoad.debug("Actual text found for Easy: " + actualEasy);
		        Assert.assertEquals("Text mismatch for Easy", expectedText, actualEasy);
		        break;

		    case "Medium":
		        String actualMedium = CFDP.GetMediumText();
		        LoggerLoad.debug("Actual text found for Medium: " + actualMedium);		        
		        Assert.assertEquals("Text mismatch for Medium", expectedText, actualMedium);
		        break;

		    case "Hard":
		        String actualHard = CFDP.GetHardText();
		        LoggerLoad.debug("Actual text found for Hard: " + actualHard);		        
		        Assert.assertEquals("Text mismatch for Hard", expectedText, actualHard);
		        break;		    

		    default:
		        Assert.fail("Unexpected element: " + expectedText);
		}
	}
		
	@When("User clicks the dropdown of Cuisine Preferences in common feature Dashboard page")
	public void user_clicks_the_dropdown_of_cuisine_preferences_in_common_feature_dashboard_page() {
		CFDP.ClickDrpdownCusinepreference();
	}

	@Then("User should see the dropdown with list of cuisine types {string} in common feature Dashboard page")
	public void user_should_see_the_dropdown_with_list_of_cuisine_types_in_common_feature_dashboard_page(String expectedText) {
		LoggerLoad.debug("Validating expected DropDown Options in Cusine Prefernce: " + expectedText);

		switch (expectedText) {
		    case "Indian":
		        String actualIndian = CFDP.GetIndianText();
		        LoggerLoad.debug("Actual text found for Indian: " + actualIndian);
		        Assert.assertEquals("Text mismatch for Indian", expectedText, actualIndian);
		        break;

		    case "American":
		        String actualAmerican = CFDP.GetAmericanText();
		        LoggerLoad.debug("Actual text found for American: " + actualAmerican);		        
		        Assert.assertEquals("Text mismatch for American", expectedText, actualAmerican);
		        break;

		    case "Continental":
		        String actualContinental = CFDP.GetContinentalText();
		        LoggerLoad.debug("Actual text found for Continental: " + actualContinental);		        
		        Assert.assertEquals("Text mismatch for Continental", expectedText, actualContinental);
		        break;	
		    case "Mediterranean":
		        String actualMediterranean = CFDP.GetMediterraneanText();
		        LoggerLoad.debug("Actual text found for Mediterranean: " + actualMediterranean);		        
		        Assert.assertEquals("Text mismatch for Mediterranean", expectedText, actualMediterranean);
		        break;	
		        
		    case "Asian":
		        String actualAsian = CFDP.GetAsianText();
		        LoggerLoad.debug("Actual text found for Asian: " + actualAsian);		        
		        Assert.assertEquals("Text mismatch for Asian", expectedText, actualAsian);
		        break;
		    case "Middle Eastern":
		        String actualMiddleEastern = CFDP.GetMiddleEasternText();
		        LoggerLoad.debug("Actual text found for Middle Eastern: " + actualMiddleEastern);		        
		        Assert.assertEquals("Text mismatch for Middle Eastern", expectedText, actualMiddleEastern);
		        break;		    
		    case "Mexican":
		        String actualMexican = CFDP.GetMexicanText();
		        LoggerLoad.debug("Actual text found for Mexican: " + actualMexican);		        
		        Assert.assertEquals("Text mismatch for Mexican", expectedText, actualMexican);
		        break;		    

		    default:
		        Assert.fail("Unexpected element: " + expectedText);
		}
	} 
	
	@When("User clicks the dropdown of Food Allergies in common feature Dashboard page")
	public void user_clicks_the_dropdown_of_food_allergies_in_common_feature_dashboard_page() {
		CFDP.ClickDrpdownFoodAllergies();
	}

	@Then("User should see the dropdown list of common allergy options {string} in common feature Dashboard page")
	public void user_should_see_the_dropdown_list_of_common_allergy_options_in_common_feature_dashboard_page(String expectedOption) {	
	    List<String> actualOptions = CFDP.getFoodAllergyOptionTexts();
	    Assert.assertTrue(
	        "Expected option '" + expectedOption + "' not found in dropdown. Actual options: " + actualOptions,
	        actualOptions.contains(expectedOption)
	    );
	}

	@When("User edit age as {string}, weight as {string}, height as {string} and click Save Changes in common feature Dashboard page")
	public void user_edit_age_as_weight_as_height_as_and_click_save_changes_in_common_feature_dashboard_page(String Age, String Weight, String Height) 
	throws InterruptedException {
		CFDP.editAgeInvalid(Age);
		CFDP.editWeightInvalid(Weight);
		CFDP.editHeightInvalid(Height);
		CFDP.ClickSavechanges();
	}

	@Then("User should see Error message in common feature Dashboard page")
	public void user_should_see_error_message_in_common_feature_dashboard_page() {
	   
	}

	@When("User edit age valid as {string}, weight as {string}, height as {string} and click Save Changes in common feature Dashboard page")
	public void user_edit_age_valid_as_weight_as_height_as_and_click_save_changes_in_common_feature_dashboard_page(String string, String string2, String string3) {
	
	}

	@Then("User should see messages {string} in common feature Dashboard page")
	public void user_should_see_messages_in_common_feature_dashboard_page(String string) {
	   
	}

	@When("User scrolls  to the Stress Management section in common feature Dashboard page")
	public void user_scrolls_to_the_stress_management_section_in_common_feature_dashboard_page() {
		CFDP.scrollToStressManagementSection();
	    LoggerLoad.debug("Scrolled to Stress Management section.");  
	}

	@Then("User should see the Title  {string} in Homepage Common user")
	public void user_should_see_the_title_in_homepage_common_user(String expectedTitle) {
		String actualTitle = CFDP.getStressManagementHeaderText();
	    LoggerLoad.debug("Actual header text found: " + actualTitle);

	    // Check that it contains expected text
	    Assert.assertTrue("Expected header to contain text '" + expectedTitle 
	        + "' but found '" + actualTitle + "'", 
	        actualTitle.contains(expectedTitle));
	        
	    // Also ensure it is displayed
	    Assert.assertTrue("Header should be visible.", CFDP.isStressManagementHeaderVisible());
	}

	@Then("user should see tabs {string} in common feature Dashboard page")
	public void user_should_see_tabs_in_common_feature_dashboard_page(String string) {
		Assert.assertTrue("Expected all tabs to be visible.",
			CFDP.areStressmanagementsTabsVisible());
		    LoggerLoad.debug("Verified all stress management tabs are visible.");  
	}

	@When("User clicks on each tab in common feature Dashboard page")
	public void user_clicks_on_each_tab_in_common_feature_dashboard_page() {
		CFDP.scrollToStressManagementSection();
		
	    CFDP.clickMeditationTab();
        assertTrue(CFDP.isMeditationContentDisplayed());

        CFDP.clickBreathingTab();
        assertTrue(CFDP.isBreathingContentDisplayed());

        CFDP.clickMovementTab();
        assertTrue(CFDP.isMovementContentDisplayed());

        CFDP.clickMindfulnessTab();
        assertTrue(CFDP.isMindfulnessContentDisplayed());  
	}

	@Then("User should see corresponding display section in common feature Dashboard page")
	public void user_should_see_corresponding_display_section_in_common_feature_dashboard_page() {
		LoggerLoad.debug("All Tabs Section is Displayed");
	}

	@When("User clicks Meditation tab in common feature Dashboard page")
	public void user_clicks_meditation_tab_in_common_feature_dashboard_page() 
	throws InterruptedException {
		CFDP.scrollToStressManagementSection();
		CFDP.clickMeditationTab();
		Thread.sleep(2000);
	}

	@Then("User should see the content with title {string} in common feature Dashboard page")
	public void user_should_see_the_content_with_title_in_common_feature_dashboard_page(String expectedText) {
		String actualText = CFDP.isGuidedMeditationTitle();
	    System.out.println("Actual welcome sub text: " + actualText);
	    assertEquals(expectedText, actualText);  
	}
		@Then("User should see buttons for {string} in common feature Dashboard page")
		public void user_should_see_buttons_for_in_common_feature_dashboard_page(String expectedText) {
		LoggerLoad.debug("Validating Excersice Time Tab " + expectedText);

		switch (expectedText) {
		    case "5 min":
		        String actual5min = CFDP.is5minsTabTitle();
		        LoggerLoad.debug("Actual text found for 5 min: " + actual5min);
		        Assert.assertEquals("Text mismatch for 5 min", expectedText, actual5min);
		        break;

		    case "10 min":
		        String actual10min  = CFDP.is10minsTabTitle();
		        LoggerLoad.debug("Actual text found for 10 min : " + actual10min );		        
		        Assert.assertEquals("Text mismatch for 10 min ", expectedText, actual10min );
		        break;

		    case "15 min":
		        String actual15min = CFDP.is15minsTabTitle();
		        LoggerLoad.debug("Actual text found for 15 min: " + actual15min);		        
		        Assert.assertEquals("Text mismatch for 15 min", expectedText, actual15min);
		        break;	
		    
		    default:
		        Assert.fail("Unexpected element: " + expectedText);
		} 
	}

		@Then("User should see a progress bar with time indicators {string} by default in common feature Dashboard page")
		public void user_should_see_a_progress_bar_with_time_indicators_by_default_in_common_feature_dashboard_page(String timeIndicator) {
		Assert.assertTrue("Progress bar is not displayed", CFDP.isProgressBarDisplayed());
        Assert.assertTrue("Time indicator not displayed for: " + timeIndicator,
        		CFDP.isTimeIndicatorDisplayed(timeIndicator)); 
	}

		@When("User clicks audio play button in common feature Dashboard page")
		public void user_clicks_audio_play_button_in_common_feature_dashboard_page() {
		CFDP.scrollToProgressbar();
		CFDP.clickPlaybutton();
	}

	@Then("User Should see meditation audio should start playing and the progress bar should update accordingly in common feature Dashboard page")
	public void user_should_see_meditation_audio_should_start_playing_and_the_progress_bar_should_update_accordingly_in_common_feature_dashboard_page() 
    throws InterruptedException {
		String initialStyle = CFDP.getProgressBarStyle();
	    // wait a few seconds to allow progress
	    Thread.sleep(10000);
	    String updatedStyle = CFDP.getProgressBarStyle();
//	    Assert.assertNotEquals("Progress bar did not update after playing audio", initialStyle, updatedStyle); 
	}

	@When("User clicks Movement Tab in common feature Dashboard page")
	public void user_clicks_movement_tab_in_common_feature_dashboard_page() {
		CFDP.scrollToStreesMangementTab();
		CFDP.clickMovementTab();
	}

	@Then("User should see title {string} in common feature Dashboard page")
	public void user_should_see_title_in_common_feature_dashboard_page(String expectedTitle) {
		String actualTitle = CFDP.GentleMoventText();
	    LoggerLoad.debug("Actual header text found: " + actualTitle);
	    
	    Assert.assertTrue("Expected header to contain text '" + expectedTitle 
	        + "' but found '" + actualTitle + "'", actualTitle.contains(expectedTitle));	   
	    Assert.assertEquals("Gentle Movement", CFDP.GentleMoventText()); 
	}

	@When("User clicks Movement Tab and see Sescrption in common feature Dashboard page")
	public void user_clicks_movement_tab_and_see_sescrption_in_common_feature_dashboard_page() {
		CFDP.scrollToStreesMangementTab();
		CFDP.clickMovementTab(); 
	}


	@Then("User should see the description {string} in common feature Dashboard page")
	public void user_should_see_the_description_in_common_feature_dashboard_page(String expectedDescription) {
		switch (expectedDescription) {
        case "Simple stretches to release tension:":
            Assert.assertTrue(CFDP.Simplestrechtext.isDisplayed());
            Assert.assertTrue(CFDP.Simplestrechtext.getText().contains(expectedDescription));
            break;
        case "Neck rolls - 5 times each direction":
            Assert.assertTrue(CFDP.Neckstrech.isDisplayed());
            break;
        case "Shoulder circles - 10 times":
            Assert.assertTrue(CFDP.shouldercircle.isDisplayed());
            break;
        case "Wrist and ankle rotations":
            Assert.assertTrue(CFDP.Wristankle.isDisplayed());
            break;
        case "Gentle torso twists":
            Assert.assertTrue(CFDP.Gentletoros.isDisplayed());
            break;
        default:
            Assert.fail("Unhandled description: " + expectedDescription);
    } 
	}

	@When("User clicks Mindfulness tab in common feature Dashboard page")
	public void user_clicks_mindfulness_tab_in_common_feature_dashboard_page() {
		CFDP.scrollToStreesMangementTab();
		CFDP.clickMindfulnessTab();
	}
	@Then("User should see title in mindfulness tab {string} in common feature Dashboard page")
	public void user_should_see_title_in_mindfulness_tab_in_common_feature_dashboard_page(String expectedTitle) {
		String actualTitle = CFDP.PresentmomentAwaremessText();
	    LoggerLoad.debug("Actual header text found: " + actualTitle);
	    
	    Assert.assertTrue("Expected header to contain text '" + expectedTitle 
	        + "' but found '" + actualTitle + "'", actualTitle.contains(expectedTitle));	   
	    Assert.assertEquals("Present Moment Awareness", CFDP.PresentmomentAwaremessText());  
	}
	
	@Then("User should see the description in mindfullness Tab {string} in common feature Dashboard page")
	public void user_should_see_the_description_in_mindfullness_tab_in_common_feature_dashboard_page(String expectedDescription) {
		switch (expectedDescription) {
        case "Focus on your senses:":
            Assert.assertTrue(CFDP.Focusontext.isDisplayed());
            Assert.assertTrue(CFDP.Focusontext.getText().contains(expectedDescription));
            break;
        case "• Notice 5 things you can see":
            Assert.assertTrue(CFDP.Notethingstext.isDisplayed());
            break;
        case "• Identify 4 things you can touch":
            Assert.assertTrue(CFDP.identifytext.isDisplayed());
            break;
        case "• Listen for 3 different sounds":
            Assert.assertTrue(CFDP.Listdifftext.isDisplayed());
            break;
        case "• Find 2 things you can smell":
            Assert.assertTrue(CFDP.Findthingstext.isDisplayed());
            break;
        case "• Observe 1 thing you can taste":
            Assert.assertTrue(CFDP.observethingtext.isDisplayed());
            break;
        default:
            Assert.fail("Unhandled description: " + expectedDescription);
    }  
	}


	@When("User scroll to the end in common feature Dashboard page")
	public void user_scroll_to_the_end_in_common_feature_dashboard_page_() {
		CFDP.scrollToBenifitofDoabeticManagement();
	}

	@Then("User should see the list of benefits with explanation {string} and {string} in common feature Dashboard page")
	public void user_should_see_the_list_of_benefits_with_explanation_and_in_common_feature_dashboard_page(String benefit, String explanation) {
		
	    switch (benefit) {
	        case "Reduces Stress Hormones":
	            Assert.assertTrue(CFDP.Reducestress.isDisplayed());
	            Assert.assertEquals(CFDP.Reducestress.getText(), benefit);
	            Assert.assertTrue(CFDP.ReducestressExplain.isDisplayed());
	            Assert.assertEquals(CFDP.ReducestressExplain.getText(), explanation);
	            break;

	        case "Improves Sleep":
	            Assert.assertTrue(CFDP.Improvesleep.isDisplayed());
	            Assert.assertEquals(CFDP.Improvesleep.getText(), benefit);
	            Assert.assertTrue(CFDP.ImprovesleepExplain.isDisplayed());
	            Assert.assertEquals(CFDP.ImprovesleepExplain.getText(), explanation);
	            break;

	        case "Reduces Diabetes Distress":
	            Assert.assertTrue(CFDP.Reducediabetic.isDisplayed());
	            Assert.assertEquals(CFDP.Reducediabetic.getText(), benefit);
	            Assert.assertTrue(CFDP.ReducediabeticExplain.isDisplayed());
	            Assert.assertEquals(CFDP.ReducediabeticExplain.getText(), explanation);
	            break;

	        default:
	            Assert.fail("No matching WebElement mapping found for benefit: " + benefit);
	    }

	    System.out.println("Verified: " + benefit + " - " + explanation);
	}

	@When("User clicks breathing tab under stress management techniques in common feature Dashboard page")
	public void user_clicks_breathing_tab_under_stress_management_techniques_in_common_feature_dashboard_page() {
		CFDP.scrollToStreesMangementTab();
		CFDP.clickBreathingTab();
	}

	@Then("User should see the heading {string}  with the description {string} in common feature Dashboard page")
	public void user_should_see_the_heading_with_the_description_in_common_feature_dashboard_page(String heading, String description) {
		Assert.assertTrue(CFDP.BreathingTech.isDisplayed());
	    Assert.assertEquals(CFDP.BreathingTech.getText(), heading, "4-7-8 Breathing Technique");

	    Assert.assertTrue(CFDP.BreathingTechExplain.isDisplayed());
	    Assert.assertEquals(CFDP.BreathingTechExplain.getText(), description);

	    System.out.println("Verified heading: " + heading + " and description: " + description);
	}  
	

	@Then("User should see the {string} button on Breathing Page in common feature Dashboard page")
	public void user_should_see_the_button_on_breathing_page_in_common_feature_dashboard_page(String string) {
		Assert.assertTrue(CFDP.StartbreathingBtn.isDisplayed());
	}


	@Then("User should see the {string} counter text and value starting at {string}  in common feature Dashboard page")
	public void user_should_see_the_counter_text_and_value_starting_at_in_common_feature_dashboard_page(String heading, String description) {
		Assert.assertTrue(CFDP.Cyclecomplete.isDisplayed());
	    Assert.assertEquals(CFDP.Cyclecomplete.getText(), heading, "Cycles completed");

	    Assert.assertTrue(CFDP.CyclecompleteValue.isDisplayed());
	    Assert.assertEquals(CFDP.CyclecompleteValue.getText(), description, "0");  
	}
	 
	@Then("User should see the label {string} with a hyphen {string} as its current value in common feature Dashboard page")
	public void user_should_see_the_label_with_a_hyphen_as_its_current_value_in_common_feature_dashboard_page(String heading, String description) {
		Assert.assertTrue(CFDP.Currentphase.isDisplayed());
	    Assert.assertEquals(CFDP.Currentphase.getText(), heading, "Current phase");

	    Assert.assertTrue(CFDP.Currentphasevalue.isDisplayed());
	    Assert.assertEquals(CFDP.Currentphasevalue.getText(), description, "-");
	}


	@Then("User should see the steps {string} below in common feature Dashboard page")
	public void user_should_see_the_steps_below_in_common_feature_dashboard_page(String text) {
		Assert.assertTrue(CFDP.Inhale.isDisplayed());	    
	    Assert.assertTrue(CFDP.Hold.isDisplayed());	   
	    Assert.assertTrue(CFDP.Exhale.isDisplayed());
	    
	}


	@When("User clicks the {string} button during the breathing exercise in common feature Dashboard page")
	public void user_clicks_the_button_during_the_breathing_exercise_in_common_feature_dashboard_page(String string) {
		CFDP.scrollToStreesMangementTab();
		CFDP.clickBreathingTab();
		CFDP.ClickStartBreathbutton();
	}

	@Then("User should see the breathing cycles begin in common feature Dashboard page")
	public void user_should_see_the_breathing_cycles_begin_in_common_feature_dashboard_page()
	throws InterruptedException {
		// Wait for the cycle to start (simulate watching for change)
	    String initialStyle = CFDP.BreathingCycleIndicator.getDomAttribute("style");
	    Thread.sleep(3000);
	    String updatedStyle = CFDP.BreathingCycleIndicator.getDomAttribute("style");

	    Assert.assertNotEquals(initialStyle, updatedStyle, 
	        "Breathing cycle did not start or animate. Style unchanged.");

	    System.out.println("Breathing cycles animation started successfully.");  
	}

	@Given("User started Breathing cycle")
	public void user_started_breathing_cycle() {
	    
	}

	@When("User view the current phase begins in common feature Dashboard page")
	public void user_view_the_current_phase_begins_in_common_feature_dashboard_page() {
	    
	}
	@Then("User should see the breathing cycle displays  {int} seconds {string} for Inhale in common feature Dashboard page")
	public void user_should_see_the_breathing_cycle_displays_seconds_for_inhale_in_common_feature_dashboard_page(Integer int1, String string) {
	}

	@Then("User should see the breathing cycle displays {string} which last for {int} seconds for hold")
	public void user_should_see_the_breathing_cycle_displays_which_last_for_seconds_for_hold(String string, Integer int1) {
	    
	}

	@Then("User should see the breathing cycle displays {string} which last for {int} seconds for Exhale")
	public void user_should_see_the_breathing_cycle_displays_which_last_for_seconds_for_exhale(String string, Integer int1) {
	    
	}


	@Given("User see the inhale phase is completed")
	public void user_see_the_inhale_phase_is_completed() {
	    
	}

	@When("User view the next phase begins in common feature Dashboard page")
	public void user_view_the_next_phase_begins_in_common_feature_dashboard_page() {
	}

	@Given("User see the hold phase has completed")
	public void user_see_the_hold_phase_has_completed() {
	    
	}

	@Given("User completed one full cycle")
	public void user_completed_one_full_cycle() {
	    
	}

	@When("User completes full breathing cycle in common feature Dashboard page")
	public void user_completes_full_breathing_cycle_in_common_feature_dashboard_page() {
	   
	}


	@Then("User should see {string} counter should increased by {int}")
	public void user_should_see_counter_should_increased_by(String string, Integer int1) {
	    
	}

	@When("User see next phase begins in common feature Dashboard page")
	public void user_see_next_phase_begins_in_common_feature_dashboard_page() {
	   
	}

	@Then("User should see breathing cycle displays {string} which last for {int} seconds in common feature Dashboard page")
	public void user_should_see_breathing_cycle_displays_which_last_for_seconds_in_common_feature_dashboard_page(String string, Integer int1) {
	}

	@Then("User should see breathing exercise stops in common feature Dashboard page")
	public void user_should_see_breathing_exercise_stops_in_common_feature_dashboard_page() {
	   
	    
	}




}
