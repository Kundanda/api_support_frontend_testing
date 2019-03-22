package seleniumdemo;

import java.sql.Time;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SignInTesting {
	
public static void main(String[] args) throws InterruptedException {
		
		//SignInTesting.SignInFailBoundaryCase1();
		//SignInTesting.SignInFailEmptyPassword();
		//SignInTesting.SignInFailEmptyUserName();
		//SignInTesting.SignInFailIncorrectPassword();
		//SignInTesting.SignInFailCommonCase();
		SignInTesting.SignInPass();
		//SignInTesting.SignInWithGoogleButton();

}

public static void SignInPass(){
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://chocolatepie.tech/login");
	//driver.manage().window().maximize();
	System.out.println("hello from "+driver.getTitle());
	//driver.findElement(By.className("google-button")).click();
	driver.findElement(By.xpath("//input[@aria-label='USERNAME']")).sendKeys("testing1@gmail.com");
	driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
	driver.findElement(By.className("v-btn__content")).click();
	
}

public static void SignInFailBoundaryCase1() {

	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://chocolatepie.tech/login");
	driver.findElement(By.xpath("//input[@aria-label='USERNAME']")).sendKeys("testing1@@gmail.com");
	
	driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
	driver.findElement(By.className("v-btn__content")).click();
	System.out.println("Sign In unsuccessful due to incorrect format of E-mail ID");
}

public static void SignInFailCommonCase() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://chocolatepie.tech/login");
	driver.findElement(By.xpath("//input[@aria-label='USERNAME']")).sendKeys("abc.?com@/gmail");
	driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
	driver.findElement(By.className("v-btn__content")).click();
	System.out.println("Sign In unsuccessful due to incorrect format of E-mail ID");
}

public static void SignInFailEmptyUserName() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://chocolatepie.tech/login");
	driver.findElement(By.xpath("//input[@aria-label='USERNAME']")).sendKeys("");
	//driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("");
	driver.findElement(By.className("v-btn__content")).click();
	System.out.println("Sign In unsuccessful because user-name is left empty");
}

public static void SignInFailEmptyPassword() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://chocolatepie.tech/login");
	driver.findElement(By.xpath("//input[@aria-label='USERNAME']")).sendKeys("testing1@gmail.com");
	driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("");
	driver.findElement(By.className("v-btn__content")).click();
	System.out.println("Sign In unsuccessful because password is left empty");
}

public static void SignInFailIncorrectPassword() {

	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://chocolatepie.tech/login");
	driver.findElement(By.xpath("//input[@aria-label='USERNAME']")).sendKeys("testing1@gmail.com");
	
	driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password12345");
	driver.findElement(By.className("v-btn__content")).click();
	System.out.println("Sign In unsuccessful due to incorrect password");
}

public static void SignInWithGoogleButton(){
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://chocolatepie.tech/login");
	//driver.manage().window().maximize();
	System.out.println("hello from "+driver.getTitle());
	driver.findElement(By.className("google-button")).click();
	System.out.println("Executed the google sign in button");
	//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testing1@gmail.com");
	
}
	

}
