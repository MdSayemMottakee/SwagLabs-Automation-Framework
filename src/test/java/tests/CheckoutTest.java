package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutTest() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Add product
        ProductPage productPage = new ProductPage(driver);
        productPage.addBackpackToCart();

        // Open cart
        CartPage cartPage = new CartPage(driver);
        cartPage.openCart();

        // Checkout process
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        checkoutPage.clickCheckout();
        checkoutPage.enterDetails("John", "Doe", "12345");
        checkoutPage.clickContinue();
        checkoutPage.clickFinish();

        // Validate success
        String message = checkoutPage.getSuccessMessage();
        Assert.assertTrue(message.contains("Thank you"), "Order not completed!");
    }
}