package team3.sweet.logic.page.objects;

import java.time.Duration;



import java.util.Arrays;
import java.util.List;

import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class HomePageFeatureFreeUser_Page {
	
	
	private WebDriverWait wait;
	WebDriver driver;
	private JavascriptExecutor js;
	
	@FindBy(xpath = "//button[normalize-space()='Home']")
	public WebElement Homebtn;
	
	@FindBy(xpath = "//button[normalize-space()='Dashboard']")
	public WebElement Dashboardbtn;
	
	@FindBy(xpath = "//button[normalize-space()='Education']")
	public WebElement Educationbtn;
	
	@FindBy(css = ".transition-transform.duration-300.text-violet-600")
	public WebElement TodaylealArrow;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[2]")
	public WebElement Nutritioninsight;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]")
	public WebElement Carbbar;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[2]/div[2]/div[1]/div[2]")
	public WebElement CarbValue;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]")
	public WebElement protienBar;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[2]/div[2]/div[2]/div[2]")
	public WebElement protienValue;
	
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[2]/div[2]/div[3]/div[1]")
	public WebElement FatBar;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[2]/div[2]/div[3]/div[2]")
	public WebElement FatValue;
	
	@FindBy(xpath = "//div[2]/div[1]/button[1]")
	public WebElement BreakfastBtn;
	
	@FindBy(xpath = "//div[2]/div[1]/button[2]")
	public WebElement LunchBtn;
	
	@FindBy(xpath = "//div[2]/div[1]/button[3]")
	public WebElement DinnerBtn;
	
	@FindBy(xpath = "//div[2]/div[1]/button[4]")
	public WebElement SnackBtn;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[3]/div[1]")
	public WebElement PremealTitle;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[3]/div[2]/div/span[1]")
	public WebElement MealTime;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[3]/div[2]/div")
	public WebElement Dotincalories;
	
	@FindBy(xpath = "//div[2]/div/div[1]/div/button")
	public WebElement Viewfullplan;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[1]/p")
	public WebElement Subscriptionpage;
	
	@FindBy(xpath = "//div[2]/div/div[1]/h2")
	public WebElement Todayexceplan;
	
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/div[2]/div[1]")
	public WebElement Moringwalk;
	
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/div[2]/div[1]/div[1]/span")
	public WebElement MoringwalkTime;
	
	@FindBy(xpath = "//div/div[2]/div[1]/div[1]/div/span")
	public WebElement MoringwalkTitle;
	
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/div[2]/div[1]/div[2]")
	public WebElement MoringwalkDuration;
	
	
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/div[2]/div[2]")
	public WebElement Yogasession;
	
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/div[2]/div[2]/div[1]/span")
	public WebElement YogasessionTime;
	
	@FindBy(xpath = "//div[2]/div[2]/div[1]/div/span")
	public WebElement YogasessionTitle;
	
	@FindBy(xpath = "//div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]")
	public WebElement YogasessionDuration;
	
	@FindBy(xpath = "//div[2]//div[2]/div/div[1]/button")
	public WebElement viewfullscheduleBtn;
	
	
	
	
	
	
	
	
	

	

}
