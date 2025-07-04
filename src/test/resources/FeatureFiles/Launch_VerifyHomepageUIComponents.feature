Feature: Verify Homepage UI components

  Scenario: Validate the presence of App Name on the home page
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see app name on the top left

  Scenario: Validate the presence of policy details
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see  the text "Our Terms of Service and Privacy Policy have recently been updated" on screen

  Scenario: Verify the homepage heading is visible
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see the heading "Smart Diabetes Tracking Powered by AI" heading in firstpage

  Scenario: Verify the Start Today input button is visible
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see a "Start Today" input button while launching the URL

  Scenario: Verify the diabetes management tools section is visible
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see the text "Comprehensive Diabetes Management Tools" section

  Scenario: Verify the Health Tracking card is visible
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see a card with title "Health Tracking" showing visibly

  Scenario: Verify the Nutrition & Exercise card is visible
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see a "Nutrition&Excerice" title card clearly

  Scenario: Verify the Smart Insights card is visible
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see a "Smart Insights" title card next to Nutrition&Excercise card

  Scenario: Validate description in Health Tracking feature card
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see the text "Monitor glucose levels, medication, and vital statistics, Easy logging of daily readings,Visualize trends over time,Set personalized targets"in Health Tracking card

  Scenario: Validate description in Nutrition & Exercise card
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see the text  "Balance diet and physical activity for optimal control,Carb counting tools,Customized exercise plans,Meal suggestions based on readings" in Nutrition & Excercise card

  Scenario: Validate description in Smart Insights card
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see the text  "Get personalized guidance based on your data, Pattern detection algorithms,Early warning notifications,Actionable recommendations" in Smart Insights card

  Scenario: Validate icon in Health tracking feature card
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see heart icon  in health tracking card

  Scenario: Validate icon in Nutrition & Exercise card
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see activity inside square icon in nutrition excercise card

  Scenario: Validate icon in Smart Insights card
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see clock icon in smart insights card

  Scenario: Verify testimonial from James D. is visible
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see a testimonial from user "James D."

  Scenario: Verify testimonial from Maria L. is visible
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see a testimonial from user "Maria L" which says about the App

  Scenario: Verify testimonial from Robert T. is visible
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see a testimonial from user "Robert T." worth every penny

  Scenario: Validate "Join our community of successful members" text is visible above testimonial section
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see "Join our community of successful members" text is visible above testimonial section

  Scenario: Validate presence of 5 yellow stars above "Join our community of successful members" text
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see 5 yellow stars above "Join our community of successful members" text

  Scenario: Validate rating for James D testimonial
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see 5 stars under "James D."

  Scenario: Validate rating for Maria L testimonial
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see 5 stars under "Maria L." testimonial

  Scenario: Validate rating for Robert T testimonial
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see 5 stars under "Robert T" which is testimonial

  Scenario: Validate presence of bottom section heading in home page
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see a section with heading "Take control of your diabetes today" on the bottom section

  Scenario: Validate the presence of button "Check your Risk"
    Given User launches the browser
    When User enters the SweetBalance url
    Then User should see a button labeled "Check Your Risk"
