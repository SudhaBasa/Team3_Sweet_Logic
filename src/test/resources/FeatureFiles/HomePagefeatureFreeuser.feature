@HomepageFreeUser @SweetBalance
Feature: Home Page Validation for Registered Free Account User

Background: User is in password auth page 
    Given User is in password auth page
    When User clicks sign in after entering password
    
 @OrderNavigationBar
  Scenario: Verify order of text in navigation bar
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see the navigation bar displaying items in the order: Home, Dashboard, Education

@CollapseToggle
  Scenario: Verify the presence of collapse toggle 
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see a caret toggle icon next to the "Today's Meal Plan" title
 
 @NutritionInsight
  Scenario: Verify the presence of "Nutrition Insights" heading is shown for each meal
    Given User is in home page
    When User clicks meal section
    Then User should see "Nutrition Insights" heading for each of the meal section 
  
@NutritionBarEachMeal
  Scenario: Verify nutrition bar is shown for each meal
    Given User is in home page
    When User clicks meal section
    Then User should see horizontal bar for Carbs, Protein, and Fat
    
 @PremealTitle
  Scenario: Verify pre-meal title is shown after main dish
    Given User is in home page
    When User clicks meal section
    Then User should see the pre-meal title  (eg: pre-breakfast)
    
@CarbValueNutrotion
  Scenario: Verify the presence of Carbs value  for nutrition
    Given User is in home page
    When User clicks meal section
    Then User should see Carbs value for the main meal   
    
@ProtienValueNutrotion
  Scenario: Verify the presence of Protein value for nutrition
    Given User is in home page
    When User clicks meal section
    Then User should see Protein value for the main meal
    
@FatValueNutrotion
  Scenario: Verify the presence of Fat value for nutrition
    Given User is in home page
    When User clicks meal section
    Then User should see Fat value for the main meal    
    
@IntakeTime
  Scenario: Verify the presence of intake time in each pre-meal
    Given User is in home page
    When User clicks meal section
    Then User should see intake time in each pre-meal      
    
@SnackPremeal
  Scenario: Validate the indicator for snack pre-meal
    Given User is in home page
    When User clicks meal section
    Then User should see indicator "PM" for snack  pre-meal      
        
@TimeSnackPremeal
  Scenario: Validate the indicator for snack pre-meal
    Given User is in home page
    When User clicks meal section
    Then User should see  "hh:mm" based time in pre-meal snack (eg : 1:00)  
    
 @TimePreSnack
  Scenario: Verify the time in pre-snack
    Given User is in home page
    When User clicks meal section
    Then User should see 3 o'clock  
       
@DotIndicator
  Scenario: Verify the dot indicator between time and calorie in each pre-meal session
    Given User is in home page
    When User clicks meal section
    Then User should see dot between time and calorie in each pre-meal session
    
@FullViewPlan
  Scenario: Verify the navigation of "View Full Plan" button
    Given User is in home page
    When User clicks meal section
    Then User should redirected to subscription page
    
@TitleExcercise
  Scenario: Verify the title in Exercise section
    Given User is in home page
    When User clicks exercise section
    Then User should see title "Today's Exercise Plan"
    
@ExcerciseList
  Scenario: Verify the presence of exercise list
    Given User is in home page
    When User clicks exercise section
    Then User should see 2 exercises listed for the day  
    
@ExcerciseTime
  Scenario: Verify the presence of time in each exercise
    Given User is in home page
    When User clicks exercise section
    Then User should see scheduled time of each exercise
    
@ExcerciseMorning
  Scenario: Verify the time for morning exercise
    Given User is in home page
    When User clicks exercise section
    Then Morning exercise should be scheduled for 7 o'clock    
    
@ExcerciseEvening
  Scenario: Verify the time for evening exercise
    Given User is in home page
    When User clicks exercise section
    Then Evening exercise should be scheduled for 5 o'clock     
    
@ExcercisePlan
  Scenario: Verify the title for each exercise plan
    Given User is in home page
    When User clicks exercise section
    Then User should see plan title for each exercise
    
 @ExcerciseClockindicator
  Scenario:  Verify the presence of 12-hour clock indicator is visible in each exercise plan
    Given User is in home page
    When User clicks exercise section
    Then User should see 12-hour clock indicator with AM/PM.
       
@ExcerciseDuration
  Scenario:  Verify the presence of duration in each exercise plan
    Given User is in home page
    When User clicks exercise section
    Then User should see a duration in each exercise item
           
@ExcerciseDurationFormat
  Scenario:  Verify the duration format in each exercise plan
    Given User is in home page
    When User clicks exercise section
    Then User should see duration format in mins for each exercise item
               
@DotIndiactorDurationFormat
  Scenario:  Verify the dot indicator between duration and intensity  level
    Given User is in home page
    When User clicks exercise section
    Then User should see dot between duration and intensity level   
    
@IntensityLevel
  Scenario:  Verify the presence of intensity level in each exercise item
    Given User is in home page
    When User clicks exercise section
    Then User should see intensity level in each exercise      
    
 @ViewFullButton
  Scenario:  Verify the presence of  "View Full Schedule" button
    Given User is in home page
    When User clicks exercise section
    Then User should see button with text "View Full Schedule"      
    
@SubscriptionPage
  Scenario:  Verify the navigation of  "View Full Schedule" button
    Given User is in home page
    When User clicks view full schedule button after reaching exercise section 
    Then User should redirected to subscription page    
    
    
    
        
    
    
    
    
    