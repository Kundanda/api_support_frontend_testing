package adminsidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadMediaAdmin {
	
public static void main(String[] args) throws InterruptedException {
		
		downloadMediaAdminTest();
		
	}
	
public static void downloadMediaAdminTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin.chocolatepie.tech/login");
		
		System.out.println("hello from "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("kenneth@ken.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		driver.findElement(By.className("v-btn__content")).click();
		Thread.sleep(7000);
		
		java.util.List<WebElement> jobs = driver.findElements(By.xpath("//div[@class='button-text']"));
		jobs.get(1).click();
		Thread.sleep(2000);
		
		java.util.List<WebElement> viewjobs = driver.findElements(By.xpath("//div[@id='message_title']"));
		viewjobs.get(1).click();
		Thread.sleep(2000);
		
		System.out.println("Successfully able to view the respected job");
		
		
		
		java.util.List<WebElement> download = driver.findElements(By.xpath("//div[@class='message__container']"));
		java.util.List<WebElement> download1 = driver.findElements(By.xpath("//div[@class='message']"));
		java.util.List<WebElement> download2 = driver.findElements(By.xpath("//i[@class='v-icon v-icon--link material-icons theme--light white--text']"));
		download2.get(0).click();
		
		Thread.sleep(2000);
		System.out.println("Successfuly able to download the requested media file");
		
		
	}

}
