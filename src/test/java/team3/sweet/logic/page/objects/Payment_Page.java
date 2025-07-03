package team3.sweet.logic.page.objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import team3.sweet.logic.utils.ConfigReader;

public class Payment_Page {
	private WebDriver driver;
	private WebDriverWait wait;
	ConfigReader config = new ConfigReader();
	 public Payment_Page(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//p[contains(@class,'text-xs text-red-500 mt-1')]")
	WebElement Validation_Messages;
	
	@FindBy(xpath="//p[text()='Your card number is invalid.']")
	WebElement InvalidCard_ErrorMessage;
	
	@FindBy(xpath="//p[text()='Your card’s expiration year is in the past.']")
	WebElement ExpiryCard_Message;
	
	@FindBy(className="text-center space-y-4")
	WebElement WelcomeToPremium_Title;
	
	 
	@FindBy(name="cardnumber") 
	WebElement CardNumber_InputField;
	
	@FindBy(name="exp-date")
	WebElement ExpirationDate_Field;
	
	@FindBy(name="cvc")
	WebElement CVC_Field;
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}