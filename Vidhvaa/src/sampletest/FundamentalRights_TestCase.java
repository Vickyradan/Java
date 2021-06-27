package sampletest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import sampletest.FundamentalRights;
public class FundamentalRights_TestCase extends CommonFunction{

	public void FundamentalRightsfunction() {
		
		PageFactory.initElements(driver, FundamentalRights.class);
		FundamentalRights.ClickGeneralStudies.click();
		FundamentalRights.ClcikPolitics.click();
		FundamentalRights.ClickFundamentalRights.click();
		WebElement element = FundamentalRights.ClickSampleMaterial;
		
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
	public void FundamentalRights() throws InterruptedException {

		LoginFunction();
		FundamentalRightsfunction();
		driver.navigate().back();

	}
}
