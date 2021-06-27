package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Mughals;
public class Mughals_TestCase extends CommonFunction{

	public void MughalsFunction() {
		PageFactory.initElements(driver, Mughals.class);
		Mughals.clickMughals.click();
		Mughals.ClickSubscribe.click();
	}
	
	@Test(priority=16)
	public void Mughals(){
		MughalsFunction();
		driver.navigate().back();
	}
}
