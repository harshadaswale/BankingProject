Feature: Test the Banking Application

  Scenario: validate the Home Page Of Banking application
    Given user is on Home Page
    Then User validate the Home page Title
    And User Validate the Home Page URL

  Scenario: validate ManagerPage of the Application
    When user click on managerPage link
    Then user validate the user is on manager page

  Scenario: validate the add customer Functionality
  When user click Add customer link
    When user enters the first name as "Anil" and last name as "Kapoor"
    And user enters the postal code as "456321"
    And user Click on Submit button
    Then new customer popup generated
    
    Scenario: open new Account
    When user click on open Account
    Then user select the customer name
    And select a currency as "Rupee"
    And user click on process button
    Then success pop generated
