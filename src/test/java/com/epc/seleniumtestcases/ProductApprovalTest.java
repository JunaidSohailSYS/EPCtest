package com.epc.seleniumtestcases;

import com.epc.seleniumtestcases.pages.ProductApprovalPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author shakeel.alaf
 * @version 1.0 type ProductApprovalTest
 */
public class ProductApprovalTest extends LoginTest{

    ProductApprovalPage productApprovalPage;

    @BeforeMethod
    public void initializeProductApprovalPageObject(){
        productApprovalPage=new ProductApprovalPage(driver);
    }

    @Test(description = "Approval Product Test with success scenario")
    public void shouldApprovalProductWhenProductExistInSubmittedState() {
        productApprovalPage.clickApprovalProductTab();
        productApprovalPage.setStatusReq("Submitted");
        productApprovalPage.clickSearchProduct();
        productApprovalPage.clickSelectProduct();
        productApprovalPage.clickApprovedProduct();
    }
}