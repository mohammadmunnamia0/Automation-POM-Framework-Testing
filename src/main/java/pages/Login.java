package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	// step 1 = import the WebDriver
	private WebDriver driver;

	// step 2 = declare all the locator
	private By userNameTextbox = By.id("Email");
	private By userPasswordbox = By.id("Password");
	private By loginButton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	// private By clickVerify = By.xpath("//*[@id=\"uMtSJ0\"]/div/label/input");

	// step 3 = create the constructor

	// constructor same name as class name without return type, when we will create
	// a object of this login class that time this constructor pass the instance of
	// the driver as a argument
	public Login(WebDriver driver) {
		this.driver = driver;
	}

	// step 4 = Create the Test Functions
	public void enterUserName(String username) {
		driver.findElement(userNameTextbox).clear();
		driver.findElement(userNameTextbox).sendKeys(username);
	}

	public void enterPAssword(String password) {
		driver.findElement(userPasswordbox).clear();
		driver.findElement(userPasswordbox).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

//	public void clickVerify() {
//		driver.findElement(clickVerify).click();
//	}
}
