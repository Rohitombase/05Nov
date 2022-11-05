package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register {

@FindBy (xpath = "//input[@id='gender-male']") private WebElement Malegender;
@FindBy (xpath = "//input[@id='gender-female']") private WebElement FemaleGender;
@FindBy (xpath = "//input[@id='FirstName']") private WebElement Firstname;
@FindBy (xpath = "//input[@id='LastName']") private WebElement Lastname;
@FindBy (xpath = "//select[@name='DateOfBirthDay']") private WebElement DateOfBirthDay;
@FindBy (xpath = "//select[@name='DateOfBirthMonth']") private WebElement DateOfBirthMonth;
@FindBy (xpath = "//select[@name='DateOfBirthYear']") private WebElement DateOfBirthYear;
@FindBy (xpath = "(//input[@type='email'])[1]") private WebElement EmailID;
@FindBy (xpath = "//input[@id='Company']") private WebElement CompanyDetails;
@FindBy (xpath = "//input[@type='checkbox']") private WebElement Newsletter;
@FindBy (xpath = "(//input[@type='password'])[1]") private WebElement password;
@FindBy (xpath = "(//input[@type='password'])[2]") private WebElement confirmpassword;
@FindBy (xpath = "(//button[@type='submit'])[2]") private WebElement Register;

public Register (WebDriver Driver) {
PageFactory.initElements(Driver,this);
}
public void SelectMalegender() {
Malegender.click();
}
public void SelectFemaleGender() {
FemaleGender.click();
}
public String EnterFirstname (String A) {
	Firstname.sendKeys(A);
	return A;
}
public String EnterLastname (String B) {
	Firstname.sendKeys(B);
	return B;
}
public void SelectDateOfBirthDay(int c) {
	Select S = new Select(DateOfBirthDay);
	S.selectByIndex(c);
}
public void SelectDateOfBirthMonth(int D) {
	Select S = new Select(DateOfBirthMonth);
	S.selectByIndex(D);
}
public void SelectDateOfBirthYear(String E) {
	Select S = new Select(DateOfBirthYear);
	S.selectByValue(E);
}
public String EnterEmailId(String F) {
	EmailID.sendKeys(F);
	return F;	
}
public String EnterCompanyDetails(String G) {
	CompanyDetails.sendKeys(G);
	return G;	
}
public String EnterPassword(String H) {

	password.sendKeys(H);
	return H;	
}
public void clickonnewletter() {
	Newsletter.click();
}
public String Enterconfirmpassword(String I) {
	EmailID.sendKeys(I);
	return I;	
}
public void ClickonRegister() {
	Register.click();
}















}
