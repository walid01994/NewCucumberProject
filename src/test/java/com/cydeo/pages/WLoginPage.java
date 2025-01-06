package com.cydeo.pages;

import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameField ;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement passwordField ;

    @FindBy(css = "#ctl00_MainContent_login_button")
    public WebElement loginButton ;

    @FindBy(xpath = "//span[.='Invalid Login or Password.']")
    public WebElement errorMsg;

    // Now we need instruct selenium to start looking for element
    // when this constructor is called
    // This is no arg constructor of this class

    public WLoginPage(){
        // PageFactory is a selenium class that support Page Object Model
        // and it has method called initElements
        // once it's called , it will locate all the element
        // specified using @FindBy annotation with locator
        // initElements accept 2 arguments ,
        // WebDriver instance and Page class instance (this) means current instance of this class.
        PageFactory.initElements(Driver.getDriver() , this );

    }

    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }
    public void login(String username, String password){

        this.userNameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.loginButton.click();
    }
    public boolean loginErrorMsgPresent(){

       return this.errorMsg.isDisplayed();



    }
}
