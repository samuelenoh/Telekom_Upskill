package org.Week3_lab.ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.Week3_lab.Utilities.ReusableMethods.navigateBack;

public class ModalsPage{
    WebDriver driver;
    @FindBy(css = "#simpleModal")
    WebElement  simpleModalBtn;

    @FindBy(css = "#formModal")
    WebElement formModalBtn;
    @FindBy(css = ".pum-close")
    WebElement closeBtn;
    @FindBy(css = "#pum_popup_title_1318")
    WebElement popUpTitle;
    @FindBy(css = "#g1051-name")
    WebElement nameField;
    @FindBy(css = "#g1051-email")
    WebElement emailField;
    @FindBy(css = "#contact-form-comment-g1051-message")
    WebElement messageField;
    @FindBy()
    WebElement submitBtn;

    String title = "Simple Modal";
    public ModalsPage(WebDriver driver){
            PageFactory.initElements(driver, this);
        }
        public void simpleModal(){
        simpleModalBtn.click();
            Assert.assertEquals(popUpTitle.getText(),title);
            closeBtn.click();
        }
        public void formModal(){
        formModalBtn.click();
        nameField.sendKeys();
        emailField.sendKeys();
        messageField.sendKeys();
        submitBtn.click();
        navigateBack(driver);
        }


}
