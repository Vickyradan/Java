package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.SwadeshiMovement;
public class SwadeshiMovement_TestCase extends CommonFunction{

	public  void SwadeshiMovementfunction() {
		PageFactory.initElements(driver, SwadeshiMovement.class);
		SwadeshiMovement.clickSwadeshiMovement.click();
		SwadeshiMovement.ClickSubscribe.click();
		
	}
	
	@Test(priority=34)
	public void  SwadeshiMovement(){
		SwadeshiMovementfunction();
		driver.navigate().back();
	}
}
