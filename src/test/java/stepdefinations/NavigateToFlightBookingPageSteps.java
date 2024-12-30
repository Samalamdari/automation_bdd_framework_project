package stepdefinations;

import enums.WaitStrategy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipkart.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

public class NavigateToFlightBookingPageSteps extends Base {

    LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page flight booking")
    public void i_am_on_the_flipkart_web_page_flight_booking() {
    }

    @When("I click on the flight booking button")
    public void i_click_on_the_flight_booking_button() {
        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver,flipKartLandingPage.flightBookingButton, WaitStrategy.CLICKABLE);
        flipKartLandingPage.clickOnFlightBookingButton();
    }

    @Then("I should see flight booking page")
    public void i_should_see_flight_booking_page() throws InterruptedException {
        Thread.sleep(2000);
    }

}
