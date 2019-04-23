package adminsidetesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendEmail {
	
	public static void main(String[] args) throws InterruptedException {
		sendEmail();
	}
	
	public static void sendEmail() throws InterruptedException {
		
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
	Thread.sleep(2000);

	

	java.util.List<WebElement> viewjobs = driver.findElements(By.xpath("//div[@id='message_title']"));
	viewjobs.get(2).click();
	Thread.sleep(2000);
	
	java.util.List<WebElement> emailbutton = driver.findElements(By.xpath("//button[@class='email-button v-btn v-btn--large v-btn--round theme--light']"));
	emailbutton.get(0).click();
	Thread.sleep(2000);
	
	System.out.println("Email sent to the client");
	
	}
	

}
