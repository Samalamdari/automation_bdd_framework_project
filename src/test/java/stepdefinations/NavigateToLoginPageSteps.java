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

public class NavigateToLoginPageSteps extends BaseTest {

    public LandingPage flipKartLandingPage;

    @Before
    public void setup(){
        super.setup();
        this.flipKartLandingPage = new LandingPage(driver);
    }

    @Given("I am on the flipkart web page login")
    public void i_am_on_the_flipkart_web_page_login() {
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        WaitUtils.applyWait(driver,flipKartLandingPage.loginButton, WaitStrategy.CLICKABLE);
        flipKartLandingPage.clickOnLoginButton();
        WaitUtils.applyGlobalWait();

    }
    @Then("I should see login page")
    public void i_should_see_login_page() {
    }

    @After
    public void tearDown(){
        super.tearDown();
    }


}
