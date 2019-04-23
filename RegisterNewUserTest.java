package usersidetesting;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterNewUserTest {
	
	public static void main(String[] args) throws InterruptedException {
		//registerNewUserPass();
		//registerNewUserCancelButton();
		//registerNewUserFailInvalidemail();
		//registerNewUserFailPasswordsDontMatch();
		registerNewUserFailDuplicateAccountExists(); 
	}
	
	
	public static void registerNewUserPass() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://user.chocolatepie.tech/login");
		driver.manage().window().maximize();
		System.out.println("hello from "+driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("register")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("testuser23");
		driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("testuser23@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("password");
		Thread.sleep(3000);
		
		
		java.util.List<WebElement> links3 = driver.findElements(By.xpath("//button[@class='v-btn theme--light accent']"));
		java.util.List<WebElement> links4 = driver.findElements(By.className("v-btn__content"));
		links3.get(0).click();
		Thread.sleep(5000);
		java.util.List<WebElement> links5 = driver.findElements(By.xpath("//button[@class='v-btn v-btn--flat theme--light purple--text text--darken-1']"));
		java.util.List<WebElement> links6 = driver.findElements(By.className("v-btn__content"));
		links5.get(0).click();
		
		System.out.println("Registration successful");
	}
	
public static void registerNewUserCancelButton() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://user.chocolatepie.tech/login");
		driver.manage().window().maximize();
		System.out.println("hello from "+driver.getTitle());
		Thread.sleep(3000);
		
		driver.findElement(By.className("register")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("testuser2");
		driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("testuser2@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("password");
		
		
		java.util.List<WebElement> links3 = driver.findElements(By.xpath("//button[@class='v-btn theme--light red']"));
		java.util.List<WebElement> links4 = driver.findElements(By.className("v-btn__content"));
		links3.get(0).click();
		Thread.sleep(1000);
		System.out.println("Registration cancelled by admin");
		
		
	}

public static void registerNewUserFailInvalidemail() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://user.chocolatepie.tech/login");
	driver.manage().window().maximize();
	System.out.println("hello from "+driver.getTitle());
	
	Thread.sleep(3000);
	
	driver.findElement(By.className("register")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("testuser7");
	driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("testuser@@@gmail.com");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("password");
	Thread.sleep(3000);
	
	

	
	System.out.println("Registration failed because of invalid E-mail. Please enter a valid email ID");
	
}


public static void registerNewUserPasswordsDontMatch() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://user.chocolatepie.tech/login");
	driver.manage().window().maximize();
	System.out.println("hello from "+driver.getTitle());
	
	
	
	
	Thread.sleep(3000);
	driver.findElement(By.className("register")).click();
	
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("testuser2");
	driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("testuser2@gmail.com");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("passwordddddd");
	Thread.sleep(2000);
	
	
	
	System.out.println("Registration failed because passwords don't match");
	
	
}

public static void registerNewUserFailDuplicateAccountExists() throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://user.chocolatepie.tech/login");
	driver.manage().window().maximize();
	System.out.println("hello from "+driver.getTitle());
	
	Thread.sleep(3000);
	
	driver.findElement(By.className("register")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("testuser17");
	driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("testuser17@gmail.com");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("password");
	Thread.sleep(2000);
	
	
	java.util.List<WebElement> links3 = driver.findElements(By.xpath("//button[@class='v-btn theme--light accent']"));
	java.util.List<WebElement> links4 = driver.findElements(By.className("v-btn__content"));
	links3.get(0).click();
	
	Thread.sleep(1000);
	System.out.println("Registration failed because a duplicate account exists. Please ask the respected admin to login with those credentials");
	//links3.get(0).click();
	
	
}

}
