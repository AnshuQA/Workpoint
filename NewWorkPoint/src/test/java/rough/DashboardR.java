package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardR {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://103.139.58.87:8090/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("testentry@fincart.com");
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		
 
		Thread.sleep(10000);
//Global Search by Name
	driver.findElement(By.id("searchByNameMobile")).sendKeys("Test NRI 28 Jan");
		Thread.sleep(5000);
		List<WebElement> autosearchName=driver.findElements(By.className("ui-menu-item-wrapper"));
		
		 for(WebElement suggect : autosearchName) {
			
			  if(suggect.getText().equalsIgnoreCase("Test NRI 28 Jan(testnri28jan@gmail.com)")){
				  suggect.click();
			 
			  break;
			  }
			  
		  }
		 Thread.sleep(5000);
			String name= "Test NRI 28 Jan(testnri28jan@gmail.com)";
			String bodyName = driver.findElement(By.tagName("body")).getText();
			
			Assert.assertTrue(bodyName.contains(name));
			
			Thread.sleep(5000);	
		driver.findElement(By.xpath("//a[contains(text(),'Go to page')]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		
//Global Search by Email
		Thread.sleep(5000);
			driver.findElement(By.id("searchByNameMobile")).sendKeys("testvideo@fincart.com");
				Thread.sleep(5000);
				List<WebElement> autosearchEmail=driver.findElements(By.className("ui-menu-item-wrapper"));
				
				 for(WebElement suggect : autosearchEmail) {
					
					  if(suggect.getText().equalsIgnoreCase("test Vedio KYC(testvideo@fincart.com)")){
						  suggect.click();
					 
					  break;
					  }
					  
				  }
				 Thread.sleep(5000);
					String email= "test Vedio KYC(testvideo@fincart.com)";
					String bodyemail = driver.findElement(By.tagName("body")).getText();
					
					Assert.assertTrue(bodyemail.contains(email));
					 Thread.sleep(5000);	
					
				driver.findElement(By.xpath("//a[contains(text(),'Go to page')]")).click();
				Thread.sleep(5000);
				driver.navigate().back();
				driver.navigate().back();
				
//Global Search by Mobile
				Thread.sleep(5000);
				driver.findElement(By.id("searchByNameMobile")).sendKeys("971820");
				Thread.sleep(5000);
				List<WebElement> autosearchmobile=driver.findElements(By.className("ui-menu-item-wrapper"));
				
				 for(WebElement suggect : autosearchmobile) {
					
					  if(suggect.getText().equalsIgnoreCase("Anshuman Singh(test23jun@gmail.com)")){
						  suggect.click();
					 
					  break;
					  }
					  
				  }
				 Thread.sleep(5000);
					String mobile= "Anshuman Singh(test23jun@gmail.com)";
					String bodymobile = driver.findElement(By.tagName("body")).getText();
					
					Assert.assertTrue(bodymobile.contains(mobile));
					
					Thread.sleep(3000);	
				driver.findElement(By.xpath("//a[contains(text(),'Go to page')]")).click();
				Thread.sleep(5000);
				driver.navigate().back();
				driver.navigate().back();
				
//**********************************Notification********************************************************
				driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/img[1]")).click();
				WebElement list = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/app-header[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/div[1]/h3[1]"));
				String itemsCount = list.getText();
				System.out.println("Total Notication Count is:  "+ itemsCount);
				/*WebElement TxtBoxContent = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/h3[1]"));
		        String xyz=TxtBoxContent.getText();
		        System.out.println(xyz);*/
			 
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//a[contains(text(),'Birthday')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h4[1]/a[1]")).click();
				Thread.sleep(3000);
				 driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h4[1]/a[1]")).sendKeys(Keys.PAGE_DOWN);
				 
//Task
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
				 WebElement list1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/app-header[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/div[1]/h3[1]"));
					String itemsCount1 = list1.getText();
					System.out.println("Total Task Count is:  "+itemsCount1);
				 
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).sendKeys(Keys.PAGE_DOWN);
				 
		
		// Take Action
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
				 driver.findElement(By.id("navActivityComment")).sendKeys("I want to close this activty");
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[2]/form[1]/div[2]/div[1]/input[1]")).click();
				 Thread.sleep(7000);
				 driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
				 
				 

	}
	

}
