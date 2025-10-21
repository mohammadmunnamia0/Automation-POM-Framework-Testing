package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Log;

// control+shift+o = will remove the unused imports

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod // Annotation will work before each test
	public void setup() { // function that will work before running the test example: start the browser

		Log.info("Setting Up WebDriver...");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		Log.info("Navigating to Test URL...");

		driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			Log.info("Closing Browser...");
			driver.quit();
		}
	}
}
