@regression @login @web
Feature: Login feature

  Background:
    Given I am on Threely Login Page

  @login-1
  Scenario: Verify valid login
    When I enter username as n12345@test.com and password as 123456
    And I click on submit button
    Then I verify logout button is displayed

