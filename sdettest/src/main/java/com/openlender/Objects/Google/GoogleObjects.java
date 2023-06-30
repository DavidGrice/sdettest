package com.openlender.Objects.Google;

import org.openqa.selenium.By;

public class GoogleObjects {

    public By title() {
        return By.xpath("//img[@alt='Google']");
    }

    public By search() {
        return By.xpath("//textarea[@title='Search']");
    }

    public By openLending() {
        return By.xpath("//a[@href='https://www.openlending.com/']/h3");
    }
}
