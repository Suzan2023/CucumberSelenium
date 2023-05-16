package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/firstFeature.feature",
        glue = "stepdefinitions",
        dryRun = false
)
public class FirstRunner {
// 2 islemle bu class i bir junit runner class haline getirebiliriz

    // 1. RunWith anotasyonunu kullanarak bu runner in junit ve cucumber ile calisacagini bildiririz
    // 2. CucumberOptions isimli anotasyonu kullanarak bir takim konfigurasyonlar yapabiliriz


    // features -> tek bir features dosyasi veya tum feature dosyalarini barindiran feature klasorunun yolu
    // glue -> stepdefinitionlarin bulundugu package yolu
    // dryRun -> true oldugu takdirde eksik step kontrolu yapar fakat kodu calistirmaz!!!!

    // Testng ile calistirmak isterseniz classin AbstractTestngCucumberTests isimli class extend edilmelidir

}
