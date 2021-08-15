Feature: Assignment 2

  @Assignment2
  Scenario Outline: Assignment 2
    Given user on WalletHub Insurance company Test
    When user clicks on Login button
    When user logins in WalletHub using "<username>" and "<password>"
    Then validate Stars are lighten up
    Then user clicks on fourth star
    Then user select "<dropdownValue>" from the dropdown
    Then user writes the review comment
    Then user clicks on Submit button
    Then user verify the review comment post is successfull
    Then user clicks on Continue button
    Then verify user review got updated

    Examples: 
      | username              | password | dropdownValue    |
      | ragdug31@gmail.com | Test@123 | Health Insurance |
