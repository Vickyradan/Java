package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.VedicPeriod_PreVedicandPostVedicPeriod;
public class VedicPeriod_PreVedicandPostVedicPeriod_TestCase extends CommonFunction {

	
	
	public void VedicPeriod_PreVedicandPostVedicPeriodFunction() {
		
		PageFactory.initElements(driver, VedicPeriod_PreVedicandPostVedicPeriod.class);
		VedicPeriod_PreVedicandPostVedicPeriod.clickVedicPeriod_PreVedicandPostVedicPeriod.click();
		VedicPeriod_PreVedicandPostVedicPeriod.ClickSubscribe.click();
	}
	
	@Test(priority=3)
	public void VedicPeriod_PreVedicandPostVedicPeriod(){
		VedicPeriod_PreVedicandPostVedicPeriodFunction();
		driver.navigate().back();
	}
}
