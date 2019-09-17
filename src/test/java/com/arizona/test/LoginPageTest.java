package com.arizona.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.arizona.Pages.HomePage;
import com.arizona.Pages.LoginPage;
import com.arizona.TestBase.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() 
	{
		super();
	}
//Initialization of driver and Login
	
	//Init
@BeforeClass
	public void setUp() 
	{
		initialization();
		 loginPage = new LoginPage();
		 
	}

//validate Logo
@Test(priority = 1)
	public void validateLogo()
	{
		boolean flag = loginPage.valiadeCRMlogo();
		Assert.assertTrue(flag);
	}
//Enter Username and Password	
@Test(priority = 2)
	public void loginTest()
	{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}


@AfterClass
public void tearDown()
{
	driver.close();
	driver.quit();
}
}	
