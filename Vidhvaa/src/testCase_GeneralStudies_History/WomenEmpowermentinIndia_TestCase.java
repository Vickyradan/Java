package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.WomenEmpowermentinIndia;
public class WomenEmpowermentinIndia_TestCase extends CommonFunction {

	
	public void  WomenEmpowermentinIndiaFunction() {
		PageFactory.initElements(driver, WomenEmpowermentinIndia.class);
		WomenEmpowermentinIndia.clickWomenEmpowermentinIndia.click();
		WomenEmpowermentinIndia.ClickSubscribe.click();
		
	}
	
	@Test(priority=23)
	public void  WomenEmpowermentinIndia(){
		WomenEmpowermentinIndiaFunction();
		driver.navigate().back();
	}
}
