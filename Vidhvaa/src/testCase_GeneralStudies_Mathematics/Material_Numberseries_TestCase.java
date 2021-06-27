package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_Numberseries;

public class Material_Numberseries_TestCase extends CommonFunction{

	
	public void NumberseriesFunction() {
		PageFactory.initElements(driver, Material_Numberseries.class);
		Material_Numberseries.Numberseries.click();
		Material_Numberseries.ClickSubscribe.click();
		
	}
	@Test
	public void Numberseries() {
		
		NumberseriesFunction();
		driver.navigate().back();
		
	}
}
