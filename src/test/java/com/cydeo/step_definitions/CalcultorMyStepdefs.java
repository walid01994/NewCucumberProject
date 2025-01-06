package com.cydeo;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

public class CalcultorMyStepdefs {
    int actualResult;
    @Given("calculator app is open")
    public void calculator_app_is_open() {
        System.out.println("Hello please add 2 numbers");
    }
    @When("i add {int} and {int}")
    public void i_add_and(int num1, int num2) {

        actualResult = num1+num2;

    }
    @Then("i should get {int} displayed")
    public void i_should_get_displayed(int result) {

        Assertions.assertEquals(result,actualResult);

    }
}
