package com.tests;
 
	import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
	 
	public class AppTest {
	    WebDriver driver;
	    public String baseUrl;
	 
	    @Before
	    public  void setUp(){
	        /*FirefoxProfile profile = new FirefoxProfile();
	        driver = new FirefoxDriver(profile);*/
	        
	        driver = new HtmlUnitDriver();
	        baseUrl = "http://localhost:8080";
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        System.out.println(" test is starting");
	    }
	 
	    @Test
	    public void testLoadingFirstPage(){
	        driver.get("http://www.google.com/");
	        Assert.assertEquals("Google",driver.getTitle());
	        System.out.println(driver.getTitle());
	    }
	 
	    
	    @Test
	    public void testLoadingPage() {
	        driver.get("http://www.google.com/");
	        Assert.assertEquals("Google",driver.getTitle());
	        System.out.println(driver.getTitle());
	    }
	 
	    @After
	    public void tearDown() {
	        driver.quit();
	        System.out.println(" test is over");
	 
	    }
	}


