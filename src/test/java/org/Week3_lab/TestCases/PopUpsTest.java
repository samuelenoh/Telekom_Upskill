package org.Week3_lab.TestCases;

import org.Week3_lab.ObjectPages.BasePage;
import org.Week3_lab.ObjectPages.HomePage;
import org.Week3_lab.ObjectPages.PopUpPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUpsTest extends BasePage {
    private HomePage home;
    private PopUpPage popUp;

    @BeforeMethod
    public void setUpTest() {
        setUp(); // Call BasePage's setUp method to initialize the driver
        home = new HomePage(driver); // Properly initialize HomePage object with driver
        popUp = new PopUpPage(driver);
    }
    @Test
    public void visitPopupsPage(){
        home.visitPopUpsPage();
    }
    @Test
    public void verifyAlertPopups(){
        popUp.clickOnAlertPopup();
    }
    @Test
    public void verifyConfirmPopups(){
        popUp.clickOnConfirmPopup();
    }@Test
    public void verifyPromptPopups(){
        popUp.clickOnPromptPopup();
    }
    @Test
    public void visitHome(){
        popUp.navigateToHome();
    }
}
