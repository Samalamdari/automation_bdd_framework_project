package stepdefinations;

import enums.WaitStrategy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipkart.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

public class NavigateToSearchButtonSteps extends Base {

    LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page search")
    public void i_am_on_the_flipkart_web_page_search() {
    }

    @When("I enter shoe in the search bar and click on submit button")
    public void i_enter_shoe_in_the_search_bar_and_click_on_submit_button() throws InterruptedException {
        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver,flipKartLandingPage.searchButton, WaitStrategy.PRESENCE);
        flipKartLandingPage.enterShoeInSearchBar();
        flipKartLandingPage.submitSearchButton.click();
        Thread.sleep(2000);
    }

    @Then("I should see shoe page")
    public void i_should_see_shoe_page() throws InterruptedException {
        Thread.sleep(2000);
    }

}
