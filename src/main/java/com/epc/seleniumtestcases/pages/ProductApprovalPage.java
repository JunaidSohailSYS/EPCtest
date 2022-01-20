package com.epc.seleniumtestcases.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author shakeel.alaf
 * @version 1.0 type ProductApprovalPage
 */
public class ProductApprovalPage {

    private WebDriver driver;

    @FindBy(css = "i.fa-check")
    WebElement approvalProductTab;

    @FindBy(id = "statusReq")
    WebElement statusReq;

    public ProductApprovalPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickApprovalProductTab() {
        approvalProductTab.click();
    }

    public void setStatusReq(String statusReqInput) {
        Select statusReqSelect = new Select(statusReq);
        statusReqSelect.selectByVisibleText(statusReqInput);
    }

    public void clickSearchProduct() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search-box\"]/div[4]/div/div/button"))).click();
    }

    public void clickSelectProduct() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search-result\"]/div/div[1]/table/tbody/tr[1]/td[2]/input"))).click();
    }

    public void clickApprovedProduct() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search-result\"]/div/div[4]/div/div[1]/button"))).click();
    }
}