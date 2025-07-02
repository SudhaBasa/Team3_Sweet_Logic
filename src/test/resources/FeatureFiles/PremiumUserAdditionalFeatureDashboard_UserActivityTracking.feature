Feature: User Activity Tracking on premium Dashboard

Background: User is in home page after logged in

Scenario: Verify Weekly Checks card shows "0" when the user hasn't logged any checks
Given User has not logged any weekly checks for the current week  
When User click dashboard on the navigation bar
Then User should see  "Weekly Checks"  displaying "0" with subtitle "Total log entries per week"

Scenario: Verify Weekly Checks card shows correct count based on existing check logs
Given User has logged weekly check for the current week  
When User click dashboard on the navigation bar
Then User should see "Weekly checks" displaying value based on the logs

Scenario: Verify Exercise Minutes card shows "0/150 this week" when there's no exercise logged
Given User has not logged any exercise minutes for the week  
When User click dashboard on the navigation bar
Then User should see the "Exercise Minutes" displaying "0/150 this week" with subtitle "Target: 150 minutes per week"

Scenario: Verify Exercise Minutes card shows correct minutes based on user entries
Given User has logged exercise minutes for the week 
When User click dashboard on the navigation bar
Then User should see "Exercise Minutes" displaying number of minutes based on the entries

Scenario: Verify Med Adherence shows "0%" with "Needs improvement" when there's no log
Given User has not logged Medication adherence for the week 
When User click dashboard on the navigation bar
Then User should see "Med Adherence" displaying "0%" with subtitle "Needs improvement"

Scenario: Verify  Med Adherence shows the correct percentage based on logged adherence
Given User has logged Medication Adherence for the week 
When User click dashboard on the navigation bar
Then User should see "Med Adherence" displaying value based on the log

Scenario: Verify Carb Goals card shows "0/28" when no meals are logged
Given User has not logged Carb goals for the week
When User click dashboard on the navigation bar
Then User should see "Carb Goals"  displaying "0/28" with subtitle "Weekly meals completed"

Scenario: Verify Carb Goals shows correct number based on logged meal entries
Given User has logged carb goals for the week
When User click dashboard on the navigation bar
Then User should see "Carb goals" displaying value based on the logs








