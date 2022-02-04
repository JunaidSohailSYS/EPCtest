package com.epc.seleniumtestcases;

import com.epc.seleniumtestcases.pages.LoginPage;
import com.epc.seleniumwebdriverconfiguration.WebDriverConfig;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * @author shakeel.alaf
 * @version 1.0 type LoginTest
 */
public class LoginTest extends WebDriverConfig {

    LoginPage loginPage;

    @BeforeMethod
    public void initializeLoginPageObject() {
        loginPage = new LoginPage(driver);
    }

    @Test(description = "Login Test with valid Credentials")
    public void shouldLoginUserWhenCredentialsAreValid() {
        loginPage.loadPage();
        loginPage.setUserName("admin");
        loginPage.setPassword("admin");
        loginPage.clickLoginButton();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://10.100.12.20:8180/EPCWeb/#/Home";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

//    @Test(description = "Login Test with invalid Credentials", priority = 1)
//    public void shouldNotLoginUserWhenCredentialsAreInvalid() {
//        loginPage.loadPage();
//        loginPage.setUserName("admin");
//        loginPage.setPassword("khan");
//        loginPage.clickLoginButton();
//        String actualErrorMessage = loginPage.getErrorMessage();
//        String expectedErrorMessage = "User authentication failed";
//        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
//    }

//    @Test(dependsOnMethods = {"shouldLoginUserWhenCredentialsAreValid"})
//    public void LogOut() {
//        loginPage.clickSignOutButton();
//    }

}