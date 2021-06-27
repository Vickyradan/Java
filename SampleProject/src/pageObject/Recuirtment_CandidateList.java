package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recuirtment_CandidateList {
	
	@FindBy(xpath="//*[@id='mainMenuFirstLevelUnorderedList']/li[5]")
	public static WebElement ClickRecuirtment;
	
	@FindBy(xpath="//*[@id='candidateSearch_jobVacancy']")
	public static WebElement ClickVacancy;
	
	@FindBy(id="btnSrch")
	public static WebElement submit;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[2]/td[2]")
	public static WebElement VerifyVacancylist;
	
	

}
