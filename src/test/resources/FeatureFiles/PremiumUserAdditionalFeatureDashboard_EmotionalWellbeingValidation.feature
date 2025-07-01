Feature: Emotional Wellbeing validations on Premium dashboard

Background: User is in home page after logged in

Scenario: Verify the title of emotional wellbeing
Given User is in Dashboard Page
When User scrolls to the middle
Then User should see the title "Emotional Wellbeing"

Scenario: Verify the question about wellbeing is displayed
Given User is in Dashboard Page
When User scrolls to the middle
Then User should see the question text "How are you feeling today?"

Scenario: Verify the mood emojis are displayed
Given User is in Dashboard Page
When User scrolls to the middle
Then User should see six emoji 😄 😊 😐 😔 😠 😰 options visible for selection

Scenario: Verify the text notes on your mood
Given User is in Dashboard Page
When User scrolls to the middle
Then Usr should see the text "Notes on your mood"

Scenario: Verify the input field of the notes
Given User is in Dashboard Page
When User scrolls to the middle
Then User should see the Text "What's affecting your mood today?" in input field 

Scenario: Verify able to give inputs to "notes on your mood" input field
Given User is in Dashboard Page
When User scrolls to middle and enter value in notes on your mood input field
Then User should see the value entered in input field

Scenario: Verify the text energy level is present with value
Given User is in Dashboard Page
When User scrolls to middle 
Then User should see the energy level slider

Scenario: Verify energy level slider is displayed
Given User is in Dashboard Page
When User scrolls to middle 
Then User should see Energy level slider with labels "low" and "high"

Scenario: Verify energy level changes when sliders move
Given User is in Dashboard Page
When User scrolls to middle and moves Energy slider to new position
Then User should see the value  changes according to the position

Scenario: Verify log Emotional state  button is displayed
Given User is in Dashboard Page
When User scrolls to middle
Then User should see the "log emotional state"button

Scenario: Verify Emotional state log success message
Given User is in Dashboard Page
When User select mood emoji and click log emotional state button
Then User should see the success message "Your Emotional State has been recorded Successfully"




