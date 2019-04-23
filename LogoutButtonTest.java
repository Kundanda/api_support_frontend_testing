package adminsidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutButtonTest {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		logoutButtonTest();
		
	
			
		}
	
	public static void logoutButtonTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin.chocolatepie.tech/login");
		//driver.manage().window().maximize();
		System.out.println("hello from "+driver.getTitle());
		//driver.findElement(By.className("google-button")).click();
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("kenneth@ken.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		driver.findElement(By.className("v-btn__content")).click();
		
		Thread.sleep(3000);
		java.util.List<WebElement> out = driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large v-btn--depressed theme--light btn1']"));
		out.get(1).click();
		Thread.sleep(3000);
		
		System.out.println("Successfuly able to logout");
		
	}

}
