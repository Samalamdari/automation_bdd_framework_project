package stepdefinations;

import enums.WaitStrategy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipkart.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

public class NavigateToFashionPageSteps extends Base {

    LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page fashion")
    public void i_am_on_the_flipkart_web_page_fashion() {
    }

    @When("I click on the fashion button")
    public void i_click_on_the_fashion_button() {
     this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
     WaitUtils.applyWait(driver,flipKartLandingPage.fashionButton, WaitStrategy.PRESENCE);
     flipKartLandingPage.clickOnFashionButton();
    }

    @Then("I should see fashion page")
    public void i_should_see_fashion_page() throws InterruptedException {
        Thread.sleep(2000);
    }

}
