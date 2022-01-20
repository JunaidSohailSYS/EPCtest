package com.epc.seleniumtestcases.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author shakeel.alaf
 * @version 1.0 type SearchProductPage
 */
public class SearchProductPage {

    private WebDriver driver;

    @FindBy(css = "i.fa-search")
    WebElement searchProductTab;

    @FindBy(name = "Provider System")
    WebElement prodProviderSystem;

    @FindBy(name = "category")
    WebElement prodCategory;

    @FindBy(name = "productType")
    WebElement productType;

    @FindBy(xpath = "//button[text()='Search']")
    WebElement searchProducts;

    @FindBy(xpath = "//button[text()='Reset']")
    WebElement resetBtn;

    @FindBy(xpath = "//*[@id=\"example1\"]/tbody[1]/tr/td[7]")
    WebElement verifySearchResult;

    public SearchProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSearchProductTab() {
        searchProductTab.click();
    }

    public void setProdProviderSystem(String prodProviderSystemInput) {
        Select prodProviderSystemSelect = new Select(prodProviderSystem);
        prodProviderSystemSelect.selectByVisibleText(prodProviderSystemInput);
    }

    public void setProdCategory(String prodCategoryInput) {
        Select prodCategorySelect = new Select(prodCategory);
        prodCategorySelect.selectByVisibleText(prodCategoryInput);
    }

    public void setProductType(String productTypeInput) {
        Select productTypeSelect = new Select(productType);
        productTypeSelect.selectByVisibleText(productTypeInput);
    }

    public WebElement getProductType() {
        Select productTypeSelect = new Select(productType);
        WebElement element = productTypeSelect.getFirstSelectedOption();
        return element;
    }

    public void setSearchProducts() {
        searchProducts.click();
    }

    public void setResetBtn() {
        resetBtn.click();
    }

    public String getVerifySearchResult() {
        return verifySearchResult.getText();
    }
}