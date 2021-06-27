package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Reproductivesystem;
public class Reproductivesystem_TestCase extends CommonFunction{

	public void ReproductivesystemFunction() {
		PageFactory.initElements(driver, Reproductivesystem.class);
		Reproductivesystem.ClickBloodandBloodCirculaton.click();
		Reproductivesystem.Subscribe.click();
		
	}
	@Test
	public void Reproductivesystem() {
		
		ReproductivesystemFunction();
		driver.navigate().back();
	}
}
