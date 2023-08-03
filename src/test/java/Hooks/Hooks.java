package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    @Before //her senaryodan once
    public void setUp(Scenario scenario){
        System.out.println("senaryo basladi..");
        System.out.println("scenario id = " + scenario.getId());
        System.out.println("scenario name= " + scenario.getName());
    }

    @After //her senaryodan sonra
    public void tearDown(Scenario scenario) throws IOException {
        System.out.println("senaryodan sonra test ortami temizleniyor");
        if(scenario.isFailed()){
            System.out.println("scenario failed");
            // takeScreenshot(scenario.getName());
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "FailedScenarioScreenshot");
            System.out.println("Screenshot taken for failed scenario: " + scenario.getName());
        }

        // internet ortaminda raporlarinizi goruntulemek icin cucumber.properties dosyasi olustururz,
        // icine cucumber.publish.enabled = true yazariz.
        // Failed scenariolar icin console ciktisinda altta dikdortgen icersindeki rapor bilgileri cikar
        // ilk linke tiklayarak online ortamda raporunuzu raporunzu goruntuleyebilirsnz
        // attach kismina tiklayarak da ekran goruntusunu gorebilirsnz


        //  Driver.getDriver().close();
    }

    private String takeScreenshot(String fileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);

        String target = ".\\test-output\\Screenshots\\" + fileName +
                new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date()) + ".png";

        File finalDestination = new File(target);
        FileUtils.copyFile(source,finalDestination);
        return target;
    }

}
