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

public class NavigateToCartPageSteps extends Base {

     LandingPage flipKartLandingPage;

    @Before
    public void setup(){
        super.setup();
        this.flipKartLandingPage = new LandingPage(driver);
    }

    @Given("I am on the flipkart web page cart")
    public void I_am_on_the_flipkart_web_page_cart(){}

    @When("I click on cart button")
    public void i_click_on_cart_button() {
        flipKartLandingPage.clickOnCartButton();
    }
    @Then("I should see cart page")
    public void i_should_see_cart_page() throws InterruptedException {
        Thread.sleep(2000);
    }
    @After
    public void tearDown(){
        super.tearDown();
    }
}
