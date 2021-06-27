package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Economics.RuralWelfareOrientedProgrammes;
public class RuralWelfareOrientedProgrammes_TestCase extends CommonFunction{

	public void RuralWelfareOrientedProgrammesfunction() {
		
		PageFactory.initElements(driver, RuralWelfareOrientedProgrammes.class);
		RuralWelfareOrientedProgrammes.ClickRuralWelfareOrientedProgrammes.click();
		WebElement element = RuralWelfareOrientedProgrammes.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	
	@Test
	public void RuralWelfareOrientedProgrammes() throws InterruptedException {

		RuralWelfareOrientedProgrammesfunction();
		driver.navigate().back();
	}
}
