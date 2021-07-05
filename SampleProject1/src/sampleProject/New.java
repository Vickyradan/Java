package sampleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "E:\\chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		WebElement Password = driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
//		driver.findElement(By.name("Submit")).click();
		
		driver.navigate().back();
		
		
		driver.navigate().forward();//*[@id="nLogin"] //*[@id="nLogin"] //*[@id="nLogin"] //*[@id="nLogin"]
		
//		driver.close(); 
		
	}

}
