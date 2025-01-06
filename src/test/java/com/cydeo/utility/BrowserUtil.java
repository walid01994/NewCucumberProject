package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {

    public static void waitFor(int seconds) {
try {
    Thread.sleep(seconds*1000);
}catch (InterruptedException e){
    e.printStackTrace();
}
    }

    public static class Driver {
        /**
         * 1. create private no arg constructor
         * <p>
         * 2. create private static field with name obj
         * Data type of variable should be WebDriver
         * <p>
         * 3. create public static method
         * name : getDriver()
         * return type :WebDriver
         * param : none
         * <p>
         * check if obj is null or not
         * if yes - create ChromeDriver with all set up
         * if no  -- return same obj
         */
        public static Driver obj;

        private Driver() {

        }

        public static Driver getDriver() {
            if (obj == null) {
                System.out.println("You Created one successfully");
                obj = new Driver();
                return obj;

            } else {
                System.out.println("You already have one");
            }
            return obj;
        }


    }
        public static boolean checkVisibilityOfElement(By locator, int second) {
            boolean result = false;

            WebDriverWait wait = new WebDriverWait(com.cydeo.utility.Driver.getDriver(), 4);

            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated( locator ));
                // if above line doesnt trow exception we will come to this line and below
                result = true;
            } catch (TimeoutException e) {
                //System.out.println("The error message is = " + e.getMessage());
                System.out.println("WE DID NOT SEE THE ERROR MESSAGE ELEMENT ");
            }
            return result;
        }
    }

