package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_DiagrammaticSeries;

public class Material_DiagrammaticSeries_TestCase extends CommonFunction {

	
	public void DiagrammaticSeriesFunctions() {
		
		PageFactory.initElements(driver, Material_DiagrammaticSeries.class);
		Material_DiagrammaticSeries.DiagrammaticSeries.click();
		Material_DiagrammaticSeries.ClickSubscribe.click();
		
	}
	
	@Test
	public void DiagrammaticSeries() {

		DiagrammaticSeriesFunctions();
		driver.navigate().back();
	}
}
