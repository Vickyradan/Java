package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.NationalScientificLaboratories;
public class NationalScientificLaboratories_TestCase extends CommonFunction {

	private void NationalScientificLaboratoriesFunction() {
		
		PageFactory.initElements(driver, NationalScientificLaboratories.class);
		NationalScientificLaboratories.nationalscientificLaboratories.click();
		NationalScientificLaboratories.Subscribe.click();
	}
	
	
	@Test
	public void NationalScientificLaboratories() {
		
		NationalScientificLaboratoriesFunction();
		driver.navigate().back();
	}
}
