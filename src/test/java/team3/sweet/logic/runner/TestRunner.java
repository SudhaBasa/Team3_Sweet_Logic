package team3.sweet.logic.runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

	@CucumberOptions(tags = "",features = "src/test/resources/FeatureFiles/01_Login_OnboardingStep1UI_Validation.feature", 
			glue = { "team3.sweet.logic.step.definition", "team3.sweet.logic.hooks" },
			monochrome = true, dryRun = false)
            //,plugin = { "html:target/cucumber.html", "json:target/cucumber.json" })
	
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

		@Override
		@DataProvider(parallel = false)
		public Object[][] scenarios() {
			return super.scenarios();
		}
		//@BeforeTest

		//@Parameters({ "browser" })

		/*public void defineBrowser(String browser) throws Throwable {

			//ConfigReader.setBrowserName(browser);


		}*/
	}

}
