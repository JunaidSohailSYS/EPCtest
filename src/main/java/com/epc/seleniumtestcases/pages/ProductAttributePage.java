package com.epc.seleniumtestcases.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author shakeel.alaf
 * @version 1.0 type ProductAttributePage
 */
public class ProductAttributePage {

    private WebDriver driver;


    @FindBy(css = "i.fa-link")
    WebElement productAttributeTab;

    @FindBy(xpath = "//button[@ng-click='characteristicAddNew=1;characteristicSearchResult=0;']")
    WebElement addAttributeBtn;

    @FindBy(xpath = "//select[@ng-model='addnewchar.category']")
    WebElement selectAttributeCategory;

    @FindBy(xpath = "//select[@ng-model='addnewchar.type']")
    WebElement selectAttributeType;

    @FindBy(xpath = "//input[@ng-model='addnewchar.name']")
    WebElement attributeName;

    @FindBy(xpath = "//input[@ng-model='addnewchar.description']")
    WebElement attributeDesc;

    @FindBy(xpath = "//select[@ng-model='addnewchar.dataType']")
    WebElement selectAttributeDataType;

    @FindBy(xpath = "//div[2]/div[4]/div/button")
    WebElement clickAddAttributeBtn;

    public ProductAttributePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickProductAttributeTab() {
        productAttributeTab.click();
    }

    public void clickAddAttributeBtn() {
        addAttributeBtn.click();
    }

    public void selectAttributeCategories(String selectAttributeCategoryInput) {
        Select selectAttributeCategorySelect = new Select(selectAttributeCategory);
        selectAttributeCategorySelect.selectByVisibleText(selectAttributeCategoryInput);
    }

    public void selectAttributeTypes(String selectAttributeTypeInput) {
        Select selectAttributeTypeSelect = new Select(selectAttributeType);
        selectAttributeTypeSelect.selectByVisibleText(selectAttributeTypeInput);
    }

    public void setAttributeName(String attributeNameInput) {
        attributeName.sendKeys(attributeNameInput);
    }

    public void setAttributeDesc(String attributeDescInput) {
        attributeDesc.sendKeys(attributeDescInput);
    }

    public void setSelectAttributeDataType(String selectAttributeDataTypeInput) {
        Select selectAttributeDataTypeSelect = new Select(selectAttributeDataType);
        selectAttributeDataTypeSelect.selectByVisibleText(selectAttributeDataTypeInput);
    }

    public void clickOnAddAttributeBtn() {
        clickAddAttributeBtn.click();
    }

    public String verifyResultMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/section/div/div[1]/div[2]/h4"))).getText();
    }
}