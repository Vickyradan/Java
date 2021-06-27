package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_TimeandWork;

public class Material_TimeandWork_TestCase extends CommonFunction {

	public void TimeandWorkFunction() {
		
		PageFactory.initElements(driver, Material_TimeandWork.class);
		Material_TimeandWork.TimeandWork.click();
		Material_TimeandWork.ClickSubscribe.click();
	}
	
	
	@Test
	public void TimeandWork() {

		TimeandWorkFunction();
		driver.navigate().back();
	}
}
