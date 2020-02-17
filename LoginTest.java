package com.test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilityFiles.Constants;

public class LoginTest extends TestBase { 
  
    @Test
    public void init() throws Exception { 
  
        
        LoginPage loginpage =   PageFactory.initElements(driver, LoginPage.class); 
        HomePage homePage =   PageFactory.initElements(driver, HomePage.class);
     
        loginpage.setEmail(Constants.Username); 
        loginpage.setPassword(Constants.Password);
        loginpage.clickOnNextButton();
        
       
        homePage.postHelloWorld(Constants.PostSomeData);
        Thread.sleep(2000);
        homePage.clickOnPost();
       
       
        
        
    } 

}
