package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class CommonFunction {
	
	public static Properties property;
	public static WebDriver driver;
	
	
	public Properties Propertyfile() throws IOException{
		
		FileInputStream inputStream = new FileInputStream("Config.properties");
		 property = new Properties();
		 property.load(inputStream);
		 
		 return property;
	}
	
	
	@BeforeSuite
	public void OpenBrowser() throws IOException{
	
		Propertyfile();
		
		String Browser = property.getProperty("browser");
		String url =property.getProperty("url");
		String driverLocation = property.getProperty("driverlocation");
		
		if (Browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();
	
		} else {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
		}
		
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
//	@AfterSuite
//	public void CloseBrowser(){
//		driver.quit();
//	}

}
