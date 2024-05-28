package org.Week3_lab.TestCases;

import org.Week3_lab.ObjectPages.BasePage;
import org.Week3_lab.ObjectPages.FileDownload;
import org.Week3_lab.ObjectPages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

class FileDownloadTest extends BasePage {

    private HomePage home;
    private FileDownload file;
    private String downloadPath = System.getProperty("user.dir") + "/downloads";
    @BeforeMethod
    public void setUpTest() {
        setUp(); // Call BasePage's setUp method to initialize the driver
        driver = getDriver();
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("safebrowsing.enabled", true);
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        home = PageFactory.initElements(driver, HomePage.class);
        file = PageFactory.initElements(driver, FileDownload.class);
    }
    @Test
    public void verifyFileUpload() throws InterruptedException {
        home.visitFileDownload(driver);
        file.testFileDownload();
        // Verify the file is downloaded
        File downloadedFile = new File(downloadPath + "/example-file.txt"); // Replace with actual file name
        Assert.assertTrue(downloadedFile.exists(), "File not downloaded successfully");
    }


}
