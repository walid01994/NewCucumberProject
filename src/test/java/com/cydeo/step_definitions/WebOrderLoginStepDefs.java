package com.cydeo.step_definitions;

import com.cydeo.pages.WLoginPage;
import com.cydeo.pages.WOrderPage;
import com.cydeo.utility.Driver;
import com.cydeo.utility.WebOrderUtil;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebOrderLoginStepDefs {

    @Given("we are at web order login page")
    public void we_are_at_web_order_login_page() {
        // Write code here that turns the phrase above into concrete actions
        WebOrderUtil.openWebOrderApp();
    }
    @When("I provide valid credentials")
    public void i_provide_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        WebOrderUtil.login("Tester","test");
    }
    @Then("I should see all order page")
    public void i_should_see_all_order_page() {
        // Write code here that turns the phrase above into concrete actions
        WOrderPage webOrder = new WOrderPage();
        //System.out.println("webOrder.webOrderPage.getText() = " + webOrder.webOrderPage.getText());
//WebElement webOrders = Driver.getDriver().findElement(By.xpath("//h1[.='Web Orders']"));
        Assertions.assertEquals(webOrder.webOrderPage.getText(),"Web Orders");
    }

    @When("I provide invalid credentials")
    public void iProvideInvalidCredentials() {
        WebOrderUtil.login("Tester","testtghth");
    }

    @Then("I should still be at the login page")
    public void iShouldStillBeAtTheLoginPage() {
        String pageTitle = Driver.getDriver().getTitle();
        Assertions.assertEquals(pageTitle, "Web Orders Login");
    }

    @And("login error message should be present")
    public void loginErrorMessageShouldBePresent() {

        WebElement errorMsg = Driver.getDriver().findElement(By.id("ctl00_MainContent_status"));

        Assertions.assertEquals(errorMsg.getText(), "Invalid Login or Password.");
    }

    @When("user provide username {string} and password {string}")
    public void userProvideUsernameAndPassword(String username, String password) {

        WebOrderUtil.login(username,password);

    }




}
