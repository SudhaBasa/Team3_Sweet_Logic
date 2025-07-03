package team3.sweet.logic.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import team3.sweet.logic.driver.factory.DriverFactory;
import team3.sweet.logic.utils.ConfigReader;

public class PremiumUserHomePage {
	WebDriver driver;
	String Email;
	String PremUserPassword;
	WebDriverWait wait;
	public PremiumUserHomePage() {
		  
	driver=  DriverFactory.getdriver();
	PageFactory.initElements(driver, this);
	 }
	
	@FindBy(xpath = "//button[normalize-space()='Login']")WebElement btnLogin;
	 @FindBy(xpath = "//input[@name='email']")WebElement emailInputElement;
	 @FindBy(xpath = "//button[text()='Continue with email']")WebElement btnContinueWithEmail;
	 @FindBy(xpath = "//input[@name='password']")WebElement passwordInputElement;
	 @FindBy(xpath = "//button[text()='Sign in']")WebElement btnSignIn;
	 @FindBy(xpath = "//div[@class='flex space-x-8']/button") WebElement navigationSequence;
	//@FindBy(xpath = "//input[@name='password']") 	WebElement passwordField; 
//	@FindBy(xpath = "//button[text()='Sign in']") 	WebElement signInButton; 
	//@FindBy(xpath = "//button[@type='submit']") 	WebElement continueWithEmailButton; 
	@FindBy(xpath = "/html/body/div/div/nav/div/div/button[1]") WebElement homeButton;	
	@FindBy(xpath = "/html/body/div/div/nav/div/div/button[2]") WebElement logbookButton;	
	@FindBy(xpath = "/html/body/div/div/nav/div/div/button[3]")	WebElement dashboardButton;	
	@FindBy(xpath = "/html/body/div/div/nav/div/div/button[4]") WebElement educationButton;	
	@FindBy(xpath = "//button[contains(text(),'🎯 Challenge Yourself Today!')]") 	WebElement flashingChallengeButton; 
	
	@FindBy(xpath = "//img[@alt='Female character illustration']") WebElement genderImg; 	
	@FindBy(xpath = "//span[@class='absolute -top-5 -right-5 text-5xl']") WebElement genderImgEmoji; 	
	@FindBy(xpath = "//div[normalize-space()='Mood: Neutral']") WebElement genderImgLable; 	
	@FindBy(xpath = "//button[normalize-space()='Log']") 	WebElement logButton;	
	@FindBy(xpath = "//button[normalize-space()='Weekly Plan']") 	WebElement weeklyPlanButton;	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[3]/h2") WebElement recordNewData;	
	@FindBy(xpath = "//*[div/div/main/div[3]/div]") 	WebElement allButtonOptionsPresence;	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[3]/div/button[1]") WebElement bloodGlucoseButton;	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[3]/div/button[2]") WebElement physicalActivityButton;	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[3]/div/button[3]") WebElement foodIntakeButton;	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[3]/div/button[4]")	WebElement medicationButton;	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[3]/div/button[1]/svg") WebElement bloodGlucoseIcon;	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[3]/div/button[2]/svg") WebElement physicalActivityIcon;	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[3]/div/button[3]/svg") WebElement foodIntakeIcon;	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[3]/div/button[4]/svg") WebElement medicationIcon;
	////////
	
	////////
	
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div/div/div/p[2]") WebElement preMealCalories_section ;
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div/div[3]/div[2]/div/p") WebElement preMealPreparation_section ;
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div/div[3]/div[1]") WebElement preMealNutrientsInfo_section;
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div/div[1]/div/p[1]") WebElement preMealTime_section;
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div/div[2]/h2") WebElement mainMealTitleformat;
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div/div[2]/p") WebElement mainMealItemDescription;
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div/div[2]/div") WebElement mainMealIngredients;
	@FindBy(linkText = "Diabetes Management Tips") WebElement diabetesManagementTips;
	@FindBy(linkText = "Healthy fats and protein will help prevent blood sugar spikes.") WebElement descriptionDiabetesManagement;
	@FindBy(linkText = "Glycemic Impact:") WebElement glycemicImpact;
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div/div[4]/p[2]") WebElement glycemicImpactValue;
	
	@FindBy(id = "radix-:rn:") WebElement challengePopWindow;
	@FindBy(linkText = "Choose Your Challenge") WebElement challengePopWindowTitle;
	@FindBy(linkText = "Select a program that best fits your health goals") WebElement challengePopWindowSubText;
	@FindBy(xpath = "html/body/div[3]/div[2]/button[1]") WebElement popWindowChallengeButton_1;
	@FindBy(xpath = "html/body/div[3]/div[2]/button[2]") WebElement popWindowChallengeButton_2;
	@FindBy(linkText = "10-Day Challenge") WebElement popWindowChallengeButton_1Text1;
	@FindBy(linkText = "Postprandial Blood Glucose Reduction") WebElement popWindowChallengeButton_1Text2;
	@FindBy(linkText = "4-Week Program") WebElement popWindowChallengeButton_2Text1;
	@FindBy(linkText = "Blood Sugar Reduction Plan") WebElement popWindowChallengeButton_2Text2;
	
	//log
	@FindBy(xpath = "//*[@id=\'root\']/div[1]/main/div[4]/div[3]/div/div[2]/div/button[1]/span") WebElement logEmoji;
	@FindBy(xpath = "//*[@id=\'notes\']") WebElement logTextInputField;
	@FindBy(xpath = "//*[@id=\'root\']/div[1]/main/div[4]/div[3]/div/button") WebElement logEmotionalStateButton;
	
	// //li[contains(@class, 'animate-pulse')] 
	
	
	   public void getNavigationSequence() { 
		    //return navigationSequence.getText();
		    List<String> expectedOrder = Arrays.asList("Home", "Logbook", "Dashboard", "Education");
		   String sequence = navigationSequence.getText();
		    List<WebElement> order = driver.findElements(By.xpath ( "//div[@class='flex space-x-8']/button") );
		    
			// List<WebElement> order = driver.findElements(By.cssSelector("//div[@class='flex space-x-8']/button"));
		    List<String> actualOrder = order.stream()
		        .map(WebElement::getText)
		        .filter(text -> !text.isEmpty())
		        .collect(Collectors.toList());

		    Assert.assertTrue(actualOrder.containsAll(expectedOrder), "order do not match expected list");
	   }
	/*
//navigation pages
	public void navigateToSignIn() {
		List<String> expectedOrder = Arrays.asList("Home", "Logbook", "Dashboard", "Education");

	    //List<WebElement> order = driver.findElements(By.xpath ( "//div[@class='flex space-x-8']") );
		  List<WebElement> order = driver.findElements(By.cssSelector("//div[@class='flex space-x-8']"));
	    List<String> actualOrder = order.stream()
	        .map(WebElement::getText)
	        .filter(text -> !text.isEmpty())
	        .collect(Collectors.toList());

	    Assert.assertTrue(actualOrder.containsAll(expectedOrder), "order do not match expected list");

	}*/
	
	public void Loginbtn() {
		  btnLogin.click();
		  
		  //wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 // wait.until(ExpectedConditions.visibilityOf(btnLogin)).click(); 
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
		 
		 public void getFlashingChallengeButton() {
			 flashingChallengeButton.getText();			 
		 }
		/* public void getanimationChallengeButton() {
		 Object animate;
			flashingChallengeButton.getCssValue(animate);
			//button[class='w-full mb-4 py-3 bg-gradient-to-r from-violet-600 via-purple-600 to-fuchsia-600 
			 //text-white text-lg font-bold rounded-lg shadow-lg
			 //hover:shadow-xl transform hover:-translate-y-1 transition-all duration-200 animate-pulse hover:animate-none']
		 }*/
		 
//		 public void getcssPropChallengeButton() {
//			 cssPropChallengeButton.getText();
//		 }
		 
		 public void genderImg() {
			 genderImg.getText();
		 }
		 public void genderImgEmoji() {
			 genderImgEmoji.getText();
		 }
		 public void genderImgLable() {
			 genderImgLable.getText();
			 genderImgLable.getTagName();
			 genderImgLable.getLocation();
		 }
		 public void getLogButton() {
			 logButton.getText();
		 }
		 public void getWeeklyPlanButton() {
			 weeklyPlanButton.getText();
		 }
		 public void getRecordNewData() {
			 recordNewData.getText();
		 }
		 public void allButtonOptionsPresence() {
				
			// allButtonOptionsPresence.getText();
			// Locate all buttons under "Record New Data"
			    List<WebElement> buttons = driver.findElements(By.xpath(
			        "//div[@class='grid grid-cols-2 md:grid-cols-4 gap-4'/button]"
			        ));
/*
			    // Optional: print their text for debug
			    for (WebElement button : buttons) {
			        System.out.println("Found button: " + button.getText());
			    }
*/
			    // Assert there are exactly 4 buttons
			    Assert.assertEquals(4, buttons.size());
			
		 }
}