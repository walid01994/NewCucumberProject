package com.cydeo.step_definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class NetflixStepDef {


    @Given("I like {string}")
    public void i_like_actions(String movieGenre) {
        System.out.println("Step i like " + movieGenre);
    }
    @When("I go to home page")
    public void i_go_to_home_page() {
        System.out.println("Step I go to HomePage");
    }
    @Then("i should get recommendations")
    public void i_should_get_recommendations() {
        System.out.println("Step i should get recomendations ");
    }
    @Given("I like")
    public void i_like(List<String> movieTypes) {

        System.out.println(movieTypes);
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @Given("I like these")
    public void i_like(Map<String,String> FavoritemovieTypes) {

        System.out.println(FavoritemovieTypes);
        System.out.println(FavoritemovieTypes.get("actions"));
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
}
