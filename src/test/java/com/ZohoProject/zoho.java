package com.ZohoProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.BaseClass1;
import POM.SingleTonDesignPattern;
import property.ConfigurationHelper;


public class zoho extends BaseClass1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumProject\\Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.zoho.com/login.html");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
		String browser = ConfigurationHelper.getInstance().getBrowser();
		driver= browserLaunch(browser);
		
		SingleTonDesignPattern sdp= new SingleTonDesignPattern(driver);
		
		String url = ConfigurationHelper.getInstance().getUrl();
		launchUrl(url);
//
//		WebElement SignUpNow = driver.findElement(By.xpath("//a[text()='Sign Up Now']"));
//		SignUpNow.click();
		
		clickOnElement(sdp.getLoginPage().getSignUpNow());
		sleep();		
//		WebElement email = driver.findElement(By.id("emailfield"));
//		email.sendKeys("balasundar008@gmail.com");
		String e = ConfigurationHelper.getInstance().getEmail();
		userInput(sdp.getLoginPage().getemail(),e);
		
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("bala12345678");
		String ps = ConfigurationHelper.getInstance().getPassword();
		userInput(sdp.getLoginPage().getPassword(), ps);
		sleep();
//		Thread.sleep(1000);
//
//		
//		WebElement agree = driver.findElement(By.xpath("//label[@class='sign_agree']/span"));
//		agree.click();
		clickOnElement(sdp.getLoginPage().getAgree());
		sleep();
//		
//		WebElement signUpForFree = driver.findElement(By.id("signupbtn"));
//		signUpForFree.click();
		clickOnElement(sdp.getLoginPage().getSignUpForFree());
		sleep();
//		
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		File source= ts.getScreenshotAs(OutputType.FILE);
//		File destination= new File("C:\\Users\\Admin\\eclipse-workspace1\\ZohoProject\\ScreenShot1\\facebook.png");
//		FileUtils.copyFile(source, destination);
		screenshot();
		
	}

}
