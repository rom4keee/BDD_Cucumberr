package com.cucumber.junit.pages;

import com.cucumber.junit.driver.WDriver;
import org.openqa.selenium.support.PageFactory;

public class BasicPage extends PageFactory {
    public BasicPage(){
        PageFactory.initElements(WDriver.getDriver(),this);
    }

    public String getPageUrl() {
        return WDriver.getDriver().getCurrentUrl();
    }
}