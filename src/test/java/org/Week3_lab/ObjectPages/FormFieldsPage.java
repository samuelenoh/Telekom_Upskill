package org.Week3_lab.ObjectPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormFieldsPage extends BasePage {
    @FindBy(name = "name")
    WebElement username;
    JavascriptExecutor js;
    WebDriverWait wait;
    @FindBy(xpath = "//input[@id='drink3']")
    WebElement favouriteDrink;

   @FindBy(css = "#color3") WebElement colorYellow;

    @FindBy(name = "siblings")
    WebElement siblings;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(id = "message")
    WebElement messageField;

    @FindBy(id = "submit-btn")
    WebElement submitBtn;

    public FormFieldsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void fillForms() throws InterruptedException {
        username.sendKeys("Johnson Godson");
        favouriteDrink.click();
        js.executeScript("arguments[0].scrollIntoView(true); " ,colorYellow);

        Thread.sleep(4000);
        colorYellow.click();
        Select siblingsSelect = new Select(siblings);
        siblingsSelect.selectByVisibleText("Yes");

        email.sendKeys("Jojo@gmail.com");
        messageField.sendKeys("Hi, everyone");
        js.executeScript("arguments[0].scrollIntoView(true); " ,submitBtn);
        Thread.sleep(4000);
        submitBtn.click();
        driver.switchTo().alert().accept();
    }

    public void navigateToHome() {
        driver.navigate().back();
    }

}