package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Marathas;
public class Marathas_TestCase extends CommonFunction{

	public void MarathasFunction() {
		
		PageFactory.initElements(driver, Marathas.class);
		Marathas.clickMarathas.click();
		Marathas.ClickSubscribe.click();
		
	}
	
	
	@Test(priority=17)
	public void Marathas(){
		MarathasFunction();
		driver.navigate().back();
	}
}
