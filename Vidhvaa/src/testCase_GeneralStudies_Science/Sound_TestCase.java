package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Sound;
public class Sound_TestCase extends CommonFunction{

	public void SoundFunction() {
		PageFactory.initElements(driver, Sound.class);
		Sound.ClickSound.click();
		Sound.Subscribe.click();
	}
	
	@Test
	public void Sound() {
		
		SoundFunction();
		driver.navigate().back();
	}
}
