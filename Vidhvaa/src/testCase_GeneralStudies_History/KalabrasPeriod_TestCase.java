package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.KalabrasPeriod;
public class KalabrasPeriod_TestCase extends CommonFunction{

	public void KalabrasPeriodFunction() {
		
		PageFactory.initElements(driver, KalabrasPeriod.class);
		KalabrasPeriod.clickKalabrasPeriod.click();
		KalabrasPeriod.ClickSubscribe.click();
	}
	
	@Test(priority=29)
	public void  KalabrasPeriod(){
		KalabrasPeriodFunction();
		driver.navigate().back();
	}
}
