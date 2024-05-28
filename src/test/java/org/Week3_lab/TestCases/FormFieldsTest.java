package org.Week3_lab.TestCases;

import org.Week3_lab.ObjectPages.BasePage;
import org.Week3_lab.ObjectPages.FormFieldsPage;
import org.Week3_lab.ObjectPages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormFieldsTest extends BasePage {
    private HomePage home;
    private FormFieldsPage fill;

    @BeforeMethod
    public void setUpTest() {
        setUp(); // Call BasePage's setUp method to initialize the driver
        home = new HomePage(driver); // Properly initialize HomePage object with driver
        fill = new FormFieldsPage(driver); // Properly initialize FormFieldsPage object with driver
    }

    @Test
    public void verifyFillForm() throws InterruptedException {
        home.visitFormsFieldsPage();
        fill.fillForms();
        fill.navigateToHome();
    }
}