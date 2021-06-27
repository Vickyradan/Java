package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import objectDetails_GeneralStudies_Economics.FiveYearPlanandAssessment;
import commonFunctions.CommonFunction;

public class FiveYearPlanandAssessment_TestCase extends CommonFunction{
	
	public void FiveYearPlanandAssessmentfunction() {
		
		PageFactory.initElements(driver, FiveYearPlanandAssessment.class);
		FiveYearPlanandAssessment.ClickFiveYearPlanandAssessment.click();
		WebElement element =FiveYearPlanandAssessment.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	
	
	
	@Test
	public void FiveYearPlanandAssessment() throws InterruptedException {

		FiveYearPlanandAssessmentfunction();
		driver.navigate().back();
	}

}
