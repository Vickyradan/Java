package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Performance_EmployeeTracker {
	
	
	@FindBy(xpath="//*[@id='menu__Performance']")
	public static WebElement ClickPerformance;
	
	@FindBy(xpath="//*[@id='mainMenuFirstLevelUnorderedList']/li[7]/ul/li[4]")
	public static WebElement ClickEmpolyeeTracker;
	
	

}
