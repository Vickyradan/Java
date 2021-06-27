package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Pallavas_PandyasPeirod;
public class Pallavas_PandyasPeirod_TestCase extends CommonFunction{

	public void Pallavas_PandyasPeirodFunction() {
		
		PageFactory.initElements(driver, Pallavas_PandyasPeirod.class);
		Pallavas_PandyasPeirod.clickPallavas_PandyasPeirod.click();
		Pallavas_PandyasPeirod.ClickSubscribe.click();
	}
	
	
	@Test(priority=30)
	public void  Pallavas_PandyasPeirod(){
		Pallavas_PandyasPeirodFunction();
		driver.navigate().back();
	}
}
