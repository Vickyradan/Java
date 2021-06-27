package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.SouthIndianHistorySocietyandCultureinAncientTamizhagam;
public class SouthIndianHistorySocietyandCultureinAncientTamizhagam_TestCase extends CommonFunction {

	public void SouthIndianHistorySocietyandCultureinAncientTamizhagamFunction() {
		
		PageFactory.initElements(driver, SouthIndianHistorySocietyandCultureinAncientTamizhagam.class);
		SouthIndianHistorySocietyandCultureinAncientTamizhagam.
		                               clickSouthIndianHistorySocietyandCultureinAncientTamizhagam.click();
		SouthIndianHistorySocietyandCultureinAncientTamizhagam.ClickSubscribe.click();
	}
	
	
	
	@Test(priority=27)
	public void  SouthIndianHistorySocietyandCultureinAncientTamizhagam(){
		SouthIndianHistorySocietyandCultureinAncientTamizhagamFunction();
		driver.navigate().back();
	}
	
}
