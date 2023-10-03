Feature: Service Storage Test

  Background:
    Given Navigate Service Storage

  Scenario: ServiceStorage Test
    When click Storage
    Then assert isPageServiceStorage

  Scenario: ServiceLogistik Test
    When click Logistic
    Then assert isPageServiceLogistik

  Scenario: LogistikContactUs test
    And click Logistic
    When click LogistikContactUst
    Then assertLogistikContactUs

    Scenario: Transport Test
      When click Transport
      Then assert isPageTransport

      Scenario: TransportContactUs Test
        And click Transport
        When click transportContactUs
        Then assert isPageContactUs
