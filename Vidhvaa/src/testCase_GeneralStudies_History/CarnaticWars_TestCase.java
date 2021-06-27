package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.CarnaticWars;
public class CarnaticWars_TestCase extends CommonFunction{

	
	public void CarnaticWarsFunction() {
		
		PageFactory.initElements(driver,CarnaticWars.class);
		CarnaticWars.clickCarnaticWars.click();
		CarnaticWars.ClickSubscribe.click();
	}
	
	@Test(priority=19)
	public void CarnaticWars(){
		CarnaticWarsFunction();
		driver.navigate().back();
	}
}
