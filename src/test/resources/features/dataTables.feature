Feature: DataTable Usage

  #  Datatable lar parametre olarak gonderilecekleri step in altina yazilirlar.
#  Scenario Outline aksine tek bir kere step tetiklenir ve tum data tek seferde step e verilir.

  Scenario: DataTable

    Given Asagidaki tablo bu methodda parametre olarak kullanilacaktir
    |name|surname|number|
    |Karl|Ortis  |123   |
    |Ali |Osman  |012345|
    |Vedat|CW    |078964|