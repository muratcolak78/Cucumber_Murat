Feature: Service Storage Test

  Background:
    Given Navigate Service Storage

  Scenario: ServiceStorage Test
    When click Storage
    Then assert isPageServiceStorage

  Scenario: ServiceLogistik Test
    And click Logistic
    And assert isPageServiceLogistik
    When click LogistikContactUst
    Then assertLogistikContactUs

    Scenario: Transport Test
      And click Transport
      And assert isPageTransport
        When click transportContactUs
        Then assert isPageContactUs

  Scenario: Close Driver
    When click HomePage
    Then close Driver
