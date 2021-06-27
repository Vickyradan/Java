package testCase_VidhvaasModelQuestions;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_VidhvaasModelQuestions.ModelQuestions_4;
public class ModelQuestions_4_TestCasee extends CommonFunction{

	
	public void ModelQuestions_4Function() {
		
		PageFactory.initElements(driver, ModelQuestions_4.class);
		ModelQuestions_4.VidhvaaModelQuestion.click();
		ModelQuestions_4.question4.click();
	}
	
	
public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	@Test
	public void  ModelQuestions_4() throws InterruptedException {
		
		
		ModelQuestions_4Function();
		Pageback();
	}
}
