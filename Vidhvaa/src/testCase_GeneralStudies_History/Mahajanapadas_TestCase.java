package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import  objectDetails_GeneralStudies_History.Mahajanapadas;
public class Mahajanapadas_TestCase extends CommonFunction{

	public void MahajanapadasFunctions() {
		PageFactory.initElements(driver, Mahajanapadas.class);
		Mahajanapadas.clickMahajanapadas.click();
		Mahajanapadas.ClickSubscribe.click();
	}
	
	
	@Test(priority=4)
	public void Mahajanapadas(){
		MahajanapadasFunctions();
		driver.navigate().back();
	}
}
