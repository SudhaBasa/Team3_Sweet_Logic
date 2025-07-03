Feature: Login page field and functional Validation

  Background: User clicked login button after reaching SweetBalance app homepage
    Given User is on the login page

  Scenario Outline: Verify email input accepts valid existing email
    Given User is on the login page
    When Registered user clicks continue with email button after entering a valid existing "<email>"
    Then User should get password field

    Examples: 
      | email                   |
      | sweetlogic789@gmail.com |

  Scenario Outline: Verify email input rejects invalid email
    Given User is on the login page
    When User enters an "<invalid email>"
    Then Email field should show "<validation error>"

    Examples: 
      | invalid email | status                             |
      | sweet         | Please enter a valid email address |

  Scenario Outline: Verify password field in login page
    Given User is on the login page
    When Registered user clicks continue with email button after entering a "<valid email>"
    Then User should see Sign in button
    
    Examples:
    | valid email |
    |sweetlogic789@gmail.com|
    
    
  Scenario: Verify sub text
    Given User is on the login page
    When User clicks continue with email button after entering a valid email
    Then User should see email id  in sub text

  Scenario: Verify presence of forgot password link
    Given User is on the login page
    When Registered user clicks continue with email button after entering a valid email
    Then User should see "Forgot password?" link

  Scenario: Verify presence of placeholder in password field
    Given User is on the login page
    When Registered user clicks continue with email button after entering a valid email
    Then User should see text " Enter your password" as placeholder in password field

  Scenario Outline: Verify password input accepts valid existing user
    Given User is on the login page
    When Registered user clicks sign in after entering "<password>"
    Then User should be navigated to home page

    Examples: 
      | password |
      | win2025$ |

  Scenario Outline: Verify email input accepts valid new email
    Given User is on the login page
    When Unregistered user clicks continue with email button after entering a valid "<new email>"
    Then User should get "Complete your profile"  form
    
    Examples:
    |new email|
    |jasmine01@gmail.com|
