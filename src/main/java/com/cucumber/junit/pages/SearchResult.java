package com.cucumber.junit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResult extends Basket {

    @FindBy (xpath = "//a[contains(@class,'add-to-basket')]")
    private WebElement addToBasketButton;

    public WebElement getAddToBasketButton(){
        return addToBasketButton;
    }
}
