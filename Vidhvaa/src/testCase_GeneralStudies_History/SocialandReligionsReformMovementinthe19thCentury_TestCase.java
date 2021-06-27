package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.SocialandReligionsReformMovementinthe19thCentury;
public class SocialandReligionsReformMovementinthe19thCentury_TestCase extends CommonFunction{

	public void SocialandReligionsReformMovementinthe19thCenturyFunction() {
		PageFactory.initElements(driver, SocialandReligionsReformMovementinthe19thCentury.class);
		SocialandReligionsReformMovementinthe19thCentury.clickSocialandReligionsReformMovementinthe19thCentury.click();
		SocialandReligionsReformMovementinthe19thCentury.ClickSubscribe.click();
	}
	
	@Test(priority=21)
	public void SocialandReligionsReformMovementinthe19thCentury(){
		SocialandReligionsReformMovementinthe19thCenturyFunction();
		driver.navigate().back();
	}
}
