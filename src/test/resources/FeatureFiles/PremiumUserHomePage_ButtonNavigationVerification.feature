Feature: Verification on  button navigation in home page
Background: User logged onto the application

Scenario: Verify user able download weekly plan
	Given User is in home page 
	When User clicks Weekly plan 
	Then User should get pdf download of weekly plan 
	
Scenario: Verify the navigation of blood glucose 
	Given User is in home page 
	When User clicks on Blood glucose button
	Then User should redirect to Blood Glucose popup window
	
Scenario: Verify the navigation of Physical activity 
	Given User is in home page 
	When User clicks on physical activity button
	Then User should redirect to physical activity popup window
	
Scenario: Verify the navigation of  food intake
	Given User is in home page 
	When User clicks on food intake button
	Then User should redirect to food intake popup window
	
Scenario: Verify the navigation of  medication
	Given User is in home page 
	When User clicks on medication button
	Then User should redirect to medication popup window
	
Scenario: Verify the navigation of log button
	Given User is in home page 
	When User clicks log button
	Then User should redirected to dashboard page
	
	
	