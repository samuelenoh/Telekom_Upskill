package org.Week3_lab.ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.Week3_lab.Utilities.ReusableMethods.scrollIntoView;

public class Iframes extends BasePage{

    @FindBy(id = "frame1")
    WebElement iframes;
    public Iframes(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void iframesInteractions(){
        scrollIntoView(iframes,driver);
         driver.switchTo().frame(iframes);

    }
}
