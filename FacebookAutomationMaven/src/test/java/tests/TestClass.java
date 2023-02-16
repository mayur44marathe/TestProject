package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.ForgetPassword;
import pomClasses.LoginOrSignUpPage;

public class TestClass {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver driverTest = new ChromeDriver();
	driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driverTest.manage().window().maximize();
	
	driverTest.get("https://www.facebook.com/");
	
	LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage (driverTest);
	
	loginOrSignUpPage.sendUserName();
	loginOrSignUpPage.sendPassword();
	
	//loginOrSignUpPage.clickLoginButton();
	loginOrSignUpPage.clickOnForgotPasswordLink();
	
	ForgetPassword forgetPasswordPage = new ForgetPassword (driverTest);
	
	forgetPasswordPage.getTextMessage1 ();
	
	forgetPasswordPage.sendEmailOrPhoneNumber1();
	
	forgetPasswordPage.clickOnSearchButton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
