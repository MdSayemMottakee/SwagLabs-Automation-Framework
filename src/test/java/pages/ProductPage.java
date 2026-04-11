package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By productTitle = By.className("title");
    By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    By cartBadge = By.className("shopping_cart_badge");

    // Actions
    public boolean isProductPageLoaded() {
        return driver.findElement(productTitle).isDisplayed();
    }

    public void addBackpackToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public String getCartCount() {
        return driver.findElement(cartBadge).getText();
    }
}