package team3.sweet.logic.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PremiumUserRecordData {
	@FindBy(xpath ="/html/body/div[4]") WebElement calenderPicker;
	@FindBy(linkText = "Track Glucose") WebElement trackBloodGlucoseTitle;
	@FindBy(linkText = "Keep your health in check") WebElement trackBloodGlucoseSubText;
	@FindBy(linkText = "Blood Glucose Level") WebElement bloodGlucoseTextField;
	@FindBy(xpath = "//*[@id=\'radix-:r1n:\']/div[2]/form/div[1]/div[1]/label") WebElement bloodGlucoseInputField;
	@FindBy(xpath = "//*[@id=\':r23:-form-item\']/input") WebElement bloodGlucosePlaceholderInput;
	@FindBy(xpath = "//*[@id=\':r23:-form-item\']/span") WebElement bloodGlucosePlaceholderInputText;
	@FindBy(xpath = "//*[@id=\'radix-:r1n:\']/div[2]/form/div[1]/div[2]") WebElement bloodGlucoseTransition;
	@FindBy(xpath = "//*[@id=\'radix-:rb:\']/div[2]/form/div[1]/div[2]/div[1]") WebElement bloodGlucoseTransitionLow;
	@FindBy(xpath = "//*[@id=\'radix-:rb:\']/div[2]/form/div[1]/div[2]/div[2]") WebElement bloodGlucoseTransitionMedium;
	@FindBy(xpath = "//*[@id=\'radix-:rb:\']/div[2]/form/div[1]/div[2]/div[3]") WebElement bloodGlucoseTransitionHigh;
	@FindBy(xpath ="//*[@id=\'radix-:rb:\']/div[2]/form/div[2]") WebElement bloodGlucoseReadingButton;
	@FindBy(xpath ="//*[@id=\'radix-:rb:\']/div[2]/form/div[3]") WebElement bloodGlucoseDateOption;
	@FindBy(xpath ="//*[@id=\'radix-:rb:\']/div[2]/form/div[4]") WebElement bloodGlucoseReadingTime;
	@FindBy(xpath ="//*[@id=\'radix-:rb:\']/div[2]/form/div[5]/button") WebElement bloodGlucoseRecordReadingButton;
	//@FindBy(xpath ="/html/body/div[4]") WebElement bloodGlucoseCalender;
	@FindBy(xpath ="//*[@id=\'radix-:rq:\']/div/div/div/div/div[2]/button[1]") WebElement bloodGlucosePreviousDateOption;
	@FindBy(xpath ="//*[@id=\'radix-:rq:\']/div/div/div/div/div[2]/button[2]") WebElement bloodGlucoseNextDateOption;
	
	@FindBy(linkText = "Physical Activity") WebElement physicalActivityTitle;
	@FindBy(linkText = "Track your fitness journey") WebElement physicalActivitySubText;
	@FindBy(linkText = "Activity Type") WebElement physicalActivityTextField;
	@FindBy(xpath = "//*[@id=\"activityType\"]") WebElement physicalActivityDropdownOptions;
	@FindBy(linkText = "Duration") WebElement physicalActivityDurationTextField;
	@FindBy(xpath = "//*[@id=\"duration\"]") WebElement physicalActivityDurationPlaceholderInput;
	@FindBy(xpath ="//*[@id=\"radix-:re:\"]/form/div[3]/button") WebElement physicalActivityDurationDateOption;
	@FindBy(linkText = "Intensity") WebElement physicalActivityIntensityText;
	@FindBy(xpath = "//*[@id=\'radix-:re:\']/form/div[4]/div") WebElement physicalActivityIntensityButtons;
	@FindBy(xpath ="//*[@id=\"radix-:re:\"]/form/button") WebElement SaveActivityButton;
	//@FindBy(xpath ="/html/body/div[4]") WebElement physicalActivityCalender;
	@FindBy(xpath ="//*[@id=\"radix-:rn:\"]/div/div/div/div/div[2]/button[1]") WebElement physicalActivityPreviousDateOption;
	@FindBy(xpath ="//*[@id=\"radix-:rn:\"]/div/div/div/div/div[2]/button[2]") WebElement physicalActivityNextDateOption;
	
	// food Intake Validation
	@FindBy(linkText = "Food Intake Tracker") WebElement foodIntakeTitle;
	@FindBy(linkText = "Track what you eat to manage your diabetes better") WebElement foodIntakeSubText;
	@FindBy(xpath = "//*[@id=\"radix-:rh:\"]/div[2]/div/div/div") WebElement foodIntakeButtonsPresence;
	
	@FindBy(xpath = "//*[@id=\"radix-:rh:\"]/div[2]/div/form/div[1]/label") WebElement foodIntakeFoodNameTextField;
	@FindBy(xpath = "//*[@id=\"radix-:rh:\"]/div[2]/div/form/div[2]/label") WebElement foodIntakeServingSizeTextField;
	@FindBy(xpath = "//*[@id=\"radix-:rh:\"]/div[2]/div/form/div[3]/label") WebElement foodIntakeCaloriesTextField;
	@FindBy(xpath = "//*[@id=\"radix-:rh:\"]/div[2]/div/form/div[4]/label") WebElement foodIntakeDateTextField;
	@FindBy(xpath = "//*[@id=\"radix-:rh:\"]/div[2]/div/form/div[5]/label") WebElement foodIntakeNotesTextField; //OR
	@FindBy(xpath = "//*[@id=\"radix-:rh:\"]/div[2]/div/form") WebElement foodIntakeFormTextField;
	
	@FindBy(xpath = "//*[@id=\"radix-:rh:\"]/div[2]/div/div/div/button[1]") WebElement foodIntakeDefaultMealTab;
	@FindBy(xpath = "//*[@id=\"foodName\"]") WebElement foodIntakeFoodNamePlaceholderInput;
	@FindBy(xpath = "//*[@id=\"radix-:rh:\"]/div[2]/div/form/div[2]/div/div/div") WebElement foodIntakeDropdownOptions;
	@FindBy(xpath = "//*[@id=\"servingSize\"]") WebElement foodIntakeServingSizePlaceholderInput;
	@FindBy(xpath = "//button[@title='Calculate calories automatically']") WebElement foodIntakeCalculator;
	@FindBy(xpath = "//div[@id='radix-:rg:']//div[3]//div[1]']") WebElement foodIntakeCaloriesTextInputField;
	@FindBy(xpath = "//input[@id='calories']") WebElement foodIntakeCaloriesPlaceholderInputField;
	@FindBy(xpath = "//p[@class='mt-1 text-sm text-gray-500']") WebElement foodIntakeCaloriesHelperText;	
	@FindBy(xpath ="//button[normalize-space()='July 1st, 2025']") WebElement foodIntakeDurationDateOption;
	@FindBy(xpath = "//textarea[@id='notes']") WebElement foodIntakeNotesPlaceholderInputField;	
	@FindBy(xpath = "//button[@type='submit']") WebElement SaveFoodEntryButtons;
	
	
	
	
}
