package stepdefinitions;

import io.cucumber.java.en.Given;

public class ParameterStepDefinitions {
    @Given("Bu parametreli bir steptir ve degeri {string}")
    public void buParametreliBirSteptirVeDegeri(String arg0) {

        System.out.println("Step'imizden "+ arg0+ " degeri okundu");

    }
}
