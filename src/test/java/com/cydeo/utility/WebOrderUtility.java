package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtility {

    public static void login(WebDriver driverParam, String username, String password) {

        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

    }


    public static void logout(WebDriver driverParam) {
        driverParam.findElement(By.id("ctl00_logout")).click();
    }


    public static boolean isAtOrderPage(WebDriver driverParam) {
        boolean result = false;

        //locator for the header element of all order page
        try {
            WebElement header = driverParam.findElement(By.xpath("//h2[normalize-space(.) = 'List of All Orders']"));
            System.out.println("element has been identified");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("no such element! you are on the wrong page");
        }
        return result;
    }
}