package sampletest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnionStateandUnionTerritory {

	@FindBy(xpath="//*[@id='hid2']")
	public static WebElement ClickGeneralStudies;
	
	@FindBy(xpath="//button[@id='myBtn']/following::button[4]")
	public static WebElement ClcikPolitics;

	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[4]/div/div/div[1]/a/button")
	public static WebElement ClickUnionStateandUnionTerritory;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
