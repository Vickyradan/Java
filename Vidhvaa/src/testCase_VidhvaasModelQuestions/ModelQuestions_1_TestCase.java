package testCase_VidhvaasModelQuestions;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import commonFunctions.PageReturn;
import objectDetails_VidhvaasModelQuestions.ModelQuestions_1;

public class ModelQuestions_1_TestCase extends CommonFunction{
	
	
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
	
	public void  ModelQuestions_1Function() {
		
		PageFactory.initElements(driver, ModelQuestions_1.class);
		ModelQuestions_1.VidhvaaModelQuestion.click();
		ModelQuestions_1.question1.click();
	}
	
	@Test
	public void  ModelQuestions_1() throws InterruptedException {
		
		LoginFunction();
		ModelQuestions_1Function();
		Pageback();
	}
	

}
