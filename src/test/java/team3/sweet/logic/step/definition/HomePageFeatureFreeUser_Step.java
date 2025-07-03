package team3.sweet.logic.step.definition;

import java.util.Arrays;


import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import team3.sweet.logic.driver.factory.DriverFactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import team3.sweet.logic.page.objects.CommonFeatureDashBoardPage_Page;
import team3.sweet.logic.page.objects.CommonFeatureforHomePage_Page;
import team3.sweet.logic.page.objects.HomePageFeatureFreeUser_Page;

import team3.sweet.logic.utils.LoggerLoad;
import team3.sweet.logic.utils.ConfigReader;


public class HomePageFeatureFreeUser_Step {
	
WebDriver driver = DriverFactory.getdriver();
	
CommonFeatureDashBoardPage_Page CFDP = new CommonFeatureDashBoardPage_Page(driver);
CommonFeatureforHomePage_Page CFHP = new CommonFeatureforHomePage_Page(driver);	
HomePageFeatureFreeUser_Page HPFFU = new HomePageFeatureFreeUser_Page(driver);
	
	
    @Then("User should see the navigation bar displaying items in the order {string} in HomePage Tab")
    public void user_should_see_the_navigation_bar_displaying_items_in_the_order_in_home_page_tab(String homeTabs) {
   	
        boolean isOrderCorrect = HPFFU.verifyNavigationBarOrder(homeTabs);
        Assert.assertTrue("Navigation bar items are not in the expected order: " + homeTabs, isOrderCorrect);
    }

	
	@Then("User should see a caret toggle icon next to the {string} title")
	public void user_should_see_a_caret_toggle_icon_next_to_the_title(String string) {
		HPFFU.isTodaymeaArrow();
		LoggerLoad.info("Today's Meal Plan Arrow Visible");
	}

	@Then("User should see {string} heading for each of the meal section")
	public void user_should_see_heading_for_each_of_the_meal_section(String string) {
		boolean allTabsHaveHeading = HPFFU.verifyNutritionInsightsForAllTabs();
		Assert.assertTrue(allTabsHaveHeading);
	}

	@Then("User should see horizontal bar for Carbs, Protein, and Fat")
	public void user_should_see_horizontal_bar_for_carbs_protein_and_fat() {
		HPFFU.scrollToBreakFastTab();
		List<WebElement> tabs = Arrays.asList(
				HPFFU.BreakfastBtn,HPFFU.LunchBtn,HPFFU.DinnerBtn,HPFFU.SnackBtn);
		    for (WebElement tab : tabs) {
		        tab.click();
		        // Wait a bit for bars to load, or use explicit WebDriverWait
		        try {
		            Thread.sleep(500);
		        } catch (InterruptedException e) {
		            Thread.currentThread().interrupt();
		        }
		        HPFFU.verifyNutritionBarsPresentWithAssert();
		    }
		}	

	@Then("User should see the pre-meal title  \\(eg: pre-breakfast)")
	public void user_should_see_the_pre_meal_title_eg_pre_breakfast() {
		HPFFU.scrollToBreakFastTab();
		List<WebElement> tabs = HPFFU.getMealTabs();
	    for (WebElement tab : tabs) {
	    	HPFFU.clickMealTab(tab);
	        // Wait for the pre-meal title to be visible (replace Thread.sleep with explicit wait if possible)
	        try {
	            Thread.sleep(500);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	        Assert.assertTrue(HPFFU.getPremealTitle().isDisplayed());	              
	    }  
	}

	@Then("User should see Carbs value for the main meal")
	public void user_should_see_carbs_value_for_the_main_meal() {
		HPFFU.scrollToBreakFastTab();
		List<WebElement> tabs = HPFFU.getMealTabs();
	    for (WebElement tab : tabs) {
	    	HPFFU.clickMealTab(tab);
	        // Optional: wait for CarbValue to update; better with WebDriverWait
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	        Assert.assertTrue(HPFFU.isCarbValueDisplayed());
	        String carbValueText = HPFFU.getCarbValueText();
	        Assert.assertFalse(carbValueText.isEmpty());	        
	        System.out.println("Carbs value for " + tab.getText() + ": " + carbValueText);
	    }  
	}

	@Then("User should see Protein value for the main meal")
	public void user_should_see_protein_value_for_the_main_meal() {
		HPFFU.scrollToBreakFastTab();
		List<WebElement> tabs = HPFFU.getMealTabs();
	    for (WebElement tab : tabs) {
	    	HPFFU.clickMealTab(tab);	        
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	        Assert.assertTrue(HPFFU.isProtienValueDisplayed());
	        String ProtienValueText = HPFFU.getProteinValueText();
	        Assert.assertFalse(ProtienValueText.isEmpty());	        
	        System.out.println("Carbs value for " + tab.getText() + ": " + ProtienValueText);
	    }    
	}

	@Then("User should see Fat value for the main meal")
	public void user_should_see_fat_value_for_the_main_meal() {
		HPFFU.scrollToBreakFastTab();
		List<WebElement> tabs = HPFFU.getMealTabs();
	    for (WebElement tab : tabs) {
	    	HPFFU.clickMealTab(tab);	        
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	        Assert.assertTrue(HPFFU.isFatValueDisplayed());
	        String FatValueText = HPFFU.getFatValueText();
	        Assert.assertFalse(FatValueText.isEmpty());	        
	        System.out.println("Carbs value for " + tab.getText() + ": " + FatValueText);
	    }       
	}

	@Then("User should see intake time in each pre-meal")
	public void user_should_see_intake_time_in_each_pre_meal() {
		HPFFU.scrollToBreakFastTab();
		List<WebElement> tabs = HPFFU.getMealTabs();
	    for (WebElement tab : tabs) {
	    	HPFFU.clickMealTab(tab);	        
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	        Assert.assertTrue(HPFFU.isMealTimeDisplayed());
	        String MealTimeText = HPFFU.getMealTimeText();
	        Assert.assertFalse(MealTimeText.isEmpty());	        
	        System.out.println("Carbs value for " + tab.getText() + ": " + MealTimeText);
	    }          
	}
	@When("User clicks meal section snack section")
	public void user_clicks_meal_section_snack_section() {
		HPFFU.scrollToBreakFastTab();
		HPFFU.clickSnackButton();
	}


	@Then("User should see indicator {string} for snack  pre-meal")
	public void user_should_see_indicator_for_snack_pre_meal(String expectedIndicator) {
		try {
	        Thread.sleep(500);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }

	    String actualIndicator = HPFFU.getMealTimeText();
	    Assert.assertTrue(actualIndicator.contains(expectedIndicator));
	} 
	
	@Then("User should see  {string} based time in pre-meal snack \\(eg : {int}:{int})")
	public void user_should_see_based_time_in_pre_meal_snack_eg(String string, Integer int1, Integer int2) {
		try {
	        Thread.sleep(500);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }

	    String timeText = HPFFU.getMealTimeText(); 
	    System.out.println("Found snack pre-meal time: " + timeText);

	    Assert.assertTrue("Expected time like hh:mm somewhere in text, but found: '" + timeText + "'",
	     timeText.matches(".*\\d{1,2}:\\d{2}.*"));
	}  
	

	@Then("User should see {int} o'clock")
	public void user_should_see_o_clock(Integer int1) {
		try {
	        Thread.sleep(500); 
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }

	    String timeText = HPFFU.getMealTimeText();
	    System.out.println("DEBUG: Found pre-snack time = '" + timeText + "'");

	    // Check if it contains "3" followed by a ":" (like "3:00")
	    Assert.assertTrue(
	        "Expected time to be around 3 o'clock, but found: '" + timeText + "'",
	        timeText.matches(".*\\b3:\\d{2}\\b.*")
	    ); 
	}
	@When("User clicks each meal section")
	public void user_clicks_each_meal_section() {
	    
	}

	@Then("User should see dot between time and calorie in each pre-meal session")
	public void user_should_see_dot_between_time_and_calorie_in_each_pre_meal_session() {
		HPFFU.scrollToBreakFastTab();
		List<WebElement> tabs = HPFFU.getMealTabs();
		for (WebElement tab : tabs) {
		    HPFFU.clickMealTab(tab);

		    try {
		        Thread.sleep(1000);
		    } catch (InterruptedException e) {
		        Thread.currentThread().interrupt();
		    }

		    String text = HPFFU.getDotInCaloriesText();
		    System.out.println("DEBUG: Text in dot & calories element: '" + text + "'");
		    Assert.assertTrue(text.contains("•"));
		    Assert.assertTrue(text.matches("(?s).*\\d{1,2}:\\d{2}(\\s?[AP]M)?.*"));
		    Assert.assertTrue(text.toLowerCase().contains("calories"));
	}
	}
	@When("User clicks View Full Plan button")
	public void user_clicks_view_full_plan_button() {
		HPFFU.scrollToBreakFastTab();
		HPFFU.clickViewFullPlan();
	}

	@Then("User should redirected to subscription page")
	public void user_should_redirected_to_subscription_page() {
		HPFFU.isSubscriptionDisplayed();
	}
	
	@When("User clicks exercise section in Freeuser Page")
	public void user_clicks_exercise_section_in_freeuser_page() {
		HPFFU.scrollToBreakFastTab();
		HPFFU.clickExcerciseIcon();
	}
	@Then("User should see title {string} in Excercise Tab")
	public void user_should_see_title_in_excercise_tab(String expectedTitle) {
		String actualTitle = HPFFU.getTodaysExcercisePlanText();
	    System.out.println("DEBUG: Found exercise title = '" + actualTitle + "'");
	    Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("User should see {int} exercises listed for the day")
	public void user_should_see_exercises_listed_for_the_day(Integer int1) {
		HPFFU.isMorningWalkDisplayed(); 
		HPFFU.isYogaSessionDisplayed();
	}

	@Then("User should see scheduled time of each exercise")
	public void user_should_see_scheduled_time_of_each_exercise() {
		List<WebElement> times = HPFFU.ExerciseTimes;
	    Assert.assertTrue(times.size() >= 2);

	    for (WebElement timeElement : times) {
	        String timeText = timeElement.getText().trim();
	        System.out.println("DEBUG: Found exercise time = '" + timeText + "'");
	        Assert.assertTrue(
	            timeText.matches("\\d{1,2}:\\d{2}\\s?[AP]M")
	        );
	    }  
	}

	@Then("Morning exercise should be scheduled for {int} o'clock")
	public void morning_exercise_should_be_scheduled_for_o_clock(Integer int1) {
		String timeText = HPFFU.getMorningwalkScheduleTimeText();
	    System.out.println("DEBUG: Found morning exercise time = '" + timeText + "'");

	    Assert.assertTrue(
	        timeText.startsWith("7:")
	    ); 
	}

	@Then("Evening exercise should be scheduled for {int} o'clock")
	public void evening_exercise_should_be_scheduled_for_o_clock(Integer int1) {
		String timeText = HPFFU.getYogaScheduleTimeText();
	    System.out.println("DEBUG: Found morning exercise time = '" + timeText + "'");

	    Assert.assertTrue(
	        timeText.startsWith("5:")
	    );   
	}

	@Then("User should see plan title for each exercise")
	public void user_should_see_plan_title_for_each_exercise() {
		HPFFU.isMorningWalkDisplayed(); 
		HPFFU.isYogaSessionDisplayed();
	}
	@Then("User should see {int}-hour clock indicator with AM\\/PM.")
	public void user_should_see_hour_clock_indicator_with_am_pm(Integer int1) {
		List<WebElement> times = HPFFU.ExerciseTimes;
	    Assert.assertFalse(times.isEmpty());

	    for (WebElement timeElement : times) {
	        String timeText = timeElement.getText().trim();
	        System.out.println("DEBUG: Found exercise time = '" + timeText + "'");
	        
	        Assert.assertTrue(
	            timeText.matches("\\d{1,2}:\\d{2}\\s?[AP]M")
	        );
	    } 
	}

	@Then("User should see a duration in each exercise item")
	public void user_should_see_a_duration_in_each_exercise_item() {
		HPFFU.isMorningExcerDurationDisplayed();
		HPFFU.isYogaSessionDurationDisplayed();
		
	}

	@Then("User should see duration format in mins for each exercise item")
	public void user_should_see_duration_format_in_mins_for_each_exercise_item() {
		String morningWalkText = HPFFU.MoringwalkDuration.getText().trim();
	    System.out.println("Morning walk duration: " + morningWalkText);
	    Assert.assertTrue(morningWalkText.contains("mins"));
	    String yogaSessionText = HPFFU.YogasessionDuration.getText().trim();
	    System.out.println("Yoga session duration: " + yogaSessionText);
	    Assert.assertTrue(yogaSessionText.contains("mins"));
	}

	@Then("User should see dot between duration and intensity level")
	public void user_should_see_dot_between_duration_and_intensity_level() {
		String text = HPFFU.MoringwalkDuration.getText().trim();
	    System.out.println("DEBUG: Duration & intensity text = '" + text + "'");
	    Assert.assertTrue(text.contains("•"));
	    Assert.assertTrue(text.contains("mins"));
	    Assert.assertTrue(text.toLowerCase().contains("intensity"));  
	}

	@Then("User should see intensity level in each exercise")
	public void user_should_see_intensity_level_in_each_exercise() {
		
        String morningText = HPFFU.MoringwalkDuration.getText().trim();
        Assert.assertTrue("Morning walk text format invalid: " + morningText,
        morningText.matches("\\d+ mins • (Low|Medium|High) intensity"));
       
        String yogaText = HPFFU.YogasessionDuration.getText().trim();
        Assert.assertTrue("Yoga session text format invalid: " + yogaText,
        yogaText.matches("\\d+ mins • (Low|Medium|High) intensity"));
    }  
	

	@Then("User should see button with text {string}")
	public void user_should_see_button_with_text(String expectedText) {
		Assert.assertTrue("View Full Schedule button is not displayed", HPFFU.isViewFullSchedulebuttonDisplayed());
		System.out.println("DEBUG: Expected Button Title is'" + expectedText + "'");
        String actualText = HPFFU.getViewFullSchedulebuttonText();
        Assert.assertEquals("Button text mismatch", expectedText, actualText);   
	}

	@When("User clicks view full schedule button after reaching exercise section")
	public void user_clicks_view_full_schedule_button_after_reaching_exercise_section() {
		HPFFU.scrollToBreakFastTab();
		HPFFU.clickExcerciseIcon();
		HPFFU.clickViewFullSchedulebutton();
	}
	@Then("User should redirected to subscription page in Excercise page")
	public void user_should_redirected_to_subscription_page_in_excercise_page() {
		HPFFU.isSubscriptionDisplayed();
	}




}
