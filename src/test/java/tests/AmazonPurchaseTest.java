package tests;

import org.testng.annotations.Test;

import pages.*;

public class AmazonPurchaseTest extends BaseTest {

    @Test
    public void buyIphoneTest() {

        HomePage home = new HomePage(driver);
        home.selectElectronics();

        PurchaseIphonePage purchase = new PurchaseIphonePage(driver);

        purchase.searchIphone("iPhone 17 Pro");
        purchase.clickSearch();
        purchase.scrollDown();
        purchase.clickFirstIphone();
        purchase.printPrice();

        BuyingIphone17Pro buy = new BuyingIphone17Pro(driver);

        buy.switchWindowAndAddToCart();
        buy.verifyCart();
    }
}