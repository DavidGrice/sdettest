package com.openlender.Actions.Google;

import org.openqa.selenium.WebDriver;

import com.openlender.Objects.Google.GoogleObjects;

public class GoogleActions {

    private WebDriver driver;
    public GoogleActions(WebDriver passedDriver) {
        driver = passedDriver;
    }
    
    private GoogleObjects googleObjects = new GoogleObjects();

    public void clickSearchBox() {
        synchronized (driver) {
            try {
                driver.findElement(googleObjects.search()).click();
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void enterSearchText(String text) {
        synchronized (driver) {
            try {
                driver.findElement(googleObjects.search()).sendKeys(text);
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void submitSearchQuery() {
        synchronized (driver) {
            try {
                driver.findElement(googleObjects.search()).submit();
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void clickOpenLendingIcon() {
        synchronized (driver) {
            try {
                driver.findElement(googleObjects.openLending()).click();
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
