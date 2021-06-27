package testCase_VidhvaasModelQuestions;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import  objectDetails_VidhvaasModelQuestions.ModelQuestions_3;
public class ModelQuestions_3_TestCase extends CommonFunction{

	public void ModelQuestions_3Function() {
		PageFactory.initElements(driver, ModelQuestions_3.class);
		ModelQuestions_3.VidhvaaModelQuestion.click();
		ModelQuestions_3.question3.click();
	}
	
	
	public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	@Test
	public void  ModelQuestions_3() throws InterruptedException {
		
		
		ModelQuestions_3Function();
		Pageback();
	}
}
