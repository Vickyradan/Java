package testCase_PreviousYearQuestionPapers;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_PreviousYearQuestionPapers.Question_1_2019;
public class Question_1_2019_TestCase extends CommonFunction{

	public void Question_1_2019Function() {
		
		PageFactory.initElements(driver, Question_1_2019.class);
		Question_1_2019.PreviousYearQuestionPapers.click();
		Question_1_2019.question1.click();
	}
	
	public void Pageback() throws InterruptedException {

		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}

	@Test
	public void  Question_1_2019() throws InterruptedException {

		Question_1_2019Function();
		Pageback();
	}
}
