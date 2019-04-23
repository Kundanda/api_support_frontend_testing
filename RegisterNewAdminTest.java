package adminsidetesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterNewAdminTest {
	
	public static void main(String[] args) throws InterruptedException {
		registerNewAdminPass();
		//registerNewAdminCancelButton();
		//registerNewAdminFailInvalidemail();
		//registerNewAdminFailPasswordsDontMatch();
		//registerNewAdminFailDuplicateAccountExists(); 
	}
	
	
	public static void registerNewAdminPass() throws InterruptedException {
		
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
		
		
		java.util.List<WebElement> out = driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large v-btn--depressed theme--light btn1']"));
		out.get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("testadmin19");
		driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("testadmin19@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("password");
		Thread.sleep(3000);
		
		
		java.util.List<WebElement> links3 = driver.findElements(By.xpath("//button[@class='v-btn theme--light accent2']"));
		//java.util.List<WebElement> links4 = driver.findElements(By.className("v-btn__content"));
		links3.get(0).click();
		Thread.sleep(3000);
		java.util.List<WebElement> links5 = driver.findElements(By.xpath("//button[@class='v-btn v-btn--flat theme--light purple--text text--darken-1']"));
		
		links5.get(0).click();
		
		System.out.println("Registration successful");
	}
	
public static void registerNewAdminCancelButton() throws InterruptedException {
		
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
		
		java.util.List<WebElement> out = driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large v-btn--depressed theme--light btn1']"));
		out.get(0).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("testuser2");
		driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("testuser2@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("password");
		
		
		java.util.List<WebElement> links3 = driver.findElements(By.xpath("//button[@class='v-btn theme--light red lighten-3']"));
		links3.get(0).click();
		Thread.sleep(1000);
		System.out.println("Registration cancelled by admin");
		
		
	}

public static void registerNewAdminFailInvalidemail() throws InterruptedException {
	
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
	
	
	java.util.List<WebElement> out = driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large v-btn--depressed theme--light btn1']"));
	out.get(0).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("testuser2");
	driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("testusergmail.com");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("password");
	Thread.sleep(2000);
	
	
	java.util.List<WebElement> links3 = driver.findElements(By.xpath("//button[@class='v-btn theme--light accent2']"));
	//java.util.List<WebElement> links4 = driver.findElements(By.className("v-btn__content"));
	//links3.get(0).click();
	Thread.sleep(3000);
	
	
	System.out.println("Registration failed because of invalid E-mail. Please enter a valid email ID");
	
}


public static void registerNewAdminFailPasswordsDontMatch() throws InterruptedException {
	
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
	
	
	java.util.List<WebElement> out = driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large v-btn--depressed theme--light btn1']"));
	out.get(0).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("testuser2");
	driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("testuser2@gmail.com");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("passwordddddd");
	Thread.sleep(2000);
	
	
	java.util.List<WebElement> links3 = driver.findElements(By.xpath("//button[@class='v-btn theme--light accent2']"));
	//java.util.List<WebElement> links4 = driver.findElements(By.className("v-btn__content"));
	//links3.get(0).click();
	Thread.sleep(3000);
	System.out.println("Registration failed because passwords don't match");
	//links3.get(0).click();
	
}

public static void registerNewAdminFailDuplicateAccountExists() throws InterruptedException {
	
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
	
	
	java.util.List<WebElement> out = driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large v-btn--depressed theme--light btn1']"));
	out.get(0).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("testadmin18");
	driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("testadmin18@gmail.com");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("password");
	Thread.sleep(2000);
	
	
	java.util.List<WebElement> links3 = driver.findElements(By.xpath("//button[@class='v-btn theme--light accent2']"));
	//java.util.List<WebElement> links4 = driver.findElements(By.className("v-btn__content"));
	links3.get(0).click();
	Thread.sleep(3000);
	System.out.println("Registration failed because a duplicate account exists. Please ask the respected admin to login with those credentials");
	//links3.get(0).click();
	
	
}

}
