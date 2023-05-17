package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class ScenarioOutlinesStepDefinitions {
    int a,b,sonuc;


    @Given("Sayi1 {int}")
    public void sayi1Sayi(int arg1) {

        a = arg1;
    }

    @And("Sayi2 {int}")
    public void sayi2Sayi(int arg1) {

        b = arg1;
    }

    @When("sayilar toplandiginda")
    public void sayilarToplandiginda() {

        sonuc = a + b;

    }

    @Then("sonuc {int} olmalidir")
    public void sonucSonucOlmalidir(int toplam) {

        Assert.assertEquals(toplam,sonuc);
    }
}