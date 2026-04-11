package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void addProductToCartTest() {

        // Login first
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Product page actions
        ProductPage productPage = new ProductPage(driver);

        // Validate page loaded
        Assert.assertTrue(productPage.isProductPageLoaded(), "Product page not loaded!");

        // Add product
        productPage.addBackpackToCart();

        // Validate cart count
        Assert.assertEquals(productPage.getCartCount(), "1", "Cart count incorrect!");
    }
}