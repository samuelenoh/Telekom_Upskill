package org.Week3_lab.TestCases;

import org.Week3_lab.ObjectPages.BasePage;

import org.Week3_lab.ObjectPages.CalendarPage;
import org.Week3_lab.ObjectPages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CalenderTest extends BasePage {
    private HomePage home;
    private CalendarPage calender;
    @BeforeMethod
    public void setUpTest() {
        setUp(); // Call BasePage's setUp method to initialize the driver
       home = new HomePage(driver);
       calender = new CalendarPage(driver);
    }
    @Test
    public void verifyCalenderPage() throws InterruptedException {
        home.visitCalendarPage();
        calender.calenderPicker();
    }

}
