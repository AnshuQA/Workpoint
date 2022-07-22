package rough;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RecordActivityR {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://103.139.58.87:8090/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("testentry@fincart.com");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
//LeadsTrackingButton
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"DynamicUserViewPanel\"]/div/div/div[1]/aside/div[2]/ul/li[2]/a")).click();
		
//Update Button
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/span[2]/b[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("record-activity")).click();
//Call
		
		
		try
		{
			if(driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[2]/div[8]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).isDisplayed())
			{

				Thread.sleep(3000);
				 
				 driver.findElement(By.id("recordactivityreason")).sendKeys("I will Call This client in evening");
				
				Thread.sleep(3000);
				WebElement time=driver.findElement(By.id("activityDate"));
				//time.click();
				
				 LocalDate today = LocalDate.now();
				    LocalDate tomorrow = today.plusDays(1L);
				    System.out.println(tomorrow);
				    Thread.sleep(5000);
				    time.clear();
				    time.sendKeys("12-12-2021");
				    Thread.sleep(5000);
					WebElement leadT =driver.findElement(By.id("leadtime"));
					leadT.clear();
					leadT.sendKeys("04:00AM");
					Thread.sleep(5000);
					driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[2]/div[8]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
					Thread.sleep(3000);
					String text= "I will Call This client in evening";
					String bodyText = driver.findElement(By.tagName("body")).getText();
					
					Assert.assertTrue(bodyText.contains(text));
					Thread.sleep(8000);
			driver.navigate().refresh();
			}
		}
			
		
		catch(Exception e)
		{
			Thread.sleep(3000);
			 
			 driver.findElement(By.id("recordactivityreason")).sendKeys("This is first Activity");
			
			Thread.sleep(3000);
			WebElement time=driver.findElement(By.id("activityDate"));
			//time.click();
			
			 LocalDate today = LocalDate.now();
			    LocalDate tomorrow = today.plusDays(1L);
			    System.out.println(tomorrow);
			    Thread.sleep(5000);
			    time.clear();
			    time.sendKeys("12-12-2021");
			    Thread.sleep(5000);
				WebElement leadT =driver.findElement(By.id("leadtime"));
				leadT.clear();
				leadT.sendKeys("04:00AM");
				Thread.sleep(5000);
				Thread.sleep(3000);
				 
				 driver.findElement(By.id("recordactivitycomment")).sendKeys("This last activity");
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[2]/div[8]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
				Thread.sleep(3000);
				String text= "This is first Activity";
				String bodyText = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText.contains(text));
				Thread.sleep(8000);
				driver.navigate().refresh();
		
		}
		
		
	}

}
