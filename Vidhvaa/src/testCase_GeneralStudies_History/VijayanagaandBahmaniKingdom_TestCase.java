package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.VijayanagarandBahmaniKingdom;

public class VijayanagaandBahmaniKingdom_TestCase extends CommonFunction{

	public void VijayanagaandBahmaniKingdomFunction() {
		PageFactory.initElements(driver, VijayanagarandBahmaniKingdom.class);
		VijayanagarandBahmaniKingdom.clickVijayanagarandBahmaniKingdom.click();
		VijayanagarandBahmaniKingdom.ClickSubscribe.click();
		
	}
	
	@Test(priority=15)
	public void VijayanagaandBahmaniKingdom(){
		VijayanagaandBahmaniKingdomFunction();
		driver.navigate().back();
	}
}
