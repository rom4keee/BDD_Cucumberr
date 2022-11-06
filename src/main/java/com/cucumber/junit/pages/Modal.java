package com.cucumber.junit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Modal extends BasicPage {

    @FindBy (xpath = "//a[@data-default-localized-pattern='Basket / Checkout']")
    private WebElement basketCheckoutButton;

    public WebElement getBasketCheckoutButton(){
        return basketCheckoutButton;
    }
}
