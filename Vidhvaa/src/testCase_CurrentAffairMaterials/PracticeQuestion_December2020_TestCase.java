package testCase_CurrentAffairMaterials;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_CurrentAffairMaterials.PracticeQuestion_December2020;

public class PracticeQuestion_December2020_TestCase extends CommonFunction{

	public void PracticeQuestion_December2020Function() {
		
		PageFactory.initElements(driver, PracticeQuestion_December2020.class);
		
		PracticeQuestion_December2020.ClickCurrtenAffair.click();
		PracticeQuestion_December2020.Clickquestion.click();
		
	}
	
public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	
	@Test
	public void PracticeQuestion_December2020() throws InterruptedException {
		
		PracticeQuestion_December2020Function();
		Pageback();
		
	}
}
