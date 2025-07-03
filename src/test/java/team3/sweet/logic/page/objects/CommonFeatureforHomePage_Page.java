package team3.sweet.logic.page.objects;

import java.time.Duration;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import team3.sweet.logic.utils.ConfigReader;
import team3.sweet.logic.utils.LoggerLoad;


public class CommonFeatureforHomePage_Page {
		
	private WebDriver driver;
    private WebDriverWait wait;
  
    ConfigReader config = new ConfigReader();
    public CommonFeatureforHomePage_Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

	
	@FindBy(xpath = "//div[1]/header/div/div[2]/button")
	public WebElement loginbtn;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement EmailIdbox;
	
	@FindBy(xpath = "//div[1]/div/div[2]/form/button")
	public WebElement Continuewithemail;
	
	@FindBy(xpath = "//*[@type=\"password\"]")
	public WebElement password;
	
	@FindBy(xpath = "//*[@type=\"submit\"]")
	public WebElement siginbtn;
	
	@FindBy(xpath = "//span[@class='text-white font-semibold']")
	public WebElement Apptitle;
	
	@FindBy(xpath = "//span[@class='text-white/80']")
	public WebElement UserName;
	
	@FindBy(xpath = "//button[normalize-space()='Logout']")
	public WebElement Logout;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/nav")
	public WebElement Navigationbar;
	
	@FindBy(xpath = "//button[normalize-space()='Home']")
	public WebElement Home;
	
	@FindBy(xpath = "//button[normalize-space()='Dashboard']")
	public WebElement Dashboard;
	
	@FindBy(xpath = "//button[normalize-space()='Education']")
	public WebElement Education;
	
	@FindBy(xpath = "//div[1]/main/div[1]/div[1]/h3")
	public WebElement currentstatus;
	
	@FindBy(xpath = "//main/div[1]/div[1]/div")
	public WebElement Lastupdated;
	
	@FindBy(xpath = "//main/div[1]/div[1]/div")
	public WebElement timeindicator;
	
	@FindBy(xpath = "//div[normalize-space()='Latest HbA1C']")
	public WebElement LatestHbA1c;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div[1]/div/div[2]/div[2]")
	public WebElement LatestHbA1c_Unit;
	
	@FindBy(xpath = "//div[normalize-space()='BMI']")
	public WebElement BMI;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div[2]/div/div[2]/div[2]")
	public WebElement BMI_Unit;
	
	@FindBy(xpath = "//div[normalize-space()='Average Blood Sugar']")
	public WebElement AvBSugar;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div[3]/div/div[2]/div[2]")
	public WebElement AvBSugar_Unit;
	
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/div[1]/button/h2")
	public WebElement TodaymealPlan;
	
	@FindBy(xpath = "//button[normalize-space()='Breakfast']")
	public WebElement Breakfast;
	
	@FindBy(xpath = "//button[normalize-space()='Lunch']")
	public WebElement Lunch;
	
	@FindBy(xpath = "//button[normalize-space()='Dinner']")
	public WebElement Dinner;
	
	@FindBy(xpath = "//button[normalize-space()='Snacks']")
	public WebElement Snack;
	
	@FindBy(xpath = "//div[@class='flex flex-col space-y-2 p-4']")
	public WebElement Flexcontainer;
	
	@FindBy(xpath = "//span[normalize-space()='Meal Plan']")
	public WebElement MealPlanicontext;
	
	@FindBy(xpath = "//span[normalize-space()='Exercise']")
	public WebElement Excerciseicontext;
	
	@FindBy(xpath = "//*[@class ='lucide lucide-utensils-crossed h-6 w-6 mx-auto']")
	public WebElement MealPlaniconimage;
	
	@FindBy(xpath = "//*[@class ='lucide lucide-dumbbell h-6 w-6 mx-auto']")
	public WebElement Excerciseiconimage;
	
	@FindBy(xpath = "//button[normalize-space()='View Full Plan']")
	public WebElement Viewfullplan;
	
	@FindBy(xpath = "//div[normalize-space()='Pre-Breakfast']")
	public WebElement Breakfastdetails;

	@FindBy(xpath = "//button[normalize-space()='Lunch']")
	public WebElement Lunchdetails;
	
	@FindBy(xpath = "//button[normalize-space()='Dinner']")
	public WebElement Dinnerdetails;
	
	@FindBy(xpath = "//button[normalize-space()='Snacks']")
	public WebElement Snackdetails;
	
	@FindBy(xpath = "//div[1]/main/div[2]//div[2]//div[2]/div[2]/div/div[1]//h3")
	public WebElement Dishtitle;
	
	@FindBy(xpath = "//div[1]/main/div[2]//div[2]//div[2]/div[2]/div/div[1]/div/div")
	public WebElement DishDescription;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[3]/div[2]/h4")
	public WebElement PremealItemname;
	
	@FindBy(xpath = "//div[3]/div[2]/div/span[3]")
	public WebElement caloriesvalue;
	
	@FindBy(xpath = "//div[3]/div[2]/div/span[1]")
	public WebElement MealTimeIndicatorAMPM;
	
	@FindBy(xpath = "//span[normalize-space()='7:00 PM']")
	public WebElement DinnerTimeIndicatorAMPM;
	
	@FindBy(xpath = "//span[normalize-space()='3:00 PM']")
	public WebElement SnacksTimeIndicatorAMPM;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div")
	public WebElement Carbcolor;
	
	@FindBy(xpath = "//div[@class='h-2 rounded-full bg-pink-500']")
	public WebElement protiencolor;
	
	@FindBy(xpath = "//div[2]/div[2]/div[3]/div[1]/div")
	public WebElement fatcolor;
	
	@FindBy(xpath = "//div[2]//div[2]/div[2]//div[2]/div[2]/div[1]/div[2]")
	public WebElement CarbUnit;
	
	@FindBy(xpath = "//div[2]//div[2]/div[2]//div[2]/div[2]/div[2]/div[2]")
	public WebElement Protienunit;
	
	@FindBy(xpath = "//div[2]//div[2]/div[2]//div[2]/div[2]/div[3]/div[2]")
	public WebElement Fatunit;
	
	@FindBy(xpath = "//div[2]/div/div[3]/div[2]/div/span[3]")
	public WebElement MealCalories;
	
	
public void LoginPage() {
	loginbtn.click(); 
}
public void Login() {		
	    EmailIdbox.sendKeys("sweetbalance456@gmail.com");
	    Continuewithemail.click();
	    password.sendKeys("India@456");
	    siginbtn.click();
	}
public void Logout() {	
	Logout.click(); 
}
public String getAppNameText() {
    return Apptitle.getText();
}
public String getLoggedInUserName() {
    return UserName.getText().trim();
}
public boolean isLogoutButtonVisible() {
    boolean visible = Logout.isDisplayed();
    LoggerLoad.info("Logout Button: " + visible);
    return visible;    
}
public boolean isNavigationBarVisible() {
    return Navigationbar.isDisplayed();
}
public boolean isHomeTabVisible() {
    return Home.isDisplayed();
}
public boolean isDashboradTabVisible() {
    return Dashboard.isDisplayed();
}
public boolean isEducationTabVisible() {
    return Education.isDisplayed();
}
public boolean iscurrentStatusVisible() {
    return currentstatus.isDisplayed();
}
public boolean isLastupdatedVisible() {
    return Lastupdated.isDisplayed();
}
public boolean isTimenextcurrentstatusVisible() {
    return timeindicator.isDisplayed();
}
public String getLastUpdatedTimestampText() {
	String fullText = MealTimeIndicatorAMPM.getText();  // "Last updated: 2h ago"
    // Assuming it's always "Last updated: <time>"
    String[] parts = fullText.split(":", 2);
    if (parts.length == 2) {
        return parts[1].trim(); // returns "2h ago"
    } else {
        return fullText; // fallback
    }
}
public boolean hasAMorPM() {
    String time = getLastUpdatedTimestampText();
    return time.toUpperCase().contains("AM") || time.toUpperCase().contains("PM");
}
public boolean isHbA1CVisible() {
    return LatestHbA1c.isDisplayed();
}
public boolean isBMILableVisible() {
    return BMI.isDisplayed();
}
public boolean AvgBloodSugarvalueVisible() {
    return AvBSugar_Unit.isDisplayed();
}
public boolean isAverageBloodSugarUnitVisible() {
    return AvBSugar_Unit.isDisplayed();
}

public String getAverageBloodSugarUnitText() {
    return AvBSugar_Unit.getText().trim(); // e.g. "mg/dL"
}
public boolean isTodaymealplanVisible() {
    return TodaymealPlan.isDisplayed();
}
public boolean isBreakfastElement(String expectedText) {
	return Breakfast.getText().trim().equals(expectedText);
}

public boolean isLunchElement(String expectedText) {
	return Lunch.getText().trim().equals(expectedText);
}
public boolean isDinnerElement(String expectedText) {
	return Dinner.getText().trim().equals(expectedText);
}
public boolean isSnackElement(String expectedText) {
	return Snack.getText().trim().equals(expectedText);
}
public boolean isBreakfastTabSelected() {
    return Breakfast.isDisplayed();
}
public boolean isFlexTabSelected() {
    return Flexcontainer.isDisplayed();
}
public boolean isMealPlanLabelVisible() {
    return MealPlanicontext.isDisplayed();
}
public boolean isExcerciseLabelVisible() {
    return Excerciseicontext.isDisplayed();
}
public boolean isMealplanIconVisible() {
    return MealPlaniconimage.isDisplayed();
}
public boolean isExcerciseIconVisible() {
    return Excerciseiconimage.isDisplayed();
}
public boolean isViewfullplanBtnVisible() {
    return Viewfullplan.isDisplayed();
}
public void BreakfastPage() {
	Breakfast.click(); 
}
public boolean isBreakfastPageVisible() {
    return Viewfullplan.isDisplayed();
}
public String getBreakfastSectionText() {
    return Breakfastdetails.getText().trim();
}
public boolean isBreakfastSectionVisible() {
    return Breakfastdetails.isDisplayed();
}
public void LunchPage() {
	Lunch.click(); 
}
public String getLunchSectionText() {
    return Lunchdetails.getText().trim();
}
public boolean isLunchSectionVisible() {
    return Lunchdetails.isDisplayed();
}
public void DinnerPage() {
	Dinner.click(); 
}
public String getDinnerSectionText() {
    return Dinnerdetails.getText().trim();
}
public boolean isDinnerSectionVisible() {
    return Dinnerdetails.isDisplayed();
}
public void SnackPage() {
	Snack.click(); 
}
public String getSnackSectionText() {
    return Snackdetails.getText().trim();
}
public boolean isSnackSectionVisible() {
    return Snackdetails.isDisplayed();
}
public boolean isDishTitleVisible() {
    return Dishtitle.isDisplayed();
}
public boolean isDishDescVisible() {
    return DishDescription.isDisplayed();
}
public boolean isPremealItemVisible() {
    return PremealItemname.isDisplayed();
}
public boolean isPremealCaloriesVisible() {
    return caloriesvalue.isDisplayed();
}
public String getMealIndicatorText() {
    return MealTimeIndicatorAMPM.getText().trim();
}
public String getDinnerTimeFormat() {
    return DinnerTimeIndicatorAMPM.getText().trim();
}
public String getSnackTimeFormat() {
    return SnacksTimeIndicatorAMPM.getText().trim();
}
public String getCarbsBarBackgroundColor() {
    return Carbcolor.getCssValue("background-color");
}
public String getFatBarBackgroundColor() {
    return fatcolor.getCssValue("background-color");
}
public String getProtiesBarBackgroundColor() {
    return Protienunit.getCssValue("background-color");
}
public String getCarbsMeasurementText() {
    return CarbUnit.getText().trim();
}
public String getProtienMeasurementText() {
    return Protienunit.getText().trim();
}
public String getFatMeasurementText() {
    return Fatunit.getText().trim();
}
public boolean isMealCaloriesVisible() {
    return MealCalories.isDisplayed();
}
public String getMealCaloriesText() {
    return MealCalories.getText().trim();
}

}


	
	
	
	
	
	
	
	
	
	
	
	
	


