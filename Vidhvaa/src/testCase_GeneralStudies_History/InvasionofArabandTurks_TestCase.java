package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.InvasionofArabandTurks;
public class InvasionofArabandTurks_TestCase extends CommonFunction{

	public void InvasionofArabandTurksFunction() {
		
		PageFactory.initElements(driver, InvasionofArabandTurks.class);
		InvasionofArabandTurks.clickInvasionofArabandTurks.click();
		InvasionofArabandTurks.ClickSubscribe.click();
	}

	@Test(priority=12)
	public void InvasionofArabandTurks(){
		InvasionofArabandTurksFunction();
		driver.navigate().back();
	}
}
