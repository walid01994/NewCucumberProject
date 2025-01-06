package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebOrderUtil {
    // Create a method to openWebOrderApp


    public static void openWebOrderApp() {

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

    }
    public static void login(String username, String password) {

        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }
    public static void loginToLibrary(String username, String password) {

        Driver.getDriver().findElement(By.id("inputEmail")).sendKeys(username);
        Driver.getDriver().findElement(By.id("inputPassword")).sendKeys(password);
        Driver.getDriver().findElement(By.linkText("Sign in")).click();


    }
    public static void loginToGMAILusername(String username){
//input[@id='identifierId']
        Driver.getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(username);

    }
    public static void loginToGMAILpassword(String password){
//input[@id='identifierId']

        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(password);

    }
}
