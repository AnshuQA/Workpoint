package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteTicket {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://103.139.58.87:8090/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("anshuman@fincart.com");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("Fincart@11111");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
   //Raise A TicketButton
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		
//Assign To me
		Thread.sleep(5000);
		driver.findElement(By.id("nav-home-tab")).click();
		for(int i=0;i<30;i++)
	    {
		Thread.sleep(3000);
		 List <WebElement> list=driver.findElements(By.linkText("TAT"));
		    list.get(0).click();
		    Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"errorAlterMessage\"]/div/div/div/div/div[2]/button")).click();
			
			Thread.sleep(3000);
			WebElement dateBox =driver.findElement(By.id("tatDate"));
		   dateBox.sendKeys(Keys.SPACE);
		   Thread.sleep(5000);
			dateBox.sendKeys(Keys.ARROW_RIGHT);
			Thread.sleep(3000);
			dateBox.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[6]/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//body/app-root[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("nav-home-tab")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//tbody/tr[1]/td[9]/a[1]")).click();
			driver.findElement(By.id("reasonToOpen")).sendKeys("This is only TEsting Automation ticket");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[7]/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//body/app-root[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
	    }
	}

}
