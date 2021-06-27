package sampletest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import sampletest.UnionStateandUnionTerritory;
public class UnionStateandUnionTerritory_TestCase extends CommonFunction{

	
	public void UnionStateandUnionTerritoryfunction() throws InterruptedException {
		
		PageFactory.initElements(driver, UnionStateandUnionTerritory.class);
		UnionStateandUnionTerritory.ClickGeneralStudies.click();
		UnionStateandUnionTerritory.ClcikPolitics.click();
		UnionStateandUnionTerritory.ClickUnionStateandUnionTerritory.click();
		WebElement element = UnionStateandUnionTerritory.ClickSampleMaterial;
				
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void LoginFunction(){
		
		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();
		
	}
	
	@Test
	public void UnionStateandUnionTerritory() throws InterruptedException {
		
		LoginFunction();
		UnionStateandUnionTerritoryfunction();
		driver.navigate().back();

	}
}
