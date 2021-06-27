package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.ElectricityAndElectronics;
public class ElectricityAndElectronics_TestCase extends CommonFunction {

	public void ElectricityAndElectronicsFunction() {
		PageFactory.initElements(driver, ElectricityAndElectronics.class);
		ElectricityAndElectronics.ElectricityAndElectronics.click();
		ElectricityAndElectronics.Subscribe.click();
	}
	
	@Test
	public void ElectricityAndElectronics() {
		
		ElectricityAndElectronicsFunction();
		driver.navigate().back();
	}
}
