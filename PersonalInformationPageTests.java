package Upgarde.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.upgrade.qa.base.Testbaseupgrade;
import com.upgrade.qa.pages.CheckYourRatePage;
import com.upgrade.qa.pages.PersonalInformationPage;
import com.upgrade.qa.pages.LoanEligibiltyPage;

public class PersonalInformationPageTests extends Testbaseupgrade {
	
	CheckYourRatePage checkYouRatePage ;
	PersonalInformationPage personalInformationPage;
	LoanEligibiltyPage loanEligibiltyPage;
	
	
	
	public PersonalInformationPageTests(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		checkYouRatePage = new CheckYourRatePage();
		personalInformationPage = new PersonalInformationPage();
		}
	
	
	//@Test(priority=1)
	//public void checkYouRatePageTest()
	//{
		//		loanEligibiltyPage = personalInformationPage.PersonalInformation1();
		
	//}
	public void checkYouRatePageTest()
	{
		personalInformationPage=checkYouRatePage.CheckYourRate1(prop.getProperty("desiredAmount"));
		
	}
	
	
	@Test(priority=2)
	public void PersonalInformationPageTest(){
		checkYouRatePageTest();
				loanEligibiltyPage = personalInformationPage.PersonalInformation1();
		}
	
	@Test(priority =3)
	public void verifyPersonalInformationPageTitle(){
		String title=personalInformationPage.verifyPersonalInformationPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Check Your Rate | Personal Loans | Upgrade");
		
		
	}

	@AfterMethod
	public void teardown(){
		//driver.quit();	
	}
	
	
	
	
	
}
