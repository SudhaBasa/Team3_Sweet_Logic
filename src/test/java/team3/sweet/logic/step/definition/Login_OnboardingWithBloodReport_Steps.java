package team3.sweet.logic.step.definition;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.*;
import team3.sweet.logic.driver.factory.DriverFactory;
import team3.sweet.logic.page.objects.Login_OnboardingWithBloodReport_Page;
import team3.sweet.logic.utils.ConfigReader;

public class Login_OnboardingWithBloodReport_Steps {

	// Login_OnboardingWithBloodReport_Page lobp = new
	// Login_OnboardingWithBloodReport_Page(DriverFactory.getdriver());

	WebDriver driver = DriverFactory.getdriver();
	Login_OnboardingWithBloodReport_Page lobp = new Login_OnboardingWithBloodReport_Page(driver);

	@Given("User filling profile form.")
	public void user_filling_profile_form() {

		lobp.completeOnboarding();

	}

	// 06_Login_BloodReportUploadModal.feature

	@Given("User clicks Upload blood button after reaching upload report page.")
	public void user_clicks_upload_blood_button_after_reaching_upload_report_page() {

		lobp.navigateToUploadBoxPage();
		lobp.clickUploadBReportBtn();
	}

	// 7

	@When("User clicks {string} after uploading valid file.")
	public void user_clicks_after_uploading_valid_file(String string) {
		String filePath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\testData\\Dummy_Blood_Report_Elora_Bright.pdf";
		System.out.println(filePath);
		lobp.fileInput().sendKeys(filePath);

		lobp.clickUploadAndProcessBtn();

	}

	@Then("User should see Report analysis.")
	public void user_should_see_report_analysis() {

	}

	// 6

	@When("User clicks {string}.")
	public void user_clicks(String string) {

		lobp.clickCancelOnFileUpload();
	}

	@Then("Modal should be closed and user returned to previous screen.")
	public void modal_should_be_closed_and_user_returned_to_previous_screen() {

		// lobp.getuploadReportHeadingText();

		assertEquals(lobp.getuploadReportHeadingText(), ConfigReader.getProperty("uploadReportHeadingText"));
	}

	// 5

	@Then("{string} button should be enabled.")
	public void button_should_be_enabled(String string) {

		lobp.uploadAndProcessBtnEnabled();
	}

	// 4
	@When("User uploads valid PDF file.")
	public void user_uploads_valid_pdf_file() {
		String filePath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\testData\\PATIENT_BLOOD_WORK_REPORT.pdf";
		System.out.println(filePath);
		lobp.fileInput().sendKeys(filePath);

		lobp.clickUploadAndProcessBtn();

	}

	@Then("Upload should see processing percentage bar.")
	public void upload_should_see_processing_percentage_bar() {

		System.out.println("It is throwing an erro while uploading pdf file");

	}

	// 2

	@When("User tries to upload a non-PDF file.")
	public void user_tries_to_upload_a_non_pdf_file() {

		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\Blood-work-report.docx";
		System.out.println(filePath);
		lobp.fileInput().sendKeys(filePath);

		lobp.clickUploadAndProcessBtn();

	}

	@Then("User should see {string} error.")
	public void user_should_see_error(String string) {

		assertEquals(lobp.getFileUploadErrorMsg(), ConfigReader.getProperty("fileUploadErrorMsg"));
	}

	// 1
	@Given("User is on blood report modal.")
	public void user_is_on_blood_report_modal() {
		System.out.println("The user is on drag and drop upload box");
	}

	@When("User hovers over the upload box.")
	public void user_hovers_over_the_upload_box() {
		Actions actions = new Actions(DriverFactory.getdriver());
		actions.moveToElement(lobp.getUploadBox()).perform();

	}

	@Then("Upload box should show drag & drop interaction.")
	public void upload_box_should_show_drag_drop_interaction() {

		WebElement uploadBox = lobp.getUploadBox();
		String dragAndDrop = uploadBox.getDomAttribute("class");
		// System.out.println(dragAndDrop);

		Assert.assertTrue(dragAndDrop.contains("border"));
	}

	// 05_Login_BloodReportUploadModalNavigation
	@Given("User is in upload blood report page.")
	public void user_is_in_upload_blood_report_page() {
		System.out.println("User is on Drop afile, Dodge the bording steps page");

	}

	@When("User clicks on {string} button.")
	public void user_clicks_on_button(String string) {
		lobp.clickUploadBReportBtn();
	}

	@Then("User should navigate to blood report modal.")
	public void user_should_navigate_to_blood_report_modal() {

		assertEquals(lobp.getUploadBRPageHeadingText(), ConfigReader.getProperty("uplodBRHeading"));
	}

}
