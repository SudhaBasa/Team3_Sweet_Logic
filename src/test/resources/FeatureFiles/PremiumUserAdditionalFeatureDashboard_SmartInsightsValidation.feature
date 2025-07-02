Feature: Smart Insights Validation on Premium dashboard

Background: User is in home page after logged in

Scenario: Verify smart insights section title
Given User has health data for the last 7 days
When User Navigates to dashboard page
Then User should see the title "Smart Insights" in smart insights section

Scenario: Verify smart insights section has the label "Last 7 days"
Given User has health data for the last 7 days
When User Navigates to dashboard page
Then User should see the label "last 7 days" in smart insights section

Scenario: Verify smart insights section has titles
Given User has health data for the last 7 days
When User Navigates to dashboard page
Then User should see Titles " Target Achievement","Pattern detected","Suggestion"

Scenario: Verify the display of Target Achievement based on health data
Given User has health data for the last 7 days
When User Navigates to dashboard page
Then User should see the display of percentage of time the user was in the target range for the last 7 days with the percentage improvement compared to the previous week

Scenario: Verify the display of Pattern detected based on health data
Given User has health data for the last 7 days
When User Navigates to dashboard page
Then user should see  percentage of glucose value spike  with suggestion to improve 

Scenario: Verify the display of suggestion based on the health data
Given User has health data for the last 7 days
When User Navigates to dashboard page
Then user should see a suggestion of activity  with the average expected glucose reduction from this activity


