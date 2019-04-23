package usersidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTicketTesting {
	
	public static void main(String[] args) throws InterruptedException {
		CloseTicketTesting.closeTicketTest();
	}
	
	public static void closeTicketTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://user.chocolatepie.tech/login");
		driver.manage().window().maximize();
		
		System.out.println("Hello from "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath("//button[@id='0']")).click();
		System.out.println("clicked on open tickets");
		Thread.sleep(3000);
		
		
		java.util.List<WebElement> links = driver.findElements(By.xpath("//div[@class='ticket-holder openTicket']"));
		links.get(2).click();
		Thread.sleep(2000);
		
		java.util.List<WebElement> close = driver.findElements(By.xpath("//button[@class='v-btn v-btn--icon theme--light']"));
		close.get(1).click();
		Thread.sleep(3000);
		
		java.util.List<WebElement> closefinal = driver.findElements(By.xpath("//button[@class='v-btn v-btn--large theme--light accent2']"));
		closefinal.get(0).click();
		
		System.out.println("Successfully resolved and closed this ticket");
		
	}
	
}