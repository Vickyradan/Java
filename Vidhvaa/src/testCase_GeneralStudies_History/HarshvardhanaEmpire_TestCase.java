package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.HarshvardhanaEmpire;
public class HarshvardhanaEmpire_TestCase extends CommonFunction {

	public void HarshvardhanaEmpireFunction() {
		
		PageFactory.initElements(driver, HarshvardhanaEmpire.class);
		HarshvardhanaEmpire.clickHarshvardhanaEmpire.click();
		HarshvardhanaEmpire.ClickSubscribe.click();
	}
	
	@Test(priority=10)
	public void HarshvardhanaEmpire(){
		HarshvardhanaEmpireFunction();
		driver.navigate().back();
	}
}
