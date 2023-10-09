Feature: AboutUs

  Background:
    Given : Navigate AboutUs

  Scenario: AboutUsPageTest
    And click OurMission
    And assert Mission
    And close OurVision
    And assert Vision
    When click getQuote2
    Then assert ispageContactUs

  Scenario: Close Driver
    When click AboutUs
    Then close Driver
