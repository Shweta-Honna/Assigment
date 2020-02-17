package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
		WebDriver driver; 
		public LoginPage(WebDriver driver) { 
			this.driver = driver; 
		} 
  
    // Using FindBy for locating elements 
	//locate Email
			@FindBy(how = How.XPATH, using = "//input[@id='email']") 
			WebElement emailTextBox; 
   //Locate Password
			@FindBy(how = How.XPATH, using = "//input[@id='pass']")
			WebElement passwordTextBox; 
    
    //Click on Login
			@FindBy(how = How.XPATH, using =  "//input[@value='Log In']") 
			WebElement nextButton;
    
 
			
	// This method is to set Email in the password text box 
			public void setEmail(String strEmail)
			{ 
				emailTextBox.sendKeys(strEmail); 
			} 
    
	// This method is to set Password in the password text box 
			public void setPassword(String strPassword)
			{ 
				passwordTextBox.sendKeys(strPassword); 
			} 
			
       
	// This method is to click on Login Button 
			public void clickOnNextButton()
			{ 
				nextButton.click(); 
			} 
    
  


}
