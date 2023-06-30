package com.openlender.Objects.Google;

import org.openqa.selenium.By;
/*
 * GoogleObjects - class used for googles home page
 */
public class GoogleObjects {

    /* 
     * title - Validate you are on google page
     */
    public By title() {
        return By.xpath("//img[@alt='Google']");
    }

    /* 
     * search - used for clicking search box
     */
    public By search() {
        return By.xpath("//textarea[@title='Search']");
    }

    /* 
     * openLending - used for clicking on open lending page
     */
    public By openLending() {
        return By.xpath("//a[@href='https://www.openlending.com/']/h3");
    }
}
