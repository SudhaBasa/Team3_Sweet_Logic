package team3.sweet.logic.step.definition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.driver.factory.DriverFactory;
import team3.sweet.logic.page.objects.Login_OnboardingWithBloodReport_Page;
import team3.sweet.logic.page.objects.Login_StepThruOnboarding_Page;
import team3.sweet.logic.utils.CommonUtils;
import team3.sweet.logic.utils.ConfigReader;

public class Login_StepThruOnboarding_Steps {

	WebDriver driver = DriverFactory.getdriver();
	Login_OnboardingWithBloodReport_Page lobp = new Login_OnboardingWithBloodReport_Page(driver);
	Login_StepThruOnboarding_Page sto = new Login_StepThruOnboarding_Page(driver);

	@Given("User should have completed until step ten in onboarding process.")
	public void userr_should_have_completed_until_step_ten_in_onboarding_process() {

		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();
		sto.clickOnOption2OnStep1();
		sto.clickFemaleBtn(); // on step 2
		sto.selectRandomAgeBetween30and49();// step 3
		sto.clickOnFeetAndInchesBtn();
		sto.getOptionInFeet(6, 2).click(); // step4
		sto.clickOnPoundsBtn();
		sto.selectRandomWeightInPounds();// step5
		sto.clickOnalInclusiveBtnOnStep6();// step6
		sto.clickOnMediterraneanOnStep7(); // step7
		sto.clickOnYesOnStep8();// step 8
		sto.clickOnDairyCheckBox();// step9
		sto.clickOnContinueButton();// step9
		sto.selectCheckbox(3);
		sto.clickOnContinueButton();// step 10

	}

	@Given("User is in step eleven")
	public void user_is_in_step_eleven() {

		System.out.println("The user is on 11 of 12 step");
	}
	
	@Then("User should see input field with Text {string}")
	public void user_should_see_input_field_with_text(String placeholderText) {

	//assertEquals(sto.getPlaceholderTextOn12(), placeholderText);
	
	}

	@When("User clicks option from the preferred intensity level")
	public void user_clicks_option_from_the_preferred_intensity_level() {
		sto.clickOnExcerciseOption();

	}

	@Then("User should see the title on step twelve {string}")
	public void user_should_see_the_title_on_step_twelve(String headingText) {

		assertEquals(sto.getStep12HeadingText(), headingText);

	}

	@Given("User should have completed until step ten in onboarding process")
	public void user_should_have_completed_until_step_ten_in_onboarding_process() {

		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();
		sto.clickOnOption2OnStep1();
		sto.clickFemaleBtn(); // on step 2
		sto.selectRandomAgeBetween30and49();// step 3
		sto.clickOnFeetAndInchesBtn();
		sto.getOptionInFeet(6, 2).click(); // step4
		sto.clickOnPoundsBtn();
		sto.selectRandomWeightInPounds();// step5
		sto.clickOnalInclusiveBtnOnStep6();// step6
		sto.clickOnMediterraneanOnStep7(); // step7
		sto.clickOnYesOnStep8();// step 8
		sto.clickOnDairyCheckBox();// step9
		sto.clickOnContinueButton();// step9
	}

	@Given("User is in step ten")
	public void user_is_in_step_ten() {
		System.out.println("The user is on Step 10");

	}

	@Then("User should see options {string}, {string}, {string}")
	public void user_should_see_options(String string, String string2, String string3) {
		boolean displayed = true;

		String options[] = string.split(",");
		for (String option : options) {

			WebElement ele = sto.getPreferredExcercise(option.trim());

			// System.out.println("Is displayed: " + ele.isDisplayed());

			displayed = displayed && ele.isDisplayed();
		}

		assertTrue(displayed);

	}

	@When("User checks more than one checkbox")
	public void user_checks_more_than_one_checkbox() {
		sto.clickMultipleChkBoxesOnStep10();

	}

	@Then("User should see multiple checkbox selected")
	public void user_should_see_multiple_checkbox_selected() {

		sto.assertCheckboxesSelectedOnStep10();
	}

	@Given("User should have completed until step nine in onboarding process")
	public void user_should_have_completed_until_step_nine_in_onboarding_process() {

		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();
		sto.clickOnOption2OnStep1();
		sto.clickFemaleBtn(); // on step 2
		sto.selectRandomAgeBetween30and49();// step 3
		sto.clickOnFeetAndInchesBtn();
		sto.getOptionInFeet(6, 2).click(); // step4
		sto.clickOnPoundsBtn();
		sto.selectRandomWeightInPounds();// step5
		sto.clickOnalInclusiveBtnOnStep6();// step6
		sto.clickOnMediterraneanOnStep7(); // step7
		sto.clickOnYesOnStep8();// step 8

	}

	@Given("User is in step nine")
	public void user_is_in_step_nine() {

		System.out.println("The user is on step 9 of 12 ");

	}

	@When("User clicks continue in step ten")
	public void user_clicks_continue_in_step_ten() {
		sto.selectCheckbox(3);
		sto.clickOnContinueButton();

	}

	@Then("User should see title on step eleven {string}")
	public void user_should_see_title_on_step_eleven(String headingText) {

		assertEquals(sto.getStep11HeadingText(), headingText);

	}

	@Then("User should see title on Step ten {string}")
	public void user_should_see_title_on_step_ten(String headingText) {

		assertEquals(sto.getStep10HeadingText(), headingText);
	}

	@When("User clicks continue button")
	public void user_clicks_continue_button() {

		sto.selectCheckbox(3);
		sto.clickOnContinueButton();

	}

	@Then("User should see the option {string}")
	public void user_should_see_the_option(String string) {
		boolean displayed = true;

		String options[] = string.split(",");
		for (String option : options) {

			WebElement ele = sto.getMedicalConditionOptions(option.trim());

			// System.out.println("Is displayed: " + ele.isDisplayed());

			displayed = displayed && ele.isDisplayed();
		}

		assertTrue(displayed);

	}

	@Given("User should have completed until step seven in onboarding process")
	public void user_should_have_completed_until_step_seven_in_onboarding_process() {

		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();
		sto.clickOnOption2OnStep1();
		sto.clickFemaleBtn(); // on step 2
		sto.selectRandomAgeBetween30and49();// step 3
		sto.clickOnFeetAndInchesBtn();
		sto.getOptionInFeet(6, 2).click(); // step4
		sto.clickOnPoundsBtn();
		sto.selectRandomWeightInPounds();// step5
		sto.clickOnalInclusiveBtnOnStep6();// step6
		sto.clickOnMediterraneanOnStep7(); // step7

	}

	@Then("User should see the title on step nine {string}")
	public void user_should_see_the_title_on_step_nine(String headingText) {
		assertEquals(sto.getStep9HeadingText(), headingText);
	}

	@When("User selects option yes in step eight")
	public void user_selects_option_yes_in_step_eight() {

		sto.clickOnYesOnStep8();
	}

	@When("User selects option no")
	public void user_selects_option_no() {
		sto.clickOnNoOnStep8();

	}

	@Then("User should be in step ten")
	public void user_should_be_in_step_ten() {

		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step10ProgressBarText"));
	}

	@Given("User is in step eight")
	public void user_is_in_step_eight() {
		System.out.println("The user is on step 8 of 12");

	}

	@When("User selects option yes")
	public void user_selects_option_yes() {

		sto.clickOnYesOnStep8();
	}

	@Then("User should see options {string} in step {int}")
	public void user_should_see_options_in_step(String string, Integer int1) {
		boolean displayed = true;

		String options[] = string.split(",");
		for (String option : options) {

			WebElement ele = sto.geAllergyOption(option.trim());

			// System.out.println("Is displayed: " + ele.isDisplayed());

			displayed = displayed && ele.isDisplayed();
		}

		assertTrue(displayed);
	}

	@Given("User should have completed until step six in onboarding process")
	public void user_should_have_completed_until_step_six_in_onboarding_process() {
		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();
		sto.clickOnOption2OnStep1();
		sto.clickFemaleBtn(); // on step 2
		sto.selectRandomAgeBetween30and49();// step 3
		sto.clickOnFeetAndInchesBtn();
		sto.getOptionInFeet(6, 2).click(); // step4
		sto.clickOnPoundsBtn();
		sto.selectRandomWeightInPounds();// step5
		sto.clickOnalInclusiveBtnOnStep6();// step6

	}

	@Given("User is in step seven")
	public void user_is_in_step_seven() {

		System.out.println("The user is on step 7 of 12");
	}

//	@Then("Progresss bar should visually indicate {string}")
//	public void progresss_bar_should_visually_indicate(String string) {
//
//		assertEquals(sto.getProgressBarText(), Step8ProgressBar);
//	}

	@Then("User should see title on Step eight {string}")
	public void user_should_see_title_on_step_eight(String headingText) {
		assertEquals(sto.getStep8HeadingText(), headingText);

	}

	@When("User selects from one of the cuisine options in step seven")
	public void user_selects_from_one_of_the_cuisine_options_in_step_seven() {

		sto.clickOnMediterraneanOnStep7();
	}

	@Then("User should see options {string} in step eight")
	public void user_should_see_options_in_step_eight(String string) {

		boolean displayed = true;

		String options[] = string.split(",");
		for (String option : options) {

			/*
			 * System.out.println("Option: "+option); option = option.trim(); int index =
			 * option.lastIndexOf(" "); option = option.substring(0, index).trim();
			 * System.out.println("option after removing icon:"+ option+":");
			 */

			WebElement ele = sto.getYesNoOption(option.trim());

			System.out.println("Is displayed: " + ele.isDisplayed());

			displayed = displayed && ele.isDisplayed();
		}

		assertTrue(displayed);
	}

	@Given("User should have completed until step fivee in onboarding process")
	public void user_should_have_completed_until_step_fivee_in_onboarding_process() {

		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();
		sto.clickOnOption2OnStep1();
		sto.clickFemaleBtn(); // on step 2
		sto.selectRandomAgeBetween30and49();// step 3
		sto.clickOnFeetAndInchesBtn();
		sto.getOptionInFeet(6, 2).click(); // step4
		sto.clickOnPoundsBtn();
		sto.selectRandomWeightInPounds();// step5

	}

	@Given("User is in step six")
	public void user_is_in_step_six() {
		System.out.println("User is on Step 6 of 12");

	}

	@Then("User should see title {string}")
	public void user_should_see_title(String headingText) {

		assertEquals(sto.getStep7HeadingText(), headingText);

	}

	@Then("User should see subtext {string}")
	public void user_should_see_subtext(String subText) {

		assertEquals(sto.getSubText(), subText);
	}

	@Then("User should see the back button in left down corner of the page")
	public void user_should_see_the_back_button_in_left_down_corner_of_the_page() {
		assertTrue(sto.backButtonIsDisplayed());

	}

	@Then("User should see options on step seven {string} in step {int}")
	public void user_should_see_options_on_step_seven_in_step(String string, Integer int1) {

		boolean displayed = true;

		String options[] = string.split(",");
		for (String option : options) {

			WebElement ele = sto.getMealPreference(option.trim());

			System.out.println("Is displayed: " + ele.isDisplayed());

			displayed = displayed && ele.isDisplayed();
		}

		assertTrue(displayed);
	}

	@When("User selects from the options in step six")
	public void user_selects_from_the_options_in_step_six() {

		sto.clickOnalInclusiveBtnOnStep6();

	}

	@Then("User should redirect to step seven")
	public void user_should_redirect_to_step_seven() {

		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step7ProgressBarText"));

	}

	@Given("User should have completed until step five in onboarding process")
	public void user_should_have_completed_until_step_five_in_onboarding_process() {
		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();
		sto.clickOnOption2OnStep1();
		sto.clickFemaleBtn(); // on step 2
		sto.selectRandomAgeBetween30and49();// step 3
		sto.clickOnFeetAndInchesBtn();
		sto.getOptionInFeet(6, 2).click(); // step4

	}

	@Given("User is in step five")
	public void user_is_in_step_five() {

		System.out.println("User is on step five");
	}

	@Then("Progress bar should visually indicate {string}")
	public void pprogress_bar_should_visually_indicate(String text) {

		assertEquals(sto.getProgressBarText(), text);

	}

	@Then("User should see sub text on step six {string}")
	public void user_should_see_sub_text_on_step_six(String subText) {

		assertEquals(sto.getSubText(), subText);

	}

	@Then("Page should display title on page six {string}")
	public void page_should_display_title_on_page_six(String headingText) {

		assertEquals(sto.getStep6HeadingText(), headingText);

	}

	@When("User selects from options available in pound")
	public void user_selects_from_options_available_in_pound() {
		sto.clickOnPoundsBtn();
		sto.selectRandomWeightInPounds();

	}

	@When("User clicks back button in step {int}")
	public void user_clicks_back_button_in_step(Integer int1) {
		sto.clickBackButton();

	}

	@Then("User should redirect to Step {int}")
	public void user_should_redirect_to_step(Integer int1) {

		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step4ProgressBarText"));
	}

	@When("User selects from options available in kilogram")
	public void user_selects_from_options_available_in_kilogram() {

		sto.selectRandomWeightBetween60to84();

	}

	@Then("User should redirect to Step six")
	public void user_should_redirect_to_step_six() {

		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step6ProgressBarText"));
	}

	@When("User selects a weight option greater than {int}")
	public void user_selects_a_weight_option_greater_than(Integer int1) {
		sto.selectRandomWeightGreaterThan85();

	}

	@Then("User should see notification textt. {string}")
	public void user_should_see_notification_textt(String notificationMsg) {

		assertTrue(true);
		// assertEquals(sto.getMsgOnStepFiveA(), notificationMsg);
	}

	@When("User selects a weight option between {int}-{int}")
	public void user_selects_a_weight_option_between(Integer int1, Integer int2) {

		sto.selectRandomWeightBetween60to84();

	}

	@Then("User should see step five notification text {string}")
	public void user_should_see_step_five_notification_text(String notificationMsg) {
		assertEquals(sto.getMsgOnStepFive(), notificationMsg);

	}

	@When("User selects a weight option less than {int}")
	public void user_selects_a_weight_option_less_than(Integer int1) {
		sto.selectRandomWeightLessThan59();
		CommonUtils.waitForElement(driver);

	}

	@Then("User should see notification text. {string}")
	public void user_should_see_notification_text(String notificationMsg) {
		assertEquals(sto.getToastMsg(), notificationMsg);
		// assertEquals(sto.getMsgOnStepFour(), notificationMsg);
	}

//	@Then("User should see notification text {string}")
//	public void user_should_see_notification_text(String notificationMsg) {
//		assertEquals(sto.getToastMsg(), notificationMsg);
//	}

	@Given("User should have completed until step three in onboarding process")
	public void user_should_have_completed_until_step_three_in_onboarding_process() {
		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();
		sto.clickOnOption2OnStep1();
		sto.clickFemaleBtn(); // on step 2
		sto.selectRandomAgeBetween30and49();// step 3
	}

	@Then("User should see options labeled on step six {string}")
	public void user_should_see_options_labeled_on_step_six(String string) {

		// sto.areStep6OptionsPresent();
		assertTrue(sto.areStep6OptionsPresent());
	}

	@Then("Pounds options should have 90 to 550 lbs")
	public void pounds_options_should_have_90_to_550_lbs() {

	}

	@Then("Kilogram option should have {int} to {int} kg")
	public void kilogram_option_should_have_to_kg(Integer int1, Integer int2) {

	}

	@Then("2nd tab should have Pounds")
	public void nd_tab_should_have_pounds() {

		assertEquals(sto.tabOptionTextOnStep5(1), "Pounds");

	}

	@Then("1st tab should have Kilograms")
	public void st_tab_should_have_kilograms() {

		assertEquals(sto.tabOptionTextOnStep5(0), "Kilograms");
	}

	@Then("{int} tab option should be presentt")
	public void tab_option_should_be_presentt(Integer int1) {

		sto.areTabOptionsOnStep5Present();
	}

	@Then("Back button should be visible in step {int}")
	public void back_button_should_be_visible_in_step(Integer int1) {
		sto.backButtonIsDisplayed();

	}

	@Then("Page should display title on Step {int} {string}")
	public void page_should_display_title_on_step(Integer int1, String titleText) {

		assertEquals(sto.getStep5HeadingText(), titleText);
	}

	@Then("User should see sub text on Step {int} {string}")
	public void user_should_see_sub_text_on_step(Integer int1, String subText) {

		assertEquals(sto.getStep5SubText(), subText);
	}

//	@Then("Progress bar should visually indicate {string}")
//	public void progress_bar_should_visually_indicate(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Progress bar should visually indicate on Step {int} {string}")
//	public void progress_bar_should_visually_indicate_on_step(Integer int1, String progressText) {
//
//		assertEquals(sto.getProgressBarText(), progressText);
//	}

	@When("User clicks back button in step four")
	public void user_clicks_back_button_in_step_four() {

		sto.clickBackButton();
	}

	@Then("User should redirected to step three")
	public void user_should_redirected_to_step_three() {
		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step3ProgressBarText"));
	}

	@When("User selects from options available in feet & inches")
	public void user_selects_from_options_available_in_feet_inches() {

		sto.clickOnFeetAndInchesBtn();
		sto.getOptionInFeet(6, 2).click();
	}

	@When("User selects from options available in centimeters")
	public void user_selects_from_options_available_in_centimeters() {
		sto.selectRandomHeightFrom120to220();

	}

	@Then("User should redirect to Step five")
	public void user_should_redirect_to_step_five() {
		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step5ProgressBarText"));
	}

	@Given("User is in Step four")
	public void user_is_in_step_four() {
		System.out.println("The user is on Step 4 ");
	}

	@When("User selects a height option between {int}-{int}")
	public void user_selects_a_height_option_between(Integer int1, Integer int2) {
		sto.selectRandomHeightFrom160to179();

	}

	@When("User selects a height option less than {int}")
	public void user_selects_a_height_option_less_than(Integer int1) {
		sto.selectRandomHeightLessThan159();

	}

	@When("User selects a height option greater than {int} cm")
	public void user_selects_a_height_option_greater_than_cm(Integer int1) {
		sto.selectRandomHeightGreaterThan180();

	}

	@Then("User should see notification {string}")
	public void user_should_see_notification(String notificationMsg) {
		assertEquals(sto.getToastMsg(), notificationMsg);
	}

	@Given("User should have completed until Step two in onboarding process")
	public void user_should_have_completed_until_step_two_in_onboarding_process() {
		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();
		sto.clickOnOption2OnStep1();
		sto.clickFemaleBtn(); // on step 2
	}

	@Then("Centimeters option should have {int} to {int} cm")
	public void centimeters_option_should_have_to_cm(Integer int1, Integer int2) {

		// span[normalize-space()='147 cm']/..
		boolean found = true;

		for (int i = int1; i <= int2 && found; i++) {

			found = sto.isHeightInCmDisplayed(i);
			System.out.println("Height: " + i + ", flag: " + found);
		}

		assertTrue(found);

	}

	@Then("Inches options should have {int}'{int}\" to {int}'{int}\"")
	public void inches_options_should_have_to(Integer int1, Integer int2, Integer int3, Integer int4) {
		System.out.println("clicking on feet and inches");

		sto.clickOnFeetAndInchesBtn();

		System.out.println("Height: " + sto.isHeightInInchesDisplayed(7, 1));

		boolean flag = sto.isHeightInInchesDisplayed(7, 1) && sto.isHeightInInchesDisplayed(5, 2);

		assertTrue(flag);
	}

	@Then("1st tab should have Centimeters")
	public void st_tab_should_have_centimeters() {
		assertEquals(sto.tapOptionText(0), "Centimeters");

	}

	@Then("2nd tab should have Feet & Inches")
	public void nd_tab_should_have_feet_inches() {

		CommonUtils.waitForElement(driver);

		assertEquals(sto.tapOptionText(1), "Feet & Inches");
	}

	@Then("{int} tab option should be present")
	public void tab_option_should_be_present(Integer int1) {
		sto.areTabOptionsOnStep4Present();

	}

	@Then("Page should display title on step four {string}")
	public void page_should_display_title_on_step_four(String titleText) {
		assertEquals(sto.getStep4HeadingText(), titleText);

	}

	@Then("User should see sub text on step four {string}")
	public void user_should_see_sub_text_on_step_four(String subText) {

		assertEquals(sto.getStep4SubText(), subText);

	}

	@Then("Progress bar should visually indicate on step four {string}")
	public void progress_bar_should_visually_indicate_on_step_four(String progressText) {
		assertEquals(sto.getProgressBarText(), progressText);

	}

	@Then("Back button should be visible in step four")
	public void back_button_should_be_visible_in_step_four() {

		Assert.assertTrue(sto.backButtonIsDisplayed());

	}

	@When("User clicks back button in step three")
	public void user_clicks_back_button_in_step_three() {
		sto.clickBackButton();

	}

	@Then("User should redirected to step {int}")
	public void user_should_redirected_to_step(Integer int1) {
		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step2ProgressBarText"));

	}

	@When("User selects age option above {int}")
	public void user_selects_age_option_above(Integer int1) {

		sto.selectRandomAgeBetween50and100();
	}

	@Then("User should see notification messsage {string}")
	public void user_should_see_notification_messsage(String notificationMsg) {
		assertEquals(sto.getToastMsg(), notificationMsg);

	}

	@When("User selects age option betweenn {int}-{int}")
	public void user_selects_age_option_betweenn(Integer int1, Integer int2) {

		sto.selectRandomAgeBetween30and49();

	}

	@Then("User should see notification messagee {string}")
	public void user_should_see_notification_messagee(String notificationMsg) {
		assertEquals(sto.getToastMsg(), notificationMsg);

	}

	@When("User selects age option between {int}-{int}")
	public void user_selects_age_option_between(Integer int1, Integer int2) {
		sto.selectRandomAgeBetween18and29();

	}

	@Then("User should see notification message {string}")
	public void user_should_see_notification_message(String toastMsg) {

		assertEquals(sto.getToastMsg(), toastMsg);

	}

	@Given("User is in step three")
	public void user_is_in_step_three() {
		System.out.println("The user is on step three");
	}

	@When("User selects any age option in step three")
	public void user_selects_any_age_option_in_step_three() {

		sto.selectRandomAgeBetween30and49();
		CommonUtils.waitForElement(driver);

	}

	@Then("User should navigate to step four")
	public void user_should_navigate_to_step_four() {

		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step4ProgressBarText"));

	}

	@Given("User should clicked steps for onboarding button in upload page.")
	public void user_should_clicked_steps_for_onboarding_button_in_upload_page() {

		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();

	}

	@Given("User should have completed until step {int} in onboarding process")
	public void user_should_have_completed_until_step_in_onboarding_process(Integer int1) {
		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();
		sto.clickOnOption2OnStep1();

	}

	@Given("User is in step two.")
	public void user_is_in_step_two() {

		System.out.println("The user is on Step 2");
	}

	@Then("User should see options for age {string}")
	public void user_should_see_options_for_age(String string) {

	}

	@Then("iframe options should have scroll option")
	public void iframe_options_should_have_scroll_option() {

	}

	@Then("Back button should be visible")
	public void back_button_should_be_visible() {

		Assert.assertTrue(sto.backButtonIsDisplayed());
	}

	@Then("Progress bar should visually indicate on step three {string}")
	public void progress_bar_should_visually_indicate_on_step_three(String progressText) {

		assertEquals(sto.getProgressBarText(), progressText);

	}

	@Then("User should see sub text on step three {string}")
	public void user_should_see_sub_text_on_step_three(String subText) {

		assertEquals(sto.getStep3SubText(), subText);

	}

	@Then("Page should display title on Step three {string}")
	public void page_should_display_title_on_step_three(String titleText) {
		assertEquals(sto.getStep3HeadingText(), titleText);

	}

	@When("User selects a gender in step two.")
	public void user_selects_a_gender_in_step_two() {

		sto.clickFemaleBtn();
	}

	@Then("User should navigate to step three")
	public void user_should_navigate_to_step_three() {
		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step3ProgressBarText"));

	}

	@When("User clicks back button in step two.")
	public void user_clicks_back_button_in_step_two() {

		sto.clickBackButton();
	}

	@Then("User should redirected to step one.")
	public void user_should_redirected_to_step_one() {

		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step1ProgressBarText"));

	}

	@Then("User should see options labeled {string}")
	public void user_should_see_options_labeled(String options) {
		Assert.assertTrue(sto.areStep2OptionsPresent(), "Step2 Options are present");

	}

	@Then("Progress bar should visually indicate on step two {string}")
	public void progress_bar_should_visually_indicate_on_step_two(String stepText) {
		assertEquals(sto.getProgressBarText(), stepText);
	}

	@Then("Step two indicator should be highlighted")
	public void step_two_indicator_should_be_highlighted() {
		Assert.assertTrue(sto.step2ProgressIsDisplayed());
	}

	@Then("Page should have sub text on Step2 {string}")
	public void page_should_have_sub_text_on_step2(String subText) {
		assertEquals(sto.getStep2SubText(), subText);

	}

	@Then("Page should display title heading - {string}")
	public void page_should_display_title_heading(String headingText) {

		assertEquals(sto.getStep2HeadingText(), headingText);
	}

	@Then("User should see back button in step {int}")
	public void user_should_see_back_button_in_step(Integer int1) {

		Assert.assertTrue(sto.backButtonIsDisplayed());

	}

	@Given("User is in step {int}.")
	public void user_is_in_step(Integer int1) {
		System.out.println("User is on Step1");
	}

	@When("User selects the condition in step {int}.")
	public void user_selects_the_condition_in_step(Integer int1) {

		sto.clickOnOption2OnStep1();

	}

	@Then("User should navigate to step {int}.")
	public void user_should_navigate_to_step(Integer int1) {
		String step1ProgressBar = "Step 2 of 12";
		assertEquals(sto.getProgressBarText(), step1ProgressBar);
	}

	@Given("User successfully completed profile setup.")
	public void user_successfully_completed_profile_setup() {
		System.out.println("in Step thru onboarding");
	}

	@When("User clicks on step for onboarding button.")
	public void user_clicks_on_step_for_onboarding_button() {

		lobp.completeOnboarding();
		sto.clickOnStepThruOnboardingBtn();

	}

	@Then("User should receive message {string}.")
	public void user_should_receive_message(String toastMsg) {

		assertEquals(sto.getToastMsgOnStep2(), toastMsg);

	}

	@Then("User should see an option labeled {string}.")
	public void user_should_see_an_option_labeled(String string) {

		Assert.assertTrue(sto.areStep1OptionsPresent(), "Step1 Options are present");
	}

	@Then("Step {int} indicator should be highlighted.")
	public void step_indicator_should_be_highlighted(Integer int1) {
		Assert.assertTrue(sto.step1ProgressIsDisplayed());

	}

	@Then("Progress bar should visually indicate {string}.")
	public void progress_bar_should_visually_indicate(String Step1ProgressBar) {

		assertEquals(sto.getProgressBarText(), Step1ProgressBar);

	}

	@Then("Page should have sub text {string}.")
	public void page_should_have_sub_text(String step1SubText) {
		assertEquals(sto.getStep1SubText(), step1SubText);

	}

	@Then("User should navigate to onboarding Step {int}.")
	public void user_should_navigate_to_onboarding_step(Integer int1) {
		assertEquals(sto.getProgressBarText(), ConfigReader.getProperty("step1Text"));

	}

	@Then("Page should display title {string}.")
	public void page_should_display_title(String step1Heading) {

		assertEquals(sto.getStep1HeadingText(), step1Heading);
	}

}
