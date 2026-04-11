package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By cartIcon = By.className("shopping_cart_link");
    By cartItem = By.className("cart_item");
    By removeBtn = By.id("remove-sauce-labs-backpack");

    // Actions
    public void openCart() {
        driver.findElement(cartIcon).click();
    }

    public boolean isItemPresent() {
        return driver.findElements(cartItem).size() > 0;
    }

    public void removeItem() {
        driver.findElement(removeBtn).click();
    }
}