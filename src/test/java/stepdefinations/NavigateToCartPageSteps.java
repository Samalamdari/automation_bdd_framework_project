package stepdefinations;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.flipkart.LandingPage;
import utils.WaitUtils;

public class NavigateToCartPageSteps extends BaseTest {

    public LandingPage flipKartLandingPage;

    @Before
    public void setup(){
        super.setup();
        this.flipKartLandingPage = new LandingPage(driver);
    }

    @Given("I am on the flipkart web page cart")
    public void I_am_on_the_flipkart_web_page_cart(){}

    @When("I click on cart button")
    public void i_click_on_cart_button() {
        WaitUtils.applyWait(driver,flipKartLandingPage.cartButton, WaitStrategy.CLICKABLE);
        flipKartLandingPage.clickOnCartButton();
        WaitUtils.applyGlobalWait();
    }
    @Then("I should see cart page")
    public void i_should_see_cart_page() {
        WaitUtils.applyGlobalWait();
    }
    @After
    public void tearDown(){
        super.tearDown();
    }

}
