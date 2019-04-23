package usersidetesting;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTesting {
	
public static void main(String[] args) throws InterruptedException {
		
		//SignInTesting.SignInFailBoundaryCase1();
		//SignInTesting.SignInFailEmptyPassword();
		//SignInTesting.SignInFailEmptyUserName();
		//SignInTesting.SignInFailIncorrectPassword();
		SignInTesting.SignInFailCommonCase();
		//SignInTesting.SignInPass();
		//SignInTesting.SignInWithGoogleButton();

}

public static void SignInPass() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://user.chocolatepie.tech/login");
	driver.manage().window().maximize();
	System.out.println("hello from "+driver.getTitle());
	//driver.findElement(By.className("google-button")).click();
	driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing@gmail.com");
	driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
	
	java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
	buttonn.get(0).click();
	Thread.sleep(6000);
	
	System.out.println("Succesfully signed in");
}

public static void SignInFailBoundaryCase1() {

	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://user.chocolatepie.tech/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing1@@gmail.com");
	
	driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
	//java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
	//buttonn.get(0).click();
	System.out.println("Sign In unsuccessful due to incorrect format of E-mail ID");
}

public static void SignInFailCommonCase() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://user.chocolatepie.tech/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("abc.?com@/gmail");
	driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
	
	System.out.println("Sign In unsuccessful due to incorrect format of E-mail ID");
}

public static void SignInFailEmptyUserName() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://user.chocolatepie.tech/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("");
	//driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("");
	java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
	buttonn.get(0).click();
	
	System.out.println("Sign In unsuccessful because user-name is left empty");
}

public static void SignInFailEmptyPassword() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://user.chocolatepie.tech/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing1@gmail.com");
	driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("");
	java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
	buttonn.get(0).click();
	System.out.println("Sign In unsuccessful because password is left empty");
}

public static void SignInFailIncorrectPassword() {

	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://user.chocolatepie.tech/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@aria-label='EMAIL']")).sendKeys("testing1@gmail.com");
	
	driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password12345");
	java.util.List<WebElement> buttonn= driver.findElements(By.xpath("//button[@class='v-btn v-btn--block v-btn--large theme--light accent']"));
	buttonn.get(0).click();
	System.out.println("Sign In unsuccessful due to incorrect password");
}

public static void SignInWithGoogleButton() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://user.chocolatepie.tech/login");
	driver.manage().window().maximize();
	System.out.println("hello from "+driver.getTitle());
	Thread.sleep(5000);
	
	String parent= driver.getWindowHandle();
	System.out.println("Parent window is"+ parent);
	Thread.sleep(3000);
			
	driver.findElement(By.className("google-button")).click();
	System.out.println("Executed the google sign in button");
	Thread.sleep(5000);
	
	Set<String> allWindowsOpened=driver.getWindowHandles();
	
	int count=allWindowsOpened.size();
	
	System.out.println("Total window "+count);
	
	
	for(String child: allWindowsOpened) {
		
		if(!parent.equalsIgnoreCase(child)) {
		driver.switchTo().window(child);
		Thread.sleep(5000);
		
		driver.findElement(By.name("identifier")).sendKeys("randomransom6464@gmail.com");
		
		
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("random6464ransom");
		driver.findElement(By.id("passwordNext")).click();
		}
	}
	
	Thread.sleep(5000);
	
	System.out.println("Succesfully signed in using Google");
	
}
}
