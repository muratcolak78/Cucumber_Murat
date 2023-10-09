Feature: HomePage Test

  Background:
    Given Navigate HomePage

  Scenario: Footer  Test Thuis
    When click Thuis
    Then assert Thuis
  Scenario: Footer  Test wagenPark
    When click wagenPark
    Then assert wagenPark

  Scenario: Footer  Test diensten
    When click diensten
    Then assert diensten

  Scenario: Footer  Test overOns
    When click overOns
    Then assert overOns

  Scenario: Footer  Test neemContactOp
    When click neemContactOp
    Then assert neemContactOp

  Scenario: Footer  Test opstag
    When click opstag
    Then assert opstag

  Scenario: Footer  Test logistiek
    When click logistiek
    Then assert logistiek

  Scenario: Footer  Test vervoer
    When click vervoer
    Then assert vervoer

  Scenario: Footer  Test number
    When click number
    Then assert number

  Scenario: Footer  Test BTW
    When click BTW
    Then assert BTW
  Scenario: Footer  Test language
    When click language
    Then assert language
  Scenario: Close Driver
    When click HomePage
    Then close Driver
