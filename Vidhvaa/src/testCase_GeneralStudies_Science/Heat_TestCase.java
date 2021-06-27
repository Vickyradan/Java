package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Heat;
public class Heat_TestCase extends CommonFunction{


	public void HeatFunction() {
		
		PageFactory.initElements(driver, Heat.class);
		Heat.Heat.click();
		Heat.Subscribe.click();
	}
	
	@Test
	public void Heat() {
		
		HeatFunction();
		driver.navigate().back();
	}
}
