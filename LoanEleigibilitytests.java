package Upgarde.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.upgrade.qa.base.Testbaseupgrade;
import com.upgrade.qa.pages.CheckYourRatePage;
import com.upgrade.qa.pages.LoanEligibiltyPage;
import com.upgrade.qa.pages.PersonalInformationPage;

public class LoanEleigibilitytests extends Testbaseupgrade {

	CheckYourRatePage checkYouRatePage ;
	PersonalInformationPage personalInformationPage;
	LoanEligibiltyPage loanEligibiltyPage;
	
	//System.out.println(ActYourLoanAmount.getText());

	//System.out.println(ActLoanAmount.getText());
	
	//System.out.println("MonthlyPayment is" + ActMonthlyPayment.getText());
	
	//System.out.println(ActTermInAPR.getText());
	
	
	public LoanEleigibilitytests(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		checkYouRatePage = new CheckYourRatePage();
		personalInformationPage = new PersonalInformationPage();
		loanEligibiltyPage = new LoanEligibiltyPage();
		}

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
	public void verifyValidateinfo(){
		//LoanEligibiltyPage ActYourLoanAmount=LoanEligibiltyPage.
		//LoanEligibiltyPage ActLoanAmount=loanEligibiltyPage.Valiadateinformationsignout();	
		//LoanEligibiltyPage ActMonthlyPayment=loanEligibiltyPage.Valiadateinformationsignout();
		//LoanEligibiltyPage ActTermInAPR=loanEligibiltyPage.Valiadateinformationsignout();
		//System.out.println(ActYourLoanAmount);
		
		//Assert.assertEquals(ActYourLoanAmount, "Your Loan Amount");
		
		
	}
	
	
}
