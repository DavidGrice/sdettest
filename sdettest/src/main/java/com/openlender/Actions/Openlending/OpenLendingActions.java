package com.openlender.Actions.Openlending;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.openlender.Objects.Openlending.OpenLendingObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * OpenLendingActions - class used for interacting with the website
 */
public class OpenLendingActions {

    /*
     * Create private web driver
     * set constructor to passed in driver made in shared actions
     * Then set driver to that
     */
    private WebDriver driver;
    public OpenLendingActions(WebDriver passedDriver) {
        driver = passedDriver;
    }

    // instnatiate private objects for open lending page
    private OpenLendingObjects openLendingObjects = new OpenLendingObjects();

    /*
     * clickHamburgerMenu - used for clicking hamburger menu
     */
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

    /*
     * clickResources - used for clicking resources
     */
    public void clickResources() {
        synchronized (driver) {
            try {
                driver.findElement(openLendingObjects.resources()).click();
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * clickCookieBoxClose - close cookie box
     */
    public void clickCookieBoxClose() {
        synchronized (driver) {
            try {
                driver.findElement(openLendingObjects.cookieBoxClose()).click();
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * clickLoadMore - click load more button on resource page
     */
    public void clickLoadMore() {
        synchronized (driver) {
            try {
                do {
                    driver.findElement(openLendingObjects.loadMore()).click();
                    driver.wait(2000);
                } while (driver.findElement(openLendingObjects.loadMore()).isDisplayed());

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /*
     * validateNoDuplicateBlogPostATags - used for validating no duplicate tags exist
     */
    public void validateNoDuplicateBlogPostATags() {
        Set<String> aTagSet = new HashSet<String>();
        synchronized (driver) {
            try {
                System.out.println("validateNoDuplicateBlogPostATags");
                driver.wait(2000);
                List<WebElement> blogATags = driver.findElements(openLendingObjects.blogPostATag());
                for (WebElement tags : blogATags) {
                    Assert.assertTrue(aTagSet.add(tags.getAttribute("href")));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /*
     * validateNoDuplicateBlogPostHeaders - used for validating no dupliacte headers exist, but in this case asserts size is same
     */
    public void validateNoDuplicateBlogPostHeaders() {
        ArrayList<String> blogHeaderText = new ArrayList<>();
        synchronized (driver) {
            try {
                System.out.println("validateNoDuplicateBlogPostHeaders");
                driver.wait(2000);
                List<WebElement> blogHeaders = driver.findElements(openLendingObjects.blogPostTextBoxHeader());
                for (WebElement headers : blogHeaders) {
                    blogHeaderText.add(headers.getText());
                }
                Assert.assertEquals(blogHeaders.size(), blogHeaderText.size());
                driver.wait(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /*
     * validateNoDuplicateBlogPostSubHeaders - used for validating unique subheading
     */
    public void validateNoDuplicateBlogPostSubHeaders() {
        Set<String> subHeaderTextSet = new HashSet<String>();
        synchronized (driver) {
            try {
                System.out.println("validateNoDuplicateBlogPostSubHeaders");
                driver.wait(2000);
                List<WebElement> blogSubHeaders = driver.findElements(openLendingObjects.blogPostTextBoxSubHeader());
                for (WebElement subHeaders : blogSubHeaders) {
                    Assert.assertTrue(subHeaderTextSet.add(subHeaders.getText()));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /*
     * validateNoDuplicateBlogPostHrefs - used for validating no subheading duplicates
     */
    public void validateNoDuplicateBlogPostHrefs() {
        Set<String> readMoreHrefs = new HashSet<String>();
        synchronized (driver) {
            try {
                System.out.println("validateNoDuplicateBlogPostHrefs");
                driver.wait(2000);
                List<WebElement> blogReadMoreHrefs = driver.findElements(openLendingObjects.blogPostTextBoxReadMoreHref());
                for (WebElement hrefs : blogReadMoreHrefs) {
                    Assert.assertTrue(readMoreHrefs.add(hrefs.getAttribute("href")));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
