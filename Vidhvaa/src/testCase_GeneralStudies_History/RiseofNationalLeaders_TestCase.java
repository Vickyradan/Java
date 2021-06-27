package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.RiseofNationalLeaders;
public class RiseofNationalLeaders_TestCase extends CommonFunction{

	public void RiseofNationalLeadersFunction() {
		
		PageFactory.initElements(driver, RiseofNationalLeaders.class);
		RiseofNationalLeaders.clickRiseofNationalLeaders.click();
		RiseofNationalLeaders.ClickSubscribe.click();
	}
	
	
	@Test(priority=24)
	public void  RiseofNationalLeaders(){
		RiseofNationalLeadersFunction();
		driver.navigate().back();
	}
}
