package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPopup {

	@FindBy (xpath ="//a[@id='terms-link']")
	private WebElement termsLink;
	
	@FindBy (xpath ="//a[@id='privacy-link']")
	private WebElement privacyLink;
	
	@FindBy (xpath ="//a[@id='cookie-use-link']")
	 private WebElement cookiesPolicyLink;
	
	public SignUpPopup (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public void clickTermsLink () {
		termsLink.click();
	}
		

	public void clickPrivacyLink () {
		privacyLink.click();
	}
	
	public void clickCookiesPolicyLink () {
		cookiesPolicyLink.click();
	}
	
	
	
	
	
	
	
	
	
	
}
