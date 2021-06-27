package testCase_PreviousYearQuestionPapers;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import commonFunctions.PageReturn;
import objectDetails_PreviousYearQuestionPapers.Question_1_2016;
public class Question_1_2016_TestCase extends CommonFunction{

	
	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();

	}
	
	
	public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	public void Question_1_2016Function() {
		
		PageFactory.initElements(driver, Question_1_2016.class);
		Question_1_2016.PreviousYearQuestionPapers.click();
		Question_1_2016.question1.click();
	}
	
	
	
	@Test
	public void  Question_1_2016() throws InterruptedException {
		
		LoginFunction();
		Question_1_2016Function();
		Pageback();
	}
}
