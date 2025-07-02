@CommonFeatureforHomeage @SweetBalance
Feature: Validation for home page - Registered user

  Background: User is in password auth page
    Given User is in password auth page
 
  #@AppName
  #Scenario: Verify App name after sign in
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see SweetBalance text  on the left side of the page.
#
  #@UserName
  #Scenario: Verify user name in home page
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see name displayed at the top-right corner of the home page.

  #@LogoutLink
  #Scenario: Verify the presence of logout link
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Logout link in the top-right corner.

  #@NavigationBar
  #Scenario: Verify the presence of  top navigation bar
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see top navigation bar on the page.

  #@HomeText
  #Scenario: Verify the presence of Home text in navigation bar
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Home tab in the top navigation bar.

  #@DashboardText
  #Scenario: Verify the presence of Dashboard text in navigation bar
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Dashboard tab in the top navigation bar.

  #@EducationText
  #Scenario: Verify the presence of Education text in navigation bar
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Education tab in the top navigation bar.
#
  #@CurrentStatusText
  #Scenario: Verify the text "Current status" in home page
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Current Status section heading on the home page.
#
  #@lastUpdatedText
  #Scenario: Verify the text "Last updated" in home page
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Last updated label below Current Status.

  #@lastUpdatedTime
  #Scenario: Verify the time for last update in home page
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see timestamp displayed next to the Last updated label.
#
  #@TimeFormat
  #Scenario: Verify the time format for last update
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see last updated timestamp in 12-hour format as hh:mm:ss or relative format like "3 min ago" or "2 hr ago".

  #@12hourClock
  #Scenario: Verify 12-hour clock indicator is visible
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see 12-hour clock indicator with AM or PM.

  #@HbA1CLable
  #Scenario: Verify Latest HbA1C label is visible
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Latest HbA1C label.

  #@BMILable
  #Scenario: Verify BMI label is visible
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see BMI label.
#
  #@AverageBlood
  #Scenario: Verify Average Blood Sugar is visible
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Average Blood Sugar value.

  #@HbA1CValue
  #Scenario: Verify condition text for HbA1C value less than 5.7
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Normal as the condition text.
#
  #@HbA1CValuePreDiabetic
  #Scenario: Verify condition text for HbA1C between 5.7 and 6.4
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Pre-Diabetic as the condition text.
#
  #@HbA1CValueDiabetic
  #Scenario: Verify condition text for HbA1C greater than or equal 6.5
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Diabetic as the condition text.
#
  #@BMI
  #Scenario: Verify BMI text for value less than 18.5
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Underweight as the BMI category.
#
  #@BMINormal
  #Scenario: Verify BMI text for value between 18.5 and 24.9
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Normal as the BMI category.
#
  #@BMIOverweight
  #Scenario: Verify BMI text for value between 25.0 and 29.9
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Overweight as the BMI category.
#
  #@BMIObese
  #Scenario: Verify BMI text for value 30.0 or above
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Obese as the BMI category.
#
  #@BloodSugar
  #Scenario: Verify units for average blood sugar
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see mg/dL unit below Average Blood Sugar.

  #@TitleinFlex
  #Scenario: Verify title in flex container
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see "Today's Meal Plan" title.

  @TodaymealPlan
  Scenario Outline: Verify "Today’s Meal Plan" section is visible
    Given User is in password auth page
    When User clicks sign in after entering password
    Then User should see tabs "<Meal_Type>"
    
    Examples:
    
    |Meal_Type|
    |Breakfast|
    |Lunch    |
    |Dinner   |
    |Snacks   |

  #@BreakfastTab
  #Scenario: Verify Breakfast tab is selected by default
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then "Breakfast" tab should be selected by default

  #@FlexContainer
  #Scenario: Verify the presence of side tab in flex container
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see sidebar tab container within the flex layout.

  #@MealPlanFlexContainer
  #Scenario: Verify the text "Meal plan" in flex container
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Meal Plan label in the sidebar section.

  #@ExcerciseFlexContainer
  #Scenario: Verify the text "Exercise" in flex container
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see Exercise label in the sidebar section.
#
  #@UtennsilIcon
  #Scenario: Verify the symbol utensil cross in  "Meal plan"
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see utensil icon (crossed fork and knife) in the Meal Plan tab.
#
  #@DumbbellIcon
  #Scenario: Verify the symbol dumbbell in  "Exercise"
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see dumbbell icon in the Exercise tab.

  #@FullPlanButton
  #Scenario: Verify View Full Plan button is visible
    #Given User is in password auth page
    #When User clicks sign in after entering password
    #Then User should see "View Full Plan" button in the Meal Plan section.

  #@Breakfast
  #Scenario: Verify each meal section is clickable to show details
    #Given User is in home page
    #When User clicks on the "Breakfast" section
    #Then Breakfast details  become visible

  #@Lunch
  #Scenario: Verify each meal section is clickable to show details
    #Given User is in home page
    #When User clicks on the Lunch section
    #Then Lunch details  become visible

  #@Dinner
  #Scenario: Verify each meal section is clickable to show details
    #Given User is in home page
    #When User clicks on the Dinner section
    #Then Dinner details  become visible
#
  #@Snack
  #Scenario: Verify each meal section is clickable to show details
    #Given User is in home page
    #When User clicks on the Snacks section
    #Then Snacks details  become visible
#
  #@DishTitle
  #Scenario: Verify meal section contains dish title
    #Given User is in home page
    #When User clicks meal section
    #Then User should see dish title
#
  #@DishDesc
  #Scenario: Verify meal section contains dish description
    #Given User is in home page
    #When User clicks meal section
    #Then User should see description for the dish
#
  #@PreMealItem
  #Scenario: Verify pre-meal item is shown for each meal
    #Given User is in home page
    #When User clicks meal section
    #Then User should see the pre-meal item name

  #@Calories
  #Scenario: Verify calories for pre-meal is shown for each meal
    #Given User is in home page
    #When User clicks meal section
    #Then User should see the pre-meal calorie value
#
  #@AMIndicator
  #Scenario: Validate the indicator for breakfast pre-meal
    #Given User is in home page
    #When User clicks  Breakfast meal section
    #Then User should see indicator "AM" for breakfast pre-meal

  #@PMIndicator
  #Scenario: Validate the indicator for lunch pre-meal
    #Given User is in home page
    #When User clicks  Lunch meal section
    #Then User should see indicator "PM" for lunch  pre-meal
#
  #@PMDinner
  #Scenario: Validate the indicator for dinner pre-meal
    #Given User is in home page
    #When User clicks  Dinner meal section
    #Then User should see indicator "PM" for dinner  pre-meal

  #@TimeFormatPremeal
  #Scenario: Verify the time format in each pre-meal
    #Given User is in home page
    #When User clicks  Snasks meal section
    #Then User should see  "hh:mm" based time in pre-meal (eg : 1:00)

  #@VerifyTimeBreakfast
  #Scenario: Verify the time in pre-breakfast
    #Given User is in home page
    #When User clicks  Breakfast meal section
    #Then User should see "7:00 AM" oclock prebreakfast

  #@VerifyTimeLunch
  #Scenario: Verify the time in pre-lunch
    #Given User is in home page
    #When User clicks  Lunch meal section
    #Then User should see "12:00 PM" oclock prelunch

  #@VerifyTimedinner
  #Scenario: Verify the time in pre-dinner
    #Given User is in home page
    #When User clicks  Dinner meal section
    #Then User should see "7:00 PM" oclock predinner
#
  #@GreenCarbs
  #Scenario: Verify Carbs bar color for each meal
    #Given User is in home page
    #When User clicks  Breakfast meal section
    #Then User should see green color for Carbs

  #@PurbleCarbs
  #Scenario: Verify Fat bar color
    #Given User is in home page
    #When User clicks  Breakfast meal section
    #Then User should see purple color for Fat

  #@PinkCarbs
  #Scenario: Verify Protein bar color
    #Given User is in home page
    #When User clicks  Breakfast meal section
    #Then User should see pink color for Protein
#
  #@MeasurementCarbs
  #Scenario: Verify unit of measurement for Carbs is in grams
    #Given User is in home page
    #When User clicks  Breakfast meal section
    #Then Measurement for Carbs should display the unit as "g"
#
  #@Measurementprotein
  #Scenario: Verify unit of measurement for Protein is in grams (g)
    #Given User is in home page
    #When User clicks  Breakfast meal section
    #Then Measurement for Protein should display the unit as "g"
#
  #@MeasurementFat
  #Scenario: Verify unit of measurement for Fat is in grams (g)
    #Given User is in home page
    #When User clicks  Breakfast meal section
    #Then Measurement for Fat should display the unit as "g"

  @CaloriesText
  Scenario: Validate the text  "calories" in pre-meal
    Given User is in home page
    When User clicks  Breakfast meal section
    Then User should see text "calories" after the calorie value in pre meal
    
