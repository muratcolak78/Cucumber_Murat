Feature: Forum2
  Background:
    Given Navigate HomePage
    And  click ContactUs

   Scenario Outline: 1
      And typeName"<Name>"
      And typeSubject "<Subject>"
      And typeEmail"<Email>"
      And typeMessage"<Message>"
      When clickSubmit
      Then assertion
      Examples:
     |Name|Subject|Email|Message|
     |Murat|Deneme|Email|Mesaj1|
     |Name2|Konu2|Email2|Mesaj2|
     |Name3|Konu3|Email3|Mesaj3|
     |Name4|Konu4|Email4|Mesaj4|