@tag
Feature: Upgrade to Premium Subscription

  Background: User clicks the "Upgrade to Premium" button after reaching subscription page

  @tag1
  Scenario: Verify User able to do payment with empty fields
    Given User is in upgrade to premium page
    When User clicks the "Pay $9.99 USD" button without entering any card details
    Then User should see validation messages for all required fields

  @tag2
  Scenario: Verify User able to do payment with invalid card number
    Given User is in upgrade to premium page
    When User clicks the "Pay $9.99 USD" button with invalid card number
    Then error message should be displayed

  Scenario: Verify User able to do payment with expired card
    Given User is in upgrade to premium page
    When User clicks the "Pay $9.99 USD" button with expired card
    Then error message should be displayed

  Scenario: Verify User able to do payment with valid payment details
    Given User is in upgrade to premium page
    When User clicks the "Pay $9.99 USD" button with valid payment details
    Then User should be redirected to the confirmation or home page with premium access enabled
