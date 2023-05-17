package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableStepDefinitions {
    @Given("Asagidaki tablo bu methodda parametre olarak kullanilacaktir")
    public void asagidakiTabloBuMethodadaParametreOlarakKullanilacaktir(DataTable table) {

//        |name|surname|number|      ->    { {"name", "surname", "number"},
//        |Karl|Ortis  |123   |      ->     {"Karl", "Ortis", "123"},
//        |Ali |Osman  |073109|      ->     {"Ali", "Osman", "073109"},
//        |Vedat|CW    |073150|      ->     {"Vedat", "CW ", "073150"} }

        List<List<String>> data =  table.asLists();

        for (List<String> eachRow : data) {
            for (String eachCell : eachRow) {
                System.out.print(eachCell + " ");
            }
            System.out.println();
        }

        //table.asMaps();

        // List{
        //  Map{name=Karl, surname=Ortis, number=123},
        //  Map{name=Ali, surname=Osman, number=073109},
        //  Map{name=Vedat, surname=CW, number=073150}
        // }

    }
}
