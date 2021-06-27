package testCase_VidhvaasModelQuestions;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_VidhvaasModelQuestions.ModelQuestions_5;
public class ModelQuestions_5_TestCase extends CommonFunction{

	
	public void ModelQuestions_5Function() {
		PageFactory.initElements(driver, ModelQuestions_5.class);
		ModelQuestions_5.VidhvaaModelQuestion.click();
		ModelQuestions_5.question5.click();
	}
	
	
	
	
public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	@Test
	public void  ModelQuestions_5() throws InterruptedException {
		
		
		ModelQuestions_5Function();
		Pageback();
	}
}
