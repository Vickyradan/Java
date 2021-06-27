package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Human_Diseases_including_communicable_diseases_preventionandremedies;
public class Human_Diseases_including_communicable_diseases_preventionandremedies_TestCase extends CommonFunction {

	public void Human_Diseases_including_communicable_diseases_preventionandremediesFunction() {
		PageFactory.initElements(driver, Human_Diseases_including_communicable_diseases_preventionandremedies.class);
		Human_Diseases_including_communicable_diseases_preventionandremedies.
		                                 ClickHuman_Diseases_including_communicable_diseases_preventionandremedies.click();
		Human_Diseases_including_communicable_diseases_preventionandremedies.Subscribe.click();
	}



	@Test
	public void Human_Diseases_including_communicable_diseases_preventionandremedies() {

		Human_Diseases_including_communicable_diseases_preventionandremediesFunction();
		driver.navigate().back();
	}
}
