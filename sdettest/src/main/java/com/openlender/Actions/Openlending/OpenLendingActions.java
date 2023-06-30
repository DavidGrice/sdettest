package com.openlender.Actions.Openlending;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.openlender.Objects.Openlending.OpenLendingObjects;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenLendingActions {

    private WebDriver driver;
    public OpenLendingActions(WebDriver passedDriver) {
        driver = passedDriver;
    }
    private OpenLendingObjects openLendingObjects = new OpenLendingObjects();

    public void clickHamburgerMenu() {
        synchronized (driver) {
            try {
                driver.findElement(openLendingObjects.hamburgerMenu()).click();
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void clickResources() {
        synchronized (driver) {
            try {
                driver.findElement(openLendingObjects.resources()).click();
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
