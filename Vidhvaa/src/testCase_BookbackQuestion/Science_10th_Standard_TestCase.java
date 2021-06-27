package testCase_BookbackQuestion;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import  objectDetails_BookbackQuestion.Science_10th_Standard;
public class Science_10th_Standard_TestCase extends CommonFunction{

	public void Science_10th_Standardfunction() {
		
		PageFactory.initElements(driver, Science_10th_Standard.class);
		Science_10th_Standard.BookBack.click();
		Science_10th_Standard.science.click();
	}
	
	public void Pageback() throws InterruptedException {

		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}


	@Test
	public void  Science_10th_Standard() throws InterruptedException {

		Science_10th_Standardfunction();
		Pageback();
	}
}
