@ui @smoke
  Feature: Login Functionality


    Scenario Outline: User logs in to the account
      Given User is on login page
      When user logs in with "<username>" and "<password>"
      Then user is able to login to the account

      Examples :
      |username| password|
      | admin  | pass    |
      | not valid | passww   |
      |admin123| pass1   |






