Feature: Background Kullanimi

  Background: Tum senaryolar icin calisacak stepler
    Given Kullanici google.com sayfasindadir

  Scenario: Google amazon search test

    When Kullanici arama kismina amazon yazar
    And Kullanici aramayi gerceklestirdiginde
    Then Kullanici title da amazon gormelidir

  Scenario:

    When Kullanici arama kismina linkedin yazar
    And Kullanici aramayi gerceklestirdiginde
    Then Kullanici title da linkedin gormelidir