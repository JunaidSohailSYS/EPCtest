package com.epc.seleniumtestcases;

import com.epc.seleniumtestcases.pages.EditProductPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epc.seleniumtestcases.ProductAddTest.Prod_ID;

/**
 * @author shakeel.alaf
 * @version 1.0 type ProductEditTest
 */
public class ProductEditTest extends LoginTest{

    EditProductPage editProductPage;

    @BeforeMethod
    public void initializeEditProductPageObject(){
        editProductPage=new EditProductPage(driver);
    }

    @Test(description = "Edit Product Test with Success Scenario")
    public void shouldEditProductWhenDataIsValid() throws InterruptedException {
        editProductPage.setSearchProductTab();
        Thread.sleep(5000);
        editProductPage.setSearchProducts();
        Thread.sleep(3000);
        editProductPage.setEditProduct();
        Thread.sleep(5000);
        editProductPage.setProviderProductId0(Prod_ID);
        Thread.sleep(3000);
        editProductPage.clickSaveEditProduct();

        String successMessage = editProductPage.getSuccessMessage();
        boolean expectedValue = successMessage.contains("Successfully Saved");
        Assert.assertEquals(expectedValue, true);
    }
}