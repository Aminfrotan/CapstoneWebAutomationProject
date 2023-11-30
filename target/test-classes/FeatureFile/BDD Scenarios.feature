#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
Feature: Admin Area Demo Login Page

  Scenario: Login into account
    Given User is navigating to "https://admin-demo.nopcommerce.com/"
    When User is adding "Email" and "Password"
    And User is clicking on "Login" button
    Then User is logged into Admin Application
