Feature: HomePage Test

  Background:
    Given Navigate HomePage

  Scenario: Main Test ReadMoreFirst
    When click readMoreFirst
    Then assert readMoreFirst

  Scenario: Main Test ReadMoreSecond
    When click readMoreSecond
    Then assert readMoreSecond

  Scenario: Main Test ReadMoreThird
    When click readMoreThird
    Then assert readMoreThird

  Scenario: Main Test contactUsButton
    When click contactUsButton
    Then assert contactUsButton

  Scenario: Main Test ReadMorefourth
    When click readMorefourth
    Then assert readMorefourth

  Scenario: Main Test ReadMorefifth
    When click readMorefifth
    Then assert readMorefifth

  Scenario: Main Test ReadMoreSixth
    When click readMoreSixth
    Then assert readMoreSixth

  Scenario: Main Test viewAllServices
    When click viewAllServices
    Then assert viewAllServices

  Scenario: Main Test contactUsButtonSecond
    When click contactUsButtonSecond
    Then assert contactUsButtonSecond

  Scenario: Main Test requestFreeQuote
    When click requestFreeQuote
    Then assert requestFreeQuote

  Scenario: Main Test close
    When click HomePage
    Then close Driver