package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.PracticeQuestion;
public class PracticeQuestion_TestCase extends CommonFunction {

	public void PracticeQuestionFunction(){
		
		PageFactory.initElements(driver, PracticeQuestion.class);
		PracticeQuestion.ClickGeneralStudies.click();
		PracticeQuestion.practicequestions.click();
		PracticeQuestion.ClickSubscribe.click();
	}
	
	@Test
	public void PracticeQuestion() {

		PracticeQuestionFunction();
				
	}
}
