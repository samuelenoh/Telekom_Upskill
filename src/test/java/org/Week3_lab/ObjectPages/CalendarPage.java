package org.Week3_lab.ObjectPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.Week3_lab.Utilities.ReusableMethods.navigateBack;

public class CalendarPage extends  BasePage{
    @FindBy(css = "#g1065-selectorenteradate")
    WebElement datePicker;
    @FindBy(className = "pushbutton-wide")
    WebElement submitBtn;

    public CalendarPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void calenderPicker(){
        datePicker.sendKeys("2024-04-23");
        submitBtn.click();
        String expetedPageTitle = "Calendars | Practice Automation";
        Assert.assertEquals(driver.getTitle(),expetedPageTitle);
        navigateBack(driver);
    }


}
