Feature: Validation for View full meal plan
Background: User clicks view meal plan after reaching home page

@Test
Scenario: Verify each meal section have Pre meal title 	
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Each meal section should display a pre-meal item with the format "Pre-meal:  <followed item by name>"
	
@Test
Scenario: Verify pre-meal includes description under the item name for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Item description  should be displayed below the item name
	
	@Test
Scenario: Verify Pre meal calorie in view full plan for each meal section  
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Calories value should be displayed 
	
	@Test
Scenario: Verify pre meal preparation in view full plan for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Preparation instructions displayed if available , if not then   "N/A"
	
	@Test
Scenario: Verify Nutrients (Pre-meal portion) in view full plan for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see "Nutrients (Pre-meal portion) " heading in full plan
	
@Test
Scenario: Verify the nutrients list (Pre-meal portion) in view full plan for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see "carb, protein, fat, fibre"
	
	@Test
Scenario: Verify the nutrients value (Pre-meal portion) in view full plan for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see value present in all each  nutrient
	
	@Test
Scenario: Verify pre-breakfast time in View Full Plan for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Pre- meal time for Breakfast displayed should be "7:00 AM"
	
	@Test
Scenario: Verify pre-lunch time in View Full Plan for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Pre- meal time for lunch displayed should be "12:30AM"
	
	@Test
Scenario: Verify pre-dinner time in View Full Plan for each meal section 
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Pre- meal time for lunch displayed should be "6:30AM"
	
	@Test
Scenario: Verify each meal section have meal title 
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Each meal section should display a meal item with the format "Mainl:  <followed item by name>"
	
	@Test
Scenario: Verify meal includes description under the item name for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Item description  should be displayed below the item name
	
	@Test
Scenario: Verify meal preparation in view full plan for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Preparation instructions displayed if available , if not then   "N/A"
	
	@Test
Scenario: Verify Nutrients information in view full plan for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see "Nutrients information " heading in full plan
	
	@Test
Scenario: Verify meal total calorie in view full plan for each meal section 
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Total Calories value should be displayed 
	
	@Test
Scenario: Verify the nutrients list (meal portion) in view full plan for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see "carb, protein, fat, fibre"
	
	@Test
Scenario: Verify the nutrients value (meal portion) in view full plan for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see value present in all each  nutrient
	
	@Test
Scenario: Verify ingredients details present in main meal for each meal section
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see ingredients list for the main meal for each meal section
	
	@Test
Scenario: Verify the presence of heading "Diabetes Management Tips" in view full plan 
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see heading "Diabetes Management Tips"  
	
	@Test
Scenario: Verify the presence of  tips description for diabetes management
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see tips under diabetes tips
	
	@Test
Scenario: Verify the presence of "Glycemic Impact:" 
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see text "Glycemic Impact:"
	
	@Test
Scenario: Verify the presence of impact value
	Given User is in View Meal plan
	When User clicks Meal sections
	Then User should see impact value 
	
	@Test
Scenario: Validate impact value
	Given User is in View Meal plan
	When User clicks Meal sections
	Then Impact value should be low/medium/high
	
	@Test
Scenario: Validate navigation of bact to plan button
	Given User is in view full plan page
	When User clicks back to plan button
	Then User should redirected to Home page
	
	

	
			