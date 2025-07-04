package team3.sweet.logic.runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

	@CucumberOptions(tags = "", features = {
			"src/test/resources/FeatureFiles/13_Login_OnboardingStep1UI_Validation.feature",
			"src/test/resources/FeatureFiles/14_Login_FunctionalAndNonFunctionalScenarios_Step2.feature",
			"src/test/resources/FeatureFiles/15_Login_FunctionalOnboarding_Step2AndNonFunctional_Step3.feature",
			"src/test/resources/FeatureFiles/16_Login_FunctionalOnboarding_Step3AndNonFunctional_Step4.feature",
			"src/test/resources/FeatureFiles/17_Login_FunctionalOnboarding_Step4AndNonFunctional_Step5.feature",
			"src/test/resources/FeatureFiles/18_Login_FunctionalOnboarding_Step5AndNonFunctional_Step6.feature",
			"src/test/resources/FeatureFiles/19_Login_FunctionalOnboarding_Step6AndNonFunctional_Step7.feature",
			"src/test/resources/FeatureFiles/20_Login_ValidationForOnboarding_Step8.feature",
			"src/test/resources/FeatureFiles/21_Login_ValidationForOnboarding_Step9.feature",
			"src/test/resources/FeatureFiles/22_Login_ValidationForOnboarding_Step10.feature",
			"src/test/resources/FeatureFiles/23_Login_ValidationForOnboarding_Step11.feature",
			"src/test/resources/FeatureFiles/24_Login_ValidationForOnboarding_Step12.feature",
			"src/test/resources/FeatureFiles/25_Login_ValidationForNonFunctional_Step12_PersonalisedScreen.feature" }, glue = {
					"team3.sweet.logic.step.definition",
					"team3.sweet.logic.hooks" }, monochrome = true, dryRun = false, plugin = {
							"html:target/cucumber.html", "json:target/cucumber.json" })

	public class TestNGTestRunner extends AbstractTestNGCucumberTests {

		@Override
		@DataProvider(parallel = false)
		public Object[][] scenarios() {
			return super.scenarios();
		}
		// @BeforeTest

		// @Parameters({ "browser" })

		/*
		 * public void defineBrowser(String browser) throws Throwable {
		 * 
		 * //ConfigReader.setBrowserName(browser);
		 * 
		 * 
		 * }
		 */
	}

}
