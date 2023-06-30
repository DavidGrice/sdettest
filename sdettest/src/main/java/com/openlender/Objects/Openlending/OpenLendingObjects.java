package com.openlender.Objects.Openlending;

import org.openqa.selenium.By;
/*
 * OpenLendingObjects - Class which holds the objects referencing DOM elements on the website.
 * Could be broken down to specific pages, but was taking too much time as is, so I made a general Objectpage
 * for the sake of time.
 * 
 */
public class OpenLendingObjects {

    /*
     * hamburgerMenu - Originally made this due to small screen, but enhanced driver so became obsolete.
     */
    public By hamburgerMenu() {
        return By.xpath("//div[@class='navbar-section']/button[@class='navbar-toggler collapsed']");
    }
    /*
     * resources - clicks on the resources tab on website
     */
    public By resources() {
        return By.xpath("//li/a[@href='https://www.openlending.com/resources/']");
    }
    /* 
     * cookieBoxClose - Closes cookie box modal
     */
    public By cookieBoxClose() {
        return By.xpath("//div[@class='cmplz-header']/div[@class='cmplz-close' and @aria-label='close-dialog']");
    }
    /*
     * loadMore - Clicks load more button on resources page
     */
    public By loadMore() {
        return By.xpath("//button[@class='facetwp-load-more' and normalize-space(text())='Load More']");
    }
    /*
     * blogPosts - gets all elements pertaining to blog posts (71-76 as of code making)
     */
    public By blogPosts() {
        return By.xpath("//div[@class='lenders-featured-block']");
    }
    /* 
     * blogPostATag - Gets the A tags within each blog, to validate no duplicates are there.
     */
    public By blogPostATag() {
        return By.xpath("//div[@class='lenders-featured-block']/a");
    }
    /*
     * blogPostTextBox - Gets the textbox which holds the header/subheader and read more information
     */
    public By blogPostTextBox() {
        return By.xpath("//div[@class='lenders-featured-text-box']");
    }
    /*
     * blogPostTextBoxHeader - gets the header tags for each post. Due to them being non-unique, can't really validate repetitive here
     */
    public By blogPostTextBoxHeader() {
        return By.xpath("//div[@class='lenders-featured-block']/div[@class='lenders-featured-text-box']/div[@class='paragraph-p3 category heading-featured']");
    }
    /*
     * blogPostTextBoxSubHeader - Gets the subheader (aka paragraph) and can be sued for validation
     */
    public By blogPostTextBoxSubHeader() {
        return By.xpath("//div[@class='lenders-featured-block']/div[@class='lenders-featured-text-box']/div[@class='paragraph-p2']");
    }
    /* 
     * blogPostTextBoxReadMoreHref - is used to validate no duplicate hrefs for click more exist
     */
    public By blogPostTextBoxReadMoreHref() {
        return By.xpath("//div[@class='lenders-featured-block']/div[@class='lenders-featured-text-box']/div[@class='paragraph-p3']/a");
    }

}