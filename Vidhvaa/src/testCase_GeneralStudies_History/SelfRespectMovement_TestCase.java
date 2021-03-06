package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_GeneralStudies_History.SelfRespectMovement;
public class SelfRespectMovement_TestCase extends CommonFunction{

	public void SelfRespectMovementFunction() {
		
		PageFactory.initElements(driver, SelfRespectMovement.class);
		SelfRespectMovement.clickSelfRespectMovement.click();
		SelfRespectMovement.ClickSubscribe.click();
	}
	
	public void pageBack() throws InterruptedException {
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	
	@Test(priority=35)
	public void  SelfRespectMovement() throws InterruptedException{
		SelfRespectMovementFunction();
		driver.navigate().back();
		pageBack();
	}
}
