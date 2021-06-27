package TestCase;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunction;
import pageObject.Login;
import pageObject.Recuirtment_CandidateList;

public class CandidateList extends CommonFunction {
	
	
	public void LoginFunction(){
		PageFactory.initElements(driver, Login.class);
		Login.username.sendKeys(properties.getProperty("username"));
		Login.password.sendKeys(properties.getProperty("password"));
		Login.submit.click();		
	}
	
	public void Recuirtment(){
		PageFactory.initElements(driver, Recuirtment_CandidateList.class);
		Recuirtment_CandidateList.ClickRecuirtment.click();
		
		Select selectVacancy = new Select(Recuirtment_CandidateList.ClickVacancy);
		selectVacancy.selectByValue("1");
		Recuirtment_CandidateList.submit.click();
	
	}
	
	public void VerifyCandidate(){
		
		String vreify=Recuirtment_CandidateList.VerifyVacancylist.getText();
		Assert.assertEquals(vreify, "Software Engineer");
	}
	@Test
	public void Candidate(){
		PageFactory.initElements(driver, Login.class);
		LoginFunction();
		Recuirtment();
		
		
		
	}
	
	

}
