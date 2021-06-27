package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Mauryas;
public class Mauryas_TestCase extends CommonFunction{

	public void MauryasFunction() {
		PageFactory.initElements(driver, Mauryas.class);
		Mauryas.clickMauryas.click();
		Mauryas.ClickSubscribe.click();
	}
	
	@Test(priority=5)
	public void Mauryas(){
		MauryasFunction();
		driver.navigate().back();
	}
}
