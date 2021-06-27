package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_PuzzleTest;

public class Material_PuzzleTest_TestCase extends CommonFunction {

	public void PuzzleTestFunctions() {
		PageFactory.initElements(driver, Material_PuzzleTest.class);
		Material_PuzzleTest.PuzzleTest.click();
		Material_PuzzleTest.ClickSubscribe.click();
	}
	
	@Test
	public void PuzzleTest() {

		PuzzleTestFunctions();
		driver.navigate().back();
	}
}
