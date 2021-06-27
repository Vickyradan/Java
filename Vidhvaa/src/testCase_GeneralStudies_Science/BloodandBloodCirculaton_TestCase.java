package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.BloodandBloodCirculaton;
public class BloodandBloodCirculaton_TestCase extends CommonFunction{

	public void BloodandBloodCirculatonFunction() {
		PageFactory.initElements(driver, BloodandBloodCirculaton.class);
		BloodandBloodCirculaton.ClickBloodandBloodCirculaton.click();
		BloodandBloodCirculaton.Subscribe.click();
	}
	
	@Test
	public void BloodandBloodCirculaton() {
		
		BloodandBloodCirculatonFunction();
		driver.navigate().back();
	}
}
