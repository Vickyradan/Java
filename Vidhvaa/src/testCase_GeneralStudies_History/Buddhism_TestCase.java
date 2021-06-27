package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Buddhism;
public class Buddhism_TestCase extends CommonFunction {

	public void BuddhismFunction() {
		PageFactory.initElements(driver, Buddhism.class);
		Buddhism.clickBuddhism.click();
		Buddhism.ClickSubscribe.click();
	}
	
	@Test(priority=6)
	public void Buddhism(){
		BuddhismFunction();
		driver.navigate().back();
	}
}
