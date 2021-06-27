package testCase_GeneralStudies_Mathematics;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_Simplifications;

public class Material_Simplifications_TestCase extends CommonFunction {
	
	
	
	public void SimplificationsFunction(){
		PageFactory.initElements(driver, Material_Simplifications.class);
		Material_Simplifications.ClickSimplification.click();
		Material_Simplifications.ClickSubscribe.click();
	}
	
	@Test
	public void Simplifications() {
		
		SimplificationsFunction();
		driver.navigate().back();
	}
}
