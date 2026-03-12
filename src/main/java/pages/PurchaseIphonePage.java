package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import base.BasePage;

public class PurchaseIphonePage extends BasePage {

    public PurchaseIphonePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    @FindBy(xpath = "(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal'])[1]")
    WebElement firstIphone;

    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    WebElement price;

    public void searchIphone(String product) {
        searchBox.sendKeys(product);
    }

    public void clickSearch() {
        searchButton.click();
    }
    public void scrollDown() {

    	JavascriptExecutor js = (JavascriptExecutor) driver;

    	js.executeScript("window.scrollBy(0,200)");
    	}
    public void clickFirstIphone() {
        firstIphone.click();
    }

    public void printPrice() {
        System.out.println("Price: " + price.getText());
    }
}