package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_Percentage;

public class Material_Percentage_TestCase extends CommonFunction{

	public void PercentageFunction() {
		PageFactory.initElements(driver,Material_Percentage.class);
		Material_Percentage.Percentage.click();
		Material_Percentage.ClickSubscribe.click();
		
	}
	@Test
	public void Percentage() {
		
		PercentageFunction();
		driver.navigate().back();
	}
}
