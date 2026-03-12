package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import base.BasePage;

public class BuyingIphone17Pro extends BasePage {

    public BuyingIphone17Pro(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")
    WebElement addToCart;

    @FindBy(id = "nav-cart-count")
    WebElement cartCount;

    public void switchWindowAndAddToCart() {

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String handle : allWindows) {

            if (!handle.equals(mainWindow)) {

                driver.switchTo().window(handle);
                break;
            }
        }

        addToCart.click();

        System.out.println("iPhone added to cart successfully!");
    }

    public void verifyCart() {

        String count = cartCount.getText();

        if (!count.equals("0")) {

            System.out.println("Item successfully added to cart! Cart count: " + count);

        } else {

            System.out.println("Item not added to cart.");
        }
    }
}