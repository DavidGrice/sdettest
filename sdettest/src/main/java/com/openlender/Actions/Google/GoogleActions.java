package com.openlender.Actions.Google;

import org.openqa.selenium.WebDriver;

import com.openlender.Objects.Google.GoogleObjects;

/*
 * GoogleActions- class sued for google web page
 */
public class GoogleActions {

    /*
     * Create private web driver
     * set constructor to passed in driver made in shared actions
     * Then set driver to that
     */
    private WebDriver driver;
    public GoogleActions(WebDriver passedDriver) {
        driver = passedDriver;
    }

    // instnatiate google objects
    private GoogleObjects googleObjects = new GoogleObjects();

    /*
     * clickSearchBox - click on search box
     */
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

    /*
     * enterSearchText - used for searching text
     */
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

    /*
     * submitSearchQuery - submit query
     */
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

    /*
     * clickOpenLendingIcon - used for clicking and getting open lending page
     */
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
