package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.RunnerZoho;

import BaseClass.BaseClass1;
import POM.SingleTonDesignPattern;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import property.ConfigurationHelper;

public class StepDefinitionZoho extends BaseClass1{
	public static WebDriver driver=	RunnerZoho.driver;
	 public static SingleTonDesignPattern sdp;


	@Given("user Launch The Url Of Application")
	public void user_Launch_The_Url_Of_Application() throws IOException, InterruptedException {
//		driver.get("https://www.zoho.com/login.html");
//		driver.manage().window().maximize();
//		WebElement SignUpNow = driver.findElement(By.xpath("//a[text()='Sign Up Now']"));
//		SignUpNow.click();
		String browser = ConfigurationHelper.getInstance().getBrowser();
		driver= browserLaunch(browser);
		
		sdp= new SingleTonDesignPattern(driver);
		String url = ConfigurationHelper.getInstance().getUrl();
		launchUrl(url);
		implicitWait();	

		clickOnElement(sdp.getLoginPage().getSignUpNow());
		sleep();
	}

	@When("user Enter The Email Id Into Email Field")
	public void user_Enter_The_Email_Id_Into_Email_Field() throws IOException {
//		WebElement email = driver.findElement(By.id("emailfield"));
//		email.sendKeys("balasundar008@gmail.com");
		String e = ConfigurationHelper.getInstance().getEmail();
		userInput(sdp.getLoginPage().getemail(),e);
		
	}

	@When("user Enter The Password Into Password Field")
	public void user_Enter_The_Password_Into_Password_Field() throws IOException, InterruptedException {
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("bala12345678");
		String ps = ConfigurationHelper.getInstance().getPassword();
		userInput(sdp.getLoginPage().getPassword(), ps);
		sleep();
		
	}

	@When("user Click The Checkbox For Agree The Terms and Condition")
	public void user_Click_The_Checkbox_For_Agree_The_Terms_and_Condition() throws InterruptedException {
//		WebElement agree = driver.findElement(By.id("signup-termservice"));
//		agree.click();
		clickOnElement(sdp.getLoginPage().getAgree());
		sleep();
	}

	@When("user Click The button Of SignUp For Free")
	public void user_Click_The_button_Of_SignUp_For_Free() throws IOException, InterruptedException {

//		WebElement signUpForFree = driver.findElement(By.id("signupbtn"));
//		signUpForFree.click();
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		File source= ts.getScreenshotAs(OutputType.FILE);
//		File destination= new File("C:\\Users\\Admin\\eclipse-workspace1\\ZohoProject\\ScreenShot1\\facebook1.png");
//		FileUtils.copyFile(source, destination);
		clickOnElement(sdp.getLoginPage().getSignUpForFree());
		sleep();
		screenshot();
	}




}
