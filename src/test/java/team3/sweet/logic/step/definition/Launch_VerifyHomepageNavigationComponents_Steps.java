package team3.sweet.logic.step.definition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.driver.factory.DriverFactory;
import team3.sweet.logic.page.objects.Launch_Page;
import team3.sweet.logic.utils.ConfigReader;

public class Launch_VerifyHomepageNavigationComponents_Steps {
	WebDriver driver = DriverFactory.getdriver();
	
	Launch_Page lp = new Launch_Page(driver);
	
	private WebDriverWait wait;

@Given("User launches the browser")
public void user_launches_the_browser() {
    System.out.println("The user launches the browser");
    
    
}

@When("User enters the SweetBalance url")
public void user_enters_the_sweet_balance_url() {
	driver.get(ConfigReader.getProperty("url"));
}

@Then("User should see app name on the top left")
public void user_should_see_app_name_on_the_top_left() {
	String actualAppName = lp.AppName();
	 Assert.assertEquals("App name text mismatch!", "SweetBalance", actualAppName.trim());
	 System.out.println("App Name is Visible "+ actualAppName);
}


@Then("User should see text {string}")
public void user_should_see_text(String string) {
	String PolicyDetails=lp.Policy_Details.getText();
	Assert.assertTrue("Policy Details is not visible!", lp.isPolicyDetailsDisplayed());
	System.out.println("Policy Details is   "+PolicyDetails );
   
}

@Then("User should see the heading {string}")
public void user_should_see_the_heading(String string) {
	String HomepageHeading=lp.Homepage_Heading.getText();
	Assert.assertTrue("HomePage Heading is not visible!", lp.isHomepageheadingisDisplayed());
	System.out.println("HomepageHeading is  "+HomepageHeading);
}

@Then("User should see a {string} input button")
public void user_should_see_a_input_button(String string) {
	Assert.assertTrue("Start Today is not visible!",lp.isStartTodayisDisplayed());
    System.out.println("Start Today is Visible");
}

@Then("User should see the text {string}")
public void user_should_see_the_text1(String string) {
    String comprehensive=lp.ComprehensiveTools();
   Assert.assertEquals("Comprehensive Tools text mismatch!", "Comprehensive Diabetes Management Tools", comprehensive.trim());
   System.out.println("Comprehensive Tools text is  "+comprehensive);
}

@Then("User should see a card with title {string}")
public void user_should_see_a_card_with_title(String string) {
	String actualTitle=lp.HealthTracking();
	Assert.assertEquals("Title does not match!", actualTitle);
	System.out.println("Actual Title is    "+actualTitle);
    
}

@Then("User should see the text  {string}")
public void user_should_see_the_text(String string) {
    String actualTitle=lp.NutritionExcercise();
    Assert.assertEquals("Title does not match!", actualTitle);
    System.out.println("Actual Title is    "+actualTitle);
    
}

@Then("User should see heart icon")
public void user_should_see_heart_icon() {
    
}

@Then("User should see activity inside square icon")
public void user_should_see_activity_inside_square_icon() {
    
}

@Then("User should see clock icon")
public void user_should_see_clock_icon() {
    
}

@Then("User should see a testimonial from user {string}")
public void user_should_see_a_testimonial_from_user(String string) {
    
}

@Then("Verify testimonial from Maria L. is visible")
public void verify_testimonial_from_maria_l_is_visible() {
    
}

@Then("User should see {string} text is visible above testimonial section")
public void user_should_see_text_is_visible_above_testimonial_section(String string) {
    
}

@Then("User should see {int} yellow stars above {string} text")
public void user_should_see_yellow_stars_above_text(Integer int1, String string) {
    
}

@Then("User should see {int} stars under {string}")
public void user_should_see_stars_under(Integer int1, String string) {
    
}

@Then("User should see a section with heading {string}")
public void user_should_see_a_section_with_heading(String string) {
    
}

@Then("User should see a button labeled {string}")
public void user_should_see_a_button_labeled(String string) {
    
}




}
