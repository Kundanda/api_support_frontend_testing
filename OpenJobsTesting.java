package adminsidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenJobsTesting {
	
	public static void main(String[] args) throws InterruptedException {
		
		openNewJobsTestingPass();
		openMyJobsTestingPass();
		
		
	}
	
	public static void openNewJobsTestingPass() throws InterruptedException {
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
		
		java.util.List<WebElement> jobs = driver.findElements(By.xpath("//div[@class='button-text']"));
		jobs.get(0).click();
		Thread.sleep(2000);
		
		System.out.println("Successfuly able to view all the New Jobs");
	}
	
	
	public static void openMyJobsTestingPass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin.chocolatepie.tech/login");
		//driver.manage().window().maximize();
		System.out.println("hello from "+driver.getTitle());
		//driver.findElement(By.className("google-button")).click();
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing1@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		driver.findElement(By.className("v-btn__content")).click();
		
		Thread.sleep(3000);
		
		java.util.List<WebElement> jobs = driver.findElements(By.xpath("//div[@class='button-text']"));
		jobs.get(1).click();
		Thread.sleep(2000);
		
		System.out.println("Successfuly able to view all My Jobs");
	}
	

}
