package com.cucumber.junit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PaymentPage extends BasicPage {


    @FindBy(xpath = "//input[@name='emailAddress']")
    private static WebElement emailInput;

    @FindBy(xpath = "//dd[@class='text-right'][@aria-hidden='true']")
    private static WebElement orderSummarySubtotal;

    @FindBy(xpath = "//dd[@class='text-right total-price']")
    private static WebElement orderSummaryTotal;

    public WebElement getEmailInput(){
        return emailInput;
    }

    public WebElement getOrderSummaryTotal(){
        return orderSummaryTotal;
    }

    public WebElement getOrderSummarySubtotal(){
        return orderSummarySubtotal;
    }

}
