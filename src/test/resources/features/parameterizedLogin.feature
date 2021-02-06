@plogin
Feature: Parameterized Login

  Scenario: Parameterized driver login
    Given p-the user is on the login pager
    When p-the user enter "User1" and "UserUser123" information
    Then p-the user should be login and display "Quick Launchpad"

  Scenario: Parameterized storemaneger login
    Given p-the user is on the login pager
    When p-the user enter "storemanager51" and "UserUser123" information
    Then p-the user should be login and display "Dashboards"

  Scenario Outline: Parameterized salesmanager login
    Given p-the user is on the login pager
    When p-the user enter "salesmanager120" and "UserUser123" information
    Then p-the user should be login and display "Dashboard"

    Examples: 
      | User1 |