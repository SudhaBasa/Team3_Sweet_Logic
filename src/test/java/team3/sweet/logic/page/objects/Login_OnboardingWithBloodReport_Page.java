package team3.sweet.logic.page.objects;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import team3.sweet.logic.utils.CommonUtils;
import team3.sweet.logic.utils.ConfigReader;

public class Login_OnboardingWithBloodReport_Page {

	WebDriver driver;

	public Login_OnboardingWithBloodReport_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElements
	@FindBy(xpath = "//button[contains(@class, 'inline-flex') and contains(text(), 'Start Today')]")
	WebElement startTodayButton;

	@FindBy(name = "email")
	WebElement emailIdInputBox;

	@FindBy(xpath = "//button[normalize-space()='Continue with email']")
	WebElement continueWithEmailBtn;

	@FindBy(xpath = "//input[@id=':rd:-form-item']")
	WebElement fullNameInputBox;

	@FindBy(xpath = "//input[@id=':re:-form-item']")
	WebElement userNameInputBox;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordInputBox;

	@FindBy(id = "terms")
	WebElement termsCheckBox;

	@FindBy(xpath = "//button[@type='submit' and text()='Create Account']")
	WebElement createAccountBtn;

	@FindBy(xpath = "//button[text()='Upload Blood Report']")
	WebElement uploadBReportBtn;

	@FindBy(xpath = "//button[normalize-space()='Step Through Onboarding']")
	WebElement stepThruOnboardingBtn;

	@FindBy(xpath = "//p[text()='Drag & drop or click to upload']")
	WebElement dragAndDropBtn;

	@FindBy(xpath = "//h1[contains(text(),'Just a quick upload, and we’ll handle the rest!')]")
	WebElement uploadBRPageHeading;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div")
	WebElement uploadBox;

	@FindBy(xpath = "//input[@type='file']")
	WebElement dragAndDrop;

	@FindBy(xpath = "//input[@type='file' and contains(@accept, '.pdf')]")
	WebElement fileInput;

	@FindBy(xpath = "//button[normalize-space()='Upload & Process']")
	WebElement uploadAndProcessBtn;
	
	@FindBy(xpath="//div[@class='flex items-center text-red-500 text-sm mt-2']")
	WebElement fileUploadErrorMsg;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement fileUploadCancelBtn;
	
	@FindBy(xpath="//h1[normalize-space()='Drop a file, Dodge the boring steps!']")
	WebElement uploadReportHeading;

	// methods

	public void completeOnboarding() {
		clickStartTodayButton();
	    enterEmailID(null);
	    clickContinueWithEmailBtn();
	    enterFullName(null);
	    enterUserName(null);
	    enterpassword(null);
	    clickTermsCheckBox();
	    clickCreateAccountBtn();
	}
	
	public String getuploadReportHeadingText() {
		return uploadReportHeading.getText();

	}
	public void clickCancelOnFileUpload() {
		CommonUtils.clickElement(driver, fileUploadCancelBtn);
	}
	public boolean uploadAndProcessBtnEnabled() {
		return uploadAndProcessBtn.isEnabled();
	}
	public String getFileUploadErrorMsg() {
		return fileUploadErrorMsg.getText();
	}
	public void clickUploadAndProcessBtn() {
		CommonUtils.clickElement(driver, uploadAndProcessBtn);
	}

	public WebElement fileInput() {
		return fileInput;
	}

	public void navigateToUploadBoxPage() {
		driver.get(ConfigReader.getProperty("uploadBloodReportLink"));
	}

	public WebElement getUploadBox() {
		return uploadBox;
	}

	public String getUploadBRPageHeadingText() {
		return uploadBRPageHeading.getText();

	}

	public WebElement clickDragAndDropBtn() {
		return dragAndDrop;
	}

	public void clickStepThruOnboardingBtn() {
		CommonUtils.clickElement(driver, stepThruOnboardingBtn);
	}

	public void clickUploadBReportBtn() {
		CommonUtils.clickElement(driver, uploadBReportBtn);
	}

	public void enterEmailID(String emaiId) {
		// emailIdInputBox.sendKeys(ConfigReader.getProperty("newEmailId"));
		emailIdInputBox.sendKeys(CommonUtils.generateRandomEmail());
	}

	public void clickContinueWithEmailBtn() {
		CommonUtils.clickElement(driver, continueWithEmailBtn);
	}

	public void enterFullName(String fullName) {
		// fullNameInputBox.sendKeys(ConfigReader.getProperty("fullName"));
		fullNameInputBox.sendKeys(CommonUtils.generateFullName());
	}

	public void enterUserName(String userName) {
		// userNameInputBox.sendKeys(ConfigReader.getProperty("newUserName"));
		userNameInputBox.sendKeys(CommonUtils.generateUserName());
	}

	public void enterpassword(String password) {
		passwordInputBox.sendKeys(ConfigReader.getProperty("password"));
	}

	public void clickTermsCheckBox() {
		CommonUtils.clickElement(driver, termsCheckBox);
	}

	public void clickCreateAccountBtn() {
		CommonUtils.clickElement(driver, createAccountBtn);
	}

	public void clickStartTodayButton() {

		CommonUtils.clickElement(driver, startTodayButton);
		// startTodayButton.click();
	}

}
