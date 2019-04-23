package usersidetesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignOutTesting {
	
	public static void main(String[] args) throws InterruptedException{
		
		SignOutTestUser();
		
		
	}
	
	public static void SignOutTestUser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://user.chocolatepie.tech/login");
		driver.manage().window().maximize();
		System.out.println("hello from "+driver.getTitle());
		//driver.findElement(By.className("google-button")).click();
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.className("options")).click();
		Thread.sleep(3000);
		
		java.util.List<WebElement> sout = driver.findElements(By.tagName("a"));
		sout.get(0).click();
		
		System.out.println("Succesfully signed out");
	}
}
