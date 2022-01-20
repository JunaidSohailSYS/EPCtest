package com.epc.seleniumtestcases;

import com.epc.seleniumtestcases.pages.AddProductPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author shakeel.alaf
 * @version 1.0 type ProductAddTest
 */
public class ProductAddTest extends LoginTest {

    AddProductPage addProductPage;
    private static int min_val = 1;
    private static int max_val = 10;
   private static double randomNum = Math.random() * ( max_val - min_val );

    //private static double randomNum;
    public static String Prod_ID = Double.toString(randomNum);


    @BeforeMethod
    public void initializeAddProductPageObject(){
        addProductPage=new AddProductPage(driver);
    }

    @Test(description = "Add Product Test with success scenario")
    public void shouldAddProductWhenProductInfoIsCorrectAndUnique() throws InterruptedException {
        addProductPage.hoverOverMenuForClickingTab();
        addProductPage.clickCreateProductOption();
        addProductPage.setProductFamily("NA");
        addProductPage.setProductSubFamily("Voice");
        addProductPage.setProductClassification("Emergency");
        addProductPage.setProductCategory("Postpaid");
        addProductPage.setProductSubCategory("Regular");

        addProductPage.setProductId("POS-"+Prod_ID);
        addProductPage.setProductMarketingName("Selenium testing");
        addProductPage.setProductAssociationLevel("Customer");
        addProductPage.setProductType("Primary");
        addProductPage.setProviderSystemCode0("CBS");
        addProductPage.setProviderProductId0("5012500");

//        // expand the product Availability
        addProductPage.clickExpandAvailabilityInfo();
        addProductPage.clickLifeValidityDateToDates();
       addProductPage.clickSellingDateTo();
       addProductPage.clickSubscriptionDateTo();
       Thread.sleep(10000);
        addProductPage.clickSaveSpec();
        Thread.sleep(5000);
        //Thread.sleep(6000);

        // Product Characteristics
        addProductPage.clickCharactristicsTabLink();
        addProductPage.setProductCtg("ProductCtg");
        addProductPage.setProductCtgType("Characteristics");
        addProductPage.setSearchChar();
        addProductPage.setAddChar();
        addProductPage.setActivValue("True");
        Thread.sleep(3000);
        addProductPage.setSaveChar();
        Thread.sleep(10000);

        // Product Compatibility
        addProductPage.setCompTab();
        addProductPage.setCompProdType("Optional");
        addProductPage.setSearchCompatibility();
        addProductPage.setProdCompType("Inclusive");
        addProductPage.setProdCompCheckBox();
        Thread.sleep(5000);
        addProductPage.setSaveProdComp();
        Thread.sleep(6000);

        // Product Tarrif
        addProductPage.setClickTarrifTab();
        addProductPage.setSubmitProductDetail();
        addProductPage.handleAndAcceptPopup();
    }
}