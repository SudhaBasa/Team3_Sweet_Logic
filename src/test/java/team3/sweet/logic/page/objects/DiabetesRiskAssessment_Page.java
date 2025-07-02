package team3.sweet.logic.page.objects;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import team3.sweet.logic.utils.ConfigReader;

public class DiabetesRiskAssessment_Page {
	private WebDriver driver;
	private WebDriverWait wait;
	ConfigReader config = new ConfigReader();
	
	public DiabetesRiskAssessment_Page(WebDriver driver) {
		 this.driver = driver;
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//button[text()='Check Your Risk ']")
	WebElement CheckYour_Risk;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement Cancel_Button;
	
    @FindBy(id="risk_age")
    WebElement Age;
    
    @FindBy(name="risk_weight")
    WebElement Weight;
    
    @FindBy(id="risk_activity")
    WebElement Activity_Dropdown;
    
    @FindBy(id="risk_bloodPressure")
    WebElement BloodPressure_Dropdown;
    
    @FindBy(name="risk_diet")
    WebElement Diet_Dropdown;
    
    @FindBy(xpath="//h2[text()='Your Diabetes Risk Assessment']")
    WebElement DiabetesRisk_Answerpage;
    
    @FindBy(xpath="//h2[text()='Diabetes Risk Analyzer']")
    WebElement DiabetesRiskAnalyzer_Header;
    
    @FindBy(xpath="//input[@placeholder='Enter your age (1-150)']")
    WebElement AgePlaceholder_Value;
    
    @FindBy(xpath="//p[text()='Answer a few questions to assess your risk of developing diabetes']")
    WebElement AnswerQuestion_Text;
    
    @FindBy(xpath="//button[text()='Calculate Risk']")
    WebElement Calculate_Risk;
    
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement FamilyHistory_Checkbox;
    
    @FindBy(xpath="//input[@placeholder='Enter your weight in kg (1-500)']")
    WebElement WeightPlaceholder_Value;
    
    @FindBy(xpath="//option[text()='Select activity level']")
    WebElement SelectActivity_Text;
    
    @FindBy(xpath="//option[text()='Select blood pressure status']")
    WebElement SelectBloodPressure_Text;
    
    @FindBy(xpath="//option[text()='Select diet quality']")
    WebElement SelectDiet_Text;
    
    public void CheckRisk() {
    	CheckYour_Risk.click();
    }
    
    public void Cancel() {
    	Cancel_Button.click();
    }
    
    public void Agevalue() {
    	Age.sendKeys("45");
    }
	
	public void Weightvalue() {
		 Weight.sendKeys("60");
	}
	public void selectActivity() {
	    
	    Select select = new Select(Activity_Dropdown);
	    select.selectByVisibleText("Active (Exercise 3+ times a week)");
	    
	}
  public void selectBloodPressure() {
	  Select select = new Select(BloodPressure_Dropdown);
	    select.selectByVisibleText("Elevated");
  }
  public void selectDiet() {
	  Select select = new Select( Diet_Dropdown);
	    select.selectByVisibleText("Average (Mixed whole foods and processed foods)");
  }
  public String DiabetesRiskAnswer() {
	  return DiabetesRisk_Answerpage.getText();
  }
  public boolean isDiabetesRiskHeaderDisplayed() {
	  return  DiabetesRiskAnalyzer_Header.isDisplayed();
  }
  public boolean isAgePlaceholderisDisplayed() {
	return  AgePlaceholder_Value.isDisplayed();
  }
  public boolean isAnswerQuestionisVisible() {
	  return AnswerQuestion_Text.isDisplayed();
  }
  public boolean isCalculateRiskEnabled() {
	  return Calculate_Risk.isEnabled();
  }
  public boolean isCalculateRiskisDisabled() {
	    return !Calculate_Risk.isEnabled();
	}
  public boolean isFamilyCheckboxisDisplayed() {
	return  FamilyHistory_Checkbox.isDisplayed();
  }
public boolean isWeightPlaceHolderValueisVisible() {
	return WeightPlaceholder_Value.isDisplayed();
}
public boolean isSelectActivityTextisDisplayed() {
	return SelectActivity_Text.isDisplayed();
	
}
public boolean isSelectBloodPressureTextisDisplayed() {
	return  SelectBloodPressure_Text.isDisplayed();
}
public boolean isSelectDietTextisDisplayed() {
	return SelectDiet_Text.isDisplayed();
}
public boolean areAllActivityOptionsPresent() {
    Select select = new Select(Activity_Dropdown);
    List<WebElement> options = select.getOptions();

    List<String> actualTexts = options.stream()
        .map(WebElement::getText)
        .collect(Collectors.toList());

    return actualTexts.contains("Active (Exercise 3+ times a week)") &&
           actualTexts.contains("Moderate (Exercise 1-2 times a week)") &&
           actualTexts.contains("Sedentary (Rarely exercise)");
}
public boolean areAllBloodPressureOptionsPresent() {
	 Select select = new Select(BloodPressure_Dropdown);
	    List<WebElement> options = select.getOptions();

	    List<String> actualTexts = options.stream()
	        .map(WebElement::getText)
	        .collect(Collectors.toList());
	    return actualTexts.contains("Normal") &&
	            actualTexts.contains("Elevated") &&
	            actualTexts.contains("High");
}
public boolean areAllDietQualityOptionsPresent() {
	Select select = new Select(Diet_Dropdown);
    List<WebElement> options = select.getOptions();

    List<String> actualTexts = options.stream()
        .map(WebElement::getText)
        .collect(Collectors.toList());
    return actualTexts.contains("Excellent (Balanced, mostly whole foods)") &&
            actualTexts.contains("Average (Mixed whole foods and processed foods)") &&
            actualTexts.contains("Poor (Mostly processed foods, high sugar)");
}
}
