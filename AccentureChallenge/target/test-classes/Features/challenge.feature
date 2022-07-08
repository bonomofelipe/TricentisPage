Feature: Start Form http://sampleapp.tricentis.com/101/app.php

  Scenario: Enter the website and fill the form
    Given that I access the webdriver form
    And I select Automotive
    Then the Automotive screen is displayed
    When the page loads
    Then the form page is shown
    Given that I select a Make
    And I select a Engine Performance
    And I select a Date of Manufacture
    And I select the Number of Seats
    And I select the Fuel Type
    And I type a List Price [$]
    And I type a License Plate Number
    And I type a Annual Mileage [mi]
    And I click on Next
    Then the VehicleData Tab is complete

  Scenario: Fill the Insurance Data form
    Given that Im in the Insurance Data tab
    And I type a First Name
    And I type a Last Name
    And I select a Date of Birth
    And I select a Gender
    And I type an Address
    And I select a Country
    And I type a Zip Code
    And I type a City
    And I select an Occupation
    And I select a Hobbie
    And I type a Website
    And I click Next
    Then the Insurance Data Tab is complete

  Scenario: Fill the Product Data form
    Given that Im in the Product Data tab
    And I select a Start Date
    And I select a Insurance Sum [$]
    And I select a Merit Rating
    And I select a Damage Insurance
    And I select an Optional Product
    And I select if I want a Courtesy Car
    And I click on the Next Button
    Then I the Product Data Tab is complete

  Scenario: Select a Price Option
    Given that Im in the Price Option tab
    Then I select a Price Option
    And click on Next

  Scenario: Send Quote
    Given that Im in the Send Quote tab
    And I type an E-mail
    And I type a Phone
    And I type an User Name
    And I type a Password
    And I confirm the Password
    And I type my Comments
    And I click on Send
    Then I check the confirmation message