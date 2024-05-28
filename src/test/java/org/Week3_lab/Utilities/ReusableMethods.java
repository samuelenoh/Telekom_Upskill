package org.Week3_lab.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableMethods  {

    public static WebDriverWait wait;
    public static JavascriptExecutor js;
    public static void scrollIntoView(WebElement element, WebDriver driver) {

        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public static void navigateBack(WebDriver driver) {
        driver.navigate().back();
    }
    public static void waitForElement(WebElement element, WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
