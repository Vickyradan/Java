package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.NorthIndianKingdoms;
public class NorthIndianKingdoms_TestCase extends CommonFunction{

	public void NorthIndianKingdomsFunction() {
		
		PageFactory.initElements(driver, NorthIndianKingdoms.class);
		NorthIndianKingdoms.clickNorthIndianKingdoms.click();
		NorthIndianKingdoms.ClickSubscribe.click();
	}
	
	
	@Test(priority=11)
	public void NorthIndianKingdoms(){
		NorthIndianKingdomsFunction();
		driver.navigate().back();
	}
	
}
