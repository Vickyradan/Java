package testCase_CurrentAffairMaterials;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_CurrentAffairMaterials.Material_January2021;
public class Material_January2021_TestCase extends CommonFunction{

	
	public void Material_January2021Function() {
		PageFactory.initElements(driver, Material_January2021.class);
		
		Material_January2021.ClickCurrtenAffair.click();
		Material_January2021.ClickMaterial.click();
		
	}
	
public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	@Test
	public void Material_January2021() throws InterruptedException {
		
		Material_January2021Function();
		Pageback();
		
		
	}
}
