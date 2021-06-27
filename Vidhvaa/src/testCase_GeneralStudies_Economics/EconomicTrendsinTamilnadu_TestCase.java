package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import  objectDetails_GeneralStudies_Economics.EconomicTrendsinTamilnadu;
public class EconomicTrendsinTamilnadu_TestCase extends CommonFunction{

	
	public void EconomicTrendsinTamilnadufunction() {
		PageFactory.initElements(driver, EconomicTrendsinTamilnadu.class);
		EconomicTrendsinTamilnadu.ClickEconomicTrendsinTamilnadu.click();
		WebElement element = EconomicTrendsinTamilnadu.ClickSampleMaterial;
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	@Test
	public void EconomicTrendsinTamilnadu() throws InterruptedException {

		EconomicTrendsinTamilnadufunction();
		driver.navigate().back();
	}
}
