package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	
	@FindBy(xpath ="//a[text()='Sign Up Now']")
	private WebElement SignUpNow;
	
	@FindBy(id="emailfield")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//label[@class='sign_agree']/span")
	private WebElement agree;
	
	@FindBy(id ="signupbtn" ) 
	private WebElement signUpForFree;
	
	
public LoginPage (WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getSignUpNow() {
	return SignUpNow;
	
}
public WebElement getemail() {
	return email;
}

public WebElement getPassword() {
	return password;
}
public WebElement getAgree() {
	return agree;
}

public WebElement getSignUpForFree() {
	return signUpForFree;
}	









			
	
}
