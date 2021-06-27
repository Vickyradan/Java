package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import objectDetails_GeneralStudies_Science.MotionandEnergy;
import commonFunctions.CommonFunction;

public class MotionandEnergy_TestCase extends CommonFunction {

	private void MotionandEnergyFunction() {
		PageFactory.initElements(driver, MotionandEnergy.class);
		MotionandEnergy.MotionandEnergy.click();
		MotionandEnergy.Subscribe.click();
		
	}
	
	@Test
	public void MotionandEnergy() {
		
		MotionandEnergyFunction();
		driver.navigate().back();
	}
}
