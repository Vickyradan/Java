package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.SocialTransformationinTamilnadu;
public class SocialTransformationinTamilnadu_TestCase extends CommonFunction{

	public void SocialTransformationinTamilnaduFunction() {
		
		PageFactory.initElements(driver, SocialTransformationinTamilnadu.class);
		SocialTransformationinTamilnadu.clickSocialTransformationinTamilnadu.click();
		SocialTransformationinTamilnadu.ClickSubscribe.click();
		
	}
	
	@Test(priority=32)
	public void  SocialTransformationinTamilnadu(){
		SocialTransformationinTamilnaduFunction();
		driver.navigate().back();
	}
	
}
