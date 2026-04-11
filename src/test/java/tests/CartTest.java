package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

public class CartTest extends BaseTest {

    @Test
    public void removeProductFromCartTest() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Add product
        ProductPage productPage = new ProductPage(driver);
        productPage.addBackpackToCart();

        // Open cart
        CartPage cartPage = new CartPage(driver);
        cartPage.openCart();

        // Validate item present
        Assert.assertTrue(cartPage.isItemPresent(), "Item not found in cart!");

        // Remove item
        cartPage.removeItem();

        // Validate cart empty
        Assert.assertFalse(cartPage.isItemPresent(), "Item was not removed!");
    }
}