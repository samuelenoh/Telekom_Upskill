package org.Week3_lab.ObjectPages;

import org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopUpPage extends BasePage{
    WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;

    @FindBy(css = "#alert")
    WebElement alertPopup;
    @FindBy(css = "button[id='confirm'] b")
    WebElement confirmPopup;
    @FindBy(css = "#prompt")
    WebElement promptPopup;

    public PopUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clickOnAlertPopup(){
        alertPopup.click();
        driver.switchTo().alert().accept();
    }
    public void clickOnConfirmPopup(){
        confirmPopup.click();
        driver.switchTo().alert().dismiss();
    }
    public void clickOnPromptPopup(){
        promptPopup.click();
         Alert promptAlert =driver.switchTo().alert();
         promptAlert.sendKeys("Johnson");
         promptAlert.accept();
    }
    public void navigateToHome() {
        driver.navigate().back();
    }


}
