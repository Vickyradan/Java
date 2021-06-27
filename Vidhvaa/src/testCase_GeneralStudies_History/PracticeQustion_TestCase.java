package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.PracticeQuestion;

public class PracticeQustion_TestCase extends CommonFunction{

	
	
	public void  PracticeQustionFunction() {
		PageFactory.initElements(driver, PracticeQuestion.class);
		PracticeQuestion.ClickGeneralStudies.click();
		PracticeQuestion.practicequestions.click();
		PracticeQuestion.ClickSubscribe.click();
	}
	
	@Test(priority=36)
	public void PracticeQustion() {
		PracticeQustionFunction();
	}
}
