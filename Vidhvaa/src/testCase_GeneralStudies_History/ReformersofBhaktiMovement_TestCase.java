package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.ReformersofBhaktiMovement;
public class ReformersofBhaktiMovement_TestCase extends CommonFunction{

	public void ReformersofBhaktiMovementFunction() {
		
		PageFactory.initElements(driver, ReformersofBhaktiMovement.class);
		ReformersofBhaktiMovement.clickReformersofBhaktiMovement.click();
		ReformersofBhaktiMovement.ClickSubscribe.click();
	}
	
	@Test(priority=14)
	public void ReformersofBhaktiMovement(){
		ReformersofBhaktiMovementFunction();
		driver.navigate().back();
	}
}
