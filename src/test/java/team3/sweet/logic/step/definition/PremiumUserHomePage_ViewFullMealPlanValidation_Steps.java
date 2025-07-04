package team3.sweet.logic.step.definition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.driver.factory.DriverFactory;
import team3.sweet.logic.page.objects.PremiumUserHomePage;

public class PremiumUserHomePage_ViewFullMealPlanValidation_Steps {
	WebDriver driver = DriverFactory.getdriver();
	
	PremiumUserHomePage premiumUser_HPobj=new PremiumUserHomePage();
	
	@Given("User is in View Meal plan")
	public void user_is_in_view_meal_plan() {
		premiumUser_HPobj.Loginbtn();
		premiumUser_HPobj.SignIn() ;
		
	    
	}

	@When("User clicks Meal sections")
	public void user_clicks_meal_sections() {
		premiumUser_HPobj.fullMealPlanButton();
	    
	}

	@Then("Each meal section should display a pre-meal item with the format {string}")
	public void each_meal_section_should_display_a_pre_meal_item_with_the_format(String string) {
		premiumUser_HPobj.mealTitle_section();
	    
	}

	@Then("Item description  should be displayed below the item name")
	public void item_description_should_be_displayed_below_the_item_name() {
		premiumUser_HPobj.preMealDescription_section();
	    
	}

	@Then("Calories value should be displayed")
	public void calories_value_should_be_displayed() {
		premiumUser_HPobj.mealCalories_section();
	    
	}

	@Then("Preparation instructions displayed if available , if not then   {string}")
	public void preparation_instructions_displayed_if_available_if_not_then(String string) {
		premiumUser_HPobj.mealPreparation_section();
	    
	}

	@Then("User should see {string} heading in full plan")
	public void user_should_see_heading_in_full_plan(String string) {
		premiumUser_HPobj.preMealPortion();
	    
	}
	@Then("User should see the {string}")
	public void user_should_see_the(String string) {
		premiumUser_HPobj.nutrientsList();
	}

	@Then("User should see value present in all each  nutrient")
	public void user_should_see_value_present_in_all_each_nutrient() {
		premiumUser_HPobj.preMealPortion();
	    
	}

	@Then("Pre- meal time for Breakfast displayed should be {string}")
	public void pre_meal_time_for_breakfast_displayed_should_be(String string) {
		premiumUser_HPobj.preMealPortion();
	    
	}

	@Then("Pre- meal time for lunch displayed should be {string}")
	public void pre_meal_time_for_lunch_displayed_should_be(String string) {
		premiumUser_HPobj.preMealPortion();
	    
	}

	@Then("Each meal section should display a meal item with the format {string}")
	public void each_meal_section_should_display_a_meal_item_with_the_format(String string) {
		premiumUser_HPobj.mealTitle_section();
	    
	}

	@Then("Total Calories value should be displayed")
	public void total_calories_value_should_be_displayed() {
		premiumUser_HPobj.mealCalories_section();
	    
	}
	@Then("User should see ingredients list for the main meal for each meal section")
	public void user_should_see_ingredients_list_for_the_main_meal_for_each_meal_section() {
		premiumUser_HPobj.mainMealIngredients();
	}

	@Then("User should see heading {string}")
	public void user_should_see_heading(String string) {
		//premiumUser_HPobj.isDiabetesManagementTipsTitle();
		boolean actualHeading=premiumUser_HPobj.isDiabetesManagementTipsTitle();
		Assert.assertEquals("Title does not match!", actualHeading);
	}

	@Then("User should see tips under diabetes tips")
	public void user_should_see_tips_under_diabetes_tips() {
		premiumUser_HPobj.diabetesManagementTips();
		
	}

@Then("User should see a text {string}")
public void user_should_see_a_text(String string) {
	premiumUser_HPobj.glycemicImpactText();
	
}
	@Then("User should see impact value")
	public void user_should_see_impact_value() {
		premiumUser_HPobj.impactValue();
		
	    
	}

	@Then("Impact value should be low\\/medium\\/high")
	public void impact_value_should_be_low_medium_high() {
		premiumUser_HPobj.impactValue();
	    
	}

	@Given("User is in view full plan page")
	public void user_is_in_view_full_plan_page() {
		premiumUser_HPobj.fullMealPlanPage();
	    
	}

	@When("User clicks back to plan button")
	public void user_clicks_back_to_plan_button() {
		premiumUser_HPobj.backToPlanButtonClick();
	    
	}

	@Then("User should redirected to Home page")
	public void user_should_redirected_to_home_page() {
		premiumUser_HPobj.homePage();
	    
	}

}
