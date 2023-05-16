package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FirstFeatureStepDefinitions {

    int int1, int2, toplam;

    @Given("Elimizde 3 sayisi mevcut")
    public void elimizde3SayisiMevcut() {
        int1 = 3;
        System.out.println("ilk sayi 3olarak set edildi");
    }

    @Given("Elimizde 5 sayisi mevcut")
    public void elimizde5SayisiMevcut() {
        int2 = 5;
        System.out.println("ikinci sayi 5 olarak set edildi");
    }

    @When("Bu sayilar toplandiginda")
    public void buSayilarToplandiginda() {
        toplam = int1 + int2;
        System.out.println("Sayilar toplandi");
    }

    @Then("Toplamin 8 oldugu gorulmelidir")
    public void toplaminOlduguGorulmelidir() {
        Assert.assertEquals(8, toplam);
        System.out.println("Toplam degerleri karsilastirildi");
    }

}
