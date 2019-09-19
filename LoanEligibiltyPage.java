package com.upgrade.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.upgrade.qa.base.Testbaseupgrade;

public class LoanEligibiltyPage extends Testbaseupgrade {

	@FindBy(xpath = "//div[contains(text(),'Your Loan Amount')]")
	WebElement ActYourLoanAmount;

	@FindBy(xpath = "//span[@class='sc-chPdSV VlhWk']")
	WebElement ActLoanAmount;

	@FindBy(xpath = "//span[@data-auto='defaultMonthlyPayment']")
	WebElement ActMonthlyPayment;

	@FindBy(xpath = "//div[@class='section--sm']")
	WebElement ActTermInAPR;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='layout__wrap']/main[@class='container-fluid layout__main layout-default']/div/header[@class='header header--collapsed']/div[@class='header-nav']/label[1]")
	WebElement headerMenu;

	@FindBy(xpath = "//nav[@class='header-nav-menu']//label[@class='header-nav__toggle'][contains(text(),'Menu')]")
	WebElement Menubtn;

	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	WebElement Signoutbtn;

	public LoanEligibiltyPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyPersonalInformationPageTitle(){
		return driver.getTitle();
	}
	
	
	public LoanEligibiltyPage Valiadateinformationsignout() {

		ActYourLoanAmount.getText();
		ActLoanAmount.getText();
		ActMonthlyPayment.getText();
		ActTermInAPR.getText();
		headerMenu.click();
		Menubtn.click();
		Signoutbtn.click();

		return new LoanEligibiltyPage();
	}

	
}


