package usersidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadMediaUserSide {
	
	public static void main(String[] args) throws InterruptedException {
		
		downloadMediaTest();
		
	}
	
public static void downloadMediaTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://user.chocolatepie.tech/login");
		driver.manage().window().maximize();
		System.out.println("hello from "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath("//button[@id='0']")).click();
		System.out.println("clicked on open tickets");
		Thread.sleep(3000);
		
		
		
		java.util.List<WebElement> links = driver.findElements(By.xpath("//div[@class='ticket-holder openTicket']"));
		links.get(0).click();
		Thread.sleep(2000);
		
		java.util.List<WebElement> download = driver.findElements(By.xpath("//div[@class='message__container reply']"));
		java.util.List<WebElement> download1 = driver.findElements(By.xpath("//div[@class='message']"));
		java.util.List<WebElement> download2 = driver.findElements(By.xpath("//i[@class='v-icon v-icon--link material-icons theme--light white--text']"));
		download2.get(0).click();
		
		Thread.sleep(5000);
		
		System.out.println("Succesfully downloaded the media file");
		
		
	}

}
