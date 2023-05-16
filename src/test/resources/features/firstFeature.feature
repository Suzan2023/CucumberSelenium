@login
Feature: First Feature Tests

@smoke
  Scenario: Smoke Test
    Given Elimizde 5 sayisi mevcut
    And Elimizde 3 sayisi mevcut
    When Bu sayilar toplandiginda
    Then Toplamin 8 oldugu gorulmelidir

@regression  @smoke
  Scenario: Regression Test
    Given Elimizde 5 sayisi mevcut
    And Elimizde 3 sayisi mevcut
    When Bu sayilar toplandiginda
    Then Toplamin 8 oldugu gorulmelidir

