package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import objectDetails_GeneralStudies_Science.Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit;
import commonFunctions.CommonFunction;

public class Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit_TestCase extends CommonFunction{

	public void Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnitFunction() {
		
		PageFactory.initElements(driver, Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit.class);
		Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit.Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit.click();
		Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit.Subscribe.click();
	}

	@Test
	public void Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit() {
		
		Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnitFunction();
		driver.navigate().back();
	}

}
