Feature: VehicleFleet Test

  Background:
    Given Navigate VehicleFleet

  Scenario: SlidePictureTest
    And click firstPicture
    And click rightArrow
    And click rigthArrow
    And click leftArrrow
    When click close
    Then assert VehicleFleePage

  Scenario: GetQuote Test
    When click getQuote
    Then assert go to VehicleContactUs

  Scenario: Close Driver
    When Navigate VehicleFleet
    Then close VehicleDriver