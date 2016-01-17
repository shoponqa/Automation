package eBFS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {

	
	WebDriver driver;
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signInLink;

	@FindBy(xpath=".//*[@id='email_create']")
	WebElement email;
	@FindBy(xpath="//*[@id='SubmitCreate']")
	WebElement CreateButton;
	
	public CreateAccount(WebDriver argDriver){
		this.driver= argDriver;
		PageFactory.initElements(driver, this);
		
		
	}
	public void ClicksignInLink(){
		signInLink.click();
	}
	public void ClickAccount(String argEmail){
		email.sendKeys(argEmail);
		CreateButton.click();
	}
}
