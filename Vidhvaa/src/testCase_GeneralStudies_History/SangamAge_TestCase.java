package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.SangamAge;
public class SangamAge_TestCase extends CommonFunction{

	public void SangamAgeFunction() {
		
		PageFactory.initElements(driver, SangamAge.class);
		SangamAge.clickSangamAge.click();
		SangamAge.ClickSubscribe.click();
	}
	
	
	@Test(priority=28)
	public void  SangamAge(){
		SangamAgeFunction();
		driver.navigate().back();
	}
}
