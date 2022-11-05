package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

@FindBy(xpath = "//button[@class = 'button-1 register-button']") private WebElement RegisterNewCustomer;
@FindBy(xpath = "//input[@id='Email']") private WebElement EmailID;	
@FindBy(xpath = "//input[@id='Password']") private WebElement Password;
@FindBy(xpath = "//input[@type='checkbox']") private WebElement	RememberMe;
@FindBy(xpath = "//a[text()='Forgot password?']") private WebElement ForgotPassword;
@FindBy(xpath = "//button[text()='Log in']") private WebElement	LogIn;
	
public Login(WebDriver Driver) {
PageFactory.initElements(Driver, this);
}
public void clickOnRegisterNewCustomer() {
	RegisterNewCustomer.click();
}
public String EnterEmailID(String A) {
	EmailID.sendKeys(A);
	return A;
}
public String EnterPassword(String B) {
	Password.sendKeys(B);
	return B;
}
public void clickOnRemmemberMe() {
	RememberMe.click();
}	
public void clickOnForgotPassword() {
	ForgotPassword.click();
}	
public void LogIn() {
	LogIn.click();
}	
	
	
	
	
	
	
}
