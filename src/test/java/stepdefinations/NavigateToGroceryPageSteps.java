package stepdefinations;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.flipkart.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

import java.time.Duration;

public class NavigateToGroceryPageSteps extends Base {

       LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page grocery")
    public void I_am_on_the_flipkart_web_page_grocery(){
    }

    @When("I click on the grocery Button")
    public void I_click_on_the_grocery_button() throws InterruptedException {
        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver, flipKartLandingPage.groceryButton, WaitStrategy.CLICKABLE);
        flipKartLandingPage.clickOnGroceryButton();

    }
    @Then("I should see grocery page")
    public void I_should_see_grocery_page() throws InterruptedException {
        Thread.sleep(2000);
    }
}
