package eBFS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistingAccount{
	WebDriver driver;
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signInLink;
	@FindBy(xpath=".//*[@id='email_create']")
	WebElement exEmail;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	WebElement CreateButton;

	public ExistingAccount(WebDriver argDriver){
		
		this.driver=argDriver;
		PageFactory.initElements(driver, this);
	}
	public void ClicksignInLink(){
		signInLink.click();
	}

public void exAccount(String argEmail){
	exEmail.sendKeys(argEmail);
	CreateButton.click();
}
}