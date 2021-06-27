package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_GeneralStudies_Mathematics.Material_ProblemonAgesPartnership;

public class Material_ProblemonAgesPartnership_TestCase extends CommonFunction {

	public void ProblemonAgesPartnershipFuction() {
		
		PageFactory.initElements(driver, Material_ProblemonAgesPartnership.class);
		Material_ProblemonAgesPartnership.ProblemonAgesPartnership.click();
		Material_ProblemonAgesPartnership.ClickSubscribe.click();
	}
	
public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	
	@Test
	public void ProblemonAgesPartnership() throws InterruptedException {

		ProblemonAgesPartnershipFuction();
		driver.navigate().back();
		Pageback();
		
	}
}
