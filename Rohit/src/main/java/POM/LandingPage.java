package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {
@FindBy (xpath = "//img[@src ='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']") private WebElement Home;
@FindBy (xpath = "//select[@id = 'customerCurrency']") private WebElement currency;
@FindBy (xpath = "//a[@class ='ico-register']") private WebElement register;
@FindBy (xpath = "//a[@class ='ico-login']") private WebElement login ;
@FindBy (xpath = "//span[@class ='wishlist-label']") private WebElement Wishlist ;
@FindBy (xpath = "//span[@class ='cart-label']") private WebElement shoppingcart;
@FindBy (xpath = "//input[@placeholder = 'Search store']") private WebElement searchStores;
@FindBy (xpath = "//button[@type = 'submit']") private WebElement search;
@FindBy (xpath = "(//a[text()='Computers '])[1]") private WebElement computers;
@FindBy (xpath = "(//a[text()='Electronics '])[1]") private WebElement Electronics;
@FindBy (xpath = "(//a[text()='Apparel '])[1]") private WebElement Apparel;
@FindBy (xpath = "(//a[text()='Digital downloads '])[1]") private WebElement Digitaldownloads;
@FindBy (xpath = "(//a[text()='Books '])[1]") private WebElement Books;
@FindBy (xpath = "(//a[text()='Jewelry '])[1]") private WebElement Jewelery;
@FindBy (xpath = "(//a[text()='Gift Cards '])[1]") private WebElement Giftcards;


public LandingPage (WebDriver driver) {
PageFactory.initElements(driver, this);	
}
public void clickonhome(){
	Home.click();
}
public void Wishlist(){
	Wishlist.click();
}
public void login(){
	login.click();
}
public void shoppingcart(){
	shoppingcart.click();
}
public void clickonregister(){
	register.click();
}
public String sendkeysonsearchstore(String S) {
	searchStores.sendKeys(S);
	return S;	
}
public void clickonsearch() {
	search.click();
}
public void clickoncomputers() {
	computers.click();
}
public void clickonElectronics() {
	Electronics.click();
}
public void clickonApparel() {
	Apparel.click();
}
public void clickonDigitaldownloads() {
	Digitaldownloads.click();
}
public void Books() {
	Books.click();
}
public void Jewelery() {
	Jewelery.click();
}
public void Giftcards() {
	Giftcards.click();
}
public void selectcurrency(int a) {
	Select s = new Select(currency);
    s.selectByIndex(a);
}




}
