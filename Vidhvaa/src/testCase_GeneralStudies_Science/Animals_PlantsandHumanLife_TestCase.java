package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_GeneralStudies_Science.Animals_PlantsandHumanLife;
public class Animals_PlantsandHumanLife_TestCase extends CommonFunction {

	public void Animals_PlantsandHumanLifeFunction() {
		PageFactory.initElements(driver, Animals_PlantsandHumanLife.class);
		Animals_PlantsandHumanLife.ClickAnimals_PlantsandHumanLife.click();
		Animals_PlantsandHumanLife.Subscribe.click();
	}
	
	
	public void PageBack() throws InterruptedException {
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	
	@Test
	public void Animals_PlantsandHumanLife() throws InterruptedException {
		
		Animals_PlantsandHumanLifeFunction();
		driver.navigate().back();
		PageBack();
	}
}
