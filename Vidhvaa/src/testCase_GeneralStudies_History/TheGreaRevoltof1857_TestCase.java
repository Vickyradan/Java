package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.TheGreaRevoltof1857;
public class TheGreaRevoltof1857_TestCase extends CommonFunction{

	
	public void TheGreaRevoltof1857Function() {
		PageFactory.initElements(driver, TheGreaRevoltof1857.class);
		TheGreaRevoltof1857.clickTheGreaRevoltof1857.click();
		TheGreaRevoltof1857.ClickSubscribe.click();
	}
	
	@Test(priority=20)
	public void TheGreaRevoltof1857(){
		TheGreaRevoltof1857Function();
		driver.navigate().back();
	}
}
