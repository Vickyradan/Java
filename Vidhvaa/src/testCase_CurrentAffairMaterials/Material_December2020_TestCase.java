package testCase_CurrentAffairMaterials;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_CurrentAffairMaterials.Material_December2020;

public class Material_December2020_TestCase extends CommonFunction{

	public void Material_December2020Function() {
		PageFactory.initElements(driver, Material_December2020.class);
		
		Material_December2020.ClickCurrtenAffair1.click();
		Material_December2020.ClickMaterial.click();
	}
	
public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	
	@Test
	public void December2020_Material() throws InterruptedException {
		
		Material_December2020Function();
		Pageback();
		
	}
}
