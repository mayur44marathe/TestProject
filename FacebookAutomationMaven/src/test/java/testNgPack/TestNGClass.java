package testNgPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.LoginOrSignUpPage;
import pomClasses.SignUpPopup;




public class TestNGClass {

	WebDriver driver;
	@BeforeClass
	public void openBrowser () {
		System.out.println("Before Class");

System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
     
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void beforopenSignUpPage () {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage (driver);	
		loginOrSignUpPage.openSignUpForm();
		
	}
	
	@Test
	public void verifyTermsLinks () {
		System.out.println("Test-1");
		SignUpPopup  signUpPopup = new SignUpPopup (driver);
		signUpPopup.clickPrivacyLink();
	
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(addr.get(1));
		
		String actualURL = driver.getCurrentUrl();
		
		String actualTitle = driver.getTitle();
		
		String expectedURL = "https://www.facebook.com/legal/terms/update";
		String expectedTitle = "Facebook";
		
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("PASSED");
			
		}
		else
		{
			System.out.println("FAILED");
			
		}
		
		
	}
	
	@Test
	public void verifyPrivacyLink () {
		System.out.println("Test-2");
		SignUpPopup  signUpPopup = new SignUpPopup (driver);
		signUpPopup.clickPrivacyLink();
	
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(addr.get(1));
		
       String actualURL = driver.getCurrentUrl();
		
		String actualTitle = driver.getTitle();
		
		String expectedURL = "https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
		String expectedTitle = "Meta Privacy Policy-How Meta";
		
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("PASSED");
			
		}
		else
		{
			System.out.println("FAILED");
			
		}
	}
		@Test
		public void verifyCookiesPolicyLink () {
			System.out.println("Test-3");
			SignUpPopup  signUpPopup = new SignUpPopup (driver);
			signUpPopup.clickCookiesPolicyLink();
		
			
			ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
			
			driver.switchTo().window(addr.get(1));
			
	       String actualURL = driver.getCurrentUrl();
			
			String actualTitle = driver.getTitle();
			
			String expectedURL = "https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
			String expectedTitle = "Meta cookies Policy";
			
			if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
			{
				System.out.println("PASSED");
				
			}
			else
			{
				System.out.println("FAILED");
				
			}
		
	
	}
	
	
	
	@AfterMethod 
		public void closedCurrentTab () {
			
		System.out.println("After Method");
		
		driver.close();
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
		
	}
	
	@AfterClass 
	public void  afterClass () {
		System.out.println("After Class");
		
		driver.quit();
		
	}
	
	
	
	
	
}
