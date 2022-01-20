package com.epc.seleniumtestcases.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author shakeel.alaf
 * @version 1.0 type LoginPage
 */
public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "UserName")
    WebElement userName;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(id = "signInId")
    WebElement loginButton;

    @FindBy(css = "p.text-danger")
    WebElement errorMessage;

    @FindBy(css = "i.fa-sign-out")
    WebElement signOut;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loadPage() {
        driver.get("http://10.100.95.20:8080/EPCWeb/#/Home");
    }

    public void setUserName(String name) {
        userName.sendKeys(name);
    }

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void clickSignOutButton() {
        signOut.click();
    }
}