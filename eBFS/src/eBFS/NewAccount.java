package eBFS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount {
	WebDriver driver;
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signInLink;
	@FindBy(xpath=".//*[@id='email']")
	WebElement newaccountemail;
	@FindBy(xpath="//*[@id='passwd']")
	WebElement newpassword;
	@FindBy(xpath="//*[@id='SubmitLogin']")
	WebElement submitclick; 
	
	public NewAccount(WebDriver argDriver){
		
		this.driver=argDriver;
		PageFactory.initElements(driver, this);
	}
	public void ClicksignInLink(){
		signInLink.click();
	}
	public void Createnewaccount(String agrEmail){
		newaccountemail.sendKeys(agrEmail);
	}
	public void Createnewpassword(String argPass){
		newpassword.sendKeys(argPass);
	}
	public void Clicksubmit(){
		submitclick.click();
	}
}
