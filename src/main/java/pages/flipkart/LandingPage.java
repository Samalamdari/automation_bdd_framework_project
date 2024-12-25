package pages.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public final WebDriver driver;
    public final WebElement becomeASellerButton;
    public final WebElement cartButton;
    public final WebElement loginButton;




    public LandingPage(WebDriver driver) {

        this.driver = driver;
        this.becomeASellerButton = driver.findElement(By.xpath("//a[text() = 'Become a Seller']"));
        this.cartButton = driver.findElement(By.xpath("//a[text() = 'Cart']"));
        this.loginButton = driver.findElement(By.xpath("//a[@class = '_1TOQfO' and @title='Login']"));



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

}
