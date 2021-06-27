package testCase_BookbackQuestion;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_BookbackQuestion.Science_8th_Standard;
public class Science_8th_Standard_TestCase extends CommonFunction{

	public void Science_8th_Standardfunction() {
		
		PageFactory.initElements(driver, Science_8th_Standard.class);
		Science_8th_Standard.BookBack.click();
		Science_8th_Standard.science.click();
		
	}
	
	public void Pageback() throws InterruptedException {

		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}


	@Test
	public void  Science_8th_Standard() throws InterruptedException {

		Science_8th_Standardfunction();
		Pageback();
	}
}
