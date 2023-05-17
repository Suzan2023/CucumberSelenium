Feature: Scenario Outline Usage

  # Scenario outline da parametrelo stepler kullanilir
  # Parametre kisimlari hardcoded olmadan Examples tablosunda belirtilen basliklarda gonderilir

  Scenario Outline:
    Given Sayi1 <sayi1>
    And Sayi2 <sayi2>

    When sayilar toplandiginda
    Then sonuc <sonuc> olmalidir

    Examples:
    |sayi1|sayi2|sonuc|
    |5    |3    |8    |
    |2    |4    |6    |
    |7    |8    |15   |
    |1    |1    |2    |
