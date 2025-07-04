package team3.sweet.logic.utils;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonUtils {

	public WebDriver driver;

	public CommonUtils(WebDriver driver) {
		this.driver = driver;
	}

	public static void clickElement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static String generateRandomEmail() {
		String randomString = UUID.randomUUID().toString().replace("-", "").substring(0, 4);
		return "Sweetlo_" + randomString + "@gmail.com";
	}

	public static String generateFullName() {
		String randomSuffix = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").substring(0,5);
		return "Sweetc" + randomSuffix;
	}

	public static String generateUserName() {
		String randomSuffix = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").substring(0, 5);
		return "Swee" + randomSuffix;
	}

	public static boolean waitForElementStaleness(WebDriver driver, WebElement element, long durationInSeconds) {
		boolean isStale = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			wait.until(ExpectedConditions.stalenessOf(element)); // Wait until element becomes stale
			isStale = true;
		} catch (Exception e) {
			LoggerLoad.error("waitForElementStaleness()::The element " + element.toString()
					+ " did not become stale. Exception is: " + e.getMessage());
		}
		return isStale;
	}
	
	public static void waitForElement(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public static void waitForVisibilityOfAllElements(WebDriver driver,List<WebElement> elements) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	
	
	public static int getRandomNumber(int min, int max) {
		
		return new Random().nextInt((max - min) + 1) + min;
	}

}
