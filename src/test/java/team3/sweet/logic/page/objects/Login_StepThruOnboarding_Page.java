package team3.sweet.logic.page.objects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import team3.sweet.logic.utils.CommonUtils;

public class Login_StepThruOnboarding_Page {

	WebDriver driver;

	public Login_StepThruOnboarding_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElements
	@FindBy(xpath = "//button[normalize-space()='Step Through Onboarding']")
	WebElement stepThruOnboardingBtn;

	@FindBy(xpath = "//p[@class='text-sm text-gray-600 text-right']")
	WebElement progressBar; // step 1 of 12 and so on

	@FindBy(xpath = "//h1[normalize-space()='So, Which sugar rebellion are we dealing with?']")
	WebElement step1HeadingText;

	@FindBy(xpath = "//p[@class=\"text-gray-600\" and contains(text(), \"This will help us tailor your plan to your condition\")]")
	WebElement step1SubText;

	@FindBy(xpath = "//div[@class='h-full bg-gradient-to-r from-violet-500 to-fuchsia-500 transition-all duration-300']")
	WebElement step1ProgressBarHighlight;

	@FindBy(xpath = "//span[text()='Type 2' or text()=\"I don't know\"]")
	List<WebElement> step1Options;

	@FindBy(xpath = "//span[text()=\"I don't know\"]")
	WebElement step1Option2;

	@FindBy(xpath = "//div[@class='text-sm opacity-90' and text()=\"No worries, we're here to figure it out together! 🔍\"]")

	WebElement toastMsgOnStep2;

	@FindBy(xpath = "//span[normalize-space()='Back']")
	WebElement backButton;

	@FindBy(xpath = "//h1[normalize-space()='Which fabulous label fits you best?']")
	WebElement step2HeadingText;

	@FindBy(xpath = "//p[@class='text-gray-600' and text()=\"Choose your gender\"]")
	WebElement step2SubText;

	@FindBy(xpath = "//div[@class='h-2 bg-gray-100 rounded-full overflow-hidden']")
	WebElement step2ProgressBarHighlight;

	@FindBy(xpath = "//div[@class='space-y-2']/button")
	List<WebElement> step2Options;

	@FindBy(xpath = "//div[@class=\"space-y-2\"]//button[2]")
	WebElement femaleButton;

	@FindBy(xpath = "//div[@class='h-full bg-gradient-to-r from-violet-500 to-fuchsia-500 transition-all duration-300']")
	WebElement step3ProgressBarHighlight;

	@FindBy(xpath = "//h1[normalize-space()='Age: own it, pick your number.']")
	WebElement step3HeadingText;

	@FindBy(xpath = "//p[normalize-space()='Please select your age']")
	WebElement step3SubText;

	@FindBy(xpath = "//span[normalize-space()='26 years']")
	WebElement selectingAge;

	@FindBy(xpath = "//div[@class='h-full bg-gradient-to-r from-violet-500 to-fuchsia-500 transition-all duration-300']")
	WebElement step4ProgressBarHighlight;

	@FindBy(xpath = "//h1[normalize-space()='How close are you to the clouds?']")
	WebElement step4HeadingText;

	@FindBy(xpath = "//p[@class='text-gray-600' and text()=\"Please enter your height\"]")
	WebElement step4SubText;

	@FindBy(xpath = "//span[@class=\"text-lg\"]")
	List<WebElement> ageOptions;

	@FindBy(xpath = "//div[@class='text-sm opacity-90']")
	WebElement toastMessage;

	@FindBy(xpath = "//span[normalize-space()='32 years']")
	WebElement selectingAge30to49;

	@FindBy(xpath = "//div[@class='text-sm opacity-90' and text()=\"In your prime and crushing it! 💫\"]")
	WebElement step3ToastMsg;

	@FindBy(xpath = "//div[@class='flex rounded-full bg-white/50 backdrop-blur-sm p-1 shadow-inner']/button")
	List<WebElement> tabOptionsOnStep4;

	@FindBy(xpath = "//button[normalize-space()='Feet & Inches']")
	WebElement feetAndInchesBtn;

	@FindBy(xpath = "//div[@class='space-y-2']/button[contains(@class, 'inline-flex')]")
	List<WebElement> centimeterOptions;

	@FindBy(xpath = "//div[@class='h-full bg-gradient-to-r from-violet-500 to-fuchsia-500 transition-all duration-300']")
	WebElement step5ProgressBarHighlight;

	@FindBy(xpath = "//h1[normalize-space()='How much awesome do you weigh?']")
	WebElement step5HeadingText;

	@FindBy(xpath = "//p[@class='text-gray-600' ]")
	WebElement subText;

	@FindBy(xpath = "//div[contains(@class, 'flex') and contains(@class, 'rounded-full')]//button")
	List<WebElement> tabOptionsOnStep5;

	@FindBy(xpath = "//button[normalize-space()='Pounds']")
	WebElement poundsBtnOnStep5;

	@FindBy(xpath = "//div[@class='space-y-2']/button[contains(@class, 'inline-flex')]")
	List<WebElement> kilogramOptions;

	@FindBy(xpath = "//div[@class='space-y-2']/button[contains(@class, 'inline-flex')]")
	List<WebElement> poundsOptions;

	@FindBy(xpath = "//div[@class='text-sm opacity-90' and text()=\"Light as a feather! But don't worry, our recipes will keep you grounded. 🪶\"]")
	WebElement messageOnStep4;

	@FindBy(xpath = "//div[normalize-space(text())=\"Perfectly balanced, as all things should be! ⚖️\"]")
	WebElement messageOnStep5;

	@FindBy(xpath = "//div[normalize-space(text())=\"More of you to love! And more energy to power those workouts. 💪\"]")
	WebElement messageOnStep5a;

	@FindBy(xpath = "//div[@class='h-full bg-gradient-to-r from-violet-500 to-fuchsia-500 transition-all duration-300']")
	WebElement progressBarHighlight;

	@FindBy(xpath = "//h1[contains(text(),'Your taste buds—what team are they on?')]")
	WebElement step6HeadingText;

	@FindBy(xpath = "//span[contains(text(),'All-inclusive diet') or contains(text(),'Vegetarian') or contains(text(),'Vegan')]")
	List<WebElement> step6Options;

	@FindBy(xpath = "//span[contains(text(),'All-inclusive diet 🍴🍖🍎')]")
	WebElement alInclusiveBtnOnStep6;

	@FindBy(xpath = "//h1[normalize-space()=\"What's your go-to food passport?\"]")
	WebElement step7HeadingText;

	@FindBy(xpath = "//span[contains(text(),'All-inclusive diet') or contains(text(),'Vegetarian') or contains(text(),'Vegan')]")
	List<WebElement> step7Options;

	@FindBy(xpath = "//span[contains(text(),'Mediterranean 🥙')]")
	WebElement mediterraneanOnStep7;

	@FindBy(xpath = "//h1[normalize-space()='Any medical quirks worth mentioning?']")
	WebElement step8HeadingText;

	@FindBy(xpath = "//span[contains(text(),'Yes ✅')]")
	WebElement yesOptionOnStep8;

	@FindBy(xpath = "//span[contains(text(),'No ❌')]")
	WebElement noOptionOnStep8;

	@FindBy(xpath = "//h1[normalize-space()='Any medical quirks worth mentioning?']")
	WebElement step10HeadingText;

	@FindBy(xpath = "//h1[normalize-space()='Tap foods your body hates']")
	WebElement step9HeadingText;

	@FindBy(xpath = "//button[@id='dairy']")
	WebElement dairyOnStep9;

	@FindBy(xpath = "//span[normalize-space()='Continue']")
	WebElement continueButton;

	@FindBy(xpath = "//button[@role='checkbox']")
	List<WebElement> checkBoxesOnStep10;

	@FindBy(xpath = "//button[@role='checkbox']")
	List<WebElement> checkBoxesOnSteps;

	@FindBy(xpath = "//h1[normalize-space()='Pick your pace: chill stroll or marathon magic?']")
	WebElement step11HeadingText;

	// span[contains(text(),'Medium 💪')]

	@FindBy(xpath = "//span[contains(text(),'Medium 💪')]")
	WebElement excerciseOption;

	@FindBy(xpath = "//h1[contains(text(),'Final Step- What’s your latest HbA1c number?!')]")
	WebElement step12HeadingText;
	

	@FindBy(xpath = "//input[@placeholder='Enter your HbA1c value (e.g., 7.0)']")
	WebElement placeholderTextOn12;
	
//	
//	public String getPlaceholderTextOn12() {
//		return getDomAttribute(placeholderTextOn12);
//	}

	

	public String getStep12HeadingText() {
		return step12HeadingText.getText();
	}

	public void clickOnExcerciseOption() {

		CommonUtils.clickElement(driver, excerciseOption);
	}

	public WebElement getPreferredExcercise(String excercise) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {

			String xpath = "//span[contains(text(),'" + excercise + "')]";

			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
			return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

		} catch (Exception e) {
			System.out.println("Preferred Excercise options not found");
		}
		return null;

	}

	public String getStep11HeadingText() {
		return step11HeadingText.getText();
	}

	public void clickMultipleChkBoxesOnStep10() {

		List<WebElement> checkbox = checkBoxesOnStep10;

		// System.out.println(checkbox.size());

		for (int i = 0; i < checkbox.size(); i += 2) {

			CommonUtils.clickElement(driver, checkbox.get(i));

		}
		System.out.println("done checking");

	}

	public void assertCheckboxesSelectedOnStep10() {
		List<WebElement> checkbox = checkBoxesOnStep10;

		for (int i = 0; i < checkbox.size(); i += 2) {
			String checked = checkbox.get(i).getDomAttribute("data-state");

			assertEquals(checked, "checked", "Checkbox at index " + i + " was not selected");

		}

		System.out.println("✅ All expected checkboxes are selected.");
	}

	public void selectCheckbox(int rowNo) {
		List<WebElement> checkbox = checkBoxesOnSteps;

		CommonUtils.clickElement(driver, checkbox.get(rowNo));

		System.out.println("done checking");

	}

	public WebElement getMedicalConditionOptions(String medical) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
			// String xpath = "//div[contains(@class, 'font-medium') and
			// contains(text(),'"+allergy+"')]";
			String xpath = "//div[@class='font-medium' and text()='" + medical + "']";

			// div[@class='font-medium' and text()='"+medical+"']
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
			return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

		} catch (Exception e) {
			System.out.println("Medical condition options not found");
		}
		return null;

	}

	public void clickOnDairyCheckBox() {

		CommonUtils.clickElement(driver, dairyOnStep9);
	}

	public void clickOnContinueButton() {

		CommonUtils.clickElement(driver, continueButton);
	}

	public String getStep9HeadingText() {
		return step9HeadingText.getText();
	}

	public String getStep10HeadingText() {
		return step10HeadingText.getText();
	}

	public WebElement geAllergyOption(String allergy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
			String xpath = "//div[contains(@class, 'font-medium') and contains(text(),'" + allergy + "')]";
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
			return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

		} catch (Exception e) {
			System.out.println("Allergy options not found");
		}
		return null;

	}

	public void clickOnYesOnStep8() {

		CommonUtils.clickElement(driver, yesOptionOnStep8);
	}

	public void clickOnNoOnStep8() {
		CommonUtils.clickElement(driver, noOptionOnStep8);
	}

	public String getStep8HeadingText() {
		return step8HeadingText.getText();
	}

	public WebElement getYesNoOption(String allergy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		try {
			String xpath = "//span[contains(text(),'" + allergy + "')]/..";
			System.out.println("Path: " + xpath);
			return wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[contains(text(),'" + allergy + "')]/..")));
			// span[contains(text(),'"+option+"')]/..

		} catch (Exception e) {
			System.out.println("Allergy Yes and No options not found");
		}
		return null;

	}

	public void clickOnMediterraneanOnStep7() {

		CommonUtils.clickElement(driver, mediterraneanOnStep7);

	}

	public WebElement getMealPreference(String meal) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		System.out.println("Meal preference: " + meal);
		try {
			return wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[contains(text(),'" + meal + "')]/..")));

		} catch (Exception e) {
			System.out.println("Meal preference not found");
		}
		return null;

	}

	public boolean areStep7OptionsPresent() {

		System.out.println("Options on step 7: " + step7Options);
		if (step6Options.size() != 3)
			return false;

		List<String> actualTexts = step6Options.stream().map(WebElement::getText).map(String::trim).toList();

		return actualTexts.contains("All-inclusive diet 🍴🍖🍎") && actualTexts.contains("Vegetarian 🥗🍆🥕")
				&& actualTexts.contains("Vegan 🥬🌱🌿");
	}

	public String getStep7HeadingText() {
		return step7HeadingText.getText();
	}

	public void clickOnalInclusiveBtnOnStep6() {
		CommonUtils.clickElement(driver, alInclusiveBtnOnStep6);

	}

	public List<String> getStep6OptionText() {
		return step6Options.stream().map(WebElement::getText).map(String::trim).toList();
	}

	public boolean areStep6OptionsPresent() {

		System.out.println("Options on step 6: " + step6Options);
		if (step6Options.size() != 3)
			return false;

		List<String> actualTexts = step6Options.stream().map(WebElement::getText).map(String::trim).toList();

		return actualTexts.contains("All-inclusive diet 🍴🍖🍎") && actualTexts.contains("Vegetarian 🥗🍆🥕")
				&& actualTexts.contains("Vegan 🥬🌱🌿");
	}

	public void selectRandomWeightInPounds() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(poundsOptions));

		int randomNumber = CommonUtils.getRandomNumber(90, 550);
		System.out.println("Selecting random Weight from 90 to 550 lbs : " + randomNumber);

		WebElement ele = getWeightInPoundsEle(randomNumber);
		ele.click();
		// CommonUtils.clickElement(driver, ele);
	}

	public WebElement getWeightInPoundsEle(int pounds) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println("Weight: " + pounds);
		try {
			return wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[normalize-space()='" + pounds + " lbs']/..")));

		} catch (Exception e) {
			System.out.println("weight in range not found");
		}
		return null;

	}

	public boolean isProgressBarDisplayed() {
		return progressBarHighlight.isDisplayed();
	}

	public String getSubText() {
		return subText.getText();
	}

	public String getStep6HeadingText() {
		return step6HeadingText.getText();
	}

	public String getProgressBarText() {

		String text = progressBar.getText();
		System.out.println("Progress Bar Text :" + text);
		return progressBar.getText();
	}

	public String getMsgOnStepFiveA() {
		return messageOnStep5a.getText();
	}

	public void selectRandomWeightGreaterThan85() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(kilogramOptions));

		int randomNumber = CommonUtils.getRandomNumber(88, 190);
		System.out.println("Selecting random Weight greater than 85: " + randomNumber);

		WebElement ele = getWeightInKilogramEle(randomNumber);
		ele.click();
	}

	public String getMsgOnStepFive() {
		return messageOnStep5.getText();
	}

	public void selectRandomWeightBetween60to84() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(kilogramOptions));

		int randomNumber = CommonUtils.getRandomNumber(60, 84);
		System.out.println("Selecting random Weight between 60 to 59 : " + randomNumber);

		WebElement ele = getWeightInKilogramEle(randomNumber);
		ele.click();
	}

	public String getMsgOnStepFour() {
		return messageOnStep4.getText();
	}

	public void selectRandomWeightLessThan59() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(kilogramOptions));

		int randomNumber = CommonUtils.getRandomNumber(40, 59);
		System.out.println("Selecting random Weight < 59 : " + randomNumber);

		WebElement ele = getWeightInKilogramEle(randomNumber);
		ele.click();
		// CommonUtils.clickElement(driver, ele);
	}

	public WebElement getWeightInKilogramEle(int kilogram) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		System.out.println("Weight: " + kilogram);
		try {
			return wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[normalize-space()='" + kilogram + " kg']/..")));

		} catch (Exception e) {
			System.out.println("weight in range not found");
		}
		return null;

	}

	public String tabOptionTextOnStep5(int index) {
		CommonUtils.waitForElement(driver);
		return tabOptionsOnStep5.get(index).getText();

	}

	public boolean areTabOptionsOnStep5Present() {

		if (tabOptionsOnStep5.size() != 2)
			return false;
		List<String> actualTexts = tabOptionsOnStep5.stream().map(WebElement::getText).map(String::trim).toList();
		return actualTexts.contains("Kilograms") && actualTexts.contains("Pounds");
	}

	public void clickOnPoundsBtn() {
		CommonUtils.clickElement(driver, poundsBtnOnStep5);
	}

	public WebElement getOptionInFeet(int feet, int inches) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
					"//span[normalize-space(.)=concat(\"" + feet + "\", \"'\", \" " + inches + "\", '\"')]/..")));

		} catch (Exception e) {
			System.out.println("Height in range not found");
		}
		return null;

	}

	public boolean step5ProgressIsDisplayed() {
		return step5ProgressBarHighlight.isDisplayed();
	}

	public String getStep5SubText() {
		return subText.getText();
	}

	public String getStep5HeadingText() {
		return step5HeadingText.getText();
	}

	public WebElement getHeighInCmElement(int centimeter) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			return wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[normalize-space()='" + centimeter + " cm']/..")));

		} catch (Exception e) {
			System.out.println("Height in range not found");
		}
		return null;

	}

	public void selectRandomHeightFrom120to220() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(centimeterOptions));

		int randomNumber = CommonUtils.getRandomNumber(120, 220);
		System.out.println("Selecting random height from 120 to 220 : " + randomNumber);

		WebElement ele = getHeighInCmElement(randomNumber);
		ele.click();

	}

	public void selectRandomHeightFrom160to179() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(centimeterOptions));

		int randomNumber = CommonUtils.getRandomNumber(160, 179);
		System.out.println("Selecting random height from 160 to 179 : " + randomNumber);

		WebElement ele = getHeighInCmElement(randomNumber);
		ele.click();

	}

	public void selectRandomHeightLessThan159() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(centimeterOptions));

		int randomNumber = CommonUtils.getRandomNumber(120, 159);
		System.out.println("Selecting random height < 159 : " + randomNumber);

		WebElement ele = getHeighInCmElement(randomNumber);
		ele.click();

	}

	public void selectRandomHeightGreaterThan180() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(centimeterOptions));

		int randomNumber = CommonUtils.getRandomNumber(180, 220);
		System.out.println("Selecting random height > 180 : " + randomNumber);

		WebElement ele = getHeighInCmElement(randomNumber);
		ele.click();

	}

	public void clickOnFeetAndInchesBtn() {

		CommonUtils.clickElement(driver, feetAndInchesBtn);
	}

	public String tapOptionText(int index) {

		return tabOptionsOnStep4.get(index).getText();

	}

	public boolean areTabOptionsOnStep4Present() {

		if (tabOptionsOnStep4.size() != 2)
			return false;
		List<String> actualTexts = tabOptionsOnStep4.stream().map(WebElement::getText).map(String::trim).toList();
		return actualTexts.contains("Centimeters") && actualTexts.contains("Feet & Inches");
	}

	public String getToastMsgForStepThree() {
		return step3ToastMsg.getText();
	}

	public String getToastMsg() {

		return toastMessage.getText();
	}

	public void selectRandomAgeBetween50and100() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfAllElements(ageOptions));

		int randomNumber = CommonUtils.getRandomNumber(50, 100);
		System.out.println("Selecting Age : " + randomNumber);

		try {
			WebElement age = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[normalize-space()='" + randomNumber + " years']/..")));

			age.click();

		} catch (Exception e) {
			System.out.println("Toast message did not appear in time.");
		}

	}

	public boolean isHeightInCmDisplayed(int centimeter) {

		try {
			WebElement height = getHeighInCmElement(centimeter);
			return height.isDisplayed();

		} catch (Exception e) {
			System.out.println("Height in range not found");
		}
		return false;

	}

	public boolean isHeightInInchesDisplayed(int feet, int inches) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			WebElement height = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
					"//span[normalize-space(.)=concat(\"" + feet + "\", \"'\", \" " + inches + "\", '\"')]/..")));
			return height.isDisplayed();

		} catch (Exception e) {
			System.out.println("Height in range not found");
		}
		return false;

	}

	public void selectRandomAgeBetween30and49() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfAllElements(ageOptions));

		int randomNumber = CommonUtils.getRandomNumber(30, 49);
		System.out.println("Selecting Age : " + randomNumber);

		try {
			WebElement age = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[normalize-space()='" + randomNumber + " years']/..")));

			age.click();

		} catch (Exception e) {
			System.out.println("Toast message did not appear in time.");
		}

	}

	public void selectRandomAgeBetween18and29() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfAllElements(ageOptions));

		int randomNumber = CommonUtils.getRandomNumber(18, 29);
		System.out.println("Selecting Age : " + randomNumber);

		try {
			WebElement age = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[normalize-space()='" + randomNumber + " years']/..")));

			age.click();

		} catch (Exception e) {
			System.out.println("Toast message did not appear in time.");
		}

	}

	public boolean step4ProgressIsDisplayed() {
		return step4ProgressBarHighlight.isDisplayed();
	}

	public String getStep4SubText() {
		return step4SubText.getText();
	}

	public String getStep4HeadingText() {
		return step4HeadingText.getText();
	}

	public boolean step3ProgressIsDisplayed() {
		return step3ProgressBarHighlight.isDisplayed();
	}

	public String getStep3SubText() {
		return step3SubText.getText();
	}

	public String getStep3HeadingText() {
		return step3HeadingText.getText();
	}

	public void clickOnAge() {
		CommonUtils.clickElement(driver, selectingAge);
		CommonUtils.waitForElement(driver);
	}

	public void clickFemaleBtn() {
		CommonUtils.clickElement(driver, femaleButton);
	}

	public void clickBackButton() {
		CommonUtils.clickElement(driver, backButton);
	}

	public boolean areStep2OptionsPresent() {

		// System.out.println(step1Options);
		if (step2Options.size() != 3)
			return false;
		List<String> actualTexts = step2Options.stream().map(WebElement::getText).map(String::trim).toList();
		return actualTexts.contains("Male 👨‍🦱") && actualTexts.contains("Female 👩‍🦰")
				&& actualTexts.contains("Other ⚧️");
	}

	public boolean step2ProgressIsDisplayed() {
		return step2ProgressBarHighlight.isDisplayed();
	}

	public String getStep2SubText() {
		return step2SubText.getText();
	}

	public String getStep2HeadingText() {
		return step2HeadingText.getText();
	}

	public boolean backButtonIsDisplayed() {
		return backButton.isDisplayed();
	}

	public String getToastMsgOnStep2() {
		return toastMsgOnStep2.getText();
	}

	public void clickOnOption2OnStep1() {
		CommonUtils.clickElement(driver, step1Option2);
	}

	public boolean areStep1OptionsPresent() {

		// System.out.println(step1Options);
		if (step1Options.size() != 2)
			return false;
		List<String> actualTexts = step1Options.stream().map(WebElement::getText).map(String::trim).toList();
		return actualTexts.contains("Type 2") && actualTexts.contains("I don't know");
	}

	public WebElement isProgreessBarDisplayed() {
		return progressBar;
	}

	public void clickOnStepThruOnboardingBtn() {
		CommonUtils.clickElement(driver, stepThruOnboardingBtn);
	}

	public boolean step1ProgressIsDisplayed() {
		return step1ProgressBarHighlight.isDisplayed();
	}

	public String getStep1SubText() {
		return step1SubText.getText();
	}

	public String getStep1HeadingText() {
		return step1HeadingText.getText();
	}

}
