package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Economics.LandReformsandAgricultureAgricultureRelatedschemes;
public class LandReformsandAgricultureAgricultureRelatedschemes_TestCase extends CommonFunction{

	
	public void LandReformsandAgricultureAgricultureRelatedschemesfunction() {
		PageFactory.initElements(driver, LandReformsandAgricultureAgricultureRelatedschemes.class);
		LandReformsandAgricultureAgricultureRelatedschemes.ClickLandReformsandAgricultureAgricultureRelatedschemes.click();
		WebElement element = LandReformsandAgricultureAgricultureRelatedschemes.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	@Test
	public void LandReformsandAgricultureAgricultureRelatedschemes() throws InterruptedException {

		LandReformsandAgricultureAgricultureRelatedschemesfunction();
		driver.navigate().back();
	}
	
}
