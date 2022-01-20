package com.epc.seleniumtestcases;

import com.epc.seleniumtestcases.pages.CopyProductPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author shakeel.alaf
 * @version 1.0 type ProductCopyTest
 */
public class ProductCopyTest extends LoginTest {

    CopyProductPage copyProductPage;

    @BeforeMethod
    public void initializeCopyProductPageObject() {
        copyProductPage = new CopyProductPage(driver);
    }

    @Test(description = "Copy Product Test with Failure scenario")
    public void shouldCopyProductWhenDataIsValid() throws InterruptedException {
        copyProductPage.setSearchProductTab();
        copyProductPage.setSearchProducts();
        Thread.sleep(5000);
        copyProductPage.setCopyProduct();
        Thread.sleep(200);
        copyProductPage.setProductId("POS-04909813");
        Thread.sleep(5000);
        copyProductPage.setSaveCopyProduct();
        Thread.sleep(5000);
        copyProductPage.setClickTarrifTab();
        Thread.sleep(5000);
        copyProductPage.setSubmitProductDetail();
        copyProductPage.handleAndAcceptPopup();
        copyProductPage.handleAndAcceptAlert();
    }
}