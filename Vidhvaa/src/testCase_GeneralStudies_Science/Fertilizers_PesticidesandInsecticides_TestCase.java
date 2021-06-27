package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Fertilizers_PesticidesandInsecticides;
public class Fertilizers_PesticidesandInsecticides_TestCase extends CommonFunction{

	public void Fertilizers_PesticidesandInsecticidesFunction() {
		PageFactory.initElements(driver, Fertilizers_PesticidesandInsecticides.class);
		Fertilizers_PesticidesandInsecticides.ClickFertilizers_PesticidesandInsecticides.click();
		Fertilizers_PesticidesandInsecticides.Subscribe.click();
	}
	
	@Test
	public void Fertilizers_PesticidesandInsecticides() {
		
		Fertilizers_PesticidesandInsecticidesFunction();
		driver.navigate().back();
	}
}
