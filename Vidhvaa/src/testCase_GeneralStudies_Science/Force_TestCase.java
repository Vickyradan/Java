package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import  objectDetails_GeneralStudies_Science.Force;
import commonFunctions.CommonFunction;

public class Force_TestCase extends CommonFunction{

	public void ForceFunction() {
		PageFactory.initElements(driver, Force.class);
		Force.Force.click();
		Force.Subscribe.click();
	}
	
	@Test
	public void Force() {
		
		ForceFunction();
		driver.navigate().back();
	}
}
