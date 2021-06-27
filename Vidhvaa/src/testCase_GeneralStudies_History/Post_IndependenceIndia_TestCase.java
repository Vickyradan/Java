package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Post_IndependenceIndia;
public class Post_IndependenceIndia_TestCase extends CommonFunction{

	
	public void Post_IndependenceIndiaFunction() {
		PageFactory.initElements(driver, Post_IndependenceIndia.class);
		Post_IndependenceIndia.clickPost_IndependenceIndia.click();
		Post_IndependenceIndia.ClickSubscribe.click();
		
	}
	
	@Test(priority=25)
	public void  Post_IndependenceIndia(){
		Post_IndependenceIndiaFunction();
		driver.navigate().back();
	}
}
