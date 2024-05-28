package org.Week3_lab.ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class Sliders extends BasePage{

    private final Actions actions;
    @FindBy(css = "#slideMe")
    WebElement sliderBtn;
    public Sliders(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }
    public void slideTo(){
        actions.dragAndDropBy(sliderBtn, 50, 0).perform();
    }
}
