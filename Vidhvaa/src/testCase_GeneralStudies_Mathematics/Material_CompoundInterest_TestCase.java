package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_GeneralStudies_Mathematics.Material_CompoundInterest;

public class Material_CompoundInterest_TestCase extends CommonFunction {


	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();

	}



	public void Material_CompoundInterest() throws InterruptedException {
		PageFactory.initElements(driver, Material_CompoundInterest.class);

		Material_CompoundInterest.ClickGeneralStudies.click();
		Material_CompoundInterest.ClickMathematics_Mateials.click();
		Material_CompoundInterest.Clickmaterial_CompoundInterest.click();

		WebElement element = Material_CompoundInterest.ClickSubscribe;
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element); 

	}

	@Test
	public void CompoundInterest() throws InterruptedException {

		LoginFunction();
		Material_CompoundInterest();
//		driver.navigate().back();


	}



}
