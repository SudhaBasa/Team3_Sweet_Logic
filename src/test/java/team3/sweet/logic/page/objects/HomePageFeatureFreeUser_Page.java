package team3.sweet.logic.page.objects;

import java.time.Duration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.stream.Collectors;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;


import team3.sweet.logic.utils.ConfigReader;



public class HomePageFeatureFreeUser_Page {
	
	private WebDriver driver;
	private WebDriverWait wait;
  
    ConfigReader config = new ConfigReader();
    public HomePageFeatureFreeUser_Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }


	@FindBy(xpath = "//button[normalize-space()='Home']")
	public WebElement Homebtn;
	
	@FindBy(xpath = "//button[normalize-space()='Dashboard']")
	public WebElement Dashboardbtn;
	
	@FindBy(xpath = "//button[normalize-space()='Education']")
	public WebElement Educationbtn;
	
	@FindBy(xpath = "//button[@class='flex items-center space-x-1 group']//*[name()='svg']")
	public WebElement TodayMealArrow;
	
	@FindBy(xpath = "//div[normalize-space()='Nutrition Insights']")
	public WebElement Nutritioninsight;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]")
	public WebElement Carbbar;
	
	@FindBy(xpath = "//div[@class='text-xs text-gray-600 mt-1' and contains(normalize-space(), 'Carbs:')]")
	public WebElement CarbValue;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]")
	public WebElement protienBar;
	
	@FindBy(xpath = "//div[@class='text-xs text-gray-600 mt-1' and starts-with(normalize-space(), 'Protein:')]")
	public WebElement protienValue;
	
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]")
	public WebElement FatBar;
	
	@FindBy(xpath = "//div[@class='text-xs text-gray-600 mt-1' and starts-with(normalize-space(), 'Fat:')]")
	public WebElement FatValue;
	
	@FindBy(xpath = "//button[normalize-space()='Breakfast']")
	public WebElement BreakfastBtn;
	
	@FindBy(xpath = "//button[normalize-space()='Lunch']")
	public WebElement LunchBtn;
	
	@FindBy(xpath = "//button[normalize-space()='Dinner']")
	public WebElement DinnerBtn;
	
	@FindBy(xpath = "//button[normalize-space()='Snacks']")
	public WebElement SnackBtn;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[3]/div[1]")
	public WebElement PremealTitle;
	
	@FindBy(xpath = "//span[contains(., 'AM') or contains(., 'PM')]")
	public WebElement MealTime;
	
	@FindBy(xpath = "//div[@class='flex items-center text-gray-600 text-sm mt-1']")
	public WebElement Dotincalories;
	
	@FindBy(xpath = "//div[@class='flex items-center text-gray-600 text-sm mt-1']")
	public List<WebElement> PreMealSections;
	
	@FindBy(xpath = "//button[normalize-space()='View Full Plan']")
	public WebElement Viewfullplan;
	
	@FindBy(xpath = "//h1[normalize-space()='Free vs. Premium Account Features']")
	public WebElement Subscriptionpage;
	
	@FindBy(xpath = "//h2[@class='text-xl font-bold bg-gradient-to-r from-violet-600 to-fuchsia-600 bg-clip-text text-transparent']")
	public WebElement TodayexceplanTitle;
	
	@FindBy(xpath = "//button[@class='p-4 rounded-lg transition-all duration-300 hover:bg-white/50 text-gray-600']")
	public WebElement ExcerciseIcon;
			
	@FindBy(xpath = "//span[normalize-space()='Morning Walk']")
	public WebElement Moringwalk;
	
	@FindBy(xpath = "//span[normalize-space()='7:00 AM']")
	public WebElement MoringwalkTime;
		
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/div[2]/div[1]/div[2]")
	public WebElement MoringwalkDuration;
		
	@FindBy(xpath = "//span[normalize-space()='Yoga Session']")
	public WebElement Yogasession;
	
	@FindBy(xpath = "//span[normalize-space()='5:00 PM']")
	public WebElement YogasessionTime;
	
	@FindBy(xpath = "//div[2]/div[2]/div[1]/div/span")
	public WebElement YogasessionTitle;
	
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]")
	public WebElement YogasessionDuration;
	
	@FindBy(xpath = "//span[contains(., ':') and (contains(., 'AM') or contains(., 'PM'))]")
	public List<WebElement> ExerciseTimes;
			
	@FindBy(xpath = "//button[normalize-space()='View Full Schedule']")
	public WebElement viewfullscheduleBtn;
	
	public List<WebElement> getNavigationElementsInOrder() {
        return Arrays.asList(Homebtn, Dashboardbtn, Educationbtn);
    }

	public List<String> getNavigationTextsInOrder() {
        return Arrays.asList(Homebtn, Dashboardbtn, Educationbtn)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList());
    }
	public boolean verifyNavigationBarOrder(String expectedOrder) {
        String[] expectedTabs = expectedOrder.split(", ");
        String actualOrder = "";

        // Collect the text from the web elements in their displayed order
        // This assumes the elements are found in the DOM in the order they appear visually.
        // For more robust checking, you might need to get their locations and sort.
        if (Homebtn.isDisplayed()) {
            actualOrder += Homebtn.getText();
        }
        if (Dashboardbtn.isDisplayed()) {
            if (!actualOrder.isEmpty()) actualOrder += ", ";
            actualOrder += Dashboardbtn.getText();
        }
        if (Educationbtn.isDisplayed()) {
            if (!actualOrder.isEmpty()) actualOrder += ", ";
            actualOrder += Educationbtn.getText();
        }

        System.out.println("Expected Order: " + expectedOrder);
        System.out.println("Actual Order: " + actualOrder);

        return actualOrder.equals(expectedOrder);
	}
	public boolean isTodaymeaArrow() {
	    return TodayMealArrow.isDisplayed();
	}
	
	public boolean verifyNutritionInsightsForAllTabs() {
	    List<WebElement> tabs = Arrays.asList(BreakfastBtn, LunchBtn, DinnerBtn, SnackBtn);
	    for (WebElement tab : tabs) {
	        tab.click();
	        // optionally wait for content to load
	        try {
	            Thread.sleep(500); // or use WebDriverWait for more stability
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	        if (!Nutritioninsight.isDisplayed()) {
	            System.out.println("Nutrition Insights heading missing on tab: " + tab.getText());
	            return false;
	        }
	    }
	    return true;
	}
	public boolean verifyNutritionBarsPresent() {
	    return Carbbar.isDisplayed() && protienBar.isDisplayed() && FatBar.isDisplayed();
	}
	public void verifyNutritionBarsPresentWithAssert() {
	    if (!Carbbar.isDisplayed()) {
	        throw new AssertionError("Carb bar not displayed");
	    }
	    if (!protienBar.isDisplayed()) {
	        throw new AssertionError("Protein bar not displayed");
	    }
	    if (!FatBar.isDisplayed()) {
	        throw new AssertionError("Fat bar not displayed");
	    }
	}
	public void scrollToBreakFastTab() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BreakfastBtn);
    }
	public List<WebElement> getMealTabs() {
        return Arrays.asList(BreakfastBtn, LunchBtn, DinnerBtn, SnackBtn);
    }

    public void clickMealTab(WebElement tab) {
        tab.click();
    }
  
    public WebElement getPremealTitle() {
        return PremealTitle;
    }

    public String getPremealTitleText() {
        return PremealTitle.getText();
    }
    public boolean isCarbValueDisplayed() {
        return CarbValue.isDisplayed();
    }
    public String getCarbValueText() {
        return CarbValue.getText().trim();
    }
    public boolean isProtienValueDisplayed() {
        return protienValue.isDisplayed();
    }
    public String getProteinValueText() {
        return protienValue.getText().trim();
    }
    public boolean isFatValueDisplayed() {
        return FatValue.isDisplayed();
    }
    public String getFatValueText() {
        return FatValue.getText().trim();
    }
    public boolean isMealTimeDisplayed() {
        return MealTime.isDisplayed();
    }
    public String getMealTimeText() {
        return MealTime.getText().trim();
    }
    public void clickSnackButton() {
        SnackBtn.click();
    }
    public String getDotInCaloriesText() {
        return Dotincalories.getText().trim();
    }
    public List<String> getPreMealSectionTexts() {
        List<String> texts = new ArrayList<>();
        for (WebElement element : PreMealSections) {
            texts.add(element.getText().trim());
        }
        return texts;
    }
    public void clickViewFullPlan() {
    	Viewfullplan.click();
    }
    public boolean isSubscriptionDisplayed() {
        return Subscriptionpage.isDisplayed();
    }
    public void clickExcerciseIcon() {
    	ExcerciseIcon.click();
    }
    public String getTodaysExcercisePlanText() {
        return TodayexceplanTitle.getText().trim();
    }
    public boolean isMorningWalkDisplayed() {
        return Moringwalk.isDisplayed();
    }
    public boolean isYogaSessionDisplayed() {
        return Yogasession.isDisplayed();
    }
    public String getMorningwalkScheduleTimeText() {
        return MoringwalkTime.getText().trim();
    }
    public String getYogaScheduleTimeText() {
        return YogasessionTime.getText().trim();
    }
    public boolean isMorningExcerDurationDisplayed() {
        return MoringwalkDuration.isDisplayed();
    }
    public boolean isYogaSessionDurationDisplayed() {
        return YogasessionDuration.isDisplayed();
    }
    public boolean isViewFullSchedulebuttonDisplayed() {
        return viewfullscheduleBtn.isDisplayed();
    }
    public String getViewFullSchedulebuttonText() {
        return viewfullscheduleBtn.getText().trim();
    }
    public void clickViewFullSchedulebutton() {
    	viewfullscheduleBtn.click();
    }
    
    
	
	
	
	
	
	
	
	
	
	

	

}
