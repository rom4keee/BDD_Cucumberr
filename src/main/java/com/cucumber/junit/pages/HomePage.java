package com.cucumber.junit.pages;

import com.cucumber.junit.driver.WDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasicPage {
    private static final String BOOK_DEPOSITORY_URL = "https://www.bookdepository.com/";

    public void openBookDepositoryWebsite(){
        WDriver.getDriver().get(BOOK_DEPOSITORY_URL);
    }
    @FindBy(xpath = "//*[@id='book-search-form']//input[1]")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class='header-search-btn']")
    private WebElement searchButton;

    public WebElement getMenuSearchField(){
        return searchField;
    }

    public WebElement getSearchButton(){
        return searchButton;
    }
}