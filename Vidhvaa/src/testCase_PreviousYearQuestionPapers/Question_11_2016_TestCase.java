package testCase_PreviousYearQuestionPapers;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_PreviousYearQuestionPapers.Question_11_2016;
public class Question_11_2016_TestCase extends CommonFunction {

	public void Question_11_2016Function() {

		PageFactory.initElements(driver, Question_11_2016.class);
		Question_11_2016.PreviousYearQuestionPapers.click();
		Question_11_2016.question11.click();
	}

	public void Pageback() throws InterruptedException {

		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}

	@Test
	public void  Question_11_2016() throws InterruptedException {

		Question_11_2016Function();
		Pageback();
	}


}
