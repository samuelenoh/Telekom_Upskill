package org.Week3_lab.ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class WindowsPage {
    WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'New Tab')]")
    WebElement newTabBtn;

    @FindBy(css = "button[onclick='newWindowSelf()'] b")
    WebElement replaceWindowBtn;

    @FindBy(linkText = "New Window")
    WebElement newWindowBtn;
    public WindowsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void newTabWindow(){
        newTabBtn.click();
        String parentWindow = driver.getWindowHandle();
        driver.switchTo().window(parentWindow);
    }
    public void replaceWindow(){
        replaceWindowBtn.click();
        driver.switchTo().alert().accept();
    }
    public void newWindow(){
        newWindowBtn.click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> I1= allWindowHandles.iterator();
        String newHandle = I1.next();
        if (I1.hasNext()){
            driver.switchTo().window(newHandle);
        }

    }

}
