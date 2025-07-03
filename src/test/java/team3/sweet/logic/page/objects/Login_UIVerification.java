package team3.sweet.logic.page.objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import team3.sweet.logic.utils.ConfigReader;

public class Login_UIVerification {
	private WebDriver driver;
	private WebDriverWait wait;
	ConfigReader config = new ConfigReader();
	 public Login_UIVerification(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        PageFactory.initElements(driver, this);


	}
	 @FindBy(xpath="//button[text()=' Login']")
	 WebElement Login_Button;
	 
	 @FindBy(xpath="//h1[text()='Welcome back']")
	 WebElement Welcomeback_Text;
	 
	 @FindBy(xpath="//p[text()='Sign in to your account or create a new one']")
	 WebElement SigninOrCreate_Text;
	 
	 @FindBy(xpath="//button[contains(@class,'absolute right')]")
	 WebElement Close_Button;
	 
	 @FindBy(name="email")
	 WebElement Email_Field;
	 
	 @FindBy(xpath="//input[@placeholder='Enter email']")
	 WebElement EmailPlaceholder_Text;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 WebElement ContinuewithEmail_Button;
	 
	 @FindBy(xpath="//button[text()='Continue with Google']")
	 WebElement ContinuewithGoogle_Button;
	 
	 @FindBy(xpath="//span[text()='OR']")
	 WebElement OR_Separator;
	 
	 @FindBy(xpath="//p[text()='By continuing you agree to our T&Cs and Privacy Policy']")
	 WebElement AgreePolicy_Text;
	 
	 @FindBy(xpath="//button[text()='Sign in']")
	 WebElement SignIn_Button;
	 
	 @FindBy(xpath="//p[text()='sweetlogic789@gmail.com']")
	 WebElement EmailId_SubText;
	 
	 @FindBy(linkText="Forgot password?")
	 WebElement ForgotPassword_Link;
	 
	 @FindBy(xpath="//input[@placeholder='Enter your password']")
	 WebElement PasswordPlaceholder_Text;
	 
	@FindBy(xpath="//p[text()='Registering with: ' or  text()='jasmine01@gmail.com']")
	WebElement NewEmail_InputField;
	
	@FindBy(xpath="//form[contains(@class,'space-y-4')]")
	WebElement CompleteProfile_Form;
	
	@FindBy(name="name")
	WebElement FullName_Field;
	
	@FindBy(name="username")
	WebElement UserName_Field;
	
	@FindBy(name="password")
	WebElement Password_Field;
	
	@FindBy(xpath="//button[@id='terms']/following::label[1]")
	WebElement AgreePrivacy_Checkbox;
	
	
	
	
	 
	 
	

}
