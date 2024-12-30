package stepdefinations;

import enums.WaitStrategy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipkart.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

public class NavigateToTwoWheelersPageSteps extends Base {


    LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page two wheelers")
    public void i_am_on_the_flipkart_web_page_two_wheelers() {
    }

    @When("I click on the two wheelers button")
    public void i_click_on_the_two_wheelers_button() {
        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver,flipKartLandingPage.twoWheelersButton, WaitStrategy.PRESENCE);
        flipKartLandingPage.clickOnTwoWheelersButton();
    }

    @Then("I should see two wheelers page")
    public void i_should_see_two_wheelers_page() throws InterruptedException {
        Thread.sleep(2000);
    }
}
