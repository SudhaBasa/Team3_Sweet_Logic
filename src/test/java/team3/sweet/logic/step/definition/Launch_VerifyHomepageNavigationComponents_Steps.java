package team3.sweet.logic.step.definition;

import org.junit.Assert;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.driver.factory.DriverFactory;
import team3.sweet.logic.page.objects.Launch_Page;
import team3.sweet.logic.utils.ConfigReader;
import team3.sweet.logic.utils.LoggerLoad;

public class Launch_VerifyHomepageNavigationComponents_Steps {
	//WebDriver driver = DriverFactory.getdriver();

	//Launch_Page LP = new Launch_Page(driver);

	//private WebDriverWait wait;
	

@Given("User is on SweetBalance homepage")
public void user_is_on_sweet_balance_homepage() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User click the {string} button once launching the URL")
public void user_click_the_button_once_launching_the_url(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be redirected to the Login page")
public void user_should_be_redirected_to_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User look at the top right corner")
public void user_look_at_the_top_right_corner() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User  should see a link labeled {string} in the sweetbalance app")
public void user_should_see_a_link_labeled_in_the_sweetbalance_app(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User click on the {string} link")
public void user_click_on_the_link(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be redirected to the Login page after clicking on login")
public void user_should_be_redirected_to_the_login_page_after_clicking_on_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User click on {string} button")
public void user_click_on_button(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be redirected to the assessment modal dialog after clicking on Check your risk button")
public void user_should_be_redirected_to_the_assessment_modal_dialog_after_clicking_on_check_your_risk_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}




}