package com.epc.seleniumtestcases.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author shakeel.alaf
 * @version 1.0 type AddProductPage
 */
public class AddProductPage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[2]/a")
    WebElement hoverOverMenu;

    @FindBy(xpath = "/html/body/div/aside/section/ul/li[2]/a")
    WebElement createProduct;

    @FindBy(id = "productId")
    WebElement productId;

    @FindBy(id = "productFamily")
    WebElement productFamily;

    @FindBy(id = "productSubFamily")
    WebElement productSubFamily;

    @FindBy(id = "productClassification")
    WebElement productClassification;

    @FindBy(id = "productCategory")
    WebElement productCategory;

    @FindBy(id = "productSubCategory")
    WebElement productSubCategory;

    @FindBy(id = "productAssociationLevel")
    WebElement productAssociationLevel;

    @FindBy(id = "providerSystemCode0")
    WebElement providerSystemCode0;

    @FindBy(id = "productType")
    WebElement productType;

    @FindBy(id = "productMarketingName")
    WebElement productMarketingName;

    @FindBy(id = "providerProductId0")
    WebElement providerProductId0;

    @FindBy(id = "hideSymbol")
    WebElement expandAvaiInfo;

    @FindBy(id = "lifeValidityDateTo")
    WebElement lifeValidityDateToDates;
    //
    @FindBy(xpath = "/html/body/div[3]/div[3]/table/thead/tr[1]/th[2]")
    WebElement lifeValidityyear;

    @FindBy(xpath = "/html/body/div[3]/div[4]/table/thead/tr/th[2]")
    WebElement lifeValidityyear2;
    //
    @FindBy(xpath = "/html/body/div[3]/div[5]/table/tbody/tr/td/span[7]")
    WebElement lifeValidityyearrange;

    @FindBy(xpath = "/html/body/div[3]/div[4]/table/tbody/tr/td/span[12]")
    WebElement lifeValiditymonth;

    @FindBy(xpath = "/html/body/div[3]/div[3]/table/tbody/tr[6]/td[3]")
    WebElement lifeValiditydate;

    @FindBy(xpath = "/html/body/div[3]/div[2]/table/tbody/tr/td/fieldset[2]/span[12]")
    WebElement lifeValiditytime;

    @FindBy(xpath = "/html/body/div[3]/div[1]/table/tbody/tr/td/fieldset/span[12]")
    WebElement lifeValidityformat;



    @FindBy(id = "sellingDateTo") //*[@id="sellingDateTo"]
    WebElement sellingDateTo;

    @FindBy(xpath = "/html/body/div[5]/div[3]/table/thead/tr[1]/th[2]")
    WebElement sellingDateyear;

    @FindBy(xpath = "/html/body/div[5]/div[4]/table/thead/tr/th[2]") // /html/body/div[5]/div[5]/table/tbody/tr/td/span[7]
    WebElement sellingDateyear2;
    //
    @FindBy(xpath = "/html/body/div[5]/div[5]/table/tbody/tr/td/span[7]")
    WebElement sellingDaterange;

    @FindBy(xpath = "/html/body/div[5]/div[4]/table/tbody/tr/td/span[12]")
    WebElement sellingDatemonth;

    @FindBy(xpath = "/html/body/div[5]/div[3]/table/tbody/tr[6]/td[3]")
    WebElement sellingDatedate;

    @FindBy(xpath = "/html/body/div[5]/div[2]/table/tbody/tr/td/fieldset[2]/span[12]")
    WebElement sellingDatetime; // /html/body/div[5]/div[2]/table/tbody/tr/td/fieldset[1]/span[12]

    @FindBy(xpath = "/html/body/div[5]/div[1]/table/tbody/tr/td/fieldset/span[12]")
    WebElement sellingDateformat;
    // /html/body/div[5]/div[1]/table/tbody/tr/td/fieldset/span[7]



    @FindBy(id = "subcriptionDateTo")
    WebElement subcriptionDateTo;

    @FindBy(xpath = "/html/body/div[7]/div[3]/table/thead/tr[1]/th[2]")
    WebElement subcriptionDateyear;

    @FindBy(xpath = "/html/body/div[7]/div[4]/table/thead/tr/th[2]")
    WebElement subcriptionDateyear2;
    //
    @FindBy(xpath = "/html/body/div[7]/div[5]/table/tbody/tr/td/span[7]")
    WebElement subcriptionDaterange;

    @FindBy(xpath = "/html/body/div[7]/div[4]/table/tbody/tr/td/span[12]")
    WebElement subcriptionDatemonth;

    @FindBy(xpath = "/html/body/div[7]/div[3]/table/tbody/tr[6]/td[2]")
    WebElement subcriptionDatedate;

    @FindBy(xpath = "/html/body/div[7]/div[2]/table/tbody/tr/td/fieldset[2]/span[6]")
    WebElement subcriptionDatetime;

    @FindBy(xpath = "/html/body/div[7]/div[1]/table/tbody/tr/td/fieldset/span[12]")
    WebElement subcriptionDateformat;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveSpec;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[1]/div/ul/li[3]/a[4]")
    WebElement clickCharactristicsTab;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[2]/div[3]/div[6]/div/div/div[1]/select")
    WebElement productCtg;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[2]/div[3]/div[6]/div/div/div[2]/select")
    WebElement productCtgType;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[2]/div[3]/div[7]/div/div[1]/button")
    WebElement searchChar;

    @FindBy(xpath = "//*[@id=\"example2\"]/tbody/tr[1]/td[8]/button")
    WebElement addChar;

    @FindBy(id = "value0")
    WebElement activValue;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[2]/div[3]/div[11]/div/div[1]/button")
    WebElement saveChar;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[1]/div/ul/li[4]/a[5]")
    WebElement compTab; // /html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[1]/div/ul/li[4]/a[5]

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[2]/div[4]/div[3]/div[1]/select")
    WebElement compProdType;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[2]/div[4]/div[4]/div/div[1]/button")
    WebElement searchCompatibility;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[2]/div[4]/div[5]/div/table/tbody/tr[3]/td[6]/select")
    WebElement ProdCompType;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[2]/div[4]/div[5]/div/table/tbody/tr[3]/td[7]/center/input")
    WebElement prodCompCheckBox;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[2]/div[4]/div[7]/div/div[1]/button")
    WebElement saveProdComp;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[1]/div/ul/li[7]/a[1]")
    WebElement clickTarrifTab;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/section/div/div/div/div[2]/div[2]/div[7]/div[5]/div/div[4]/button")
    WebElement submitProductDetail;

    public AddProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void hoverOverMenuForClickingTab() {
        Actions builder = new Actions(driver);
        builder.moveToElement(hoverOverMenu).build().perform();
    }

    public void clickCreateProductOption() {
        createProduct.click();
    }

    public void setProductId(String productIdInput) {
        productId.sendKeys(productIdInput);
    }

    public void setProductFamily(String productFamilyInput) {
        Select productFamilySelect = new Select(productFamily);
        productFamilySelect.selectByVisibleText(productFamilyInput);
    }

    public void setProductSubFamily(String productSubFamilyInp) {
        Select productSubFamilySelect = new Select(productSubFamily);
        productSubFamilySelect.selectByVisibleText(productSubFamilyInp);

    }

    public void setProductClassification(String productClassificationInput) {
        Select productClassificationSelect = new Select(productClassification);
        productClassificationSelect.selectByVisibleText(productClassificationInput);
    }

    public void setProductCategory(String productCategoryInput) {
        Select productCategorySelect = new Select(productCategory);
        productCategorySelect.selectByVisibleText(productCategoryInput);
    }

    public void setProductSubCategory(String productSubCategoryInput) {
        Select productSubCategorySelect = new Select(productSubCategory);
        productSubCategorySelect.selectByVisibleText(productSubCategoryInput);
    }

    public void setProductAssociationLevel(String productAssociationLevelInput) {
        Select productAssociationLevelSelect = new Select(productAssociationLevel);
        productAssociationLevelSelect.selectByVisibleText(productAssociationLevelInput);
    }

    public void setProviderSystemCode0(String providerSystemCode0Input) {
        Select providerSystemCode0Select = new Select(providerSystemCode0);
        providerSystemCode0Select.selectByVisibleText(providerSystemCode0Input);
    }

    public void setProductType(String productTypeInput) {
        Select productTypeSelect = new Select(productType);
        productTypeSelect.selectByVisibleText(productTypeInput);
    }

    public void setProductMarketingName(String productMarketingNameInput) {
        productMarketingName.sendKeys(productMarketingNameInput);
    }

    public void setProviderProductId0(String providerProductId0Input) {
        providerProductId0.sendKeys(providerProductId0Input);
    }

    public void clickExpandAvailabilityInfo() {
        expandAvaiInfo.click();
    }



    public void clickLifeValidityDateToDates() throws InterruptedException {

        lifeValidityDateToDates.click();
        Thread.sleep(2000);
        lifeValidityyear.click();
        Thread.sleep(2000);
        lifeValidityyear2.click();
        Thread.sleep(2000);
        lifeValidityyearrange.click();
        Thread.sleep(2000);
        lifeValiditymonth.click();
        Thread.sleep(2000);
        lifeValiditydate.click();
        Thread.sleep(2000);
        lifeValiditytime.click();
        Thread.sleep(2000);
        lifeValidityformat.click();
        Thread.sleep(3000);


    }


    public void clickSellingDateTo() throws InterruptedException {
        //JavascriptExecutor executor = (JavascriptExecutor) driver;
        //executor.executeScript("arguments[0].value='"+fieldValue+"'",sellingDateTo);

        sellingDateTo.click();
        Thread.sleep(2000);
        sellingDateyear.click();
        Thread.sleep(2000);
        sellingDateyear2.click();
        Thread.sleep(2000);
        sellingDaterange.click();
        Thread.sleep(2000);
        sellingDatemonth.click();
        Thread.sleep(2000);
        sellingDatedate.click();
        Thread.sleep(2000);
        sellingDatetime.click();
        Thread.sleep(2000);
        sellingDateformat.click();
        Thread.sleep(2000);

//
    }

    public void clickSubscriptionDateTo() throws InterruptedException {

        //JavascriptExecutor executor = (JavascriptExecutor) driver;
        //executor.executeScript("arguments[0].value='"+fieldValue+"'",subcriptionDateTo);


        subcriptionDateTo.click();
        Thread.sleep(5000);
        subcriptionDateyear.click();
        Thread.sleep(5000);
        subcriptionDateyear2.click();
        Thread.sleep(5000);
        subcriptionDaterange.click();
        Thread.sleep(3000);
        subcriptionDatemonth.click();
        Thread.sleep(3000);
        subcriptionDatedate.click();
        Thread.sleep(3000);
        subcriptionDatetime.click();
        Thread.sleep(3000);
        subcriptionDateformat.click();
        Thread.sleep(2000);
//
    }
//
//
    public void clickSaveSpec() {
        saveSpec.click();
    }

    public void clickCharactristicsTabLink() {
        clickCharactristicsTab.click();
    }

    public void setProductCtg(String productCtgInput) {
        Select productCategorySelect = new Select(productCtg);
        productCategorySelect.selectByVisibleText(productCtgInput);
    }

    public void setProductCtgType(String productCtgTypeInput) throws InterruptedException {
        Select productCtgTypeSelect = new Select(productCtgType);
        productCtgTypeSelect.selectByVisibleText(productCtgTypeInput);
        Thread.sleep(3000);
    }

    public void setSearchChar() {
        searchChar.click();
    }

    public void setAddChar() throws InterruptedException {
        addChar.click();
        Thread.sleep(3000);
    }

    public void setActivValue(String activValueInput) {
        activValue.sendKeys(activValueInput);
    }

    public void setSaveChar() {
        saveChar.click();
    }

    public void setCompTab() {
        compTab.click();
        compTab.click();
    }

    public void setCompProdType(String compProdTypeInput) {
        Select compProdTypeSelect = new Select(compProdType);
        compProdTypeSelect.selectByVisibleText(compProdTypeInput);
    }

    public void setSearchCompatibility() {
        searchCompatibility.click();
    }

    public void setProdCompType(String ProdCompTypeInput) throws InterruptedException {
        Select ProdCompTypeSelect = new Select(ProdCompType);
        ProdCompTypeSelect.selectByVisibleText(ProdCompTypeInput);
        Thread.sleep(5000);

    }

    public void setProdCompCheckBox() {
        prodCompCheckBox.click();
    }

    public void setSaveProdComp() {
        saveProdComp.click();
    }

    public void setClickTarrifTab() {
        clickTarrifTab.click();
    }

    public void setSubmitProductDetail() {
        submitProductDetail.click();
    }

    public void handleAndAcceptPopup() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        alert.accept();
    }
}