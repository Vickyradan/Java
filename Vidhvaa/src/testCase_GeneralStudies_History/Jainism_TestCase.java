package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Jainism;
public class Jainism_TestCase extends CommonFunction{

	public void JainismFunnction() {
		PageFactory.initElements(driver, Jainism.class);
		Jainism.clickJainism.click();
		Jainism.ClickSubscribe.click();
		
	}

	
	@Test(priority=7)
	public void Jainism(){
		JainismFunnction();
		driver.navigate().back();
	}
}
