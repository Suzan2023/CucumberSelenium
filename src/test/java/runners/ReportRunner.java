package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions"},
        plugin = {
                "html:reports/html/htmlReport.html", //html formatinca rapor almak icin
                "json:reports/jsonReport.json",  //json formatinca rapor almak icin
                "junit:reports/xmlReport.xml",//xml formatinca rapor almak icin
                "pretty",                    //konsol ciktilarinin daha okunakli olmasi icin
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  //spark report icin

        }

)

public class ReportRunner {

        //    1. ExtentReport (Third party Reporting Framework)

        //    2. Cucumber Built in raporlari

        //    Cucumber html json ve xml reportlar uretebilir
//        html - html:<path>
//        json - json:<path>
//        xml - junit:<path>

}
