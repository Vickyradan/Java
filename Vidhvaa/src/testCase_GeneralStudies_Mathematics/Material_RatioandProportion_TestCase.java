package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_RatioandProportion;

public class Material_RatioandProportion_TestCase extends CommonFunction {

	public void RatioandProportionFunction() {

		PageFactory.initElements(driver, Material_RatioandProportion.class);
		Material_RatioandProportion.RatioandProportion.click();
		Material_RatioandProportion.ClickSubscribe.click();
	}

	@Test
	public void RatioandProportion() {

		RatioandProportionFunction();
		driver.navigate().back();
	}
}
