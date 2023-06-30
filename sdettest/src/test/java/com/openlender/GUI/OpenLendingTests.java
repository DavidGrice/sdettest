package com.openlender.GUI;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.openlender.Actions.SharedActions;
import com.openlender.Actions.Google.GoogleActions;
import com.openlender.Actions.Openlending.OpenLendingActions;

/**
 * OpenLendingTests - used for the openlending test.
 * Could have made more specifi, but was wasting too much time.
 */
class OpenLendingTests {

    // create private webdriver to be shared within test class
    private WebDriver driver;

    // sdetTest - could be renamed, but you only gave one test so not going to waste time.
    @Test
    void sdetTest() {

        // string for navigate to google website
        String webString = "https://www.google.com";

        // instantiate web driver
        SharedActions sharedActions = new SharedActions(driver);

        // set webdriver to current driver
        driver = sharedActions.instantiateWebDriver();

        // open website
        sharedActions.navigateToWebsite(webString);
        
        // validate string of webpage
        String webpageTitleGoogle = "Google";

        // strign used for searching openlending page
        String searchText = "Open Lending";

        // instantiate actions for google actions page passing driver
        GoogleActions googleActions = new GoogleActions(driver);

        // validate you are on google home page
        sharedActions.validateWebpage(webpageTitleGoogle);

        // click on google search box
        googleActions.clickSearchBox();

        // enter text into searchbox
        googleActions.enterSearchText(searchText);

        // submit query for searching open lending
        googleActions.submitSearchQuery();

        // click on open lending icon on page
        googleActions.clickOpenLendingIcon();

        // validate string for open lending page
        String webpageTitleOpenLending = "Automated Lending Platform | Open Lending | United States";

        // instantiae actions for openlending page passing in driver
        OpenLendingActions openLendingActions = new OpenLendingActions(driver);

        // make sure webpage is proper and not wrong page
        sharedActions.validateWebpage(webpageTitleOpenLending);

        // can use if window not fully maximized.
        //openLendingActions.clickHamburgerMenu();

        // click on resources tab
        openLendingActions.clickResources();

        // close the cookie box
        openLendingActions.clickCookieBoxClose();

        // click load more until it no longer exists
        openLendingActions.clickLoadMore();

        // validate a tages for blogs are unqiue
        openLendingActions.validateNoDuplicateBlogPostATags();

        // validate headers are of equal size - semi pointless check but whatever
        openLendingActions.validateNoDuplicateBlogPostHeaders();

        // validate no subheadings are duplicate
        openLendingActions.validateNoDuplicateBlogPostSubHeaders();

        // validate hrefs for blog posts are unique
        openLendingActions.validateNoDuplicateBlogPostHrefs();
    }
}
