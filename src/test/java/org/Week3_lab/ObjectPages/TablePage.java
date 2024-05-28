package org.Week3_lab.ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.Week3_lab.Utilities.ReusableMethods.navigateBack;
import static org.Week3_lab.Utilities.ReusableMethods.scrollIntoView;

public class TablePage {
    WebDriver driver;
    @FindBy(tagName = "select")
    WebElement paginationDropDown;
    @FindBy(xpath = "//label[normalize-space()='Search:']")
    WebElement searchField;
     String countryName ="Brazil";

    String pageSource = driver.getPageSource();
    public TablePage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    public void setPagination(){
        scrollIntoView(paginationDropDown,driver);
        Select selectPagination = new Select(paginationDropDown);
        selectPagination.selectByValue("50");
    }

    public void searchCountry(){
        searchField.sendKeys(countryName);
            if (pageSource.contains(countryName)) {
                System.out.println("Text is present on the page.");
            } else {
                System.out.println("Text is not present on the page.");
            }
            navigateBack(driver);
        }



}

