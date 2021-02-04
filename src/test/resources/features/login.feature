@login
Feature: Users should be able to login

  @driver @hello
  Scenario: Login as a driver
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login

    @salesmanager @hello @db
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login

    @storemanager @hello
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login

    @admin @wip
    Scenario: Login as administrator
      Given the user is on the login page
      When  the user enters the admin information
      Then the user should be able to login