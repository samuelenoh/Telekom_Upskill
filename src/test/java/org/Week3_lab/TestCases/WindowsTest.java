package org.Week3_lab.TestCases;

import org.Week3_lab.ObjectPages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsTest extends BasePage {
    WebDriver driver;
    public WindowsPage windowsPage;
    public  HomePage home;

    @BeforeMethod
    public void setUpTest() {
        setUp(); // Call BasePage's setUp method to initialize the driver
        driver = getDriver();
        windowsPage = PageFactory.initElements(driver, WindowsPage.class);
        home = PageFactory.initElements(driver, HomePage.class);
    }
    @Test(priority = 1)
    public  void verifyWindow() throws InterruptedException {
        home.visitWindowsPage();
        Thread.sleep(3000);
        windowsPage.newTabWindow();
    }
    @Test(priority = 2)
    public void verifyReplaceWindow(){
        windowsPage.replaceWindow();
    }
    @Test(priority = 3)
    public void verifyNewWindow(){
        windowsPage.newWindow();
    }
}
