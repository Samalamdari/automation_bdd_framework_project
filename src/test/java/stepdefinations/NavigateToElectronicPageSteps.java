package stepdefinations;

import enums.WaitStrategy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipkart.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

public class NavigateToElectronicPageSteps extends Base {

    LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page electronics")
    public void i_am_on_the_flipkart_web_page_electronics() {
    }

    @When("I click on the electronics button")
    public void i_click_on_the_electronics_button() {
        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver,flipKartLandingPage.electronicsButton, WaitStrategy.PRESENCE);
        flipKartLandingPage.clickOnElectronicsButton();
    }

    @Then("I should see electronics page")
    public void i_should_see_electronics_page() throws InterruptedException {
     Thread.sleep(2000);
    }






}
