package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics 
{

	@BeforeSuite
	public void setUp()
	{
		System.out.println("SetUp property for Chrome");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("LaunchBrowser");
	}
	
	@BeforeClass
	public void login()
	{
		System.out.println("Login to app");
		
	}
	
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("Enter URL");
	}
	
	@Test
	public void googleTitleTest()
	{
		System.out.println("Google Title Test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("Search test");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("logout from app");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("Delete all cookies");
	}
	
	
}
