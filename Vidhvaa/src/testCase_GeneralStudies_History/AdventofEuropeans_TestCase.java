package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.AdventofEuropeans;
public class AdventofEuropeans_TestCase extends CommonFunction{

	public void AdventofEuropeansFunction() {
		
		PageFactory.initElements(driver, AdventofEuropeans.class);
		AdventofEuropeans.clickAdventofEuropeans.click();
		AdventofEuropeans.ClickSubscribe.click();
		
	}
	
	
	@Test(priority=18)
	public void AdventofEuropeans(){
		AdventofEuropeansFunction();
		driver.navigate().back();
	}
}
