package team3.sweet.logic.page.objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import team3.sweet.logic.utils.ConfigReader;

public class Subscription_Page {
	private WebDriver driver;
	private WebDriverWait wait;
	ConfigReader config = new ConfigReader();
	 public Subscription_Page(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        PageFactory.initElements(driver, this);


	}

@FindBy(xpath="//td[text()='Daily Meal Plan']/following::td[1]")
WebElement DailyMeal_FreeAccount;

@FindBy(xpath="//td[text()='Daily Meal Plan']/following::td[1]/following::td[1]")
WebElement DailyMeal_PremiumAccount;

 @FindBy(xpath="//td[text()='Weekly Meal Plan']/following::td[1]/following::td[1]")             
WebElement WeeklyMeal_PremiumAccount;
 
 @FindBy(xpath="//td[text()='Personalized Exercise Plan']/following::td[1]/following::td[1]")
WebElement PersonalizedExcercise_PremiumAccount;
 
 @FindBy(xpath="//td[text()='10-Day Quick Reversal Plan']/following::td[1]/following::td[1]")
 WebElement TenDayQuickReversalPlan_PremiumAccount;
 
 @FindBy(xpath="//td[text()='30-Day Blood Sugar Reduction Plan']/following::td[1]/following::td[1]")
 WebElement BloodSugarReduction_PremiumAccount;
 
 @FindBy(xpath="//td[text()='Glucose Level Graph']/following::td[1]")
 WebElement GlucoseLevelGraph_FreeAccount;
 
 @FindBy(xpath="//td[text()='Glucose Level Graph']/following::td[1]/following::td[1]")
 WebElement GlucoseLevelGraph_PremiumAccount;
 
 @FindBy(xpath="//td[text()='BMI Calculation']/following::td[1]")
 WebElement BMICalculation_FreeAccount;
 
 @FindBy(xpath="//td[text()='BMI Calculation']/following::td[1]/following::td[1]")
 WebElement BMICalculation_PremiumAccount;
 
 @FindBy(xpath="//td[text()='Downloadable Meal Plan PDF']/following::td[1]/following::td[1]")
 WebElement DownloadableMealPlan_PremiumAccount;
 
 @FindBy(xpath="//td[text()='Reminders (Medication, Appointments, Health Tasks)']/following::td[1]/following::td[1]")
 WebElement RemindersAvailability_PremiumAccount;
 
 @FindBy(xpath="//button[text()='Continue Free']")
 WebElement ContinueFree_AccountButton;
 
 @FindBy(xpath="//button[text()='Upgrade to Premium']")
 WebElement UpgradetoPremium_AccountButton;
 
 @FindBy(xpath="//span[contains(@class,'text-emerald-500 text-xl font-bold')]")
 WebElement GreenCheck_Marks;
 
 @FindBy(xpath="//span[contains(@class,'text-red-500 text-xl font-bold')]")
 WebElement RedCheck_Marks;
 
 @FindBy(xpath="//th[text()='Free Account']")
 WebElement FreeAccount_Amount;
 
 @FindBy(xpath="//th[text()='Premium Account']")
 WebElement PremiumAccount_Amount;
 
 
 
 @FindBy(xpath="//tr[contains(@class,'hover:bg-purple-50/50 transition-colors duration-200')]")
 WebElement Features_List;
 
 @FindBy(xpath="//p[text()='Upgrade to premium for complete diabetes management']")
 WebElement UpgradetoPremium_Text;
 
@FindBy(xpath="//table[contains(@class,'w-full border-collapse')]")
WebElement VisualSeparation_FreePremium;

@FindBy(xpath="//h1[text()='Upgrade to Premium']")
WebElement UpgradetoPremium_Title;

@FindBy(xpath="//p[text()='Get personalized insights and advanced features to better manage your diabetes.']")
WebElement GetPersonalized_Text;

@FindBy(xpath="//li[.//span[text()='✓']]")
WebElement SubText_List;

@FindBy(xpath="//p[text()='$' or text()='9.99' or text()='/month']")
WebElement PremiumSubscription_Price;

@FindBy(xpath="//p[text()='Cancel anytime']")
WebElement CancelAnytime_Text;

@FindBy(xpath="//label[text()='Card Number']")
WebElement CardNumber_Text;

@FindBy(xpath="//div[contains(@class,'grid grid-cols-2 gap-4')]")
WebElement ExpirationDate_CVCField;

@FindBy(id="card-number")
WebElement CardNumber_Field;

@FindBy(xpath="//button[text()='Pay $' or text()='9.99' or text()='USD']")
WebElement NineDollar_Button;

@FindBy(className="text-xs text-gray-500 mt-6")
WebElement AutoRenewal_Notice;



}

