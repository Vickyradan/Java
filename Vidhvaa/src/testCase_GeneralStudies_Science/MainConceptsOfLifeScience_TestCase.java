package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.MainConceptsOfLifeScience;
public class MainConceptsOfLifeScience_TestCase extends CommonFunction {

	public void MainConceptsOfLifeScienceFunction() {
		PageFactory.initElements(driver, MainConceptsOfLifeScience.class);
		MainConceptsOfLifeScience.ClickMainConceptsOfLifeScience.click();
		MainConceptsOfLifeScience.Subscribe.click();
	}
	
	@Test
	public void MainConceptsOfLifeScience() {
		
		MainConceptsOfLifeScienceFunction();
		driver.navigate().back();
		
	}
}
