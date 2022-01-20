package com.epc.seleniumtestcases;

import com.epc.seleniumtestcases.pages.SearchProductPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author shakeel.alaf
 * @version 1.0 type ProductSearchTest
 */
public class ProductSearchTest extends LoginTest{

    SearchProductPage searchProductPage;

    @BeforeMethod
    public void initializeSearchProductPageObject(){
        searchProductPage=new SearchProductPage(driver);
    }

    @Test(description = "Search Product Test with Success Scenario", priority = 2)
    public void shouldSearchWhenDataIsCorrectAndFound(){
        searchProductPage.setProdProviderSystem("CBS");
        searchProductPage.setProdCategory("Postpaid");
        searchProductPage.setProductType("Primary");
        searchProductPage.setSearchProducts();
        String actualSearchedProductType= searchProductPage.getVerifySearchResult();
        System.out.println(actualSearchedProductType);
        String expectedTableProductType="Primary";
        Assert.assertEquals(actualSearchedProductType,expectedTableProductType);
        System.out.println("Test Passed!");
    }

    @Test(description = "Reset Field Test", priority = 1)
    public void shouldResetFieldsWhenButtonIsClick(){
        searchProductPage.clickSearchProductTab();
        searchProductPage.setProdProviderSystem("CBS");
        searchProductPage.setProdCategory("Postpaid");
        searchProductPage.setProductType("Primary");
        searchProductPage.setResetBtn();
        WebElement element=searchProductPage.getProductType();
        String value=element.getText();
        boolean expectedValue=value.equalsIgnoreCase("Primary");
        Assert.assertEquals(expectedValue,false);
    }
}