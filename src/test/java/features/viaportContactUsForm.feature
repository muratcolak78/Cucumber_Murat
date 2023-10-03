Feature: ContactUs
  Scenario: formTest
    Given goto contact
    And typeName
    And typeSubject
    And typeEmail
    And typeMessage
    When clickSubmit
    Then assertion
