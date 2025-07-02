package team3.sweet.logic.page.objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import team3.sweet.logic.utils.ConfigReader;

public class Launch_Page {
	private WebDriver driver;
	private WebDriverWait wait;
	ConfigReader config = new ConfigReader();
	 public Launch_Page(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        PageFactory.initElements(driver, this);


	}

	
	
	
	
   
    
    @FindBy(xpath = "//div[text()='SweetBalance']")
    WebElement App_Name;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div")
    WebElement Policy_Details;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/section[1]/div/div[1]/h1")
    WebElement Homepage_Heading;
    
    @FindBy(xpath= "//*[@id=\"root\"]/div[1]/main/section[1]/div/div[2]/button")
    WebElement Start_Today;
    
    
    @FindBy(xpath ="//h2[text()='Comprehensive Diabetes Management Tools']")
    WebElement Comprehensive_Tools;
    
    
    @FindBy(xpath="//h3[text()='Health Tracking']")
    WebElement Health_Tracking;
    
    
    @FindBy(xpath="//h3[text()='Nutrition & Exercise']")
    WebElement Nutrition_Excercise;
    
    
    @FindBy(xpath="//h3[text()='Smart Insights']")
    WebElement Smart_Insights;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/main/section[2]/div/div[2]/div[1]")
    WebElement Description_HealthTracking;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/main/section[2]/div/div[2]/div[2]")
    WebElement Description_NutritionExcercise;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/main/section[2]/div/div[2]/div[3]")
    WebElement Description_SmartInsights;
    
    @FindBy(xpath="//*[local-name()='svg' and contains(@class, 'lucide-heart')]")
    WebElement Heart_Icon;
    
    @FindBy(xpath="//*[local-name()='svg' and contains(@class,  'lucide-square')]")
    WebElement Square_Icon;
    
    
    @FindBy(xpath="//*[local-name()='svg' and contains(@class,  'lucide-clock ')]")
    WebElement Clock_Icon;
    
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/main/section[3]/div/div[2]/div[1]/div/p")
    WebElement JamesD_Testimonial;
    
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/main/section[3]/div/div[2]/div[2]/div/p")
    WebElement MariaL_Testimonial;
    
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/main/section[3]/div/div[2]/div[3]/div/p")
    WebElement RoberT_Testimonial;
    
    
    @FindBy(xpath="//p[text()='Join our community of successful members']")
    WebElement JoinOur_CommunityText;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/main/section[3]/div/div[1]/div")
    WebElement FiveStars_JoinOurCommunityText;
    
    @FindBy(xpath="(//p[text()='James D.']/following::div)[1]//*[local-name()='svg' and contains(@class, 'lucide-star')]")
    WebElement FiveStars_JamesD;
    
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/main/section[3]/div/div[2]/div[2]/div/div/div[2]/div")
    WebElement FiveStars_MariaL;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/main/section[3]/div/div[2]/div[3]/div/div/div[2]/div")
    WebElement FiveStars_RobertD;
    
    
    @FindBy(xpath="//h2[text()='Take control of your diabetes today']")
    WebElement TakeControl_DiabetesText;
    
    
    @FindBy(xpath="//button[contains(., 'Check Your Risk')]")
    WebElement CheckYourRisk_Button;
    
    @FindBy(xpath="//button[contains(., ' Login')]")
    WebElement Login_Link;
    
    public String AppName() {
    	return App_Name.getText();
    }
    public boolean isPolicyDetailsDisplayed() {
    	return  Policy_Details.isDisplayed();
    }
    public boolean isHomepageheadingisDisplayed() {
    	return Homepage_Heading.isDisplayed();
    }
    public boolean isStartTodayisDisplayed() {
    	return Start_Today.isDisplayed();
    }
    public String ComprehensiveTools() {
    	return Comprehensive_Tools.getText();
    }
    public void CheckYourRisk() {
    	CheckYourRisk_Button.click();
    }
    
    public void Login() {
    	Login_Link.click();
    }
}