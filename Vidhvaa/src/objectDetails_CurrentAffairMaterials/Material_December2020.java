package objectDetails_CurrentAffairMaterials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Material_December2020 {

	
	@FindBy(xpath="//*[@id='hid4']/h3/a")
	public static WebElement ClickCurrtenAffair1;
	
	@FindBy(xpath="//*[@id='tab-10']/div/div/div/div[2]/div[2]/a")
	public static WebElement ClickMaterial;
	
	@FindBy(xpath="//div[@id='cookiesPopup']/child::button[2]")
	public static WebElement ClickSubscribe;
}
