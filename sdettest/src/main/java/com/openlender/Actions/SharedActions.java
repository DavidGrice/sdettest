package com.openlender.Actions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SharedActions {

    private WebDriver driver;
    public SharedActions(WebDriver passedDriver) {
        driver = passedDriver;
    }

    public WebDriver instantiateWebDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        return driver;
    }

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
    
}
