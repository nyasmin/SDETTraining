package com.fanniemae.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fanniemae.base.TestBase;

public class SDETTestCase extends TestBase{
	
	  @Test(enabled=false)
	  public void openURL() throws InterruptedException {
		  
		// driver.get(config.getProperty("testsiteurl"));

	  }
	  @Test
	  public void loginPage() throws InterruptedException {
		 
		String loginHomeButton = "id_LOGIN_BUTTON_HOME";
		String loginButton = "xpath_LOGIN_BUTTON";
		String username = "id_LOGIN_USERNAME";
		String password = "id_LOGIN_PASSWORD";
		
		Assert.assertTrue(isElementPresent(By.id(OR.getProperty("id_LOGIN_BUTTON_HOME"))));
		click(loginHomeButton);
		type(username,"sdet@sdettraining.com");
		type(password,"Password");
		click(loginButton);
		Thread.sleep(3000);
		
	  }
}
