package TestCase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunction;
import pageObject.Login;
import pageObject.Performance_EmployeeTracker;

public class EmployeeTracker extends CommonFunction {
	
	public void LoginFunction(){
		PageFactory.initElements(driver, Login.class);
		Login.username.sendKeys(properties.getProperty("username"));
		Login.password.sendKeys(properties.getProperty("password"));
		Login.submit.click();		
	}
			
	public void ClickTracker(){
		PageFactory.initElements(driver, Performance_EmployeeTracker.class);
		Actions action = new Actions(driver);
		action.moveToElement(Performance_EmployeeTracker.ClickPerformance);
		action.moveToElement(Performance_EmployeeTracker.ClickEmpolyeeTracker);
		action.click().build().perform();
		
	}
	
	@Test
	public void EmployeeTracker1(){
//		LoginFunction();
		PageFactory.initElements(driver, Performance_EmployeeTracker.class);
		ClickTracker();
		
	}

}
