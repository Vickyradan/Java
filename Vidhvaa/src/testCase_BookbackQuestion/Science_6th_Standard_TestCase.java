package testCase_BookbackQuestion;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import commonFunctions.PageReturn;
import objectDetails_BookbackQuestion.Science_6th_Standard;
public class Science_6th_Standard_TestCase extends CommonFunction {

	
	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();

	}
	
	
	public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	public void Science_6th_Standardfunction() {
		
		PageFactory.initElements(driver, Science_6th_Standard.class);
		Science_6th_Standard.BookBack.click();
		Science_6th_Standard.science.click();
	}
	
	@Test
	public void  Science_6th_Standard() throws InterruptedException {
		
		LoginFunction();
		Science_6th_Standardfunction();
		Pageback();
	}
}
