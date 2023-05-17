package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.GoogleHomePage;
import utils.Driver;

public class BackgroundStepDefinitions {


    @Given("Kullanici google.com sayfasindadir")
    public void kullaniciGoogleComSayfasindadir() {

        Driver.getDriver().get("https://www.google.com/");
        try {
            Driver.getDriver().findElement(By.id("L2AGLb")).click();
        } catch (Exception e) {

        }

    }

    @When("Kullanici arama kismina amazon yazar")
    public void kullaniciAramaKisminaAmazonYazar() {

        GoogleHomePage hp = new GoogleHomePage();
        hp.searchFor("amazon");
        hp.clickSearchButton();

    }

    @And("Kullanici aramayi gerceklestirdiginde")
    public void kullaniciAramayiGerceklestirdiginde() {

        GoogleHomePage hp = new GoogleHomePage();
        hp.clickSearchButton();

    }

    @Then("Kullanici title da amazon gormelidir")
    public void kullaniciTitleDaAmazonGormelidir() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("amazon"));

    }

    @When("Kullanici arama kismina linkedin yazar")
    public void kullaniciAramaKisminaLinkedinYazar() {

        GoogleHomePage hp = new GoogleHomePage();
        hp.searchFor("linkedin");

    }

    @Then("Kullanici title da linkedin gormelidir")
    public void kullaniciTitleDaLinkedinGormelidir() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("linkedin"));

        Driver.closeDriver();
    }
}