package stepdefinations;

import enums.WaitStrategy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipkart.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

public class NavigateToBeautyAndToysPageSteps extends Base {

    LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page beauty and toys")
    public void i_am_on_the_flipkart_web_page_beauty_and_toys() {
    }

    @When("I click on the beauty and toys button")
    public void i_click_on_the_beauty_and_toys_button() {
        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver,flipKartLandingPage.beautyAndToysButton, WaitStrategy.PRESENCE);
        flipKartLandingPage.clickOnBeautyAndToysButton();
    }

    @Then("I should see beauty and toys page")
    public void i_should_see_beauty_and_toys_page() throws InterruptedException {
        Thread.sleep(2000);
    }

}
