package com.epc.seleniumtestcases;

import com.epc.seleniumtestcases.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author shakeel.alaf
 * @version 1.0 type SignUpTest
 */
public class SignUpTest extends LoginTest {

    SignUpPage signUpPage;

    @BeforeMethod
    public void initializeSignUpPageObject() {
        signUpPage = new SignUpPage(driver);
    }

    @Test(description = "Sign Up Test with valid Credentials", priority = 1)
    public void shouldSignUpUserWhenCredentialsAreValidAndUnique() {
        signUpPage.clickUserAccessManagement();
        signUpPage.setFirstName("SeleniumFunctionality");
        signUpPage.setLastName("Test");
        signUpPage.setUserName("TestFunction");
        signUpPage.setStatus("Disabled");
        signUpPage.setEmail("selenium@gmail.com");
        signUpPage.setRole("Guest");
        signUpPage.setPassword("TestFunction");
        signUpPage.clickSignUpButton();
        String successMessage = signUpPage.getSuccessMessage();
        boolean expectedValue = successMessage.contains("Successfully Created");
        Assert.assertEquals(expectedValue, true);
    }

    @Test(description = "Sign Up Test with Invalid Credentials", priority = 2)
    public void shouldNotSignUpUserWhenCredentialsAreInvalidAndNotUnique() {
        signUpPage.clearAllFields();
        signUpPage.setFirstName("SeleniumFunctionality");
        signUpPage.setLastName("Test");
        signUpPage.setUserName("TestFunction");
        signUpPage.setStatus("Disabled");
        signUpPage.setEmail("selenium@gmail.com");
        signUpPage.setRole("Guest");
        signUpPage.setPassword("TestFunction");
        signUpPage.clickSignUpButton();
        String pageText = signUpPage.getInnerPageText();
        System.out.println(pageText);
        boolean expectedValue = (pageText.contains("User not Created") || pageText.contains("ERROR!"));
        Assert.assertEquals(expectedValue, true);
    }

}