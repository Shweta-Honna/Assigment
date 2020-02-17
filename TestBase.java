package com.test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.utilityFiles.Constants;
public class TestBase {
	public static WebDriver driver = null; 
	  
    @BeforeSuite
    public void initialize() throws IOException { 
    	
    //To disable chrome notification Pop-ups 
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--disable-notifications");
    	
    //To set the path 
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shweta\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
        driver = new ChromeDriver(options); 
    
     // To maximize browser 
       driver.manage().window().maximize(); 
    
      // Implicit wait 
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
        
      //DeleteAll Cookies
        driver.manage().deleteAllCookies();
    
      // To open Facebook site 
        driver.get(Constants.URL); 
    } 
    
    
  
    @AfterSuite
    // To Quit 
    public void TeardownTest()
    { 
        TestBase.driver.quit(); 
    } 

}
