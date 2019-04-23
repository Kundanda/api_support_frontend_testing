package adminsidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatTestingAdmin {

	public static void main(String[] args) throws InterruptedException {
		chatTestAdmin();
			
		}
		
		public static void chatTestAdmin() throws InterruptedException {
			
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
			
			java.util.List<WebElement> viewjobs = driver.findElements(By.xpath("//div[@id='message_title']"));
			viewjobs.get(1).click();
			Thread.sleep(2000);
			
			System.out.println("Successfully able to view the respected job");
			
			driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys("new try");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			System.out.println("Successfully able to send text message over chat");
			
		}
			

}
