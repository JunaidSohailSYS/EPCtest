package com.epc.seleniumwebdriverconfiguration;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author shakeel.alaf
 * @version 1.0 type WebDriverConfig
 */
public class WebDriverConfig {
    public static WebDriver driver;

    @BeforeSuite
    public void initializeWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void quitDriver() throws InterruptedException {
        Thread.sleep(5000);
        //driver.quit();
    }

    @AfterMethod
    public void shouldTakeScreenShotWhenTestIsFail(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
            try {
                String screenShotName = result.getName() + new Date().getTime() + System.currentTimeMillis() + ".png";
                Files.move(screenshot, new File("src/main/resources/screenshots/" + screenShotName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}