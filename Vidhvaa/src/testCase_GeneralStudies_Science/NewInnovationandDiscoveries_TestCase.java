package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;

public class NewInnovationandDiscoveries_TestCase extends CommonFunction {

	public void NewInnovationandDiscoveriesFunction() {
		
		PageFactory.initElements(driver, objectDetails_GeneralStudies_Science.NewInnovationandDiscoveries.class);
		objectDetails_GeneralStudies_Science.NewInnovationandDiscoveries.newInnovationandDiscoveries.click();
		objectDetails_GeneralStudies_Science.NewInnovationandDiscoveries.Subscribe.click();
	}
	
	@Test
	public void NewInnovationandDiscoveries() {
		
		NewInnovationandDiscoveriesFunction();
		driver.navigate().back();
	}
}
