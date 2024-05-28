package org.Week3_lab.ObjectPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;

    public void setUp() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://practice-automation.com");

        }
    }

    public WebDriver getDriver() {
        return driver;
    }
@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null; // Ensure driver is null after quit
        }
    }





}