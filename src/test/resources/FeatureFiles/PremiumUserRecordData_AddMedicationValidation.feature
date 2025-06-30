Feature: Add Medication validation
Background: User clicks medication button after reaching home page
  
@Test
Scenario: Verify the presence of iframe
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see iframe 
  
  @Test
Scenario: Verify the presence of cancel button
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see cancel button
  
  @Test
Scenario: Verify the heading in iframe
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see "Add new medication"
  
  @Test
Scenario: Verify the fields in iframe
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see Medication,Dosage,Frequency,Date,Take with food,Notes (optional)
  
  @Test
Scenario: verify the presence of dropdown in medication field
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see dropdown for Medication
  
  @Test
Scenario: Verify the options in medication dropdown
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see "Select a medication,Metformin (Oral),Glipizide (Oral),Januvia (Oral),Jardiance (Oral),Trulicity (Injectable),Insulin Glargine (Injectable),Insulin Lispro (Injectable),Insulin NPH (Injectable),Other (Custom Medication)"
  
  @Test
Scenario: Verify the input field for Dosage
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see input field for dosage
  
  @Test
Scenario: Verify the placeholder text in dosage input field
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see "e.g., 500mg or 10 units" as placeholder
  
  @Test
Scenario: verify the presence of dropdown for frequency
  Given User is in diabetes tracker
  When User clicks add medication    
  Then user should see dropdown for frequency field
  
  @Test
Scenario: Verify the options for frequency 
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see "Once daily, twice daily, Three times daily"
  
  @Test
Scenario: Verify the presence of date picker
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see date picker in tracker
  
  @Test
Scenario: Verify the checkbox in take with food 
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see checkbox for take with food
  
  @Test
Scenario: Verify the presence text block for notes
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see text block for notes
  
  @Test
Scenario: Verify the add medication button
  Given User is in diabetes tracker
  When User clicks add medication    
  Then User should see add medication button
  
  