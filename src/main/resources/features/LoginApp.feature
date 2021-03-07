Feature: Login to application

  Scenario: Login to the application with valid user name and password
    Given User enters '1234567890' as username
    And   User enters 'admin' as password 
    When  User click on login button
    Then  verify tital of page
