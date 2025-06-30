package team3.sweet.logic.driver.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import team3.sweet.logic.utils.ConfigReader;
import team3.sweet.logic.utils.LoggerLoad;

public class DriverFactory {
	
	public static ThreadLocal<WebDriver> thdriver = new ThreadLocal<>();
	
	public static String baseUrl = null;
	
	public static WebDriver initialization() {

	
		baseUrl = ConfigReader.getProperty("url"); 
		System.out.println("URL: "+baseUrl);
		String browser = ConfigReader.getProperty("browser");
		System.out.println("Browser: "+browser);
		
		/*String userName = ConfigReader.getProperty("username");
		String password = ConfigReader.getProperty("password");
		
		System.out.println("User Name: " + userName);
		System.out.println("Password: " + password);*/
		
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			//co.addArguments("--headless");
			thdriver.set(new ChromeDriver(co));
		}
		else if (browser.equalsIgnoreCase("firefox")) {

			FirefoxOptions options = new FirefoxOptions();

			options.addArguments("--headless");
			thdriver.set(new FirefoxDriver(options));
		} else if (browser.equalsIgnoreCase("safari")) {
			thdriver.set(new SafariDriver());

		}

		getdriver().get(baseUrl);
		getdriver().manage().window().maximize();
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return thdriver.get();

	}

	public static WebDriver getdriver() {
		if (thdriver == null) {
			LoggerLoad.error("Driver value is null");
		}
		return thdriver.get();

	}

	public static void closeBrowser() {
		getdriver().close();
	}
}
