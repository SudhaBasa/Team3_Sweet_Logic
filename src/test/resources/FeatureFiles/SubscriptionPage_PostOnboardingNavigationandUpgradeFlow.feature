@tag
Feature: Post-Onboarding Navigation and Upgrade Flow

  Background: User clicks submit / continue after completing onboarding process

  @tag1
  Scenario: Verify user able to go to subscription payment screen
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should be redirected to the subscription payment screen

  @tag2
  Scenario: Verify title of Upgrade screen
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then Page title should be "Upgrade to Premium"

  Scenario: Verify sub text
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should see "Get personalized insights and advanced features to better manage your diabetes."

  Scenario: Verify the presence of "premium features"
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should see text "premium features"

  Scenario: verify the description for premium feature
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should see text "✓Personalized meal plans,✓Advanced analytics,✓Priority support"

  Scenario: verify the presence of subscription price
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should see "$9.99/month"

  Scenario: verify the presence of cancel anytime text
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should see cancel anytime text below the pricing details

  Scenario: Verify the presence of "Card Number"
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should see heading "Card Number"

  Scenario: Verify the presence of fields in payment
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should see card number, expiration , cvv field

  Scenario: Verify  presence of payment button
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should see "Pay $9.99 USD" button

  Scenario: Verify  terms and renewal message
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should see terms of service and auto-renewal notice

  Scenario: Verify the presence of terms and auto-renewal note
    Given User is in upgrade page
    When User clicks the "Upgrade to Premium" button
    Then User should see "By completing this purchase, you agree to our Terms of Service and Privacy Policy. Your subscription will automatically renew each month until cancelled."

  Scenario: Verify user able to go to home page
    Given User is in upgrade page
    When user clicks the "Go for free" button
    Then User should be redirected to the home page
