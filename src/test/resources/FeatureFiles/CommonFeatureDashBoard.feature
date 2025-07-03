@CommonFeatureDashBoard @SweetBalance
Feature: Dashboard page validation for Registered Free account user

  Background: User logged into the app

    Given User is in Home Page
       
 #@WelcomeMsg
  #Scenario: Verify the Welcome Message is displayed with name
    #Given User is in Home Page
    #When User clicks the Dashboard on the navigation bar
    #Then User should see the "Welcome Back,full name" message
    
#@WelcomeMsgVeriFyText
  #Scenario: Verify the text is displayed below welcome message 
    #Given User is in Home Page
    #When User clicks the Dashboard on the navigation bar
    #Then User should see the text "Track your metrics, manage your diet, and stay healthy with our comprehensive tools."

#@UpgradePremium
  #Scenario: Verify Upgrade to premium button  is visible  
    #Given User is in Home Page
    #When User clicks the Dashboard on the navigation bar
    #Then User should see Upgrade to Premium button
    
#@AccountInfo
  #Scenario: Verify the header Account Information is present  
    #Given User is in Home Page
    #When User clicks the Dashboard on the navigation bar
    #Then User should see the header "Account Information" with correct spelling
    #
#@SaveChange
  #Scenario: Verify Save Changes button  is visible   
    #Given User is in Home Page
    #When User clicks the Dashboard on the navigation bar
    #Then User should see Save Changes button
    #
#@AllFieldAccInfo
  #Scenario Outline: Verify all the fields under Account Information are Displayed   
    #Given User is in Home Page
    #When User clicks the Dashboard on the navigation bar
    #Then User should see all the fields under "<Account Information>" section
   #
   #Examples:
   #|Account Information   |
   #|Age                   | 
   #|Height (cm)           |
   #|Weight (kg)           |
   #|Exercise Routine Level|
   #|Cuisine Preferences   |
   #|Food Allergies        |
      
#@Age
  #Scenario: Verify age should accept only Numeric Value   
    #Given User is in Dashboard page 
    #When User edit age field with valid data
    #Then User should see that entered age is displayed in that Age field
        #
#@Height
  #Scenario: Verify height should accept only Numeric Value   
    #Given User is in Dashboard page 
    #When User Edit height field with valid data
    #Then User should see that entered height is displayed in Height field
    #
#@Weight
  #Scenario: Verify Weight should accept only Numeric Value   
    #Given User is in Dashboard page 
    #When User Edit Weight field with valid data
    #Then User should see that entered weight is displayed  in Weight field
#
#@ExcerciseRoutine
  #Scenario Outline: Verify Exercise Routine Level dropdown is displayed with options  
    #Given User is in Dashboard page 
    #When User clicks the dropdown of Exercise Routine Level
    #Then User should see the dropdown with options "<Excercise_Level>"
   #Examples:
      #| Excercise_Level   | 
      #| Easy              | 
      #| Medium            | 
      #| Hard              |
       #
 #@Cuisine
  #Scenario Outline: Verify Cuisine Preferences dropdown is displayed with options  
    #Given User is in Dashboard page 
    #When User clicks the dropdown of Cuisine Preferences
    #Then User should see the dropdown with list of cuisine types "<Cuisine_Type>"
#
#Examples:
      #|Cuisine_Type   | 
      #|Indian         | 
      #|American       | 
      #|Continental    |
      #|Mediterranean  |
      #|Asian          |
      #|Middle Eastern |
      #|Mexican        |
      
      
#@Allergies
  #Scenario Outline: Verify Food Allergies dropdown is displayed with options  
    #Given User is in Dashboard page 
    #When User clicks the dropdown of Food Allergies
    #Then User should see the dropdown list of common allergy options "<Food_Allergies>"
#
#Examples:
#
       #|Food_Allergies|
       #|None          |
       #|Dairy         |
       #|Gluten        |
       #|Shellfish     |
       #|Soy           |
       #|Eggs          |
       #|Nuts          |
       #|Other         |

#@AccountInvaliddata
  #Scenario Outline: Verify account details cannot be  updated with invalid data 
    #Given User is in Dashboard page 
    #When User edit age as "<Age>", weight as "<Weight>", height as "<Height>" and click Save Changes
    #Then User should see Error message
  #
  #Examples:  
    #| Age | Weight | Height |
    #| abc | 70     | 170    |    # Invalid age
    #| 30  | @!     | 170    |    # Invalid weight
    #| 30  | 70     | -5     |    # Invalid height
    #| abc | @!     | xyz    |    # All invalid
    
 #@Accountvaliddata
  #Scenario Outline: Verify account details  can be updated with valid data
    #Given User is in Dashboard page 
    #When User edit age valid as "<Age>", weight as "<Weight>", height as "<Height>" and click Save Changes
    #Then User should see messages "Changes Saved Your profile has been updated successfully!"
    #
    #Examples:  
    #| Age | Weight | Height |
    #| 50  | 70     | 170    |   
     #
#@VerifyHeader
  #Scenario: Verify the header Stress Management Techniques
    #Given User is in Dashboard page 
    #When User scrolls  to the Stress Management section
    #Then User should see the Title  "Stress Management Techniques"
    #
#@SMTechniques
  #Scenario Outline: Verify the navigation bar order 
    #Given User is in Dashboard page 
    #When User scrolls  to the Stress Management section
    #Then user should see tabs "<Tabs>"
  #
  #Examples:
#
       #|Tabs          |
       #|Meditation    |
       #|Breathing     |
       #|Movement      |
       #|Mindfulness   |
       
#@TabNavigate
  #Scenario: Verify tab navigation
    #Given User is in Dashboard page 
    #When User clicks on each tab
    #Then User should see corresponding display section
    
 #@GuidedMeditation
  #Scenario: Verify Guided Meditation section is visible
    #Given User is in Dashboard page 
    #When User clicks Meditation tab
    #Then User should see the content with title "Guided Meditation"
 #
 #@GuidedMeditationButton
  #Scenario Outline: Verify meditation duration options are displayed
    #Given User is in Dashboard page 
    #When User clicks Meditation tab
    #Then User should see buttons for "<Duration>"
    #
    #Examples:
#
       #|Duration      |
       #|5 min         |
       #|10 min        |
       #|15 min        |
       
             
#@GuidedMeditationProgress
  #Scenario Outline: Verify audio player progress bar and time indicators
    #Given User is in Dashboard page 
    #When User clicks Meditation tab
    #Then User should see a progress bar with time indicators "<TimeIndicator>" by default
     #
     #Examples:
#
       #|TimeIndicator |
       #|0:00          |
       #|5:00          |
            
#@AudioPlay
  #Scenario: Verify audio playback functionality
    #Given User is in Dashboard page 
    #When User clicks audio play button 
    #Then User Should see meditation audio should start playing and the progress bar should update accordingly
    
#@GentleMovement
  #Scenario: Verify the Title displayed under Movement tab
    #Given User is in Dashboard page 
    #When User clicks Movement Tab
    #Then User should see title "Gentle Movement" 
                 
@GentleMovementContent
  Scenario Outline: Verify the content displayed under Movement tab
    Given User is in Dashboard page 
    When User clicks Movement Tab and see Sescrption
    Then User should see the description "<Ex_Descriptions>"
 
 Examples:

       |Ex_Descriptions                        |
       |Simple stretches to release tension:   |
       |Neck rolls - 5 times each direction    |  
       |Shoulder circles - 10 times            | 
       |Wrist and ankle rotations              |
       |Gentle torso twists                    |                 

#@MindefullPresent
  #Scenario: Verify the title under Mindfulness tab
    #Given User is in Dashboard page 
    #When User clicks Mindfulness tab
    #Then User should see title "Present Moment Awareness"    
    #
 #@MindefullPresentContent
  #Scenario Outline: Verify the content displayed under Mindfulness tab
    #Given User is in Dashboard page 
    #When User clicks Mindfulness tab
    #Then User should see the description "<Mindfulness_Tab>"
   #Examples:
#
       #|Mindfulness_Tab                  |
       #|Focus on your senses:            |
       #|• Notice 5 things you can see    |  
       #|• Identify 4 things you can touch| 
       #|• Listen for 3 different sounds  |
       #|• Find 2 things you can smell    |   
       #|• Observe 1 thing you can taste  |  
       #
#@BenifDiabetics
  #Scenario Outline: Verify "Benefits for Diabetes Management" section is visible
    #Given User is in Dashboard page 
    #When User scroll to the end 
    #Then User should see the list of benefits with explanation "<Benefits>" and "<Explanation>"
   #Examples:
#
       #|Benefits                  |Explanation|
       #|Reduces Stress Hormones   |Lowers cortisol that can increase blood glucose|
       #|Improves Sleep            |Better sleep leads to better glucose control   |
       #|Reduces Diabetes Distress |Helps manage overwhelm from diabetes care      |
       #
 #@BreathingTab
  #Scenario: Verify heading and description is displayed under Breathing tab
    #Given User is in Dashboard page 
    #When User clicks breathing tab under stress management techniques
    #Then User should see the heading "4-7-8 Breathing Technique"  with the description "A natural tranquilizer for the nervous system"
 #
 #@StartBreathingTab
  #Scenario: Verify Start button is displayed under Breathing tab
    #Given User is in Dashboard page 
    #When User clicks breathing tab under stress management techniques
    #Then User should see the "Start Breathing Exercise" button
    #
#@CycleCompleteBreathingTab
  #Scenario: Verify Cycle completed counter is displayed
    #Given User is in Dashboard page 
    #When User clicks breathing tab under stress management techniques
    #Then User should see the "Cycles completed" counter text and value starting at 0    
    #
#@CurrentPhasecounter
  #Scenario: Verify current phase counter is displayed
    #Given User is in Dashboard page 
    #When User clicks breathing tab under stress management techniques
    #Then User should see the label 'Current phase' with a hyphen (-) as its current value.
    #
#@BreathingStep
  #Scenario Outline: verify breathing steps are displayed
    #Given User is in Dashboard page 
    #When User clicks breathing tab under stress management techniques
    #Then User should see the steps "<Breathing_Steps>""Inhale 4 seconds", "Hold 7 seconds", "Exhale 8 seconds"
   #Examples:
#
       #|Breathing_Steps  |
       #|Inhale 4 seconds |
       #|Hold 7 seconds   |  
       #|Exhale 8 seconds | 
         #
#@BreathingBegin
  #Scenario: Verify start button functionality
    #Given User is in Dashboard page 
    #When User clicks the "Start Breathing Exercise" button during the breathing exercise
    #Then User should see the breathing cycles begin 
            #
#@InhalePhase
  #Scenario: Verify the inhale phase in breathing cycle
    #Given User started Breathing cycle
    #When User view the current phase begins
    #Then User should see the breathing cycle displays "Inhale" which last for 4 seconds
                #
#@HoldPhase
  #Scenario: Verify the hold phase in breathing cycle
    #Given User see the inhale phase is completed
    #When User view the next phase begins
    #Then User should see the breathing cycle displays " hold" which last for 7 seconds
                    #
#@ExhalePhase
  #Scenario: Verify the Exhale phase in breathing cycle
    #Given User see the hold phase has completed
    #When User view the next phase begins
    #Then User should see the breathing cycle displays "Exhale" which last for 8 seconds
                        #
#@VerifyCompleteCycle
  #Scenario: Verify the count of cycle completed
    #Given User completed one full cycle
    #When User completes full breathing cycle
    #Then User should see "Cycles completed" counter should increased by 1    
    #
#@VerifypauseCycle
  #Scenario: Verify the pause phase in breathing cycle
    #Given User completed one full cycle
    #When User see next phase begins
    #Then User should see breathing cycle displays "pause" which last for 4 seconds        
    #
#@VerifypauseCycle
  #Scenario: Verify stop button of breathing exercise
    #Given User completed one full cycle
    #When  User clicks the "Stop" button during the breathing exercise
    #Then User should see breathing exercise stops        
        #
    #
    #
    #
    #
    #
    #
    