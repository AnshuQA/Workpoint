package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateLeadsR {

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
// UpdateButton
			Thread.sleep(9000);
			driver.findElement(By.xpath("//*[@id=\"nav-home\"]/div[2]/div/div[2]/div/span[2]/b")).click();
			
//Assign lead Convert to FellowUP	
	 Thread.sleep(5000);
       driver.findElement(By.id("FOLLOWUP")).click();
       Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id='reason']")).sendKeys("I will send this lead on Followup!!!");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"LeadChangeStatus\"]/div[2]/input")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();

//Follow Up Leads button
		Thread.sleep(3000);
		driver.findElement(By.id("nav-profile-tab")).click();
		Thread.sleep(10000);
		String text= "test15janemail@gmail.com";
		String bodyText = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText.contains(text));
		
//*************************************************************************************************************
/*//Re-assign Lead
		//searchByname
			
			 driver.findElement(By.id("searchLead")).sendKeys("Test Mail TO");
				    
				    Thread.sleep(5000);
					List<WebElement> autosearvh=driver.findElements(By.className("ui-menu-item-wrapper"));
					
					 for(WebElement suggect : autosearvh) {
						
						  if(suggect.getText().equalsIgnoreCase("Test Mail TO Secondary")){
							  Thread.sleep(4000);
						  suggect.click();
						 
						  break;
						  }
						  
					  }
					 Thread.sleep(4000);
					 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[7]/input[1]")).click();
	//Update Button
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/span[2]/b[1]")).click();
	//Reassign Button
		 Thread.sleep(5000);
		 driver.findElement(By.id("re-assign")).click();
		 Thread.sleep(3000);
			WebElement reassign=driver.findElement(By.id("assigneeEmpCode"));
			Select select = new Select(reassign);
			
			select.selectByVisibleText("testentry1");
			Thread.sleep(4000);
			driver.findElement(By.id("assignreason")).sendKeys("this lead transfer only automation testing purpose");
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[1]/form[1]/div[2]/input[1]")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
	//Logout
			 
			 driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
	//Again Login
			 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("testentry1@fincart.com");
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("fincart@123");
				driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
				
	//LeadsTrackingButton
				Thread.sleep(10000);
				driver.findElement(By.xpath("//*[@id=\"DynamicUserViewPanel\"]/div/div/div[1]/aside/div[2]/ul/li[2]/a")).click();	
	//Re-assign Lead
	 * 
	 */
	/*	//searchByname
					
					 driver.findElement(By.id("searchLead")).sendKeys("Test Mail TO");
						    
						    Thread.sleep(5000);
							List<WebElement> autosearch=driver.findElements(By.className("ui-menu-item-wrapper"));
							
							 for(WebElement suggect1 : autosearch) {
								
								  if(suggect1.getText().equalsIgnoreCase("Test Mail TO Secondary")){
									  Thread.sleep(4000);
								  suggect1.click();
								 
								  break;
								  }
								  
							  }
							 Thread.sleep(4000);
							 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[7]/input[1]")).click();
	//Update Button
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/span[2]/b[1]")).click();
	//Reassign Button
				 Thread.sleep(5000);
				 driver.findElement(By.id("re-assign")).click();
				 Thread.sleep(3000);
					WebElement reAssign=driver.findElement(By.id("assigneeEmpCode"));
					Select select1 = new Select(reAssign);
					
					select1.selectByVisibleText("testentry");
					Thread.sleep(4000);
					driver.findElement(By.id("assignreason")).sendKeys("this lead again back transfer only automation testing purpose");
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[1]/form[1]/div[2]/input[1]")).click();
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
		//Logout
					 
					 driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();*/
			
	//*************************************************************************************************************************************************************
			
	/*// Request for review
			//searchByname
			
			 driver.findElement(By.id("searchLead")).sendKeys("vivek test");
				    
				    Thread.sleep(5000);
					List<WebElement> autosearvh=driver.findElements(By.className("ui-menu-item-wrapper"));
					
					 for(WebElement suggect : autosearvh) {
						
						  if(suggect.getText().equalsIgnoreCase("vivek test 28 jan 2021")){
							  Thread.sleep(4000);
						  suggect.click();
						 
						  break;
						  }
						  
					  }
					 Thread.sleep(4000);
					 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[7]/input[1]")).click();
	//Update Button
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/span[2]/b[1]")).click();
			
	//Request For Review Button
		 Thread.sleep(3000);
		 driver.findElement(By.id("request-for-review")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("reviewreason")).sendKeys("please ingnore this lead this is only testing review");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[1]/form[1]/div[2]/input[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
	//Logout
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
	//Again Login Ravi Sir id
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("ravi.sharma@fincart.com");
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("JAn@2021");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();	 
	//LeadsTrackingButton
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"DynamicUserViewPanel\"]/div/div/div[1]/aside/div[2]/ul/li[2]/a")).click();*/	
			
	//****************************************************************************************************************************************************
			
	/*// Request for DND
			
					//searchByname
					
					 driver.findElement(By.id("searchLead")).sendKeys("test14jan@gmail.com");
						    
						    Thread.sleep(5000);
							List<WebElement> autosearvh=driver.findElements(By.className("ui-menu-item-wrapper"));
							
							 for(WebElement suggect : autosearvh) {
								
								  if(suggect.getText().equalsIgnoreCase("Test HUF User")){
									  Thread.sleep(4000);
								  suggect.click();
								 
								  break;
								  }
								  
							  }
							 Thread.sleep(4000);
							 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[7]/input[1]")).click();
	//Update Button
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/span[2]/b[1]")).click();
					
	//Request For Review Button
				 Thread.sleep(3000);
				 driver.findElement(By.id("mark-dnd")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.id("markdndreason")).sendKeys("please ingnore this lead this is only testing DND");
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//*[@id=\"markDNDStatus\"]/div[2]/input")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
	//Logout
				 
				 driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
	//Again Login Ravi Sir id
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("ravi.sharma@fincart.com");
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("JAn@2021");
					driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();	 
	//DND Button
					Thread.sleep(10000);
					driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[7]/a[1]")).click();
					
	// Search and Action and Reject
					
		  Thread.sleep(8000);
		 driver.findElement(By.id("searchLead")).sendKeys("test14jan@gmail.com");
				    
				    Thread.sleep(5000);
					List<WebElement> autosearh=driver.findElements(By.className("ui-menu-item-wrapper"));
					
					 for(WebElement suggect1 : autosearh) {
						
						  if(suggect1.getText().equalsIgnoreCase("Test HUF User")){
							  Thread.sleep(4000);
						  suggect1.click();
						 
						  break;
						  }
						  
					  }
					 Thread.sleep(4000);
					 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/input[1]")).click();
	//View button
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();
					 Thread.sleep(3000);
						String text= "please ingnore this lead this is only testing DND";
						String bodyText = driver.findElement(By.tagName("body")).getText();
						
						Assert.assertTrue(bodyText.contains(text));
						
						Thread.sleep(3000);
						driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
	//Action
						
						Thread.sleep(3000);
						driver.findElement(By.xpath("//tbody/tr[1]/td[10]/a[1]")).click();
						 Thread.sleep(3000);
							WebElement reAssign=driver.findElement(By.id("activeStatus"));
							Select select1 = new Select(reAssign);
							
							select1.selectByVisibleText("Reject");
						Thread.sleep(3000);
	            driver.findElement(By.xpath("//button[contains(text(),'YES')]")).click();
	            Thread.sleep(3000);
	            driver.findElement(By.xpath("//button[contains(text(),'Close')")).click();*/
	            
	         
	            
	            
			 
			

	}
	

}
