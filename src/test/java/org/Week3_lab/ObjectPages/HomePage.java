package org.Week3_lab.ObjectPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.Week3_lab.Utilities.ReusableMethods.scrollIntoView;

public class HomePage {
    WebDriver driver;

    @FindBy(linkText = "Form Fields")
    WebElement formFieldsBtn;
    @FindBy(linkText = "Popups")
    WebElement popUpsBtn;
    @FindBy(linkText = "Sliders")
    WebElement slidersBtn;
    @FindBy(linkText = "Calendars")
    WebElement calendarBtn;
    @FindBy(linkText = "Tables")
    WebElement tableBtn;
    @FindBy(xpath = "//a[normalize-space()='Window Operations']")
    WebElement windowBtn;
    @FindBy(xpath = "//a[normalize-space()='Modals']")
    WebElement modalsBtn;
    @FindBy(xpath = "//a[normalize-space()='Iframes']")
    WebElement iframesBtn;
    @FindBy(xpath = "//a[normalize-space()='File Download']")
    WebElement fileDownload;
    @FindBy(xpath = "//a[normalize-space()='File Upload']")
    WebElement fileUpload;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void visitFormsFieldsPage() {
        formFieldsBtn.click();
    }
    public void visitPopUpsPage(){
        popUpsBtn.click();
    }
    public void visitCalendarPage() throws InterruptedException {
        scrollIntoView(calendarBtn,driver);
        Thread.sleep(3000);
        calendarBtn.click();
    }
    public void visitModalsPage() throws InterruptedException {
        scrollIntoView(modalsBtn,driver);
        Thread.sleep(3000);
        modalsBtn.click();
    }
    public void visitWindowsPage() throws InterruptedException {
        scrollIntoView(windowBtn,driver);
        Thread.sleep(3000);
        windowBtn.click();
    }
    public void visitTablePage() throws InterruptedException {
        scrollIntoView(tableBtn,driver);
        Thread.sleep(3000);
        tableBtn.click();
    }
    public void visitIframesPage(){
        scrollIntoView(iframesBtn,driver);
        iframesBtn.click();
    }
    public void visitSlidersPage(WebDriver driver) throws InterruptedException {
        scrollIntoView(slidersBtn,driver);
        Thread.sleep(3000);
        slidersBtn.click();
    }
    public void visitFileDownload(WebDriver driver) throws InterruptedException {
        scrollIntoView(fileDownload,driver);
        Thread.sleep(4000);
        fileDownload.click();
    }

}