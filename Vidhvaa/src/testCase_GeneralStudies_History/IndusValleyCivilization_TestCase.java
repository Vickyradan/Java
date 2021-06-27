package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.IndusValleyCivilization;
public class IndusValleyCivilization_TestCase extends CommonFunction {

	public void IndusValleyCivilizationFunction() {
		PageFactory.initElements(driver, IndusValleyCivilization.class);
		IndusValleyCivilization.clickIndusValleyCivilization.click();
		IndusValleyCivilization.ClickSubscribe.click();
		
	}
	
	
	@Test(priority=2)
	public void IndusValleyCivilization(){
		IndusValleyCivilizationFunction();
		driver.navigate().back();
	}
}
