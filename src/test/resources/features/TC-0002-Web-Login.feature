Feature: TC-0002 Web Login

  @login
  Scenario: TC-0002.01 Facebook Login
    Given Facebook website is accessible
    When login with user-defined username and password
    Then login is successful
