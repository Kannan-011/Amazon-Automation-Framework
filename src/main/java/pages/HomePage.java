package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "searchDropdownBox")
    WebElement dropdown;

    public void selectElectronics() {

        Select select = new Select(dropdown);
        select.selectByVisibleText("Electronics");
    }
}