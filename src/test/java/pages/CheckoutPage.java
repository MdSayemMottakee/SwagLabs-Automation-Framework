package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By checkoutBtn = By.id("checkout");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");
    By successMsg = By.className("complete-header");

    // Actions
    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }

    public void enterDetails(String fName, String lName, String zip) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(zipCode).sendKeys(zip);
    }

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }

    public void clickFinish() {
        driver.findElement(finishBtn).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMsg).getText();
    }
}