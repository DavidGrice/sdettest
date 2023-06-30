package com.openlender.Actions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * SharedActions - used for astions whcih can be used across more than one page
 */
public class SharedActions {

    /*
     * Create private web driver
     * set constructor to passed in driver made in shared actions
     * Then set driver to that
     */
    private WebDriver driver;
    public SharedActions(WebDriver passedDriver) {
        driver = passedDriver;
    }

    /*
     * instantiateWebDriver - create webdriver
     */
    public WebDriver instantiateWebDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        return driver;
    }

    /*
     * navigateToWebsite - used fro any website
     */
    public void navigateToWebsite(String webString) {
        synchronized (driver) {
            try {
                driver.get(webString);
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * validateWebpage - make sure website is one which we want to be on.
     */
    public void validateWebpage(String expectedTitle) {
        synchronized (driver) {
            try {
                String actualTitle = driver.getTitle();
                Assert.assertEquals(expectedTitle, actualTitle);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * closeDriver - close driver once testing is done.
     */
    public void closeDriver() {
        driver.close();
    }
    
}
