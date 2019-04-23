package usersidetesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateTicketTesting {
	public static void main(String[] args) throws InterruptedException {
		
		//	CreateTicketTesting.CTChrome();
		//CreateTicketTesting.FormFillPass1(); //Pass without Uploading file
	    CreateTicketTesting.FormFillPass2(); //Pass with Uploading file
	   // CreateTicketTesting.FormFillFail1(); //Fail with no Ticket title	CreateTicketTesting.FormFillFail2(); //Fail with no Ticket Category
	    //CreateTicketTesting.FormFillFail3(); //Fail with no Message
		}
	

	
	
	public static void CTSafari() throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("https://www.user.chocolatepie.tech/");
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		Thread.sleep(5000);
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		links.get(2).click();
		System.out.println("Create Ticket successful in Safari Web Browser");
		}
	
	
	
	
	public static void CTChrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.user.chocolatepie.tech/");
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		Thread.sleep(6000);
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		links.get(2).click();
		System.out.println("Create Ticket successful in Chrome Web Browser");
	}
	
	
	
	
	
	
	public static void FormFillPass1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.user.chocolatepie.tech/");
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		Thread.sleep(7000);
		
		//Create ticket
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		links.get(2).click();
		Thread.sleep(4000);
		
		//Ticket Title
		driver.findElement(By.xpath("//input[@aria-label='Ticket Title']")).sendKeys("try");
		
		//Ticket Category
		driver.findElement(By.className("v-select__selections")).click();
		Thread.sleep(2000);
		java.util.List<WebElement> links2 = driver.findElements(By.tagName("a"));
		links2.get(2).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Ticket Title']")).click();
		
		//Message
		driver.findElement(By.name("message")).sendKeys("try");
		
		//Submit
		java.util.List<WebElement> links3 = driver.findElements(By.tagName("button"));
		links3.get(1).click();
		
		//View Ticket
		links.get(1).click();
		Thread.sleep(2000);

		System.out.println("Ticket created successfuly.");
	}
	
	
	public static void FormFillPass2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.user.chocolatepie.tech/");
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		Thread.sleep(7000);
		
		//Create ticket
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		links.get(2).click();
		Thread.sleep(2000);
		
		//Ticket Title
		driver.findElement(By.xpath("//input[@aria-label='Ticket Title']")).sendKeys("testing UploadImage1111");
		
		//Ticket Category
		driver.findElement(By.className("v-select__selections")).click();
		Thread.sleep(2000);
		java.util.List<WebElement> links2 = driver.findElements(By.tagName("a"));
		links2.get(2).click();
		driver.findElement(By.xpath("//input[@aria-label='Ticket Title']")).click();
		
		//Message
		driver.findElement(By.name("message")).sendKeys("testing FormFillPass1111");
		
	
		
		//Upload
		//java.util.List<WebElement> links4 = driver.findElements(By.tagName("i"));
		//((WebElement) links4).click();
		
//		WebElement uploadmyfiles= driver.findElement(By.xpath("//input[@aria-label='Files']"));
//		
//		uploadmyfiles.sendKeys("/Users/kundandalmia/desktop/Unknown.jpeg");
		
		WebElement uploadfil=driver.findElement(By.xpath("//input[@type='file']"));
		uploadfil.sendKeys("/Users/kundandalmia/desktop/Antarctic.jpeg");
		Thread.sleep(2000);
		
		//Submit
		java.util.List<WebElement> links3 = driver.findElements(By.tagName("button"));
		links3.get(1).click();
		
		
		//View Ticket
		//links.get(1).click();

		System.out.println("Ticket created successfuly with file uploaded.");
	}
	
	public static void FormFillFail1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.user.chocolatepie.tech/");
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		Thread.sleep(7000);
		
		//Create ticket
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		links.get(2).click();
		Thread.sleep(2000);
		
		
		//Ticket Title
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@aria-label='Ticket Title']")).sendKeys("testing FormFillPass");
		
		//Ticket Category
		driver.findElement(By.className("v-select__selections")).click();
		Thread.sleep(2000);
		java.util.List<WebElement> links2 = driver.findElements(By.tagName("a"));
		links2.get(2).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Ticket Title']")).click();
		
		//Message
		Thread.sleep(2000);
		driver.findElement(By.name("message")).sendKeys("testing FormFillPass");
		
		//Submit
		Thread.sleep(2000);
		java.util.List<WebElement> links3 = driver.findElements(By.tagName("button"));
		links3.get(1).click();

		System.out.println("Create Ticket Fail. Ticket Title was not entered.");
		
	}
	
	public static void FormFillFail2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.user.chocolatepie.tech/");
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing1@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		Thread.sleep(7000);
		
		//Create ticket
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		links.get(2).click();
		
		
		//Ticket Title
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Ticket Title']")).sendKeys("testing FormFillPass");
		
		//Ticket Category
//		driver.findElement(By.className("v-select__selections")).click();
//		java.util.List<WebElement> links2 = driver.findElements(By.tagName("a"));
		//links2.get(2).click();
//		driver.findElement(By.xpath("//input[@aria-label='Ticket Title']")).click();
		
		//Message
		Thread.sleep(2000);
		driver.findElement(By.name("message")).sendKeys("testing FormFillPass");
		
		//Submit
		Thread.sleep(2000);
		java.util.List<WebElement> links3 = driver.findElements(By.tagName("button"));
		links3.get(1).click();

		System.out.println("Create Ticket Fail. Ticket category was not selected.");
		
	}
	public static void FormFillFail3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.user.chocolatepie.tech/");
		driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing1@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
		java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
		buttonn.get(0).click();
		Thread.sleep(7000);
		
		//Create ticket
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		links.get(2).click();
		
		//Ticket Title
		driver.findElement(By.xpath("//input[@aria-label='Ticket Title']")).sendKeys("testing FormFillPass");
		
		//Ticket Category
		driver.findElement(By.className("v-select__selections")).click();
		java.util.List<WebElement> links2 = driver.findElements(By.tagName("a"));
		links2.get(2).click();
		driver.findElement(By.xpath("//input[@aria-label='Ticket Title']")).click();
		
		//Message
		//driver.findElement(By.name("message")).sendKeys("testing FormFillPass");
		
		//Submit
		Thread.sleep(2000);
		java.util.List<WebElement> links3 = driver.findElements(By.tagName("button"));
		links3.get(1).click();

		System.out.println("Create Ticket Fail. No Message found.");
		
	}
	
}
