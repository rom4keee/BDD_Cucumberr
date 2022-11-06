package com.cucumber.junit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Basket extends BasicPage {
        @FindBy (xpath = "//p[@class = 'item-total']")
        private WebElement itemTotal;

        @FindBy (xpath = "//dl[@class = 'total']/dd")
        private WebElement basketTotal;

        @FindBy (xpath = "//div[@class='basketHeaderButtons']//a[contains(@class,'checkout-btn')]")
        private WebElement checkoutButton;

        public WebElement getItemTotal(){
            return itemTotal;
        }

        public WebElement getBasketTotal(){
            return basketTotal;
        }

        public WebElement getCheckoutButton(){
            return checkoutButton;
        }
    }