package com.epc.seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SignUpTest extends LoginTest{

    @Test
    public void signUpPageTest() {
        driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[11]/a")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("fname")));
        WebElement lastName = driver.findElement(By.name("lname"));
        WebElement userNameSignUp = driver.findElement(By.name("username"));
        Select status = new Select(driver.findElement(By.name("enabled")));
        Select role = new Select(driver.findElement(By.name("role")));
        WebElement email = driver.findElement(By.name("email"));
        WebElement passwordSignUp = driver.findElement(By.name("password"));
        WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Add User']"));

        firstName.sendKeys("Testselenium");
        lastName.sendKeys("Testselenium");
        userNameSignUp.sendKeys("Testselenium");
        status.selectByVisibleText("Disabled");
        email.sendKeys("selenium@gmail.com");
        role.selectByVisibleText("Guest");
        passwordSignUp.sendKeys("Testselenium");
        signUpButton.click();

    }

    @AfterTest
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        if (driver != null) {
            driver.quit();
        }
    }

}
