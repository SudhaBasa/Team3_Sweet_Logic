package team3.sweet.logic.runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

	@CucumberOptions(tags = "", features = {"src/test/resources/FeatureFiles"}, glue = {
					"team3.sweet.logic.step.definition",
					"team3.sweet.logic.hooks" }, monochrome = true, dryRun = false, plugin = {
							"pretty","html:target/cucumber.html", "json:target/cucumber.json",
							"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})

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
