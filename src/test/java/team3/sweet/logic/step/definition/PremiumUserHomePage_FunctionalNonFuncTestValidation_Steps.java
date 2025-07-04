package team3.sweet.logic.step.definition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team3.sweet.logic.page.objects.PremiumUserHomePage;
import team3.sweet.logic.utils.LoggerLoad;

public class PremiumUserHomePage_FunctionalNonFuncTestValidation_Steps {

	PremiumUserHomePage premiumUser_HPobj=new PremiumUserHomePage();
//	@Given("User is Logged into the app")
//	 public void user_is_logged_into_the_app() {
//
//
//		premiumUser_HPobj.Loginbtn();
//		premiumUser_HPobj.SignIn();
//	 }
//	 
//	 @Given("User is on the homepage")
//	 public void user_is_on_the_homepage() {
//	  
//	  LoggerLoad.info("You are on the Home Page");
//	 }
@When("User clicks meal section")
public void user_clicks_meal_section() {
	premiumUser_HPobj.mealPlanButton();

}

@Then("User should see {string} title")
public void user_should_see_title(String expectedTitle) {
	premiumUser_HPobj.preMealTitle();
	 //String actualTitle = premiumUser_HPobj.preMealTitle();
	  //  Assert.assertEquals("Mismatch in title text!", expectedTitle, actualTitle);
}

@Then("User should see alarm clock icon")
public void user_should_see_alarm_clock_icon() {
	premiumUser_HPobj.preMealIcon();

}

@Then("User should see pre-meal in first place of  each meal section")
public void user_should_see_pre_meal_in_first_place_of_each_meal_section() {
	premiumUser_HPobj.preMealPosition();

}

@When("User clicks snack section")
public void user_clicks_snack_section() {
   	premiumUser_HPobj.SnackButton();
}

@Then("User should see Pre-Meal entry displays as {string} by default")
public void user_should_see_pre_meal_entry_displays_as_by_default(String string) {
	premiumUser_HPobj.nonePremealSnackDisplay();

}

@Then("User should see {int} calorie in pre-meal snack")
public void user_should_see_calorie_in_pre_meal_snack(Integer int1) {
	premiumUser_HPobj.caloriesSnackDisplay();
}

@Then("User should see meal title for main-meal in snack")
public void user_should_see_meal_title_for_main_meal_in_snack() {
	premiumUser_HPobj.mainMealTitle_Snacks();

}

@Then("User should see description for the dish in snack")
public void user_should_see_description_for_the_dish_in_snack() {
	premiumUser_HPobj.mainMealDescription_Snacks();

}

@Then("User should see {string} as sub title")
public void user_should_see_as_sub_title(String string) {
	premiumUser_HPobj.mainMealSubTitle();

}

@Then("User should see utensil icon for each main-meal")
public void user_should_see_utensil_icon_for_each_main_meal() {
	premiumUser_HPobj.mainMealUtensilIcon();

}

@Then("User should see  {string} based time in main-meal \\(eg : {int}:{int})")
public void user_should_see_based_time_in_main_meal_eg(String string, Integer int1, Integer int2) {
	premiumUser_HPobj.mainMealTime();

}

@Then("User should see indicator {string} for breakfast main-meal")
public void user_should_see_indicator_for_breakfast_main_meal(String string) {
	premiumUser_HPobj.mainMealTime();

}

@Then("User should see indicator {string} for lunch  main-meal")
public void user_should_see_indicator_for_lunch_main_meal(String string) {
	premiumUser_HPobj.mainMealTime();

}

@Then("User should see indicator {string} for dinner  main-meal")
public void user_should_see_indicator_for_dinner_main_meal(String string) {
	premiumUser_HPobj.mainMealTime();

}

@Then("User should see indicator {string} for snack  main-meal")
public void user_should_see_indicator_for_snack_main_meal(String string) {
	premiumUser_HPobj.mainMealTime();

}

@Then("User should see {int}:{int} o'clock")
public void user_should_see_o_clock(Integer int1, Integer int2) {
	premiumUser_HPobj.mainMealTime();

}

@Then("User should see the main-meal calorie value")
public void user_should_see_the_main_meal_calorie_value() {
	premiumUser_HPobj.mainMealCalories();
}

@Then("User should see text {string} after the calorie value in main meal")
public void user_should_see_text_after_the_calorie_value_in_main_meal(String string) {
	premiumUser_HPobj.mainMealCalories();

}

@Then("user should see {string} button")
public void user_should_see_button(String string) {
	premiumUser_HPobj.completeButton();

}

@Then("Button color should change to green")
public void button_color_should_change_to_green() {
	premiumUser_HPobj.completeButton();

}

@Then("Button color should change to yellow")
public void button_color_should_change_to_yellow() {
	premiumUser_HPobj.partiallyCompleteButton();

}

@Then("Button color should change to red")
public void button_color_should_change_to_red() {
	premiumUser_HPobj.notCompleteButton();

}

@Then("Nutrition Insight summary card should be displayed in each meal section")
public void nutrition_insight_summary_card_should_be_displayed_in_each_meal_section() {
	premiumUser_HPobj.summaryFlexCard();

}

@Then("User should see a title {string}")
public void user_should_see_a_title(String string) {
	premiumUser_HPobj.flexCardTitle();

}

@Then("User should see subtitle {string}")
public void user_should_see_subtitle(String string) {
	premiumUser_HPobj.flexCardSubTitle();
}

@Then("total calorie count should equal the sum of Pre-Meal and Meal calories")
public void total_calorie_count_should_equal_the_sum_of_pre_meal_and_meal_calories() {
	//premiumUser_HPobj.flexCardTotalCalories();
	 int preMealCalories = premiumUser_HPobj.getPreMealCalories();
	    int mainMealCalories = premiumUser_HPobj.getMainMealCalories();
	    int displayedTotalCalories = premiumUser_HPobj.flexCardTotalCalories();
	    int expectedTotal = preMealCalories + mainMealCalories;
	    System.out.println("Pre-Meal: " + preMealCalories + ", Meal: " + mainMealCalories + ", Total: " + displayedTotalCalories);
	    Assert.assertEquals(expectedTotal, displayedTotalCalories);

}

@Then("calorie detail for each meal should appear on the right side of its section")
public void calorie_detail_for_each_meal_should_appear_on_the_right_side_of_its_section() {
	premiumUser_HPobj.caloryDetailPosition();

}

@Then("Calorie in fex card should match with meal")
public void calorie_in_fex_card_should_match_with_meal() {
	premiumUser_HPobj.caloryMatch();

}

@Then("User should see donut chart")
public void user_should_see_donut_chart() {
	premiumUser_HPobj.donutChart();

}

@Then("User should see total calories in donut chart")
public void user_should_see_total_calories_in_donut_chart() {
	premiumUser_HPobj.donutChartCalories();

}

@Then("User should see distinct color segment in each macro")
public void user_should_see_distinct_color_segment_in_each_macro() {
   

}

@Then("Macro percentages match expected values")
public void macro_percentages_match_expected_values() {
   

}

@Then("User should see each segment color matches its corresponding label")
public void user_should_see_each_segment_color_matches_its_corresponding_label() {
   

}

@Then("User should see macronutrient bar chart in each meal section")
public void user_should_see_macronutrient_bar_chart_in_each_meal_section() {
	premiumUser_HPobj.barChart();

}

@Then("User should see a visible progress bar for carbs, protein, fat, and fiber on the nutrient screen.")
public void user_should_see_a_visible_progress_bar_for_carbs_protein_fat_and_fiber_on_the_nutrient_screen() {
	premiumUser_HPobj.horizontalCarbsBar();

}

//@Then("Each nutrient bar should show a value consistent with its label \\(e.g., carbs: 40g)")
//public void each_nutrient_bar_should_show_a_value_consistent_with_its_label_e_g_carbs_40g() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

@Then("All macro percentages combined should make up exactly {int}%")
public void all_macro_percentages_combined_should_make_up_exactly(Integer int1) {
	premiumUser_HPobj.macroLableChart();

}

@Then("Below the chart, every macronutrient should display its name along with the corresponding percentage")
public void below_the_chart_every_macronutrient_should_display_its_name_along_with_the_corresponding_percentage() {
   

}

@Then("Each macro's legend color must be consistent with its section in the chart")
public void each_macro_s_legend_color_must_be_consistent_with_its_section_in_the_chart() {
	premiumUser_HPobj.colorMatch();

}

@When("User Clicks View Meal Plan button")
public void user_clicks_view_meal_plan_button() {
	premiumUser_HPobj.fullMealPlanButtonClick();

}

@Then("User should redirected to Full meal plan page")
public void user_should_redirected_to_full_meal_plan_page() {
	premiumUser_HPobj.fullMealPlanNavigation();

}
@Then("User should see the title {string}")
public void user_should_see_the_title(String string) {
	premiumUser_HPobj.getfullMealPlanTitle();
}


@Then("User should see the {string} button")
public void user_should_see_the_button(String string) {
	premiumUser_HPobj.backToPlanButton();
}



@Then("User should see each meal section button")
public void user_should_see_each_meal_section_button() {
	premiumUser_HPobj.mealSectionButtons();

}

}
