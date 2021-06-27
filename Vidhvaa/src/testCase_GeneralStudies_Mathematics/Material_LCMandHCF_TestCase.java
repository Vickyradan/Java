package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_LCMandHCF;

public class Material_LCMandHCF_TestCase extends CommonFunction{

	
	public void LCMandHCF_Function(){
		
		PageFactory.initElements(driver, Material_LCMandHCF.class);
		Material_LCMandHCF.ClickTimeandDistance.click();
		Material_LCMandHCF.ClickSubscribe.click();
		
	}
	
	@Test
	public void LCMandHCF() {
		
		LCMandHCF_Function();
		driver.navigate().back();
	}
	
}
