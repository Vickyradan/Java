package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.CulturalFeaturesofIndia;
public class CulturalFeaturesofIndia_TestCase extends CommonFunction{

	public void CulturalFeaturesofIndiaFunction() {
		
		PageFactory.initElements(driver, CulturalFeaturesofIndia.class);
		CulturalFeaturesofIndia.clickCulturalFeaturesofIndia.click();
		CulturalFeaturesofIndia.ClickSubscribe.click();
	}
	
	
	@Test(priority=26)
	public void  CulturalFeaturesofIndia(){
		CulturalFeaturesofIndiaFunction();
		driver.navigate().back();
	}
}
