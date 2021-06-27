package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.DelhiSultanate;
public class DelhiSultanate_TestCase extends CommonFunction{

	public void DelhiSultanateFunction() {
		PageFactory.initElements(driver, DelhiSultanate.class);
		DelhiSultanate.clickDelhiSultanate.click();
		DelhiSultanate.ClickSubscribe.click();
		
	}
	

	@Test(priority=13)
	public void DelhiSultanate(){
		DelhiSultanateFunction();
		driver.navigate().back();
	}
}
