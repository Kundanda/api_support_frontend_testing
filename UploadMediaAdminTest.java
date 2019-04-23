package adminsidetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadMediaAdminTest {
	
	public static void main(String[] args) throws InterruptedException {
		uploadMediaConfirm();
		//uploadMediaCancel();
		//uploadMediaFailUnsupportedFileSupport();
		
		
		
	}
	
	public static void uploadMediaConfirm() throws InterruptedException {
		
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
		viewjobs.get(2).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys("new try");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		
		Thread.sleep(3000);
		
		WebElement uploadfil=driver.findElement(By.xpath("//input[@type='file']"));
		uploadfil.sendKeys("/Users/kundandalmia/desktop/Antarctic.jpeg");
		Thread.sleep(3000);
		java.util.List<WebElement> buttons = driver.findElements(By.tagName("Button"));
		buttons.get(1).click();
		Thread.sleep(2000);
		System.out.println("Media upload successful");
		
	}
	
public static void uploadMediaCancel() throws InterruptedException {
		
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
		viewjobs.get(2).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys("new try");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		
		Thread.sleep(3000);
		
		WebElement uploadfil=driver.findElement(By.xpath("//input[@type='file']"));
		uploadfil.sendKeys("/Users/kundandalmia/desktop/Antarctic.jpeg");
		Thread.sleep(3000);
		java.util.List<WebElement> buttons = driver.findElements(By.tagName("Button"));
		buttons.get(0).click();
		Thread.sleep(2000);
		System.out.println("Media upload cancelled by admin");
		
	}

public static void uploadMediaFailUnsupportedFileSupport() throws InterruptedException {
	
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
	viewjobs.get(2).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys("new try");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@aria-label='Type here...']")).sendKeys(Keys.ENTER);
	//Thread.sleep(1000);
	
	Thread.sleep(3000);
	
	WebElement uploadfil=driver.findElement(By.xpath("//input[@type='file']"));
	uploadfil.sendKeys("/Users/kundandalmia/desktop/tester.rtf");
	System.out.println("Unsupported file format, media upload not successful");
//	Thread.sleep(3000);
//	java.util.List<WebElement> buttons = driver.findElements(By.tagName("Button"));
//	buttons.get(0).click();
//	Thread.sleep(2000);
	
}
		
	}




