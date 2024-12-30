package stepdefinations;

import enums.WaitStrategy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.TextPage.MobilesTextPage;
import pages.flipkart.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

public class NavigateToMobilesPageSteps extends Base {

    LandingPage flipKartLandingPage;

    @Given("I am on the flipkart web page mobiles")
    public void i_am_on_the_flipkart_web_page_mobiles() {
    }

    @When("I click on mobiles button")
    public void i_click_on_mobiles_button() {
        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver, flipKartLandingPage.mobilesButton, WaitStrategy.CLICKABLE);
        flipKartLandingPage.clickOnMobilesButton();
    }

    @Then("I should see mobiles page")
    public void i_should_see_mobiles_page() throws InterruptedException {
        Thread.sleep(2000);

    }
    @And("I should see Mobiles Year End Sale text")
    public void i_should_see_mobiles_year_end_sale_text() {
        MobilesTextPage flipMobilesTextPage = new MobilesTextPage(DriverManager.getDriver());
        String actualText = flipMobilesTextPage.mobilesYearEndSaleText.getText();
        String expectedText = "Mobiles Year End Sale";
        Assert.assertEquals(actualText,expectedText,"The text does not match.try again!");
    }
}
