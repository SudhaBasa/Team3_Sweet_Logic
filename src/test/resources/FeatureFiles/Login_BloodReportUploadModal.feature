Feature: Blood Report Upload Modal

  Background: 
    Given User clicks Upload blood button after reaching upload report page.

  Scenario: Verify upload box supports drag & drop
    Given User is on blood report modal.
    When User hovers over the upload box.
    Then Upload box should show drag & drop interaction.
    
  Scenario: Verify supported file types (PDF)
    Given User is on blood report modal.
    When User tries to upload a non-PDF file.
    Then User should see "Only PDF files are supported" error.

  #Scenario: Verify file size limit (10MB)
    #Given User is on blood report modal.
    #When User uploads a PDF file over 10MB.
    #Then User should see "File exceeds 10MB" error

  Scenario: Verify valid PDF file upload
    Given User is on blood report modal.
    When User uploads valid PDF file.
    Then Upload should see processing percentage bar.
    

  Scenario: Verify "Upload & Process" button is enabled after valid upload
    Given User is on blood report modal.
    When User uploads valid PDF file.
    Then "Upload & Process" button should be enabled.

  Scenario: Verify upload cancel button functionality
    Given User is on blood report modal.
    When User clicks "Cancel".
    Then Modal should be closed and user returned to previous screen.

  Scenario: Verify "Upload & Process" processes the file
    Given User is on blood report modal.
    When User clicks "Upload & Process" after uploading valid file.
    Then User should see Report analysis.

  #Scenario: Verify onboarding button in report analysis
    #Given User is on blood report modal
    #When User clicks "Upload & Process" after uploading valid file
    #Then User should see onboarding button
#
  #Scenario: Validate fields on report analysis
    #Given User is on blood report modal
    #When User clicks "Upload & Process" after uploading valid file
    #Then User should see Blood Test Results, Complete Blood Count, Medical Conditions, Abnormal Values, Recommendations
