package team3.sweet.logic.hooks;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import team3.sweet.logic.driver.factory.DriverFactory;
import team3.sweet.logic.utils.LoggerLoad;

public class Hooks {

	private static WebDriver driver;

	@Before
	public static void initialization() throws Throwable {

		DriverFactory.initialization();
		driver = DriverFactory.getdriver();
		LoggerLoad.info("Starting browser");
		
	}
	

	@After
	public void AddScreenshot(Scenario scenario) throws IOException {

		if (scenario.isFailed()) {
			
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My Screenshot");
			Allure.addAttachment("Failed Scenario Screenshot", new ByteArrayInputStream(screenshot));
		}

	}

	@After
	public static void afterAll() {

		DriverFactory.closeBrowser();
		LoggerLoad.info("closing browser");

	}
}
