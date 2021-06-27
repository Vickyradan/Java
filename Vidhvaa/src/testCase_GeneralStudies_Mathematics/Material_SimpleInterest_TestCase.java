package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_SimpleInterest;

public class Material_SimpleInterest_TestCase extends CommonFunction {
	
	
	public void Material_SimpleInteres() {
		
		PageFactory.initElements(driver, Material_SimpleInterest.class);
		Material_SimpleInterest.ClickSimpleInterest.click();
		
		Material_SimpleInterest.ClickSubscribe.click();
		
	}
	
	
	@Test
	public void SimpleInterest() {
		
		Material_SimpleInteres();
		driver.navigate().back();
	}
	

}
