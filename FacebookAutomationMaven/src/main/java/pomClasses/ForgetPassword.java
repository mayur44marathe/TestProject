package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ForgetPassword {
	
	private WebDriver driver;
	
	private Actions act;
	
	
	
	

	@FindBy (xpath = "//table/tr[1]//td[2]//div")
	private WebElement forgetMessage;
	
	@FindBy (xpath = "(//input[@name='email'])[2]")
	private WebElement emailOrPhonenumber;
	
	@FindBy (xpath ="//a[text() ='Cancel']")
	private WebElement cancelButton;
	
	@FindBy (xpath = "//button[text() ='Search']")
	private WebElement searchButton;
	
	//driver = driverTest = new ChromeDriver();
	
	public ForgetPassword (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
		Actions act = new Actions(driver);
	}
	public void getTextMessage1 () {
		String text = forgetMessage.getText();
		System.out.println(text);
	}
	public void sendEmailOrPhoneNumber1 () {
		emailOrPhonenumber.sendKeys("58478963214");
	}
	public void clickOnSearchButton() {
	//searchButton.click();           //mouseaction
		
		//Actions act = new Actions (driver);
		act.moveToElement(searchButton).click().perform();
	
	}
	public void clickOnCancelButton() {
		//cancelButton.click();
		
		act.moveToElement(cancelButton).click().perform();
	}
	
//	public void getTextMessage() {
//		Select s = new Select(forgetMessage);
//		s.selectByIndex(5);
//		
//	}
//	
//	public void sendEmailOrPhoneNumber() {
//		
//		Select s = new Select(emailOrPhoneNumber);
//		s.selectByIndex(5);
	//}
	
	
	
	
	
	
}
