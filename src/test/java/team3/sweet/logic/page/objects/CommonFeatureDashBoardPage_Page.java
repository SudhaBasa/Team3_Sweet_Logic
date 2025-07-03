package team3.sweet.logic.page.objects;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class CommonFeatureDashBoardPage_Page {
	
	
	private WebDriver driver;
    private WebDriverWait wait;
  
    ConfigReader config = new ConfigReader();
    public CommonFeatureDashBoardPage_Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

	
	@FindBy(xpath = "//button[normalize-space()='Dashboard']")
	public WebElement Dashboardbtn;
	
	@FindBy(xpath = "//div[1]/main/div[1]/div[1]/h3")
	public WebElement WelcomeBacktext;
	
	@FindBy(xpath = "//div[1]/main/div[1]/div[2]/p")
	public WebElement Welcomemessage;
	
	@FindBy(xpath = "//div[1]/main/div[1]/div[2]/button")
	public WebElement Upgradetopremium;
	
	@FindBy(xpath = "//div[2]/div/div[1]/span")
	public WebElement Accountinformation;
	
	@FindBy(xpath = "//button[normalize-space()='Save Changes']")
	public WebElement Savechanges;
	
	@FindBy(xpath = "//label[normalize-space()='Age']")
	public WebElement Age;
	
	@FindBy(xpath = "//*[@id=\"age\"]")
	public WebElement AgeValue;
	
	@FindBy(xpath = "//label[normalize-space()='Height (cm)']")
	public WebElement Height;
	
	@FindBy(xpath = "//*[@id=\"height\"]")
	public WebElement HeightValue;
	
	@FindBy(xpath = "//label[normalize-space()='Weight (kg)']")
	public WebElement Weight;
	
	@FindBy(xpath = "//*[@id=\"weight\"]")
	public WebElement WeightValue;
	
	@FindBy(xpath = "//label[normalize-space()='Exercise Routine Level']")
	public WebElement Excerciseroutine;
	
	@FindBy(xpath = "//*[@id=\"radix-:r0:\"]/div/div[1]")
	public WebElement Easy;
	
	@FindBy(xpath = "//*[@id=\"radix-:r0:\"]/div/div[2]")
	public WebElement Medium;
	
	@FindBy(xpath = "//*[@id=\"radix-:r0:\"]/div/div[3]")
	public WebElement Hard;
		
	@FindBy(xpath = "//*[@id=\"radix-:r0:\"]/div")
	private List<WebElement> listOfExcerciseRotuinelevel;
		
	@FindBy(xpath = "//button[@id='exerciseLevel']")
	public WebElement ExcerciseroutineValue;
	
	@FindBy(xpath = "//*[@id=\"exerciseLevel\"]/svg")
	public WebElement Excercisearrow;
	
	@FindBy(xpath = "//label[normalize-space()='Cuisine Preferences']")
	public WebElement CuisinePref;
	
	@FindBy(xpath = "//*[@id=\"cuisinePreference\"]")
	public WebElement CuisinePrefBox;
	
	@FindBy(xpath = "//*[@id=\"radix-:r1:\"]/div/div[1]")
	public WebElement Indian;
	
	@FindBy(xpath = "//*[@id=\"radix-:r1:\"]/div/div[2]")
	public WebElement American;
	
	@FindBy(xpath = "//*[@id=\"radix-:r1:\"]/div/div[3]")
	public WebElement Continental;
	
	@FindBy(xpath = "//*[@id=\"radix-:r1:\"]/div/div[4]")
	public WebElement Mediterranean;
	
	@FindBy(xpath = "//*[@id=\"radix-:r1:\"]/div/div[5]")
	public WebElement Asian;
	
	@FindBy(xpath = "//*[@id=\"radix-:r1:\"]/div/div[6]")
	public WebElement MiddleEastern;
	
	@FindBy(xpath = "//*[@id=\"radix-:r1:\"]/div/div[7]")
	public WebElement Mexican;
	
	@FindBy(xpath = "//label[normalize-space()='Food Allergies']")
	public WebElement Allergies;
	
	@FindBy(xpath = "//*[@id=\"allergies\"]")
	public WebElement AllergiesBox;
	
	@FindBy(xpath = "//*[@id=\"radix-:r2:\"]/div/div[1]")
	public WebElement None;
	
	@FindBy(xpath = "//*[@id=\"radix-:r2:\"]/div/div[2]")
	public WebElement Dairy;
	
	@FindBy(xpath = "//*[@id=\"radix-:r2:\"]/div/div[3]")
	public WebElement Gluten;
	
	@FindBy(xpath = "//*[@id=\"radix-:r2:\"]/div/div[4]")
	public WebElement Shellfish;
	
	@FindBy(xpath = "//*[@id=\"radix-:r2:\"]/div/div[5]")
	public WebElement Soy;
	
	@FindBy(xpath = "//*[@id=\"radix-:r2:\"]/div/div[6]")
	public WebElement Eggs;
	
	@FindBy(xpath = "//*[@id=\"radix-:r2:\"]/div/div[7]")
	public WebElement Nuts;
	
	@FindBy(xpath = "//*[@id=\"radix-:r2:\"]/div/div[8]")
	public WebElement Other;
	
	@FindBy(xpath = "//*[@id='radix-:r2:']/div/div")
	public List<WebElement> foodAllergyOptions;
			
	@FindBy(xpath = "//li[@role='status']")
	public WebElement Errormsg;
	
	@FindBy(xpath = "//li[@role='status']")
	public WebElement Successmsg;
	
	@FindBy(xpath = "//span[@class='text-xl font-medium text-black flex items-center']")
	public WebElement StressmanagementTech;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:-trigger-meditation\"]")
	public WebElement Medidation;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:-content-meditation\"]/div")
	public WebElement MedidationContent;
			
	@FindBy(xpath = "//*[@id=\"radix-:r3:-trigger-breathing\"]")
	public WebElement Breathing;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:-content-breathing\"]/div")
	public WebElement BreathingContent;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:-trigger-movement\"]")
	public WebElement Movement;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:-content-movement\"]/div")
	public WebElement MovementContent;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:-trigger-mindfulness\"]")
	public WebElement Mindfullness;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:-content-mindfulness\"]/div")
	public WebElement MindfullnessContent;
	
	@FindBy(xpath = "//nav/div/div/button[1]")
	public WebElement HomeNav;
	
	@FindBy(xpath = "///main/div[1]/div[1]/h3")
	public WebElement HomeScreen;
	
	@FindBy(xpath = "//nav/div/div/button[2]")
	public WebElement DashboardNav;
	
	@FindBy(xpath = "//main/div[1]/div[1]/h3")
	public WebElement DashboarScreen;
	
	@FindBy(xpath = "//nav/div/div/button[3]")
	public WebElement EducationNav;
	
	@FindBy(xpath = "//div[1]/div/div[1]/h1")
	public WebElement EducationScreen;
	
	@FindBy(xpath = "//h3[normalize-space()='Guided Meditation']")
	public WebElement Guidedmeditation;
	
	@FindBy(xpath = "//button[normalize-space()='5 min']")
	public WebElement fiveminbtn;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:-content-meditation\"]/div/div/div[1]/div/button[2]")
	public WebElement tenminbtn;
	
	@FindBy(xpath = "//button[normalize-space()='15 min']")
	public WebElement fifteenminbtn;
	
	@FindBy(xpath = "//div[@role='progressbar']")
	public WebElement Prgogressbar;
	
	@FindBy(xpath = "//span[normalize-space()='0:00']")
	public WebElement Time00Indicator;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:-content-meditation\"]/div/div/div[2]/div/div[3]/span[1]")
	public WebElement Time00IndicatorProgress;
		
	@FindBy(xpath = "//span[normalize-space()='5:00']")
	public WebElement Time5Indicator;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:-content-meditation\"]/div/div/div[2]/div/div[1]/button")
	public WebElement Playbtn;
	
	@FindBy(xpath = "//h3[normalize-space()='Gentle Movement']")
	public WebElement gentlemovement;
	
	@FindBy(xpath = "//p[@class='text-sm text-black/80 mb-4 ']")
	public WebElement Simplestrechtext;
	
	@FindBy(xpath = "//li[contains(text(),'• Neck rolls - 5 times each direction')]")
	public WebElement Neckstrech;
	
	@FindBy(xpath = "//li[contains(text(),'• Shoulder circles - 10 times')]")
	public WebElement shouldercircle;
	
	@FindBy(xpath = "//li[contains(text(),'• Wrist and ankle rotations')]")
	public WebElement Wristankle;
	
	@FindBy(xpath = "//li[contains(text(),'• Gentle torso twists')]")
	public WebElement Gentletoros;
	
	@FindBy(xpath = "//h3[normalize-space()='Present Moment Awareness']")
	public WebElement Presentmov;
	
	@FindBy(xpath = "//p[@class='text-sm text-black/80 mb-4']")
	public WebElement Focusontext;
	
	@FindBy(xpath = "//li[contains(text(),'• Notice 5 things you can see')]")
	public WebElement Notethingstext;
	
	@FindBy(xpath = "//li[contains(text(),'• Identify 4 things you can touch')]")
	public WebElement identifytext;
	
	@FindBy(xpath = "//li[contains(text(),'• Listen for 3 different sounds')]")
	public WebElement Listdifftext;
	
	@FindBy(xpath = "//li[contains(text(),'• Find 2 things you can smell')]")
	public WebElement Findthingstext;
	
	@FindBy(xpath = "//li[contains(text(),'• Observe 1 thing you can taste')]")
	public WebElement observethingtext;
	
	@FindBy(xpath = "//h4[normalize-space()='Benefits for Diabetes Management']")
	public WebElement Benifitdiabeticmanagement;
	
	@FindBy(xpath = "//p[normalize-space()='Reduces Stress Hormones']")
	public WebElement Reducestress;
	
	@FindBy(xpath = "//p[normalize-space()='Improves Sleep']")
	public WebElement Improvesleep;
	
	@FindBy(xpath = "//p[normalize-space()='Reduces Diabetes Distress']")
	public WebElement Reducediabetic;
	
	@FindBy(xpath = "//p[normalize-space()='Lowers cortisol that can increase blood glucose']")
	public WebElement ReducestressExplain;
	
	@FindBy(xpath = "//p[normalize-space()='Better sleep leads to better glucose control']")
	public WebElement ImprovesleepExplain;
	
	@FindBy(xpath = "//p[normalize-space()='Helps manage overwhelm from diabetes care']")
	public WebElement ReducediabeticExplain;
	
	@FindBy(xpath = "//h3[normalize-space()='4-7-8 Breathing Technique']")
	public WebElement BreathingTech;
	
	@FindBy(xpath = "//p[@class='text-sm text-black/80 mb-4']")
	public WebElement BreathingTechExplain;
	
	@FindBy(xpath = "//button[normalize-space()='Start Breathing Exercise']")
	public WebElement StartbreathingBtn;
	
	@FindBy(xpath = "//button[normalize-space()='Stop']")
	public WebElement StopbreathingBtn;
	
	
	@FindBy(xpath = "//p[normalize-space()='Cycles completed']")
	public WebElement Cyclecomplete;
	
	@FindBy(xpath = "//p[normalize-space()='0']")
	public WebElement CyclecompleteValue;
	
	@FindBy(xpath = "//p[normalize-space()='Current phase']")
	public WebElement Currentphase;
	
	@FindBy(xpath = "//p[contains(text(),'—')]")
	public WebElement Currentphasevalue;
	
	@FindBy(xpath = "//div[@class='p-3 rounded-lg bg-blue-600/10 border border-blue-400/20']")
	public WebElement Inhale;
	
	@FindBy(xpath = "//div[@class='p-3 rounded-lg bg-purple-400/10 border border-purple-400/20']")
	public WebElement Hold;
	
	@FindBy(xpath = "//div[@class='p-3 rounded-lg bg-green-400/10 border border-green-400/20']")
	public WebElement Exhale;
	
	@FindBy(xpath = "//body/div[@id='root']/div[@class='min-h-screen bg-gradient-to-br from-indigo-100 to-purple-100']/main[@class='max-w-7xl mx-auto px-4 py-8']/div[@class='rounded-lg border mb-6 bg-indigo-300 text-white shadow-lg']/div[@class='p-6']/div[@class='w-full mb-6 bg-indigo-200 text-black shadow-lg']/div[@id='radix-:r3:-content-breathing']/div[1]")
	public WebElement BreathingCycleIndicator;
	
	
	
	
	public void NavigatetoDashBoardPage() {	
		Dashboardbtn.click(); 
	}
	public String WelcomeMsgWithUserName() {
	    return WelcomeBacktext.getText();
	}
	public String WelcomeMsgText() {
	    return Welcomemessage.getText();
	}
	public boolean isUpgradeToPremiumBtnVisible() {
	    return Upgradetopremium.isDisplayed();
	}
	public String AccoununInfoText() {
	    return Accountinformation.getText();
	}
	public boolean isSavechangesBtnVisible() {
	    return Savechanges.isDisplayed();
	}
	public String isAgeElement() {
		return Age.getText();
	}
	public String isHeightElement() {
		return Height.getText().trim();
	}
	public String isWeightElement() {
		return Weight.getText().trim();
	}
	public String isExcerciseroutineElement() {
		return Excerciseroutine.getText().trim();
	}
	public String isCusinepreferenceElement() {
		return CuisinePref.getText().trim();
	}
	public String isFoodAllergiesElement() {
		return Allergies.getText().trim();
	}
	public boolean isAgeTextisvisible() {
	    return AgeValue.isDisplayed();
	}
	public String GetAgeValue() {
	    return AgeValue.getText().trim();
	}
	public void EditAge() {	
		AgeValue.click();
		AgeValue.clear();
		AgeValue.sendKeys("45");
	}
	public void ClickSavechanges() {	
		Savechanges.click();
		
	}
	public String GetHeightValue() {
	    return HeightValue.getText().trim();
	}
	public void EditHeight() {	
		HeightValue.click();
		HeightValue.clear();
		HeightValue.sendKeys("160");
	}
	public String GetWeightValue() {
	    return WeightValue.getText().trim();
	}
	public void EditWeight() {	
		WeightValue.click();
		WeightValue.clear();
		WeightValue.sendKeys("70");
	}	
	public void ClickDrpdownExcerciseroutine() {	
		ExcerciseroutineValue.click();
		
	}
	public String GetEasyText() {
	    return Easy.getText().trim();
	}
	public String GetHardText() {
	    return Hard.getText().trim();
	}
	public String GetMediumText() {
	    return Medium.getText().trim();
	}
	public String GetIndianText() {
	    return Indian.getText().trim();
	}
	public String GetAmericanText() {
	    return American.getText().trim();
	}
	public String GetContinentalText() {
	    return Continental.getText().trim();
	}
	public String GetMediterraneanText() {
	    return Mediterranean.getText().trim();
	}
	public String GetAsianText() {
	    return Asian.getText().trim();
	}
	public String GetMiddleEasternText() {
	    return MiddleEastern.getText().trim();
	}
	public String GetMexicanText() {
	    return Mexican.getText().trim();
	}
	public void ClickDrpdownCusinepreference() {	
		CuisinePrefBox.click();
		
	}
	public List<String> getFoodAllergyOptionTexts() {
	    return Arrays.asList(
	        None.getText().trim(),
	        Dairy.getText().trim(),
	        Gluten.getText().trim(),
	        Shellfish.getText().trim(),
	        Soy.getText().trim(),
	        Eggs.getText().trim(),
	        Nuts.getText().trim(),
	        Other.getText().trim()
	    );
	}
	public void ClickDrpdownFoodAllergies() {	
		AllergiesBox.click();
		
	}
	public void editAgeInvalid(String value) 
    throws InterruptedException {
	    AgeValue.click();
	    AgeValue.clear();
	    Thread.sleep(2000); 
	    AgeValue.sendKeys("60");
	}

	public void editWeightInvalid(String value) 
    throws InterruptedException {
	    WeightValue.click();
	    WeightValue.clear();
	    Thread.sleep(2000); 
	    WeightValue.sendKeys(value);
	}

	public void editHeightInvalid(String value) 
    throws InterruptedException {
	    HeightValue.click();
	    HeightValue.clear();
	    Thread.sleep(2000); 
	    HeightValue.sendKeys(value);
	}
	public void scrollToStressManagementSection() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", StressmanagementTech);
    }

    public String getStressManagementHeaderText() {
        return StressmanagementTech.getText().trim();
    }

    public boolean isStressManagementHeaderVisible() {
        return StressmanagementTech.isDisplayed();
    }
    public boolean areStressmanagementsTabsVisible() {
        return Medidation.isDisplayed()
            && Breathing.isDisplayed()
            && Movement.isDisplayed()
            && Mindfullness.isDisplayed();
    }
    public void clickMeditationTab() {
        Medidation.click();
    }

    public boolean isMeditationContentDisplayed() {
        return MedidationContent.isDisplayed();
    }

    public void clickBreathingTab() {
        Breathing.click();
    }

    public boolean isBreathingContentDisplayed() {
        return BreathingContent.isDisplayed();
    }

    public void clickMovementTab() {
        Movement.click();
    }

    public boolean isMovementContentDisplayed() {
        return MovementContent.isDisplayed();
    }

    public void clickMindfulnessTab() {
        Mindfullness.click();
    }

    public boolean isMindfulnessContentDisplayed() {
        return MindfullnessContent.isDisplayed();
    }
    public String isGuidedMeditationTitle() {
        return Guidedmeditation.getText().trim();
    }
    public String is5minsTabTitle() {
        return fiveminbtn.getText().trim();
    }
    public String is10minsTabTitle() {
        return tenminbtn.getText().trim();
    }
    public String is15minsTabTitle() {
        return fifteenminbtn.getText().trim();
    }
    public boolean isProgressBarDisplayed() {
        return Prgogressbar.isDisplayed();
    }
    public boolean isProgressBarTimeDisplayed() {
        return Time00IndicatorProgress.isDisplayed();
    }

    public boolean isTimeIndicatorDisplayed(String time) {
        switch (time) {
            case "0:00":
                return Time00Indicator.isDisplayed();
            case "5:00":
                return Time5Indicator.isDisplayed();
            default:
                throw new IllegalArgumentException("Time indicator not defined for: " + time);
        }
    }
    public String getProgressBarStyle() {
        return Time00IndicatorProgress.getDomAttribute("style");
    }
    public void clickPlaybutton() {
    	Playbtn.click();
    }
    public void scrollToProgressbar() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Prgogressbar);
    }
    public String GentleMoventText() {
        return gentlemovement.getText().trim();
    }
    public void scrollToStreesMangementTab() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", StressmanagementTech);
    }
    public boolean areMovementDescriptionTextVisible() {
        return Simplestrechtext.isDisplayed()
            && Neckstrech.isDisplayed()
            && shouldercircle.isDisplayed()
            && Wristankle.isDisplayed()
            && Gentletoros.isDisplayed();
    }
    public String PresentmomentAwaremessText() {
        return Presentmov.getText().trim();
    }
    public boolean areMindfullnessDescriptionTextVisible() {
        return Focusontext.isDisplayed()
            && Notethingstext.isDisplayed()
            && identifytext.isDisplayed()
            && Listdifftext.isDisplayed()
            && Findthingstext.isDisplayed()
            && observethingtext.isDisplayed();
    }
    public void scrollToBenifitofDoabeticManagement() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Benifitdiabeticmanagement);
    }
    public void ClickStartBreathbutton() {
    	StartbreathingBtn.click();
    }
    public String getCurrentBreathingText() {
        return BreathingCycleIndicator.getText();
    }

    public String getBreathingPhaseStyle() {
        return BreathingCycleIndicator.getDomAttribute("style");
    }
    
    
}
	
	

	


