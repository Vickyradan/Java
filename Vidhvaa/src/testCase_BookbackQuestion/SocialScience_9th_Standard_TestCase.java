package testCase_BookbackQuestion;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_BookbackQuestion.SocialScience_9th_Standard;
public class SocialScience_9th_Standard_TestCase extends CommonFunction{

	
	public void SocialScience_9th_Standardfunction() {
		
		PageFactory.initElements(driver, SocialScience_9th_Standard.class);
		SocialScience_9th_Standard.BookBack.click();
		SocialScience_9th_Standard.socialscience.click();
	}
	
	
	public void Pageback() throws InterruptedException {

		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}


	@Test
	public void  SocialScience_9th_Standard() throws InterruptedException {

		SocialScience_9th_Standardfunction();
		Pageback();
	}
}
