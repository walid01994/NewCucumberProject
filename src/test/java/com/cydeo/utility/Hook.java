package com.cydeo.utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook {

    @Before("@smoke")
    public void setup(){
        System.out.println("running before scenario");
    }

    @After("@smoke")
    public void tearDown(){

        System.out.println("running after scenario");
       // Driver.closeBrowser();
    }
}
