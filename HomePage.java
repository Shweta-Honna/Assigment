package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
		WebDriver driver; 
	  
		public HomePage(WebDriver driver)
		{ 
			this.driver = driver; 
		} 
	
	
	//to post something say HelloWorld
		@FindBy(how=How.XPATH,using = "//textarea[@title='Write something here...']")
		WebElement helloworldtext;

    //click on post
		@FindBy(how=How.XPATH,using = "//button[@data-testid='react-composer-post-button']")
		WebElement clickonpost;
	
	// This method is to write some data in text box 
		public void postHelloWorld(String HelloWorld)
		{
			helloworldtext.sendKeys(HelloWorld);
		}

	// This method is to click on post 
		public void clickOnPost()
		{
			clickonpost.click();
		}

}
