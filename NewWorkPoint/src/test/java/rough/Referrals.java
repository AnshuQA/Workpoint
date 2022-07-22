package rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Referrals {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://103.139.58.87:8090/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("testentry@fincart.com");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		
// Client Button
				Thread.sleep(10000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[3]/a[1]")).click();
		
//Three Dots button
				Thread.sleep(10000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[1]")).click();
				
//Refrerall
	      		driver.findElement(By.linkText("View Referral Link")).click();
	      		Thread.sleep(3000);
	      		WebElement copy1=driver.findElement(By.xpath("//button[contains(text(),'Copy Link')]"));
	      		copy1.click();
	      		Robot robot = new Robot();
	        //Opening new tab
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_T);
	    		robot.keyRelease(KeyEvent.VK_T);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		
	    		
	    		
	    		// Pasting the copied content to the address bar
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_V);
	    		robot.keyRelease(KeyEvent.VK_V);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);	
	    		
	    		//Clicking enter after pasting the url in browser address bar
	    		robot.keyPress(KeyEvent.VK_ENTER);
	    		robot.keyRelease(KeyEvent.VK_ENTER);	
	    		Thread.sleep(5000);
	            ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	            driver.switchTo().window(tabs.get(1));
	            Thread.sleep(5000);
	            driver.findElement(By.xpath("//body/div[@id='content-wrapper']/section[@id='referal-bg']/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test Reff Auto");
	            driver.findElement(By.xpath("//body/div[@id='content-wrapper']/section[@id='referal-bg']/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("6000000001");
	            Thread.sleep(3000);
	            driver.findElement(By.xpath("//a[@id='save']")).click();
	            Thread.sleep(8000);
	            driver.close();
	            driver.switchTo().window(tabs.get(0));
	            
 // Referrals Button
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[6]/a[1]")).click();
		Thread.sleep(3000);
		 List <WebElement> list=driver.findElements(By.linkText("Register"));
		    list.get(0).click();
		    Thread.sleep(4000);
		    driver.findElement(By.id("email")).sendKeys("testautoreff22feb@gmail.com");
        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/div[1]/input[1]")).click();
        Thread.sleep(12000);
    	driver.findElement(By.xpath("//body/app-root[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
    	driver.findElement(By.xpath(""));
	}

}
