package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Palayakkas_RebellioninTamilnadu;
public class Palayakkas_RebellioninTamilnadu_TestCase extends CommonFunction{

	public  void Palayakkas_RebellioninTamilnaduFunction() {
		
		PageFactory.initElements(driver, Palayakkas_RebellioninTamilnadu.class);
		Palayakkas_RebellioninTamilnadu.clickPalayakkas_RebellioninTamilnadu.click();
		Palayakkas_RebellioninTamilnadu.ClickSubscribe.click();
		
	}
	
	
	@Test(priority=31)
	public void  Palayakkas_RebellioninTamilnadu(){
		Palayakkas_RebellioninTamilnaduFunction();
		driver.navigate().back();
	}
}
