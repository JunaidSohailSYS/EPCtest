package com.epc.seleniumTests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class CreateProductTest extends LoginTest {

    @Test
    public void createProdTest(){
        driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a")).click();

    }

    @AfterTest
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        if (driver != null) {
          // driver.quit();
        }
    }

}
