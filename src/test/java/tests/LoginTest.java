package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login;
import utils.Log;

public class LoginTest extends BaseTest {

	@Test
	public void testValidLogin() {

		Log.info("Starting Login Test...");
		Login login = new Login(driver); // Here the "driver" is coming form the BaseTest, cause we inherited the

		Log.info("Adding the Credentials...");
		login.enterUserName("admin@yourstore.com");
		login.enterPAssword("admin");
		login.clickLogin();
		// login.clickVerify();

		System.out.println("Page Title :" + driver.getTitle());
		Log.info("Verifying Page Title...");
		Assert.assertEquals(driver.getTitle(), "Just a moment...");

		Log.info("Login Test Complete...");
	}
}
