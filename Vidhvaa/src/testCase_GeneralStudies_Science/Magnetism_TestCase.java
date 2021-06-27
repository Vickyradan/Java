package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Magnetism;
public class Magnetism_TestCase extends CommonFunction{
	
	public void MagnetismFunction() {
		
		PageFactory.initElements(driver, Magnetism.class);
		Magnetism.Magnetism.click();
		Magnetism.Subscribe.click();
	}
	
	@Test
	public void Magnetism() {
		
		MagnetismFunction();
		driver.navigate().back();
	}

}
