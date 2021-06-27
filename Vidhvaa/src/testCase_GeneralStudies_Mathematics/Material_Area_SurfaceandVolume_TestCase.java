package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_Area_SurfaceandVolume;

public class Material_Area_SurfaceandVolume_TestCase extends CommonFunction {

	public void Area_SurfaceandVolumeFunction() {
		PageFactory.initElements(driver, Material_Area_SurfaceandVolume.class);
		Material_Area_SurfaceandVolume.Area_SurfaceandVolume.click();
		Material_Area_SurfaceandVolume.ClickSubscribe.click();
	}
	
	@Test
	public void Area_SurfaceandVolume() {

		Area_SurfaceandVolumeFunction();
		driver.navigate().back();
	}
}
