package testCase_CurrentAffairMaterials;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import commonFunctions.PageReturn;
import objectDetails_CurrentAffairMaterials.Material_November2020;

public class Material_November2020_TestCase extends CommonFunction{


	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();

	}

	public void MaterialFunction() throws InterruptedException {
		PageFactory.initElements(driver, Material_November2020.class);
		Material_November2020.ClickCurrtenAffair.click();
		Material_November2020.ClickMaterial.click();
		
	}
	
	
public void Pageback() throws InterruptedException {
		
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}

	@Test
	public void Novermber2020_Material() throws InterruptedException {
		LoginFunction();
		MaterialFunction();
		Pageback();
		
		
	}
	

}
