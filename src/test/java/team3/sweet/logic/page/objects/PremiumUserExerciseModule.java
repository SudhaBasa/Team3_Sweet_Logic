package team3.sweet.logic.page.objects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import team3.sweet.logic.driver.factory.DriverFactory;
import team3.sweet.logic.utils.ConfigReader;

public class PremiumUserExerciseModule {
	
	WebDriverWait wait;
	WebDriver driver;
	String Email;
	String PremUserPassword;
	public String exerciseName;
	public String exerciseDescription;
	public String exerciseDuration;
	public String exerciseCalories;
	public String exerciseIntensity;
	
	public PremiumUserExerciseModule() {
		
	    driver=  DriverFactory.getdriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Login']")WebElement btnLogin;
	@FindBy(xpath = "//input[@name='email']")WebElement emailInputElement;
	@FindBy(xpath = "//button[text()='Continue with email']")WebElement btnContinueWithEmail;
	@FindBy(xpath = "//input[@name='password']")WebElement passwordInputElement;
	@FindBy(xpath = "//button[text()='Sign in']")WebElement btnSignIn;
	
	@FindBy(xpath = "//*[@class ='block text-s mt-1']")WebElement exerciseOptionElement;
	@FindBy(xpath = "//button[text()='View Full Schedule']")WebElement btnViewFullSchedule;
	@FindBy(xpath = "//h1[@class='text-3xl font-bold text-white']")WebElement titleTodayExerciseScheduleElement;
	@FindBy(xpath = "//button[text()='Warm Up']")WebElement btnWarmUp;
	@FindBy(xpath = "//button[text()='Main Workout']")WebElement btnMainWorkout;
	@FindBy(xpath = "//button[text()='Cool Down']")WebElement btnCoolDown;
	
	@FindBy(xpath = "//h3[@class ='font-semibold']")WebElement exerciseNameElement;
	@FindBy(xpath = "//p[@class ='text-gray-600 mb-2']")WebElement exerciseDescriptionElement;                    // not sure
	
	//div[@class ='flex space-x-4 text-sm text-gray-500']//span[text()='5 minutes']
	
	
	@FindBy(xpath = "//div[@class ='flex space-x-4 text-sm text-gray-500']")WebElement exerciseDurationElement;   // not sure
	@FindBy(xpath = "//div[@class ='flex space-x-4 text-sm text-gray-500']")WebElement exerciseCaloriesElement;   // not sure
	@FindBy(xpath = "//div[@class ='flex space-x-4 text-sm text-gray-500']")WebElement exerciseIntensityElement;  // not sure
	@FindBy(xpath = "//button[@class ='flex items-center px-3 py-1 bg-violet-600 hover:bg-violet-700 text-white rounded-lg shadow transition-colors text-sm']")
	WebElement btnMarkAsCompleted;
	
	@FindBy(xpath = "//ol[@class='fixed top-0 z-[100] flex max-h-screen w-full flex-col-reverse p-4 sm:bottom-0 sm:right-0 sm:top-auto sm:flex-col md:max-w-[420px]']")
	WebElement successDialogElement;
	
	@FindBy(xpath = "//span[text()='Completed']")WebElement btnSuccessMsgCompleted;
	@FindBy(xpath = "//button[text()='Undo']")WebElement btnUndo;
	
	
	public void Loginbtn() {
		btnLogin.click();
		
		//wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	//	wait.until(ExpectedConditions.visibilityOf(btnLogin)).click();	
	}
	public void SignIn() {
		
		Email = ConfigReader.getProperty("email");
		emailInputElement.sendKeys(Email);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnContinueWithEmail)).click();
		
		PremUserPassword=ConfigReader.getProperty("PremUserPassword");
		passwordInputElement.sendKeys(PremUserPassword);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnSignIn)).click();
	}
	
	public void viewFullSchedule() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(exerciseOptionElement)).click();
				
	}
	public String getText_btnViewFullSchedule() {

		return btnViewFullSchedule.getText();
	}
	public void getViewFullSchedule() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnViewFullSchedule)).click();
	}
	public String getTitle() {

		return titleTodayExerciseScheduleElement.getText();
	}
	public String getText_btnWarmUp() {

		return btnWarmUp.getText();
	}
	public String getText_btnMainWorkout() {

		return btnMainWorkout.getText();
	}
	public String getText_btnCoolDown() {

		return btnCoolDown.getText();
	}
	
	public void clickBtnWarmUp() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnWarmUp)).click();
		
		exerciseName = exerciseNameElement.getText();
		exerciseDescription = exerciseDescriptionElement.getText() ;
		exerciseDuration = exerciseDurationElement.getText();
		exerciseCalories = exerciseCaloriesElement.getText();
		exerciseIntensity = exerciseIntensityElement.getText() ;		
	}
	
	public void clickBtnMainWorkout() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnMainWorkout)).click();
		
		exerciseName = exerciseNameElement.getText();
		exerciseDescription = exerciseDescriptionElement.getText() ;
		exerciseDuration = exerciseDurationElement.getText();
		exerciseCalories = exerciseCaloriesElement.getText();
		exerciseIntensity = exerciseIntensityElement.getText() ;		
	}
	public void clickBtnCoolDown() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnCoolDown)).click();
		
		exerciseName = exerciseNameElement.getText();
		exerciseDescription = exerciseDescriptionElement.getText() ;
		exerciseDuration = exerciseDurationElement.getText();
		exerciseCalories = exerciseCaloriesElement.getText();
		exerciseIntensity = exerciseIntensityElement.getText() ;		
	}
	

}
