package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Acids_BasesandSalts;
public class Acids_BasesandSalts_TestCase extends CommonFunction{


	private void  Acids_BasesandSaltsFunction() {
		PageFactory.initElements(driver, Acids_BasesandSalts.class);
		Acids_BasesandSalts.ClickAcids_BasesandSalts.click();
		Acids_BasesandSalts.Subscribe.click();
	}
	
	@Test
	public void Acids_BasesandSalts() {
		
		Acids_BasesandSaltsFunction();
		driver.navigate().back();
	}
}
