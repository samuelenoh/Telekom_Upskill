package org.Week3_lab.TestCases;

import org.Week3_lab.ObjectPages.BasePage;
import org.Week3_lab.ObjectPages.HomePage;
import org.Week3_lab.ObjectPages.Sliders;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTest extends BasePage {

    private HomePage home;
    private Sliders slide;

    @BeforeMethod
    public void setUpTest() {
        setUp(); // Call BasePage's setUp method to initialize the driver
        driver = getDriver();

        home = PageFactory.initElements(driver, HomePage.class);
        slide = PageFactory.initElements(driver, Sliders.class);
    }
    @Test
    public void verifySlider() throws InterruptedException {
        home.visitSlidersPage(driver);
        slide.slideTo();
    }
}
