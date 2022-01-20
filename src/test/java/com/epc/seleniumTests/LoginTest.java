package com.epc.seleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    public static WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginPageTest() {
        driver.get("http://10.100.95.20:8080/EPCWeb/#/Home");
        WebElement username = driver.findElement(By.id("UserName"));
        WebElement password = driver.findElement(By.id("Password"));
        WebElement login = driver.findElement(By.xpath("//button[text()='Sign In']"));

        username.sendKeys("admin");
        password.sendKeys("admin");
        login.click();
        String actualUrl = "http://10.100.95.20:8080/EPCWeb/#/Home";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

}
