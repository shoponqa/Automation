package Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import eBFS.CreateAccount;
import eBFS.ExistingAccount;
import eBFS.Homepage;
import eBFS.NewAccount;

public class ebfstest {

	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	Homepage objhomepage;
	CreateAccount objcreateaccount;
	ExistingAccount objexistingaccount;
	NewAccount objnewaccount;

	@Test(priority = 0)
	public void Homepage() {
		objhomepage = new Homepage(driver);
		objhomepage.clicksignInLink();
		// objhomepage.clicksignInLink();
	}

	@Test(priority = 1)
	public void CreateAccount() {
		objcreateaccount = new CreateAccount(driver);
		objcreateaccount.ClicksignInLink();
		System.out.println("Click has been done");
		objcreateaccount.ClickAccount("InvalidEmail@email");
//		TakesScreenshot ts=(TakesScreenshot)driver;
		
//Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='create_account_error']")).isDisplayed());
	
	}

	@Test(priority = 2)

	public void ExistingAccount() {
		objexistingaccount = new ExistingAccount(driver);
		objexistingaccount.ClicksignInLink();
		objexistingaccount.exAccount("rabbani@rabbani.com");

	}

	@Test(priority = 3)
	public void NewAccount() {
		objnewaccount = new NewAccount(driver);
		objnewaccount.ClicksignInLink();
		objnewaccount.Createnewaccount("mizan@gmail.com");
		objnewaccount.Createnewpassword("password123");
		objnewaccount.Clicksubmit();

	}

	@BeforeMethod

	public void browser() {
		driver = new FirefoxDriver();
		driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void teardown() {
//
//		 report = new
//		 ExtentReports("C:\\Users\\Mizanur\\Downloads\\Cucumber_Jar\\newReport1.html");
//		 logger = report.startTest("TestBlogTitle");
//		 logger.log(LogStatus.INFO, "Browser strated ");
//		 String image =
//		 logger.addScreenCapture("C:\\Users\\Mizanur\\Downloads\\Cucumber_Jar\\newReport1.html");
//		 logger.log(LogStatus.PASS, "Title Verified", image);
//		// if (result.getStatus() == ITestResult.FAILURE) {
//		// Utility.CaptureScreenshot(driver, result.getName());
//		// logger.log(LogStatus.FAIL, "Title verification");
//		// }
//		 report.endTest(logger);
//		 report.flush();
			driver.quit();
		 }


	
}
