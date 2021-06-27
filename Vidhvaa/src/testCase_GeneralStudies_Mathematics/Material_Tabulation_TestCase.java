package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_Tabulation;

public class Material_Tabulation_TestCase extends CommonFunction {

	
	
	public void TabulationFunction() {
		
		PageFactory.initElements(driver, Material_Tabulation.class);
		Material_Tabulation.Tabulation.click();
		Material_Tabulation.ClickSubscribe.click();
	}
	
	@Test
	public void Tabulation() {

		TabulationFunction();
		driver.navigate().back();
	}
}
