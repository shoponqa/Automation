package eBFS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signInLink;
	
	public Homepage(WebDriver argDriver){
		
		this.driver=argDriver;
		PageFactory.initElements(driver, this);
		
		
		
		
		
	}

	public void clicksignInLink(){
		signInLink.click();
	}
}
		//PageFactory.initElements(driver, this);
		
	
	//public void clickSignInLink(){
		
		//signInLink.click();
	

	
		
		
		
	
	

