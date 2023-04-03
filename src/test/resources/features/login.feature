Feature:Login to SRK website

  @InvalidCredentials
  Scenario Outline: To verify the login functionality of SRK website
    Given User is on home page of website
    When User enters username as "<username>"
    And  User enters password as "<password>"
    And  User clicks on login button
    Then User should be able to see error message as incorrect credentials "<username>" and "<password>"
    Examples:
      |username |password |
      |aryan    |srkcss   |
      |ppd      |pandey   |
      |aryan    |pandey   |


  @Validcredentials
  Scenario Outline: To verify the login functionality of SRK website
    Given User is on home page of website
    When User enters username as "<username>"
    And  User enters password as "<password>"
    And User clicks on login button
    Then User should be able to login successfully
    Examples:
      |username |password |
      |ppd      |srkcss   |


    @Registration
    Scenario Outline: To fill the registration form
      Given User is on home page of website
      When User enters username as "<username>"
      And  User enters password as "<password>"
      And User clicks on login button
      Then User should be able to login successfully
      When User fill the Registration form
      And Click on save button

      Examples:
        |username |password |
        |ppd      |srkcss   |