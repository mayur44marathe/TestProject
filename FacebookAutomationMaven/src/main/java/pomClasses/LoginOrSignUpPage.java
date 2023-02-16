package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
	//variable - private - WebElement
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@value='1']")
			private WebElement loginButton;
	
	@FindBy (xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy (xpath = "//a[text()='Create new account']")
	
	private WebElement createNewAcc;
	
	@FindBy (xpath ="//a[text () ='Create a Page']")
	private WebElement createPage;
	
	
	//constructor- public -  webelement initilization(find)
	public LoginOrSignUpPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Methods - public - WebElement Action
	
	public void sendUserName () {
		userName.sendKeys("Akshay");
	}
	public void sendPassword () {
		password.sendKeys("12");
		
	}
	public void clickLoginButton () {
		loginButton.click();
	}
	public void clickOnForgotPasswordLink () {
		forgotPasswordLink.click();
	}
	
	// clickOnCreateNewAccount
	public void openSignUpForm() {
		createNewAcc.click();
		
	}
	
	
	
	
	
	
	
	
	
	

}
