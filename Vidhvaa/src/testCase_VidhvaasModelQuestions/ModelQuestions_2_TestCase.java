package testCase_VidhvaasModelQuestions;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_VidhvaasModelQuestions.ModelQuestions_2;
public class ModelQuestions_2_TestCase extends CommonFunction{

	public void ModelQuestions_2Function() {
		
		PageFactory.initElements(driver, ModelQuestions_2.class);
		ModelQuestions_2.VidhvaaModelQuestion.click();
		ModelQuestions_2.question2.click();
	}
	
	
  public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	@Test
	public void  ModelQuestions_2() throws InterruptedException {
		
		
		ModelQuestions_2Function();
		Pageback();
	}
}
