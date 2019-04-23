package usersidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewTicketTesting {
	
public static void main(String[] args) throws InterruptedException {
	
	//viewTicketsOpenPass(); 
	viewTicketsClosedPass();
	
	
	
}
	
	
public static void viewTicketsOpenPass() throws InterruptedException {
	
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
	System.out.println("clicked on open tickets and able to view all open tickets");
	
}

public static void viewTicketsClosedPass() throws InterruptedException {
	
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
	
	
	driver.findElement(By.xpath("//button[@id='1']")).click();
	System.out.println("clicked on closed tickets and able to view all closed tickets");
	
}


		
		
}	


