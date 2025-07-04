package team3.sweet.logic.step.definition;


import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import team3.sweet.logic.driver.factory.DriverFactory;
import team3.sweet.logic.page.objects.Launch_Page;
import team3.sweet.logic.utils.ConfigReader;

public class Launch_VerifyHomepageUIComponents_Steps {
WebDriver driver = DriverFactory.getdriver();
	
	Launch_Page lp = new Launch_Page(driver);
	
	private WebDriverWait wait;


	



@Given("User launches the browser")
public void user_launches_the_browser() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User enters the SweetBalance url")
public void user_enters_the_sweet_balance_url() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see app name on the top left")
public void user_should_see_app_name_on_the_top_left() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see  the text {string} on screen")
public void user_should_see_the_text_on_screen(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see the heading {string} heading in firstpage")
public void user_should_see_the_heading_heading_in_firstpage(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see a {string} input button while launching the URL")
public void user_should_see_a_input_button_while_launching_the_url(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see the text {string} section")
public void user_should_see_the_text_section(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see a card with title {string} showing visibly")
public void user_should_see_a_card_with_title_showing_visibly(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see a {string} title card clearly")
public void user_should_see_a_title_card_clearly(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see a {string} title card next to Nutrition&Excercise card")
public void user_should_see_a_title_card_next_to_nutrition_excercise_card(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see the text \"Monitor glucose levels, medication, and vital statistics, Easy logging of daily readings,Visualize trends over time,Set personalized targets\"in Health Tracking card")
public void user_should_see_the_text_monitor_glucose_levels_medication_and_vital_statistics_easy_logging_of_daily_readings_visualize_trends_over_time_set_personalized_targets_in_health_tracking_card() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see the text  {string} in Nutrition & Excercise card")
public void user_should_see_the_text_in_nutrition_excercise_card(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see the text  {string} in Smart Insights card")
public void user_should_see_the_text_in_smart_insights_card(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see heart icon  in health tracking card")
public void user_should_see_heart_icon_in_health_tracking_card() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see activity inside square icon in nutrition excercise card")
public void user_should_see_activity_inside_square_icon_in_nutrition_excercise_card() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see clock icon in smart insights card")
public void user_should_see_clock_icon_in_smart_insights_card() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see a testimonial from user {string}")
public void user_should_see_a_testimonial_from_user(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see a testimonial from user {string} which says about the App")
public void user_should_see_a_testimonial_from_user_which_says_about_the_app(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see a testimonial from user {string} worth every penny")
public void user_should_see_a_testimonial_from_user_worth_every_penny(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see {string} text is visible above testimonial section")
public void user_should_see_text_is_visible_above_testimonial_section(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see {int} yellow stars above {string} text")
public void user_should_see_yellow_stars_above_text(Integer int1, String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see {int} stars under {string}")
public void user_should_see_stars_under(Integer int1, String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see {int} stars under {string} testimonial")
public void user_should_see_stars_under_testimonial(Integer int1, String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see {int} stars under {string} which is testimonial")
public void user_should_see_stars_under_which_is_testimonial(Integer int1, String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see a section with heading {string} on the bottom section")
public void user_should_see_a_section_with_heading_on_the_bottom_section(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should see a button labeled {string}")
public void user_should_see_a_button_labeled(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
