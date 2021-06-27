package testCase_BookbackQuestion;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_BookbackQuestion.SocialScience_10th_Standard;
public class SocialScience_10th_Standard_TestCase extends CommonFunction{

	public void SocialScience_10th_Standardfunction() {
		
		PageFactory.initElements(driver, SocialScience_10th_Standard.class);
		SocialScience_10th_Standard.BookBack.click();
		SocialScience_10th_Standard.socialscience.click();
	}
	
	
	public void Pageback() throws InterruptedException {

		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}


	@Test
	public void  SocialScience_10th_Standard() throws InterruptedException {

		SocialScience_10th_Standardfunction();
		Pageback();
	}
}
