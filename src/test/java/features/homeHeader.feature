Feature: HomePage Test

  Background:
    Given Navigate HomePage

  Scenario: Header Test VehicleFleet
    When click vehicleFleet
    Then assert go to VehicleFleet

  Scenario: Header Test ServiceStorage
    When click ServiceStorage
    Then assert ServiceStorage

  Scenario: Header Test ServiceLogistic
    When click ServiceLogistic
    Then assert go to ServiceLogistic

  Scenario: Header Test ServiceTransport
    When click ServiceTransport
    Then assert go to ServiceTransport

  Scenario: Header Test AboutUs
    When click AboutUs
    Then assert go to AboutUs

  Scenario: Header Test ContactUs
    When click ContactUs
    Then assert go to ContactUs

 Scenario: Header Test Search
   And click Search
   When send keys
   Then assert go to Search
   Scenario: Header Test close
     When click HomePage
     Then close Driver

