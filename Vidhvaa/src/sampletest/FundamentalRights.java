package sampletest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FundamentalRights {

	@FindBy(xpath="//*[@id='hid2']")
	public static WebElement ClickGeneralStudies;
	
	@FindBy(xpath="//button[@id='myBtn']/following::button[4]")
	public static WebElement ClcikPolitics;

	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[6]/div/div/div[1]/a/button")
	public static WebElement ClickFundamentalRights;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
