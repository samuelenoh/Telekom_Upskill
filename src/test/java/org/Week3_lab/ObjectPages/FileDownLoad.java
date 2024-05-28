package org.Week3_lab.ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownload {
    WebDriver driver;

   @FindBy(xpath = ".wpdm-download-link.download-on-click")
    WebElement downloadBtn;

    public FileDownload(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void testFileDownload() throws InterruptedException {
        downloadBtn.click();
    }
}
