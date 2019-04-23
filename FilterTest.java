package adminsidetesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterTest {
	
	public static void main(String[] args) throws InterruptedException {
		//filterTestNewJobs();
		filterTestMyJobs();
		
	}
	
	public static void filterTestNewJobs() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin.chocolatepie.tech/login");
		
		System.out.println("hello from "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("kenneth@ken.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		driver.findElement(By.className("v-btn__content")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='v-select__selections']")).click();
		
		List<WebElement> filter= driver.findElements(By.xpath("//a[@class='v-list__tile v-list__tile--link theme--light']"));
		Thread.sleep(3000);
		filter.get(2).click();
		
		Thread.sleep(3000);
		
		System.out.print("Successfully applied the filter under New Jobs");
		
		
		
		
	}
	
	public static void filterTestMyJobs() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin.chocolatepie.tech/login");
		
		System.out.println("hello from "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("kenneth@ken.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		driver.findElement(By.className("v-btn__content")).click();
		Thread.sleep(3000);
		
		
		java.util.List<WebElement> jobs = driver.findElements(By.xpath("//div[@class='button-text']"));
		jobs.get(1).click();
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//div[@class='v-select__selections']")).click();
		
		List<WebElement> filter= driver.findElements(By.xpath("//a[@class='v-list__tile v-list__tile--link theme--light']"));
		Thread.sleep(3000);
		filter.get(2).click();
		
		Thread.sleep(3000);
		
		System.out.print("Successfully applied the filter under My Jobs");
		
	}
	}


