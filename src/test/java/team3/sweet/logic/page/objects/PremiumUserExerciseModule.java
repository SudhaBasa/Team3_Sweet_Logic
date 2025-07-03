package team3.sweet.logic.page.objects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
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
	public String actaulResultMarkAsCompleted;
	public String actualResultSuccessDialog;
	
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
	@FindBy(xpath = "//p[@class ='text-gray-600 mb-2']")WebElement exerciseDescriptionElement;                    
	@FindBy(xpath = " //span[contains(text(),'Duration: ')]")WebElement exerciseDurationElement;  
	@FindBy(xpath = " //span[contains(text(),'Calories: ')]")WebElement exerciseCaloriesElement;  
	@FindBy(xpath = " //span[contains(text(),'Intensity: ')]")WebElement exerciseIntensityElement; 
	@FindBy(xpath = "//span[text()='Mark as Completed']")WebElement btnMarkAsCompleted;
	@FindBy(xpath = "//div[@class='text-sm font-semibold']")WebElement successDialogElement;
	@FindBy(xpath = "//span[text()='Completed']")WebElement btnSuccessMsgCompleted;
	@FindBy(xpath = "//button[text()='Undo']")WebElement btnUndo;
	
	
	public void Loginbtn() {
		
		btnLogin.click();
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
	public void getViewFullSchedule() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnViewFullSchedule)).click();
	}
	public boolean areExerciseTabsVisible() {
		
        return btnWarmUp.isDisplayed()
            && btnMainWorkout.isDisplayed()
            && btnCoolDown.isDisplayed();
    }
	
	public void clickBtnWarmUp() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnWarmUp)).click();
	}
	public void clickBtnMainWorkout() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnMainWorkout)).click();
	}
	public void clickBtnCoolDown() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnCoolDown)).click();	
	}
	
	public String getTitle() {

		return titleTodayExerciseScheduleElement.getText();
	}
	public String getText_btnViewFullSchedule() {

		return btnViewFullSchedule.getText();
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
	public String getText_btnMarkAsCompleted() {

		return btnMarkAsCompleted.getText();
	}
	
	public String exerciseName_Warmup() {
		
		clickBtnWarmUp();

		exerciseName = exerciseNameElement.getText();
		
		return exerciseName;
	}
	public String exerciseDescription_Warmup() {
		
		clickBtnWarmUp();
		
		exerciseDescription = exerciseDescriptionElement.getText();
		
		return exerciseDescription;
	}
	public void warnUpExerciseDetails() {
		
		try {
			clickBtnWarmUp();
			
			exerciseDuration = exerciseDurationElement.getText();
			exerciseCalories = exerciseCaloriesElement.getText();
			exerciseIntensity = exerciseIntensityElement.getText() ;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}		
	}
	public void mainWorkoutExerciseDetails() {
		
		try {
			clickBtnMainWorkout();
			
			exerciseDuration = exerciseDurationElement.getText();
			exerciseCalories = exerciseCaloriesElement.getText();
			exerciseIntensity = exerciseIntensityElement.getText() ;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}		
	}
	public void coolDownExerciseDetails() {
	
		try {
			clickBtnCoolDown();

			exerciseDuration = exerciseDurationElement.getText();
			exerciseCalories = exerciseCaloriesElement.getText();
			exerciseIntensity = exerciseIntensityElement.getText() ;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
	}

	public String exerciseName_MainWorkout() {
		
		clickBtnMainWorkout();
		
		exerciseName = exerciseNameElement.getText();
		
		return exerciseName;
	}
	
	public String exerciseDescription_MainWorkout() {
		
		clickBtnMainWorkout();
		
		exerciseDescription = exerciseDescriptionElement.getText();
		return exerciseDescription;
	}
			
	public String exerciseName_CoolDown() {
		
		clickBtnCoolDown();
		
		exerciseName = exerciseNameElement.getText();
		
		return exerciseName;
	}
	public String exerciseDescription_CoolDown() {
		
		clickBtnCoolDown();
		
		exerciseDescription = exerciseDescriptionElement.getText();
		
		return exerciseDescription;
	}
	
	public void checkMarkAsCompleted(String exerciseTab) {
		
		try {
			if (exerciseTab.equals("Warm Up")) {
				
				clickBtnWarmUp();
				
				wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,800)", "");
				actaulResultMarkAsCompleted = btnMarkAsCompleted.getText();		
			}
			else if (exerciseTab.equals("Main workout")) {
				
				clickBtnMainWorkout();
				
				wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,800)", "");
				actaulResultMarkAsCompleted = btnMarkAsCompleted.getText();
			}
			else
			{
				clickBtnCoolDown();
				
				wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,800)", "");
				actaulResultMarkAsCompleted = btnMarkAsCompleted.getText();
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
	public void checkSuccessDialog (String exerciseTab) {
		
		try {
			if (exerciseTab.equals("Warm Up")) {
				
				clickBtnWarmUp();	
				
				wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.visibilityOf(btnMarkAsCompleted)).click();
				
				wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,800)", "");
				actualResultSuccessDialog = successDialogElement.getText();
			}
			else if (exerciseTab.equals("Main Workout")) {
				
				clickBtnMainWorkout();
				
				wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.visibilityOf(btnMarkAsCompleted)).click();
				
				wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,600)", "");
				actualResultSuccessDialog = successDialogElement.getText();
			}
			else
			{
				clickBtnCoolDown();
				
				wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.visibilityOf(btnMarkAsCompleted)).click();
				
				wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,600)", "");
				actualResultSuccessDialog = successDialogElement.getText();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
