package com.cydeo.ApiTests;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class Desserializationn {

    @Test
    public void test() {

        Response response = given().accept(ContentType.JSON)
                .pathParam("id",1)
                .and().when().get("https://jsonplaceholder.typicode.com/posts");

        Map<String,Object> apiMap = response.body().as(Map.class);
        System.out.println("apiMap = " + apiMap.get("id"));

    }}
