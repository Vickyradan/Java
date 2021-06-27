package testCase_GeneralStudies_History;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_GeneralStudies_History.PreHistoricPeriod;
public class PreHistoricPeriod_TestCase extends CommonFunction{

	
	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();
	}
	
	public void PreHistoricPeriodFunction()  {
		
		PageFactory.initElements(driver, PreHistoricPeriod.class);
		PreHistoricPeriod.ClickGeneralStudies.click();
		PreHistoricPeriod.Material.click();
		PreHistoricPeriod.clickPreHistoricPeriod.click();
		PreHistoricPeriod.viewsample.click();
	
	
	}
	
	
	@Test(priority=1)
	public void PreHistoricPeriod(){
		LoginFunction();
		PreHistoricPeriodFunction();
		driver.navigate().back();
	}
}
