package adminsidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoMyJobsTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		addToMyJobsTesting();
		
		
	}
	
	public static void addToMyJobsTesting() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin.chocolatepie.tech/login");
		//driver.manage().window().maximize();
		System.out.println("hello from "+driver.getTitle());
		//driver.findElement(By.className("google-button")).click();
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("kenneth@ken.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		driver.findElement(By.className("v-btn__content")).click();
		
		Thread.sleep(7000);
		
		java.util.List<WebElement> jobs = driver.findElements(By.xpath("//div[@class='button-text']"));
		jobs.get(0).click();
		Thread.sleep(3000);
		
		java.util.List<WebElement> viewjobs = driver.findElements(By.xpath("//div[@id='message_title']"));
		viewjobs.get(2).click();
		Thread.sleep(2000);
		
		java.util.List<WebElement> links5 = driver.findElements(By.xpath("//button[@class='v-btn v-btn--large v-btn--round theme--light']"));
		//java.util.List<WebElement> links6 = driver.findElements(By.className("v-btn__content"));
		links5.get(0).click();
		
		Thread.sleep(3000);
		
		System.out.println("Successfully added the selected ticket to My Jobs");
		
//		java.util.List<WebElement> buttons = driver.findElements(By.tagName("Button"));
//		buttons.get(0).click();
//		Thread.sleep(2000);
	}

	
	
}
