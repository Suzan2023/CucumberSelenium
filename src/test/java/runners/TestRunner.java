package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "html:reports/html-reports/cucumber.html", //html formatinda rapor almak icin kullanilan plugin
                    "json:reports/json-reports/cucumber.json", //json formatinda rapor almak icin kullanilan plugin
                    "junit:reports/xml-reports/cucumber.xml",  //xml formatinda rapor almak icin kullanilan plugin
                    "pretty"  ,                               //konsol ciktilarinin daha okunakli olmasi icin plugin
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //spark report icin
            features = "src/test/resources/features",
            glue = {"stepdefinitions","hooks"},
            tags = "@firstFeature",
            dryRun = false
    )
    public class TestRunner {
    }
/*
plugin olarak cucumber in adapter olarak calismasini saglayan;
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
bu sekilde eklenirse
 */

