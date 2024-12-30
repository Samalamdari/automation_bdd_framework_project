package pages.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public final WebDriver driver;
    public final WebElement becomeASellerButton;
    public final WebElement cartButton;
    public final WebElement loginButton;
    public final WebElement groceryButton;
    public final WebElement mobilesButton;
    public final WebElement fashionButton;
    public final WebElement electronicsButton;
    public final WebElement homeAndFurnitureButton;
    public final WebElement appliancesButton;
    public final WebElement flightBookingButton;
    public final WebElement beautyAndToysButton;
    public final WebElement twoWheelersButton;
    public final WebElement searchButton;
    public final WebElement submitSearchButton;




    public LandingPage(WebDriver driver) {

        this.driver = driver;
        this.becomeASellerButton = driver.findElement(By.xpath("//a[text() = 'Become a Seller']"));
        this.cartButton = driver.findElement(By.xpath("//a[text() = 'Cart']"));
        this.loginButton = driver.findElement(By.xpath("//a[@class = '_1TOQfO' and @title='Login']"));
        this.groceryButton = driver.findElement(By.xpath("//img[@alt = 'Grocery']"));
        this.mobilesButton = driver.findElement(By.xpath("//img[@alt = 'Mobiles']"));
        this.fashionButton = driver.findElement(By.xpath("//img[@alt='Fashion']"));
        this.electronicsButton = driver.findElement(By.xpath("//img[@alt = 'Electronics']"));
        this.homeAndFurnitureButton = driver.findElement(By.xpath("//img[@alt = 'Home & Furniture']"));
        this.appliancesButton = driver.findElement(By.xpath("//img[@alt = 'Appliances']"));
        this.flightBookingButton = driver.findElement(By.xpath("//img[@alt = 'Flight Bookings']"));
        this.beautyAndToysButton = driver.findElement(By.xpath("//img[@alt = 'Beauty, Toys & More']"));
        this.twoWheelersButton = driver.findElement(By.xpath("//img[@alt = 'Two Wheelers']"));
        this.searchButton = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
        this.submitSearchButton = driver.findElement(By.xpath("//button[@type = 'submit']"));


    }
    public void clickOnBecomeASellerButton(){
        becomeASellerButton.click();
    }
    public void clickOnCartButton(){
        cartButton.click();
    }
    public void clickOnLoginButton(){
        loginButton.click();
    }
    public void clickOnGroceryButton(){
        groceryButton.click();
    }
    public void clickOnMobilesButton(){
        mobilesButton.click();
    }
    public void clickOnFashionButton() {
        fashionButton.click();
    }
    public void clickOnElectronicsButton() {
        electronicsButton.click();
    }
    public void clickOnHomeAndFurnitureButton() {
        homeAndFurnitureButton.click();
    }
    public void clickOnAppliancesButton() {
        appliancesButton.click();
    }
    public void clickOnFlightBookingButton() {
        flightBookingButton.click();
    }
    public void clickOnBeautyAndToysButton() {
        beautyAndToysButton.click();
    }
    public void clickOnTwoWheelersButton() {
        twoWheelersButton.click();
    }
    public void enterShoeInSearchBar() {
        searchButton.sendKeys("shoe");
    }
    public void clickOnSubmitSearchButton() {
        submitSearchButton.click();
    }

}
