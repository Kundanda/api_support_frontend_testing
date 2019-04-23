package usersidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTicketsandChatTesting {
	
	public static void main(String[] args) throws InterruptedException {
		//openTicketPass();
		chatPasswithUploadMediaButtonConfirmTest(); 
		//cancelUploadMediaButtonTest(); 
		//unsupportedFileFormatUploadCheckTesting();
	}
	
	public static void openTicketPass() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://user.chocolatepie.tech/login");
		
		System.out.println("hello from "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath("//button[@id='0']")).click();
		System.out.println("clicked on open tickets");
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Testing 1")).click();
		
		java.util.List<WebElement> links = driver.findElements(By.xpath("//div[@class='ticket-holder openTicket']"));
		links.get(0).click();
		Thread.sleep(2000);
		
		System.out.println("Succesfully opened the requested ticket");
		
		}

	public static void chatPasswithUploadMediaButtonConfirmTest() throws InterruptedException {
		
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
		
		//driver.findElement(By.linkText("Testing 1")).click();
		
		java.util.List<WebElement> links = driver.findElements(By.xpath("//div[@class='ticket-holder openTicket']"));
		links.get(2).click();
		Thread.sleep(2000);
		
		System.out.println("Succesfully opened the requested ticket");
		
		driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys("Automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement uploadfil=driver.findElement(By.xpath("//input[@type='file']"));
		uploadfil.sendKeys("/Users/kundandalmia/desktop/Antarctic.jpeg");
		Thread.sleep(3000);
		java.util.List<WebElement> buttons = driver.findElements(By.tagName("Button"));
		buttons.get(1).click();
		Thread.sleep(2000);
		
		System.out.println("Succesfully send the message and uploaded media to the chat");
		
	}
	
	public static void cancelUploadMediaButtonTest() throws InterruptedException {
		
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
		links.get(2).click();
		Thread.sleep(2000);
		
		System.out.println("Succesfully opened the requested ticket");
		
		driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys("Automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement uploadfil=driver.findElement(By.xpath("//input[@type='file']"));
		uploadfil.sendKeys("/Users/kundandalmia/desktop/Antarctic.jpeg");
		Thread.sleep(3000);
		java.util.List<WebElement> buttons = driver.findElements(By.tagName("Button"));
		buttons.get(0).click();
		Thread.sleep(2000);
		
		System.out.println("User cancelled the media upload to the chat");
		
	}
	
	public static void unsupportedFileFormatUploadCheckTesting() throws InterruptedException {

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
		
		//driver.findElement(By.linkText("Testing 1")).click();
		
		java.util.List<WebElement> links = driver.findElements(By.xpath("//div[@class='ticket-holder openTicket']"));
		links.get(2).click();
		Thread.sleep(2000);
		
		System.out.println("Succesfully opened the requested ticket");
		
		driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys("Automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement uploadfil=driver.findElement(By.xpath("//input[@type='file']"));
		uploadfil.sendKeys("/Users/kundandalmia/desktop/tester.rtf");
		Thread.sleep(3000);
		
		System.out.println("Unable to upload media because it is of unsupported format");
		
		
	}
		

}
