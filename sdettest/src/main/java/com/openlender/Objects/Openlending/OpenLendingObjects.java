package com.openlender.Objects.Openlending;

import org.openqa.selenium.By;

public class OpenLendingObjects {

    public By hamburgerMenu() {
        return By.xpath("//div[@class='navbar-section']/button[@class='navbar-toggler collapsed']");
    }

    public By resources() {
        return By.xpath("//li/a[@href='https://www.openlending.com/resources/']");
    }
}