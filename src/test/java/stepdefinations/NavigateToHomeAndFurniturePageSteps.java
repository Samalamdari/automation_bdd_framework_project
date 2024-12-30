package stepdefinations;

import enums.WaitStrategy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipkart.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

public class NavigateToHomeAndFurniturePageSteps extends Base {

     LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page home and furniture")
    public void i_am_on_the_flipkart_web_page_home_and_furniture() {
    }

    @When("I click on the home and furniture button")
    public void i_click_on_the_home_and_furniture_button() {
        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver,flipKartLandingPage.homeAndFurnitureButton, WaitStrategy.PRESENCE);
        flipKartLandingPage.clickOnHomeAndFurnitureButton();
    }

    @Then("I should see home and furniture page")
    public void i_should_see_home_and_furniture_page() throws InterruptedException {
        Thread.sleep(2000);
    }

}
