package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    /**
     * We wanted to have a class with that only return Single object
     * no matter how many time you asked for object
     * so we are creating this class with technic we learned from Singleton pattern
     */


        private static WebDriver obj ;

        private Driver(){ }

    /**
     * returm obj with obly one WebDriver instance
     * @return same WebDriver if it exists, new one if null
     */

        public static WebDriver getDriver(){
// read the browser type we want to use from the properties file
           String browserName = ConfigReader.read("browser");

            if(obj == null){
                switch (browserName) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments("--remote-allow-origins=*");
                        obj = new ChromeDriver(options);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        obj = new FirefoxDriver();
                        break;
                    // other browsers omitted
                    default:
                        obj = null;
                        System.out.println("UNKNOWN BROWSER TYPE!!! " + browserName);
                }
//            System.out.println("One and only created for the first time");
                return obj ;
            }else{
//            System.out.println("You have it just use existing one");
                return obj ;

            }

        }

    /**
     * quiting the browser and setting the value of
     * WebDriver instance to null because you can re-use already quited driver
     */
    public static void closeBrowser(){
            // check if we have webDriver instance or not
    // basically checking if obj is null or not
    // if not null
    // quit the browser make it null, because once quit it can not be
    if(obj != null){
        obj.quit();
        // so when ask for it again , it gives us not quited fresh driver
        obj=null;
    }


}
    }

