package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Environment_Ecology;
public class Environment_Ecology_TestCase extends CommonFunction {

	public void Environment_EcologyFunction() {
		PageFactory.initElements(driver, Environment_Ecology.class);
		Environment_Ecology.ClickEnvironment_Ecology.click();
		Environment_Ecology.Subscribe.click();
	}
	
	@Test
	public void Environment_Ecology() {
		
		Environment_EcologyFunction();
		driver.navigate().back();
	}
}
