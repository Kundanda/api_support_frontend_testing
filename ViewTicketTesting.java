package seleniumdemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewTicketTesting extends SignInTesting {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "/Users/kundandalmia/downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://chocolatepie.tech/login");
        
        System.out.println("hello from "+driver.getTitle());
        
        driver.findElement(By.xpath("//input[@aria-label='USERNAME']")).sendKeys("testing1@gmail.com");
        driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).sendKeys("password");
        driver.findElement(By.className("v-btn__content")).click();
        Thread.sleep(3000);
        
        
        driver.findElement(By.xpath("//button[@id='1']")).click();
        System.out.println("clicked on open tickets");
        
    }
    
}

