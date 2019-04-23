package adminsidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBarTest {
	
	public static void main(String[] args) throws InterruptedException {
		//searchBarTestingPassNewJobs(); 	
		//searchBarTestingFailNewJobs();
		//searchBarTestingPassMyJobs();
		searchBarTestingFailMyJobs();
	}
	
	public static void searchBarTestingPassNewJobs() throws InterruptedException {
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
		driver.findElement(By.xpath("//input[@aria-label='Search...']")).sendKeys("Testing1");
		System.out.println("Successfuly able to search for the respected ticket in New Jobs");
		
		
	}
	
	public static void searchBarTestingFailNewJobs() throws InterruptedException {
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
		driver.findElement(By.xpath("//input[@aria-label='Search...']")).sendKeys("Tesfkghjklfjhasf");
		System.out.println("Unable to search for the respected ticket in New Jobs due to invalid input in the search field");
		
		
	}
	
	public static void searchBarTestingPassMyJobs() throws InterruptedException {
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
		jobs.get(1).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search...']")).sendKeys("Testing1");
		System.out.println("Successfuly able to search for the respected ticket in My Jobs");
		
		
	}
	
	public static void searchBarTestingFailMyJobs() throws InterruptedException {
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
		jobs.get(1).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Search...']")).sendKeys("Ttryuhijlkgjhaskbh");
		System.out.println("Unable to search for the respected ticket in My Jobs due to invalid input in the search field");
		
		
	}

}
