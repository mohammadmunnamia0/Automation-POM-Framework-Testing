package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login;

public class LoginTest extends BaseTest {

	@Test
	public void testValidLogin() {
		Login login = new Login(driver); // Here the "driver" is coming form the BaseTest, cause we inherited the

		login.enterUserName("admin@yourstore.com");
		login.enterPAssword("admin");
		login.clickLogin();
		// login.clickVerify();
		System.out.println("Page Title :" + driver.getTitle());
	}
}
