Feature: BOSS_Payment_Approve

  Manage Payment

  Background:
    Given launch the application "https://qa3.swapstech.net/sso/login?service=https%3A%2F%2Fqa3.swapstech.net%2FbossPortal%2Fj_spring_cas_security_check"
    And user enters username "Testuser2" and password "Password@1"
    And user clicks on Login button
    And user clicks on Payment module

  @ORPHAN
  Scenario: Approve a payment
    And user click on pending approval Open Advance Search 
     |Transaction|
     |           |
    And user click on Select button
    And user click on Approve button
    Then system refresh the screen payment moved to approved status

  @ORPHAN
  Scenario: Cancel the future payment 
