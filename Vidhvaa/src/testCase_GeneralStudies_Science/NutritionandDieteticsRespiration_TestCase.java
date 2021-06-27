package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.NutritionandDieteticsRespiration;
public class NutritionandDieteticsRespiration_TestCase extends CommonFunction {

	public void NutritionandDieteticsRespirationFunction() {
		PageFactory.initElements(driver, NutritionandDieteticsRespiration.class);
		NutritionandDieteticsRespiration.ClickNutritionandDieteticsRespiration.click();
		NutritionandDieteticsRespiration.Subscribe.click();
	}
	
	@Test
	public void NutritionandDieteticsRespiration() {
		
		NutritionandDieteticsRespirationFunction();
		driver.navigate().back();
	}
		
}
