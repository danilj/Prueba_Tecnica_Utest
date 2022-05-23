#Autor: Daniela Londono

  @stories
  Feature: Register Utest Page
    Get into the Utest page with the purpose to fill out the registration form to create an account
    @scenario1
    Scenario: Create an account
      Given Daniela wants to create an account on the Utest page
      When get into the Utest page and click on the 'Join Today' button to register
      Then she register the information for the successful creation of the account