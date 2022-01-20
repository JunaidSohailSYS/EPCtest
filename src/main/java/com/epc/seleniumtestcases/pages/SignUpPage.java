package com.epc.seleniumtestcases.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author shakeel.alaf
 * @version 1.0 type SignUpPage
 */
public class SignUpPage {
    private WebDriver driver;

    @FindBy(css = "i.fa-user")
    WebElement userAccessManagement;

    @FindBy(name = "fname")
    WebElement firstName;

    @FindBy(name = "lname")
    WebElement lastName;

    @FindBy(name = "username")
    WebElement userName;

    @FindBy(name = "enabled")
    WebElement status;

    @FindBy(name = "role")
    WebElement role;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[text()='Add User']")
    WebElement signUp;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickUserAccessManagement() {
        userAccessManagement.click();
    }

    public void setUserName(String name) {
        userName.sendKeys(name);
    }

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    public void setFirstName(String fName) {
        firstName.sendKeys(fName);
    }

    public void setLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void setStatus(String statusSelect) {
        Select selectStatus = new Select(status);
        selectStatus.selectByVisibleText(statusSelect);
    }

    public void setRole(String roles) {
        Select selectRole = new Select(role);
        selectRole.selectByVisibleText(roles);
    }

    public void setEmail(String emails) {
        email.sendKeys(emails);
    }

    public void clickSignUpButton() {
        signUp.click();
    }

    public String getInnerPageText() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String innerText = js.executeScript(" return document.documentElement.innerText;").toString();
        return innerText;
    }

    public String getSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String massage = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.callout-success"))).getText();
        return massage;
    }

    public void clearAllFields() {
        firstName.clear();
        lastName.clear();
        userName.clear();
        email.clear();
        password.clear();
    }
}