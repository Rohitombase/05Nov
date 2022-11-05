package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
@FindBy (xpath = "(//button[@name='updatecart'])[1]")private WebElement UpdateShoppingCart;
@FindBy (xpath = "//button[@class='button-2 continue-shopping-button']")private WebElement continueShopping;
@FindBy (xpath = "//a[@class='estimate-shipping-button']")private WebElement EstimateShopping;
@FindBy (xpath = "//input[@name='discountcouponcode']")private WebElement DiscountCode;
@FindBy (xpath = "//select[@name='checkout_attribute_1']")private WebElement GiftWrapping;
@FindBy (xpath = "//input[@name='giftcardcouponcode']")private WebElement GiftCards;
@FindBy (xpath = "//input[@name='termsofservice']")private WebElement TermsAndConditions;
@FindBy (xpath = "//a[@class='read']")private WebElement ReadTerms;
@FindBy (xpath = "//button[@name='checkout']")private WebElement CheckOut;

public ShoppingCart(WebDriver Driver) {
PageFactory.initElements(Driver, this);
}

public void ClickOnUpdateShoppingCart(){
	UpdateShoppingCart.click();
	
}




}
