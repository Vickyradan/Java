package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Economics.SocialSectorProblemsPopulationEducationHealthEmploymentPoverty;
public class SocialSectorProblemsPopulationEducationHealthEmploymentPoverty_TestCase extends CommonFunction{

	public void SocialSectorProblemsPopulationEducationHealthEmploymentPovertyfuction() {
		
		PageFactory.initElements(driver, SocialSectorProblemsPopulationEducationHealthEmploymentPoverty.class);
		SocialSectorProblemsPopulationEducationHealthEmploymentPoverty.
		                                 ClickSocialSectorProblemsPopulationEducationHealthEmploymentPoverty.click();
		WebElement element =SocialSectorProblemsPopulationEducationHealthEmploymentPoverty.ClickSampleMaterial;
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	
	@Test
	public void SocialSectorProblemsPopulationEducationHealthEmploymentPoverty() throws InterruptedException {

		SocialSectorProblemsPopulationEducationHealthEmploymentPovertyfuction();
		driver.navigate().back();
	}
}
