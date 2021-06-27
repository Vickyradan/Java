package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;

public class PracticeQuestion_TestCase extends CommonFunction {

	public void PracticeQuestionFunction() {
		
		PageFactory.initElements(driver, objectDetails_GeneralStudies_Mathematics.PracticeQuestion.class);
		objectDetails_GeneralStudies_Mathematics.PracticeQuestion.ClickGeneralStudies.click();
		objectDetails_GeneralStudies_Mathematics.PracticeQuestion.practicequestions.click();
		objectDetails_GeneralStudies_Mathematics.PracticeQuestion.ClickSubscribe.click();
		
	}
	
	@Test
	public void PracticeQuestion() {

		PracticeQuestionFunction();
				
	}
}
