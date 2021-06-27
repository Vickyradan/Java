package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_ConversionofInformationtoData;

public class Material_ConversionofInformationtoData_TestCase extends CommonFunction {

	public void ConversionofInformationtoDataFunction() {
		
		PageFactory.initElements(driver, Material_ConversionofInformationtoData.class);
		Material_ConversionofInformationtoData.ConversionofInformationtoData.click();
		Material_ConversionofInformationtoData.ClickSubscribe.click();
	}
	
	@Test
	public void ConversionofInformationtoData() {

		ConversionofInformationtoDataFunction();
		driver.navigate().back();
	}
}
