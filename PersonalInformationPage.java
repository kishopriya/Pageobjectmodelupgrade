package com.upgrade.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.upgrade.qa.base.Testbaseupgrade;

public class PersonalInformationPage extends Testbaseupgrade {

	
	@FindBy(xpath="//div[@class='sc-esjQYD eWKYyK']//label[1]//div[1]")
	WebElement RDbtn;
	
	@FindBy(xpath="//div[contains(text(),'Individual')]")
	WebElement IndividualRDbtn;
	
	@FindBy(xpath="//input[@name='borrowerFirstName']")
	WebElement FirstNamefield;
	
	@FindBy(xpath="//input[@name='borrowerLastName']")
	WebElement LastNamefield;
	
	@FindBy(xpath="//input[@name='borrowerStreet']")
	WebElement Streetfield;
	
	@FindBy(xpath="//input[@name='borrowerCity']")
	WebElement borrowerCity;
	
	@FindBy(xpath="//input[@name='borrowerState']")
	WebElement borrowerState;
	
	@FindBy(xpath="//input[@name='borrowerZipCode']")
	WebElement borrowerZipCode;
	
	@FindBy(xpath="//input[@name='borrowerDateOfBirth']")
	WebElement borrowerDateOfBirth;
	
	@FindBy(xpath="//input[@name='borrowerIncome']")
	WebElement borrowerIncome;
	
	@FindBy(xpath ="//button[contains(text(),'Confirm')]")
	WebElement Confirmbtn;
	
	@FindBy(xpath="//input[@name='borrowerAdditionalIncome']")
	WebElement AdditionalIncome;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='sc-kPVwWT sc-kfGgVZ ghCrQD']")
	WebElement checkboxagree;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitbtn;
	
	public PersonalInformationPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyPersonalInformationPageTitle(){
		return driver.getTitle();
	}
	
	
	public LoanEligibiltyPage PersonalInformation1(){
		
		RDbtn.isEnabled();
		IndividualRDbtn.isEnabled();
		FirstNamefield.sendKeys("Kishore");
		LastNamefield.sendKeys("Ram");
		Streetfield.sendKeys("73 Henry Smith St");
		Streetfield.sendKeys(Keys.TAB);
		Streetfield.click();
		borrowerCity.sendKeys("Findlay");
		borrowerState.sendKeys("OH");
		borrowerZipCode.sendKeys("45840");
		borrowerDateOfBirth.sendKeys("02/12/1985");
		borrowerIncome.sendKeys("2000001");
		borrowerIncome.sendKeys(Keys.TAB);
		borrowerIncome.sendKeys(Keys.TAB);
		Confirmbtn.click();
		AdditionalIncome.sendKeys("1000001");
		username.sendKeys("kishorpriya1@upgrade-challenge.com");
		password.sendKeys("Kandachinna1!");
		checkboxagree.click();
		submitbtn.click();
		
		return new LoanEligibiltyPage();
				
	}
		
	
	
	
	
	
}
