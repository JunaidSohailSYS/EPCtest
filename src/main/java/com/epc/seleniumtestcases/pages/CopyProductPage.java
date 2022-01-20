package com.epc.seleniumtestcases.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author shakeel.alaf
 * @version 1.0 type CopyProductPage
 */
public class CopyProductPage {

    private WebDriver driver;

    @FindBy(css ="i.fa-search")
    WebElement searchProductTab;

    @FindBy(xpath="//button[text()='Search']")
    WebElement searchProducts;

    @FindBy(xpath = "//*[@id=\"example1\"]/tbody[7]/tr/td[11]/a[3]")
    WebElement copyProduct;

    @FindBy(id = "productId")
    WebElement productId;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveCopyProduct;

    @FindBy(xpath="//ul/li[7]/a[1][text()='Tariff']")
    WebElement clickTarrifTab;

    @FindBy(xpath="//div[7]/div[5]/div/div[4]/button")
    WebElement submitProductDetail;

    public CopyProductPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void setSearchProductTab() throws InterruptedException {
        searchProductTab.click();
        Thread.sleep(5000);
    }

    public void setSearchProducts() throws InterruptedException {
        searchProducts.click();
        searchProducts.click();
        Thread.sleep(5000);
    }

    public void setCopyProduct() {
        copyProduct.click();
    }

    public void setProductId(String productIdInput) {
        productId.clear();
        productId.sendKeys(productIdInput);
    }

    public void setSaveCopyProduct() {
        saveCopyProduct.click();
    }

    public void setClickTarrifTab() {
        clickTarrifTab.click();
    }

    public void setSubmitProductDetail() {
        submitProductDetail.click();
    }

    public void handleAndAcceptPopup(){
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        alert.accept();
    }

    public void handleAndAcceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}