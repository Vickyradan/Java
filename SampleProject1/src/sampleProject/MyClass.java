package sampleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://vidhvaa.com/vidhvaaindex");
		
		driver.navigate().to("http://vidhvaa.com/vidhvaaindex");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		driver.findElement(By.id("myBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ClickLogin = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("myBtn"))));
		ClickLogin.click();
		 
		driver.findElement(By.name("mobile")).sendKeys("7639613839");
		driver.findElement(By.name("email")).sendKeys("vigneshpyroferus@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/input")).click();
		
		driver.navigate().back();
		
		driver.quit();
		System.out.println("Successfull");
	}

}
