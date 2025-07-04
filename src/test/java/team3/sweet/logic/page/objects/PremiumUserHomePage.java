package team3.sweet.logic.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.math.BigInteger;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import team3.sweet.logic.driver.factory.DriverFactory;
import team3.sweet.logic.utils.ConfigReader;
import team3.sweet.logic.utils.LoggerLoad;

public class PremiumUserHomePage {
	WebDriver driver;
	String Email;
	String PremUserPassword;
	WebDriverWait wait;

	public PremiumUserHomePage() {

		driver = DriverFactory.getdriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Login']")	WebElement btnLogin;
	@FindBy(xpath = "//input[@name='email']")	WebElement emailInputElement;
	@FindBy(xpath = "//button[text()='Continue with email']")	WebElement btnContinueWithEmail;
	@FindBy(xpath = "//input[@name='password']")	WebElement passwordInputElement;
	@FindBy(xpath = "//button[text()='Sign in']")	WebElement btnSignIn;
	@FindBy(xpath = "//div[@class='flex space-x-8']/button")	WebElement navigationSequence;
	@FindBy(xpath = "/html/body/div/div/nav/div/div/button[1]")	WebElement homeButton;
	@FindBy(xpath = "/html/body/div/div/nav/div/div/button[2]")	WebElement logbookButton;
	@FindBy(xpath = "/html/body/div/div/nav/div/div/button[3]")	WebElement dashboardButton;
	@FindBy(xpath = "/html/body/div/div/nav/div/div/button[4]")	WebElement educationButton;
	@FindBy(xpath = "//div[1]/main/div[1]/div[1]/button")	WebElement flashingChallengeButton;
	@FindBy(xpath = "//img[@alt='Female character illustration']")	WebElement genderImg;
	@FindBy(xpath = "//span[@class='absolute -top-5 -right-5 text-5xl']")	WebElement genderImgEmoji;
	@FindBy(xpath = "//div[normalize-space()='Mood: Neutral']")	WebElement genderImgLable;
	@FindBy(xpath = "//button[normalize-space()='Log']")	WebElement logButton;
	@FindBy(xpath = "//button[normalize-space()='Weekly Plan']")	WebElement weeklyPlanButton;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/main/div[3]/h2")	WebElement recordNewData;
	@FindBy(xpath = "//*[div/div/main/div[3]/div]")	WebElement allButtonOptionsPresence;
	@FindBy(xpath = "//div[1]/main/div[3]/div/button[1]")	WebElement bloodGlucoseButton;
	@FindBy(xpath = "//div[1]/main/div[3]/div/button[2]")	WebElement physicalActivityButton;
	@FindBy(xpath = "//div[1]/main/div[3]/div/button[3]")	WebElement foodIntakeButton;
	@FindBy(xpath = "//div[1]/main/div[3]/div/button[4]")	WebElement medicationButton;
	@FindBy(xpath = "//div[@id='radix-:rb:']")	WebElement bloodGlucosepPopup;
	@FindBy(xpath = "//div[@id='radix-:re:']")	WebElement physicalGlucosepPopup;
	@FindBy(xpath = "//div[@id='radix-:rh:']")	WebElement foodIntakePopup;
	@FindBy(xpath = "//div[@id='radix-:rk:']")	WebElement medicationPopup;

	// presence of "Pre-meal" title in each meal section
	@FindBy(xpath = "//body/div[@id='root']/div[1]")	WebElement preMealTitle;
	@FindBy(xpath = "//div[1]/main/div[2]/div/div/div[1]/div/button[1]")	WebElement mealPlanButton;
	@FindBy(xpath = "//span[contains(text(),'⏰')]")	WebElement preMealIcon;
	@FindBy(xpath = "//body/div[@id='root']/div[1]")	WebElement preMealDescription;
	@FindBy(xpath = "//div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[1]/button[4]")	WebElement SnackButton;
	@FindBy(xpath = "//div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[1]/div/div[1]")	WebElement nonePremealSnackDisplay;
	@FindBy(xpath = "//span[normalize-space()='0 calories']")	WebElement caloriesSnackDisplay;
	@FindBy(xpath = "//body/div[@id='root']/div[1]")	WebElement mainMealTitle_Snacks;
	@FindBy(xpath = "//div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[1]/div/div[2]/span[2]")	WebElement preMealCaloriesDisplay;
	@FindBy(xpath = "//body/div[@id='root']/div[1]")	WebElement mainMealSubTitle;
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M15 15 3.3')]")	WebElement mainMealUtensilIcon;
	@FindBy(xpath = "//span[normalize-space()='7:30 AM']")	WebElement mainMealTime;
	@FindBy(xpath = "//div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[2]/div/div[2]/span[1]")	WebElement mainMealTime_1;
	@FindBy(xpath = "//div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[2]/div/div[2]/span[2]")	WebElement mainMealCalories;
	@FindBy(xpath = "//button[contains(text(),'✅ Completed')]")	WebElement completeButton;
	@FindBy(xpath = "div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[3]/button[2]")	WebElement partiallyCompleteButton;
	@FindBy(xpath = "div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[3]/button[3]")	WebElement notCompleteButton;
	@FindBy(xpath = "//div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[4]/div")	WebElement summaryFlexCard;
	@FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[4]/div/div/h3")	WebElement flexCardTitle;
	@FindBy(xpath = "//h3[normalize-space()='Calories']")	WebElement flexCardSubTitle;
	@FindBy(xpath = "//body/div[@id='root']/div[1]")	WebElement flexCardPreMealCalories;
	@FindBy(xpath = "//body/div[@id='root']/div[2]")	WebElement flexCardMainMealCalories;
	@FindBy(xpath = "//p[@class='text-sm text-gray-500']")	WebElement totalCaloriesCount;
	@FindBy(xpath = "//div[@class='text-right']")	WebElement caloryDetailPosition;
	@FindBy(xpath = "//div[1]/main/div[2]/div/div/div[2]/div/div[1]")	WebElement donutChart;
	@FindBy(xpath = "//div[@class='text-2xl font-bold']")	WebElement donutChartCalories;
	@FindBy(xpath = "//div[@class='space-y-3']")	WebElement barChart;
	@FindBy(xpath = "//div[@class='space-y-3']")	WebElement horizontalCarbsBar;
	@FindBy(xpath = "//div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[4]/div/div[3]/div[2]/div[2]")	WebElement macroLableChart;
	@FindBy(xpath = "//button[normalize-space()='View Full Meal Plan']")	WebElement fullMealPlanButton;
	@FindBy(xpath = "//div[1]/div/div[1]/h1")	WebElement fullMealPlanTitle;
	@FindBy(xpath = "//div[1]/div/div[1]/button")	WebElement backToPlanButton;
	@FindBy(xpath = "//div[@class='flex gap-4 mb-6 overflow-x-auto pb-2']")	WebElement mealSectionButtons;
	@FindBy(xpath = "//ul[@class='list-disc list-inside']")	WebElement nutrientsList;
	@FindBy(xpath = "/html/body/div/div/div/div[2]/button[1]")	WebElement breakfastSectionButton;
	@FindBy(xpath = "/html/body/div/div/div/div[2]/button[2]")	WebElement lunchSectionButton;
	@FindBy(xpath = "/html/body/div/div/div/div[2]/button[3]")	WebElement dinnerSectionButton;
	@FindBy(xpath = "/html/body/div/div/div/div[2]/button[4]")	WebElement snacksSectionButton;
	@FindBy(xpath = "//h2[normalize-space()='Pre-meal: Fenugreek Sprout Salad']")	WebElement preMealTitle_section;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[1]/p")	WebElement preMealDescription_section;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[1]/div/p[2]")	WebElement preMealCalories_section;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[1]/div/p[3]")	WebElement preMealPreparation_section;
	@FindBy(xpath = "//ul[@class='list-disc list-inside']")	WebElement preMealNutrientsInfo_section;
	@FindBy(xpath = "//p[normalize-space()='Time: 7:00 AM']")	WebElement preMealTime_section;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[1]/div/div/ul")	WebElement preMealPortion;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[2]/h2/text()[2]")	WebElement mainMealTitleformat;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[2]/h2")	WebElement mainMealItemDescription;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[2]/div")	WebElement mainMealIngredients;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[4]/h3")	WebElement diabetesManagementTipsTitle;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[4]/p[1]")	WebElement descriptionDiabetesManagement;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[4]/p[2]/text()[1]")	WebElement glycemicImpact;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div[4]/p[2]/text()[3]")	WebElement glycemicImpactValue;
	@FindBy(xpath = "//div[@id='radix-:r8:']")	WebElement challengePopWindow;
	@FindBy(xpath = "//*[@id=\"radix-:r9:\"]")	WebElement challengePopWindowTitle;
	@FindBy(xpath = "//p[@id='radix-:ra:']")	WebElement challengePopWindowSubText;
	@FindBy(xpath = "//body/div[3]/div[2]/button[1]")	WebElement popWindowChallengeButton_1;
	@FindBy(xpath = "//body/div[3]/div[2]/button[2]")	WebElement popWindowChallengeButton_2;
	@FindBy(xpath = "//div[2]/button[1]/span[2]")	WebElement popWindowChallengeButton_1text;
	@FindBy(xpath = "//div[2]/button[2]/span[1]")	WebElement popWindowChallengeButton_2text;
	@FindBy(linkText = "10-Day Challenge")	WebElement popWindowChallengeButton_1Text1;
	@FindBy(linkText = "Postprandial Blood Glucose Reduction")	WebElement popWindowChallengeButton_1Text2;
	@FindBy(linkText = "4-Week Program")	WebElement popWindowChallengeButton_2Text1;
	@FindBy(linkText = "Blood Sugar Reduction Plan")	WebElement popWindowChallengeButton_2Text2;
	@FindBy(xpath = "//div[1]/nav/div/div/button[1]")	WebElement homeTabClick;
	@FindBy(xpath = "//div[1]/main/div[4]/div[3]/div/div[2]/div/button[1]/span")	WebElement logEmoji;
	@FindBy(xpath = "//div[1]/main/div[4]/div[3]/div/button")	WebElement logEmotionalStateButton;
	@FindBy(xpath = "//div[1]/main/div[4]/div[3]/div/div[2]/div/button[1]/span")	WebElement logEmojiText;
	@FindBy(xpath = "//textarea[@id='notes']")	WebElement logTextInputFieldText;

	public void getNavigationSequence() {
		// return navigationSequence.getText();
		List<String> expectedOrder = Arrays.asList("Home", "Logbook", "Dashboard", "Education");
		// String sequence = navigationSequence.getText();
		List<WebElement> order = driver.findElements(By.xpath("//div[@class='flex space-x-8']/button"));
		List<String> actualOrder = order.stream().map(WebElement::getText).filter(text -> !text.isEmpty())
				.collect(Collectors.toList());
		Assert.assertTrue(actualOrder.containsAll(expectedOrder), "order do not match expected list");
	}

	public void Loginbtn() {
		btnLogin.click();
		// wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.visibilityOf(btnLogin)).click();
	}

	public void SignIn() {

		Email = ConfigReader.getProperty("email");
		emailInputElement.sendKeys(Email);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnContinueWithEmail)).click();

		PremUserPassword = ConfigReader.getProperty("PremUserPassword");
		passwordInputElement.sendKeys(PremUserPassword);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btnSignIn)).click();
	}

	public void getFlashingChallengeButton() {
		flashingChallengeButton.getText();
	}
	/*
	 * public void getanimationChallengeButton() { Object animate;
	 * flashingChallengeButton.getCssValue(animate); //button[class='w-full mb-4
	 * py-3 bg-gradient-to-r from-violet-600 via-purple-600 to-fuchsia-600
	 * //text-white text-lg font-bold rounded-lg shadow-lg //hover:shadow-xl
	 * transform hover:-translate-y-1 transition-all duration-200 animate-pulse
	 * hover:animate-none'] }
	 */

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
		String value = "";
		String[] obj = { "Blood Glucose", "Physical Activity", "Food Intake", "Medication" };
		boolean valuePresentFlag = false;
		int actualCount = 0;
		// allButtonOptionsPresence.getText();
		// Locate all buttons under "Record New Data"
		List<WebElement> buttons = driver.findElements(By.xpath("//*[@id=\"root\"]/div[1]/main/div[3]"));

		// Optional: print their text for debug
		for (WebElement button : buttons) {
			value = button.getText();
			System.out.println("Found button: " + button.getText());
		}

		// Assert there are exactly 4 buttons
		for (String valArray : obj) {
			valuePresentFlag = value.contains(valArray);
			if (valuePresentFlag) {
				actualCount++;
			}

		}
		Assert.assertEquals(4, actualCount);
	}

	public void buttonOrder(String expectedText) {

		List<String> expectedOrder = Arrays.asList("Blood Glucose", "Physical Activity", "Food Intake", "Medication");
		List<WebElement> buttons = wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"root\"]/div[1]/main/div[3]/div/button")));
		List<WebElement> order = driver.findElements(By.xpath("//div[@class='flex space-x-8']/button"));

		List<String> actualText = buttons.stream().map(WebElement::getText).filter(text -> !text.isEmpty())
				.collect(Collectors.toList());

		Assert.assertTrue(actualText.containsAll(expectedOrder), "order do not match expected list");

	}

	public void bloodGlucoseIcon() {
		bloodGlucoseButton.isDisplayed();
	}

	public void physicalActivityIcon() {
		physicalActivityButton.isDisplayed();
	}

	public void foodIntakeIcon() {
		foodIntakeButton.isDisplayed();
	}

	public void medicationIcon() {
		medicationButton.isDisplayed();
	}

	public void fullMealPlanButton() {
		fullMealPlanButton.click();
	}

	public void mealPlanButton() {
		mealPlanButton.click();
	}

	public String preMealTitle() {
		return preMealTitle.getText();
	}

	public void preMealIcon() {
		preMealIcon.isDisplayed();
	}

	public boolean preMealPosition() {
		// preMealTitle.getLocation();
		WebElement preMeal = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[1]/h3"));
		WebElement mainMeal = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[1]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[2]/h3"));

		int preMealX = preMeal.getLocation().getX();
		int mainMealY = mainMeal.getLocation().getY();

		return preMealX < mainMealY;

	}

	public void SnackButton() {
		SnackButton.click();
	}

	public void nonePremealSnackDisplay() {
		nonePremealSnackDisplay.getText();
	}

	public void caloriesSnackDisplay() {
		caloriesSnackDisplay.isDisplayed();
	}

	public void mainMealTitle_Snacks() {
		mainMealTitle_Snacks.getText();
	}

	public void mainMealDescription_Snacks() {

	}

	public void mainMealSubTitle() {
		mainMealSubTitle.getText();
	}

	public void mainMealUtensilIcon() {
		mainMealUtensilIcon.isDisplayed();
	}

	public void mainMealTime() {
		mainMealTime.isDisplayed();
	}

	public void mainMealTime_1() {
		mainMealTime_1.isDisplayed();
	}

	public void mainMealCalories() {
		// mainMealCalories.getText();
		mainMealCalories.isDisplayed();
	}

	public void completeButton() {
		completeButton.getText();
		completeButton.isDisplayed();
	}

	public void partiallyCompleteButton() {
		partiallyCompleteButton.getText();
		partiallyCompleteButton.isDisplayed();
	}

	public void notCompleteButton() {
		notCompleteButton.getText();
		notCompleteButton.isDisplayed();
	}

	public void summaryFlexCard() {
		summaryFlexCard.isDisplayed();
	}

	public void flexCardSubTitle() {
		flexCardSubTitle.getText();
		flexCardSubTitle.isDisplayed();

	}

	public int flexCardTotalCalories() {
		return extractCalories(totalCaloriesCount.getText());

	}

	public int getPreMealCalories() {

		return extractCalories(preMealCaloriesDisplay.getText());
	}

	private int extractCalories(String text) {
		String num = text.replaceAll("[^0-9]", "");
		return Integer.parseInt(num);
	}

	public int getMainMealCalories() {

		return extractCalories(mainMealCalories.getText());
	}

	public void caloryDetailPosition() {
		caloryDetailPosition.getLocation();
	}

	public void caloryMatch() {
		int actualPreMeal = extractCalory(preMealCaloriesDisplay.getText());
		int ExpectedPreMeal = extractCalory(flexCardPreMealCalories.getText());
		int actualMainMeal = extractCalory(mainMealCalories.getText());
		int ExpectedMainMeal = extractCalory(flexCardMainMealCalories.getText());
		Assert.assertEquals(actualPreMeal, ExpectedPreMeal, "Pre-meal calories mismatch!");
		Assert.assertEquals(actualMainMeal, ExpectedMainMeal, "Main-meal calories mismatch!");
	}

	private int extractCalory(String text) {
		String num = null;
		// String num = text.replaceAll("[^0-9]", "");
		BigInteger bigValue = new BigInteger(num);

		System.out.println("Big number is: " + bigValue);
		return Integer.parseInt(num);
	}

	public void donutChart() {
		donutChart.getText();
		donutChart.isDisplayed();
	}

	public void donutChartCalories() {
		donutChartCalories.isDisplayed();
	}

	public void barChart() {
		barChart.isDisplayed();
	}

	public void horizontalCarbsBar() {
		horizontalCarbsBar.isDisplayed();
	}

	public void macroLableChart() {
		macroLableChart.getText();
		macroLableChart.isDisplayed();
		/*
		 * List<WebElement> macroElements = (List<WebElement>)
		 * driver.findElement(By.xpath("//div[@class='flex flex-wrap gap-2 pt-2']"));
		 * int total = 0;
		 * 
		 * for (WebElement macro : macroElements) { String text =
		 * macro.getText().replaceAll("[^\\d]", ""); // Removes % sign or other chars
		 * total += Integer.parseInt(text); }
		 * 
		 * Assert.assertEquals( 100, total,"Total macro percentages should be 100");
		 */
	}

	public void colorMatch() {
		boolean barChartColor = barChart.isDisplayed();
		boolean macroLableChartColor = macroLableChart.isDisplayed();
		if (barChartColor == macroLableChartColor) {
			Assert.assertEquals(barChartColor, macroLableChartColor, "color mismatch!");
		}
	}

	public void fullMealPlanButtonClick() {
		fullMealPlanButton.click();

	}

	public void fullMealPlanNavigation() {
		driver.navigate().to(
				"https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/view-full-plan-premium?date=2025-07-03&source=home");

	}

	public void getfullMealPlanTitle() {
		fullMealPlanTitle.getText();

	}

	public void backToPlanButton() {
		backToPlanButton.getText();

	}

	public void mealSectionButtons() {
		mealSectionButtons.getText();

	}

	public void flexCardTitle() {
		flexCardTitle.getText();

	}

	public void mealSectionButtonsClick() {
		mealSectionButtons.click();

	}

	public void mealTitle_section() {
		// preMealTitle_section.isDisplayed();
		List<WebElement> preMealTitles = driver
				.findElements(By.xpath("//h2[normalize-space()='Pre-meal: Fenugreek Sprout Salad']"));

		for (WebElement title : preMealTitles) {
			String text = title.getText();
			Assert.assertEquals(text, text.startsWith("Pre-meal: "));
		}

	}

	public void preMealDescription_section() {
		preMealDescription_section.getText();
		preMealDescription_section.isDisplayed();

	}

	public void mealCalories_section() {
		preMealCalories_section.getText();
		preMealCalories_section.isDisplayed();

	}

	public void mealPreparation_section() {
		String expecting = preMealPreparation_section.getText();
		String actual = "N/A";
		if (actual != expecting) {
			preMealPreparation_section.getText();
		} else {
			actual = "N/A";
		}
		assertEquals(actual, expecting);
	}

	public void preMealPortion() {
		preMealPortion.getText();
		preMealPortion.isDisplayed();

	}

	public void nutrientsList() {
		nutrientsList.getText();
		nutrientsList.isDisplayed();
		/*
		 * List<String> expectedText = Arrays.asList("Carbs", "Protein", "Fat",
		 * "Fiber"); List<WebElement> text1 =
		 * driver.findElements(By.xpath("//ul[@class='list-disc list-inside']"));
		 * List<String> actualText = text1.stream().map(WebElement::getText).filter(text
		 * -> !text.isEmpty()) .collect(Collectors.toList());
		 * 
		 * Assert.assertTrue(actualText.containsAll(expectedText), "Text Mismatched");
		 */
	}

	public void mainMealIngredients() {
		mainMealIngredients.isDisplayed();

	}

	public boolean isDiabetesManagementTipsTitle() {

		return diabetesManagementTipsTitle.isDisplayed();
	}

	public void diabetesManagementTips() {
		descriptionDiabetesManagement.isDisplayed();

	}

	public String glycemicImpactText() {
		return glycemicImpact.getText();

	}

	public String impactValue() {
		return glycemicImpactValue.getText();

	}

	public void fullMealPlanPage() {
		fullMealPlanButton.click();

	}

	public void backToPlanButtonClick() {
		backToPlanButton.click();

	}

	public void homePage() {

		driver.navigate().to("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/");

	}

	public void challengeButtonClick() {
		flashingChallengeButton.click();

	}

	public void challengePopWindow() {
		challengePopWindow.isDisplayed();

	}

	public void challengePopWindowTitle() {
		challengePopWindowTitle.getText();
		// String title = challengePopWindowTitle.getText();
		// Assert.assertEquals("Choose Your Challenge", title);
	}

	public void challengePopWindowSubTitle() {
		challengePopWindowSubText.getText();
		// String title =challengePopWindowSubText.getText();
		// Assert.assertEquals("Select a program that best fits your health goals",
		// title);
	}

	public void popWindowChallengeButtonOption() {
		popWindowChallengeButton_1.isDisplayed();
		popWindowChallengeButton_2.isDisplayed();
		/*
		 * boolean button1 = popWindowChallengeButton_1.isDisplayed(); boolean button2 =
		 * popWindowChallengeButton_2.isDisplayed(); Assert.assertTrue(button1,
		 * "Challenge Button 1 is not visible"); Assert.assertTrue(button2,
		 * "Challenge Button 2 is not visible");
		 */
	}

	public void popWindowChallengeFirstButton() {
		popWindowChallengeButton_1.getText();

	}

	public void popWindowChallengeSecondButton() {
		popWindowChallengeButton_2.getText();

	}

	public void weeklyPlanButtonClick() {
		weeklyPlanButton.click();

	}

	public void pdfDownload() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // or use dynamic waits

		// Define download path
		String downloadPath = "C:\\Users\\YourUsername\\Downloads";
		File folder = new File(downloadPath);

		File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".pdf"));
		boolean pdfDownloaded = false;

		for (File file : files) {
			if (file.getName().contains("weekly-plan")) {
				pdfDownloaded = true;
				break;
			}
		}
		Assert.assertTrue(pdfDownloaded, "Weekly plan PDF was not downloaded");
	}

	public void bloodGlucoseButtonClick() {
		bloodGlucoseButton.click();

	}

	public void bloodGlucosepPopup() {
		bloodGlucosepPopup.isDisplayed();

	}

	public void physicalActivityButtonClick() {
		physicalActivityButton.click();

	}

	public void physicalGlucosepPopup() {
		physicalGlucosepPopup.isDisplayed();

	}

	public void foodIntakeButtonClick() {
		foodIntakeButton.click();

	}

	public void foodIntakePopup() {
		foodIntakePopup.isDisplayed();

	}

	public void medicationButtonClick() {
		medicationButton.click();

	}

	public void medicationPopup() {
		medicationPopup.isDisplayed();

	}

	public void logButtonClick() {
		logButton.click();

	}

	public void dashboardPage() {
		driver.navigate().to("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/dashboard");
	}

	public void logEmotionalState() {
		logEmoji.click();
		WebElement logTextInputField = driver.findElement(By.xpath("//textarea[@id='notes']"));
		logTextInputField.clear();
		logTextInputField.sendKeys("Happy");
		logEmotionalStateButton.click();
		homeTabClick.click();

	}

	public void emojiDisplay() {
		String emoji = logEmojiText.getText();
		String mood = logTextInputFieldText.getText();
		Assert.assertTrue(emoji.contains("😄"), "😄");
		Assert.assertEquals("Happy", mood);
	}

}
