package com.openlender.GUI;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.openlender.Actions.SharedActions;
import com.openlender.Actions.Google.GoogleActions;
import com.openlender.Actions.Openlending.OpenLendingActions;

/**
 * Unit test for simple App.
 */
class OpenLendingTests {
    
    private WebDriver driver;

    @Test
    void sdetTest() {
        String webString = "https://www.google.com";
        String webpageTitleGoogle = "Google";
        String searchText = "Open Lending";

        String webpageTitleOpenLending = "Automated Lending Platform | Open Lending | United States";

        SharedActions sharedActions = new SharedActions(driver);
        driver = sharedActions.instantiateWebDriver();
        sharedActions.navigateToWebsite(webString);
        sharedActions.validateWebpage(webpageTitleGoogle);

        GoogleActions googleActions = new GoogleActions(driver);
        googleActions.clickSearchBox();
        googleActions.enterSearchText(searchText);
        googleActions.submitSearchQuery();
        googleActions.clickOpenLendingIcon();

        OpenLendingActions openLendingActions = new OpenLendingActions(driver);
        sharedActions.validateWebpage(webpageTitleOpenLending);
        openLendingActions.clickHamburgerMenu();
        openLendingActions.clickResources();
    }
}
