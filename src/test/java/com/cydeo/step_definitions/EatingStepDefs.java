package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingStepDefs {

    @Given("{string} is hungry")
    public void jhon_is_hungry(String name) {

        System.out.println(name + " is hungry");
    }
    @When("He eats {int} cucumbers")
    public void he_eats_cucumbers(Integer countOfCucumber) {

        System.out.println("he eats " + countOfCucumber+ " cucumber");
    }
    @Then("He will be full")
    public void he_will_be_full() {
        System.out.println("he is full now");
    }


}
