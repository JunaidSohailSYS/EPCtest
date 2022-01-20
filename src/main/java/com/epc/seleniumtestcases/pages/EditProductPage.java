package com.epc.seleniumtestcases.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author shakeel.alaf
 * @version 1.0 type EditProductPage
 */
public class EditProductPage {

    private WebDriver driver;

    @FindBy(css = "i.fa-search")
    WebElement searchProductTab;

    @FindBy(xpath = "//button[text()='Search']")
    WebElement searchProducts;

    @FindBy(xpath = "//*[@id=\"example1\"]/tbody[15]/tr/td[11]/a[1]")
    WebElement editProduct;

    @FindBy(id = "providerProductId0")
    WebElement providerProductId0;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveEditProduct;

    public EditProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setSearchProductTab() {
        searchProductTab.click();
    }

    public void setSearchProducts() {
        searchProducts.click();
    }

    public void setEditProduct() {
        editProduct.click();
    }

    public void setProviderProductId0(String providerProductId0Input) {
        providerProductId0.clear();
        providerProductId0.sendKeys(providerProductId0Input);
    }

    public void clickSaveEditProduct() {
        saveEditProduct.click();
    }

    public String getSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String massage = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.callout-success"))).getText();
        return massage;
    }
}