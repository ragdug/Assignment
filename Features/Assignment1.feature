Feature: Assignment 1

  @FacebookLogin
  Scenario Outline: Assignment 1
    Given user on Facebook Login Page
    When user logins in FB using "<username>" and "<password>"
    Then verify user is able to see the Home Button
    Then user clicks on Profile Button
    Then user clicks on Status Box
    Then user Enters the status
    Then user post the status

    Examples: 
      | username                   | password |
      | testassignment31@gmail.com | test@123 |
  
