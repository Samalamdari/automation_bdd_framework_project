package stepdefinations;


import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.flipkart.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

import java.time.Duration;

public class NavigateToLoginPageSteps extends Base {

     LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page login")
    public void i_am_on_the_flipkart_web_page_login() {
    }

    @When("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver, flipKartLandingPage.loginButton, WaitStrategy.CLICKABLE);
        flipKartLandingPage.clickOnLoginButton();
    }
    @Then("I should see login page")
    public void i_should_see_login_page() throws InterruptedException {
        Thread.sleep(2000);
    }
}
