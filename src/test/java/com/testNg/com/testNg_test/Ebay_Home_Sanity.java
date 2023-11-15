package com.testNg.com.testNg_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class Ebay_Home_Sanity {
	
	WebDriver driver;
	

	  @BeforeClass 
	  public void beforeClassSetup() {
	  System.out.println("Before Class Settings Done");
	  System.out.println("Execution Starts: EBayHome_Sanity");
	  }
	  
	  @AfterClass 
	  public void afterClassSetup() {
	  System.out.println("After Class Settings Done");
	  System.out.println("Execution Ends: EBayHome_Sanity"); 
	  }
	  
	  @BeforeMethod
	  public void setUp() throws Exception {
	   driver = new ChromeDriver(); 
	   driver.get("https://www.ebay.com/"); 
	  Thread.sleep(2000); }
	  
	  @AfterMethod
	  public void tearDown() 
	  { driver.close(); 
	  	}
	  
	  
	
	/*
	 * @Test public void empty_search_test() throws Exception { WebDriver driver =
	 * new ChromeDriver();
	 * 
	 * driver.get("https://www.ebay.com/");
	 * 
	 * Thread.sleep(2000);
	 * 
	 * String expectedURL = "https://www.ebay.com/v/allcategories"; String
	 * expectedTitle = "All Categories - Browse and Discover more | eBay";
	 * 
	 * Assert.assertTrue(driver.findElement(By.cssSelector("input#gh-btn")).
	 * isEnabled(), "Verify Search Button Enabled");
	 * 
	 * driver.findElement(By.cssSelector("input#gh-btn")).click();
	 * Thread.sleep(2000); String newUrl = driver.getCurrentUrl(); String newTitle =
	 * driver.getTitle(); System.out.println(newUrl); System.out.println(newTitle);
	 * 
	 * Assert.assertEquals(newUrl, expectedURL,"Verify URL of the new page");
	 * Assert.assertEquals(newTitle, expectedTitle,"Verify Title of the new page");
	 * 
	 * }
	 */
	
	  @Test 
	  public void empty_search_test_softassert() throws Exception {
		  
		  
		  driver = new ChromeDriver();
		  
		  driver.get("https://www.ebay.com/");
		  
		  Thread.sleep(2000);
	  
	  SoftAssert sa = new SoftAssert();
	  
	  String expectedURL = "https://www.ebay.com/v/allcategories"; 
	  String expectedTitle = "All Categories - Browse and Discover more | eBay";
	  
	  sa.assertTrue(driver.findElement(By.cssSelector("input#gh-btn")).isEnabled(),
	  "Verify Search Button Enabled");
	  
	  driver.findElement(By.cssSelector("input#gh-btn")).click();
	  Thread.sleep(2000); 
	  String newUrl = driver.getCurrentUrl();
	  String newTitle =driver.getTitle();
	  System.out.println(newUrl); 
	  System.out.println(newTitle);
	  
	  sa.assertEquals(newUrl, expectedURL,"Verify URL of the new page");
	  sa.assertEquals(newTitle, expectedTitle,"Verify Title of the new page");
	  
	  //driver.close();
	  
	  sa.assertAll();//if we dont put this method test case will never fail
	  
	  }
	  
	  @Test
	  
	  public void testMethod(){
	    System.out.println("Iam in Test Method");
}
	  
}