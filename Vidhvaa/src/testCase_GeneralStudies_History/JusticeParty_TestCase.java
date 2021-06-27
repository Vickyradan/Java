package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.JusticeParty;
public class JusticeParty_TestCase extends CommonFunction{

	public  void JusticePartyFunction() {
		
		PageFactory.initElements(driver, JusticeParty.class);
		JusticeParty.clickJusticeParty.click();
		JusticeParty.ClickSubscribe.click();
	}
	
	
	@Test(priority=33)
	public void  JusticeParty(){
		JusticePartyFunction();
		driver.navigate().back();
	}
}
