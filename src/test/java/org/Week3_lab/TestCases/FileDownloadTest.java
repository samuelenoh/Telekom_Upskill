package org.Week3_lab.TestCases;

import org.Week3_lab.ObjectPages.BasePage;
import org.Week3_lab.ObjectPages.HomePage;
import org.Week3_lab.ObjectPages.TablePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class FileUploadTest extends BasePage {

    private HomePage home;
    private TablePage table;
    @BeforeMethod
    public void setUpTest() {
        setUp(); // Call BasePage's setUp method to initialize the driver
        driver = getDriver();

        home = PageFactory.initElements(driver, HomePage.class);
        table = PageFactory.initElements(driver, TablePage.class);
    }
}
