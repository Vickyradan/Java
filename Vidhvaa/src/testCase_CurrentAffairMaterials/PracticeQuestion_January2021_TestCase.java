package testCase_CurrentAffairMaterials;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_CurrentAffairMaterials.PracticeQuestion_January2021;

public class PracticeQuestion_January2021_TestCase extends CommonFunction{

	public void PracticeQuestion_January2021Function() {
		
		PageFactory.initElements(driver, PracticeQuestion_January2021.class);
		
		PracticeQuestion_January2021.ClickCurrtenAffair.click();
		PracticeQuestion_January2021.Clickquestion.click();
	
	}
	
public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	@Test
	public void PracticeQuestion_January2021() throws InterruptedException {
		
		PracticeQuestion_January2021Function();
		Pageback();
		
	}
}
