package stepdefinations;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipkart.LandingPage;
import utils.WaitUtils;

import java.sql.DriverManager;

public class NavigateToFlipkartBecomeASellerPageSteps extends BaseTest {

    public LandingPage flipKartLandingPage;

    @Before
    public void setup(){
        super.setup();
        this.flipKartLandingPage = new LandingPage(driver);
    }

    @Given("I am on the flipkart web page seller")
    public void i_am_on_the_flipkart_web_page_seller() {}

    @When("I click on the become a seller button")
    public void i_click_on_the_become_a_seller_button() {
        WaitUtils.applyWait(driver, flipKartLandingPage.becomeASellerButton, WaitStrategy.CLICKABLE);
        flipKartLandingPage.clickOnBecomeASellerButton();
        WaitUtils.applyGlobalWait();
    }

    @Then("I should see become a seller page")
    public void i_should_see_become_a_seller_page() {
        WaitUtils.applyGlobalWait();
    }

    @After
    public void tearDown(){
        super.tearDown();
    }
}
