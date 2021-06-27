package testCase_PreviousYearQuestionPapers;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import  objectDetails_PreviousYearQuestionPapers.Question_1_2018;
public class Question_1_2018_TestCase extends CommonFunction{

	public void Question_1_2018Function() {
		
		PageFactory.initElements(driver, Question_1_2018.class);
		Question_1_2018.PreviousYearQuestionPapers.click();
		Question_1_2018.question1.click();
	}
	
	
	public void Pageback() throws InterruptedException {

		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}

	@Test
	public void  Question_1_2018() throws InterruptedException {

		Question_1_2018Function();
		Pageback();
	}
}
