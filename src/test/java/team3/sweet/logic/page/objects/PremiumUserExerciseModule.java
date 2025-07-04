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
	public String actualSuccessMsg;
	public String actualUndoMsg;
	
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
	@FindBy(xpath = "//button[text()='Back to Home']")WebElement btnBacktoHome;
	@FindBy(xpath = "//h2[@class = 'text-xl font-semibold text-violet-700 mb-4']")WebElement warmUpSectionElement;
	@FindBy(xpath = "//h3[@class = 'font-semibold mb-2']")WebElement warmUpExerciseNameElement;
	@FindBy(xpath = "//h3[text()='Light Walking & Gentle Yoga']")WebElement mainWorkoutExerciseNameElement;
	@FindBy(xpath = "//h3[text()='Static Stretching']")WebElement coolDownExerciseNameElement;
	
	@FindBy(xpath = "//h3[text()='Light Walking & Gentle Yoga']/following-sibling::p[@class='text-gray-600 mb-2']")WebElement mainWorkoutDescriptionElement;
	@FindBy(xpath = "//h3[text()='Gentle Arm Circles & Leg Swings']/following-sibling::p[@class='text-gray-600 mb-2']")WebElement warmUpDescriptionElement;
	@FindBy(xpath = "//h3[text()='Static Stretching']/following-sibling::p[@class='text-gray-600 mb-2']")WebElement coolDownDescriptionElement;
	
	
	@FindBy(xpath = "//h3[text()='Gentle Arm Circles & Leg Swings']/following-sibling::div/span[contains(text(),'Duration')]")WebElement warmUpDurationElement;
	@FindBy(xpath = "//h3[text()='Light Walking & Gentle Yoga']/following-sibling::div/span[contains(text(),'Duration')]")WebElement mainWorkoutDurationElement;
	@FindBy(xpath = "//h3[text()='Static Stretching']/following-sibling::div/span[contains(text(),'Duration')]")WebElement coolDownDurationElement;

	
	@FindBy(xpath = "//h2[text()='Warm Up']/following-sibling::div//span[contains(text(),'Calories')]")WebElement warmUpCaloriesElement;
	@FindBy(xpath = "//h2[text()='Main Workout']/following-sibling::div//span[contains(text(),'Calories')]")WebElement mainWorkoutCaloriesElement;
	@FindBy(xpath = "//h2[text()='Cool Down']/following-sibling::div//span[contains(text(),'Calories')]")WebElement coolDownCaloriesElement;

	@FindBy(xpath = "//h2[text()='Warm Up']/following-sibling::div//span[contains(text(),'Intensity')]")WebElement warmUpIntensityElement;
	@FindBy(xpath = "//h2[text()='Main Workout']/following-sibling::div//span[contains(text(),'Intensity')]")WebElement mainWorkoutIntensityElement;
	@FindBy(xpath = "//h2[text()='Cool Down']/following-sibling::div//span[contains(text(),'Intensity')]")WebElement coolDownIntensityElement;
	
	@FindBy(xpath = "//div[contains(@class, 'text-violet-800')]//span[contains(text(), 'Total Duration')]")WebElement totalDurationElement;
	@FindBy(xpath = "//div[contains(@class, 'text-violet-800')]//span[contains(text(), 'Total Calories')]")WebElement totalCaloriesElement;

	
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
	public boolean areTotalDurationVisible() {
		
        return totalDurationElement.isDisplayed();
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
	
	public void clickbtnUndo() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		wait.until(ExpectedConditions.visibilityOf(btnUndo)).click();		
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
	public String getText_btnSuccessMsgCompleted() {

		return btnSuccessMsgCompleted.getText();
	}
	public String getText_btnUndo() {

		return btnUndo.getText();
	}
	public String getText_btnBacktoHome() {

		return btnBacktoHome.getText();
	}
	public String getText_warmUpSectionElement() {

		return warmUpSectionElement.getText();
	}
	
	
	public String getText_warmUpExerciseNameElement() {

		return warmUpExerciseNameElement.getText();
	}
	public String getText_mainWorkoutExerciseNameElement() {

		return mainWorkoutExerciseNameElement.getText();
	}
	public String getText_coolDownExerciseNameElement() {

		return coolDownExerciseNameElement.getText();
	}
	
	
	public String getText_warmUpDescriptionElement() {

		return warmUpDescriptionElement.getText();
	}
	public String getText_mainWorkoutDescriptionElement() {

		return mainWorkoutDescriptionElement.getText();
	}
	public String getText_coolDownDescriptionElement() {

		return coolDownDescriptionElement.getText();
	}
	
	
	
	public String getText_warmUpDurationElement() {

		return warmUpDurationElement.getText();
	}
	public String getText_mainWorkoutDurationElement() {

		return mainWorkoutDurationElement.getText();
	}
	public String getText_coolDownDurationElement() {

		return coolDownDurationElement.getText();
	}
	
	
	public String getText_warmUpCaloriesElement() {

		return warmUpCaloriesElement.getText();
	}
	public String getText_mainWorkoutCaloriesElement() {

		return mainWorkoutCaloriesElement.getText();
	}
	public String getText_coolDownCaloriesElement() {

		return coolDownCaloriesElement.getText();
	}
	
	
	public String getText_warmUpIntensityElement() {

		return warmUpIntensityElement.getText();
	}
	public String getText_mainWorkoutIntensityElement() {

		return mainWorkoutIntensityElement.getText();
	}
	public String getText_coolDownIntensityElement() {

		return coolDownIntensityElement.getText();
	}
	
	
	public String getText_totalDurationElement() {

		return totalDurationElement.getText();
	}
	public String getText_totalCaloriesElement() {

		return totalCaloriesElement.getText();
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
			}
			else if (exerciseTab.equals("Main workout")) {
				
				clickBtnMainWorkout();
			}
			else
			{
				clickBtnCoolDown();
			}
			
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			actaulResultMarkAsCompleted = btnMarkAsCompleted.getText();	
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
	public void clickBtnMarkAsCompleted() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnMarkAsCompleted)).click();
	}
	public void checkSuccessDialog (String exerciseTab) {
		
		try {
			if (exerciseTab.equals("Warm Up")) {
				
				clickBtnWarmUp();		
				clickBtnMarkAsCompleted();	
			}
			else if (exerciseTab.equals("Main Workout")) {
				
				clickBtnMainWorkout();
				clickBtnMarkAsCompleted();
			}
			else
			{
				clickBtnCoolDown();
				clickBtnMarkAsCompleted();
			}
			
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			actualResultSuccessDialog = successDialogElement.getText();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void checkBtnCompleted (String exerciseTab) {
		
			if (exerciseTab.equals("Warm Up")) {
				
				clickBtnWarmUp();	
			}
			else if (exerciseTab.equals("Main Workout")) {
				
				clickBtnMainWorkout();
			}
			else
			{
				clickBtnCoolDown();
			}
			
			clickBtnMarkAsCompleted();
			
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			actualSuccessMsg = getText_btnSuccessMsgCompleted();
	}
	public void checkBtnUndo(String exerciseTab) {
		
		if (exerciseTab.equals("Warm Up")) {
			
			clickBtnWarmUp();	
		}
		else if (exerciseTab.equals("Main Workout")) {
			
			clickBtnMainWorkout();
		}
		else
		{
			clickBtnCoolDown();
		}
		
		clickBtnMarkAsCompleted();
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		actualUndoMsg = getText_btnUndo();
	}
	
	public void checkUndobtnBack() {
		
		clickbtnUndo();
		actaulResultMarkAsCompleted = getText_btnMarkAsCompleted();
	}
}
