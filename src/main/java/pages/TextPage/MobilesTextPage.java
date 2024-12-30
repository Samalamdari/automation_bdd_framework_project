package pages.TextPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilesTextPage {

    public WebDriver driver;

    public WebElement mobilesYearEndSaleText;

    public MobilesTextPage(WebDriver driver) {

        this.driver = driver;
        this.mobilesYearEndSaleText = driver.findElement(By.xpath("//h1[text() = 'Mobiles Year End Sale']"));
    }
}
