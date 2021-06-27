package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.ClassificationoflivingOrganism;
public class ClassificationoflivingOrganism_TestCase extends CommonFunction {

	public void ClassificationoflivingOrganismFunction() {
		PageFactory.initElements(driver, ClassificationoflivingOrganism.class);
		ClassificationoflivingOrganism.ClickClassificationoflivingOrganism.click();
		ClassificationoflivingOrganism.Subscribe.click();
	}
	
	
	@Test
	public void ClassificationoflivingOrganism() {
		
		ClassificationoflivingOrganismFunction();
		driver.navigate().back();
		
	}
}
