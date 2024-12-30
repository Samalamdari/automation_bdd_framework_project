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

import java.sql.Driver;
import java.time.Duration;


public class NavigateToFlipkartBecomeASellerPageSteps extends Base {

     LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page seller")
    public void i_am_on_the_flipkart_web_page_seller() {}

    @When("I click on the become a seller button")
    public void i_click_on_the_become_a_seller_button() {
        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver, flipKartLandingPage.becomeASellerButton, WaitStrategy.CLICKABLE);
        flipKartLandingPage.clickOnBecomeASellerButton();
//        WaitUtils.applyGlobalWait();
    }

    @Then("I should see become a seller page")
    public void i_should_see_become_a_seller_page() throws InterruptedException {
       Thread.sleep(2000);
    }

}
