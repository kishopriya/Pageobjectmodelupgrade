package Upgarde.qa.tests;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import org.testng.annotations.Test;

import com.upgrade.qa.base.Testbaseupgrade;
import com.upgrade.qa.pages.CheckYourRatePage;
import com.upgrade.qa.pages.PersonalInformationPage;

public class CheckYourRatetests extends Testbaseupgrade {
 
	CheckYourRatePage checkYouRatePage ;
	PersonalInformationPage personalInformationPage;
	
	
	
	public CheckYourRatetests(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		checkYouRatePage = new CheckYourRatePage();
		}
	
	@Test(priority=1)
	public void checkYouRatePageTest()
	{
		personalInformationPage=checkYouRatePage.CheckYourRate1(prop.getProperty("desiredAmount"));
		
	}
	
	@Test(priority=2)
	public void ValidateLoginPageTitle()
	{
		String title = checkYouRatePage.ValidateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Check Your Rate | Personal Loans | Upgrade");
	}
		
	
	
	
	
	@AfterMethod
	public void tearDown()
	
	{
		//driver.quit();
	}
	
	
	
	
	
}
