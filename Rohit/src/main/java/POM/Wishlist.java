package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
@FindBy (xpath = "(//button[@name='updatecart'])[1]") private WebElement UpdateCart;
@FindBy (xpath = "//button[@name='addtocartbutton']") private WebElement AddToCart;	
@FindBy (xpath = "//button[@class='button-2 email-a-friend-wishlist-button']") private WebElement EmailAFriend;	
@FindBy (xpath = "//a[@class='share-link']") private WebElement WishlistURL;

public Wishlist (WebDriver Driver) {
PageFactory.initElements(Driver, this);
}
public void ClickOnUpdateCart() {
	UpdateCart.click();
}
public void ClickOnAddtoCart() {
	AddToCart.click();
}
public void ClickOnEmailAFriend() {
	EmailAFriend.click();
}
public void ClickOnWishlistURL() {
	WishlistURL.click();
}

}	
