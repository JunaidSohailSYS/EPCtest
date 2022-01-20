package com.epc.seleniumtestcases;

import com.epc.seleniumtestcases.pages.ProductAttributePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * @author shakeel.alaf
 * @version 1.0 type ProductAttributeTest
 */
public class ProductAttributeTest extends LoginTest{

    ProductAttributePage productAttributePage;
    private String attributename = "SELENIUMTEST";

    int leftLimit = 97; // letter 'a'
    int rightLimit = 105; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();

    String generatedString = random.ints(leftLimit, rightLimit + 1)
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

    @BeforeMethod
    public void initializeProductAttributePageObject(){
        productAttributePage=new ProductAttributePage(driver);
    }

    @Test(priority = 1,description = "Add Product Attribute Test with Failure scenario")
    public void shouldAddProductAttributeWithAlreadyExistingAttribute(){
        productAttributePage.clickProductAttributeTab();
        productAttributePage.clickAddAttributeBtn();
        productAttributePage.selectAttributeCategories("ProductCtg");
        productAttributePage.selectAttributeTypes("Characteristics");
        productAttributePage.setAttributeName(generatedString);
        productAttributePage.setAttributeDesc("This is Auto testing using selenium");
        productAttributePage.setSelectAttributeDataType("Enumerated");
        productAttributePage.clickOnAddAttributeBtn();
        String actualOccurredMessage= productAttributePage.verifyResultMessage();
        System.out.println(actualOccurredMessage);
        String expectedOccurredMessage="Attribute already existing in the database.";
        Assert.assertEquals(actualOccurredMessage,expectedOccurredMessage);
        System.out.println("Test Passed!");
    }

    @Test(priority = 2,description = "Add Product Attribute Test with Success scenario")
    public void shouldAddProductAttributeFunctionalityWithNewAttribute(){
        productAttributePage.clickProductAttributeTab();
        productAttributePage.clickAddAttributeBtn();
        productAttributePage.selectAttributeCategories("ProductCtg");
        productAttributePage.selectAttributeTypes("Characteristics");
        productAttributePage.setAttributeName("TESTINGSELENIUMS");
        productAttributePage.setAttributeDesc("This is Auto testing using selenium");
        productAttributePage.setSelectAttributeDataType("Enumerated");
        productAttributePage.clickOnAddAttributeBtn();
    }
}