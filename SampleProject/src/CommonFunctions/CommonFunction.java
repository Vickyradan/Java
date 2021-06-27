package CommonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@SuppressWarnings("unused")
public class CommonFunction {
	public static Properties properties=null;
	public static WebDriver driver=null;
	public Properties PropertyFile() throws IOException{
		FileInputStream fileInputStream =new FileInputStream("Configure.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		
		return properties;
	}
	
	@BeforeSuite
	public void OpenBrowser() throws IOException{
		
		PropertyFile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverlocation = properties.getProperty("driverlocation");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver = new ChromeDriver();
			
		}else{
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterSuite
	public void CloseBrowser(){
		driver.quit();
	}

}
