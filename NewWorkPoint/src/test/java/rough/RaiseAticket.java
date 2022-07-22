package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RaiseAticket {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://103.139.58.87:8090/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("testentry@fincart.com");
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
//Raise A Ticket button
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[1]/app-sidebar[1]/aside[1]/div[2]/ul[1]/li[5]/a[1]")).click();
	/*//Raise A ticket Button		
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'RAISE A TICKET')]")).click();*/
	/*//Same Dept
				Thread.sleep(3000);
				driver.findElement(By.id("AssignToName")).sendKeys("Test");
				Thread.sleep(5000);
				List<WebElement> autosearvh=driver.findElements(By.className("ui-menu-item-wrapper"));
				
				 for(WebElement suggect : autosearvh) {
					
					  if(suggect.getText().equalsIgnoreCase("testentry1")){
					  suggect.click();
					 
					  break;
					  }
					  
				  }
				 Thread.sleep(3000);
					WebElement campaig=driver.findElement(By.id("priority"));
					Select select1 = new Select(campaig);
					select1.selectByVisibleText("Medium");
				 Thread.sleep(3000);
					WebElement campaign=driver.findElement(By.id("subject"));
					Select select = new Select(campaign);
					
					select.selectByVisibleText("HDFC ULIP & TERM MODIFICATION");
					Thread.sleep(3000);
					driver.findElement(By.xpath("/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[4]/div/div/div/div[2]/div/button")).click();
					
					driver.findElement(By.xpath("//body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[5]/ckeditor[1]/div[2]/div[2]/div[1]/p[1]")).sendKeys("This Ticket only testing ");
					Thread.sleep(5000);
					((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.id("radio-1")));
					
				Thread.sleep(3000);
					driver.findElement(By.id("radio-1")).sendKeys(Keys.PAGE_DOWN);
					//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/div[1]/input[1]")).click();
					
					driver.findElement(By.id("client_name")).sendKeys("test");
					Thread.sleep(5000);
					List<WebElement> autosearvh1=driver.findElements(By.className("ui-menu-item-wrapper"));
					
					 for(WebElement suggect1 : autosearvh1) {
						
						  if(suggect1.getText().equalsIgnoreCase("John Test")){
						  suggect1.click();
						 
						  break;
						  }
						  
					  }
					 WebElement uploadElement = driver.findElement(By.id("selectFilesFin"));
						uploadElement.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
						Thread.sleep(5000);
						driver.findElement(By.xpath("/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/div/form/div/div/div[2]/div[10]/div/input[2]")).click();
						Thread.sleep(15000);
						driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();*/
		//*****************************************************************************************************************************************************************
				
	/*	//Other Dept
				Thread.sleep(3000);
				    driver.findElement(By.xpath("//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/span[2]/input[1]")).click();
				    Thread.sleep(3000);
					WebElement campaig2=driver.findElement(By.id("department_name"));
					Select select2 = new Select(campaig2);
					select2.selectByVisibleText("IT");
						
						 Thread.sleep(3000);
							WebElement campaign=driver.findElement(By.id("subject"));
							Select select = new Select(campaign);
							
							select.selectByVisibleText("Investment Not Showing");
							Thread.sleep(3000);
							WebElement campaign1=driver.findElement(By.id("Ticket_Category_Id"));
							Select select1 = new Select(campaign1);
							select1.selectByVisibleText("CAF");
							Thread.sleep(3000);
							driver.findElement(By.xpath("//*[@id=\"subjectSubPointPopup\"]/div/div/div/div[2]/div/button")).click();
							
							driver.findElement(By.xpath("//*[@id=\"message\"]/div[2]/div[2]/div")).sendKeys("This Ticket only testing ");
							Thread.sleep(5000);
							driver.findElement(By.id("radio-1")).sendKeys(Keys.ENTER);
				            Actions actions = new Actions(driver);
							actions.moveToElement(driver.findElement(By.id("radio-1"))).click().perform();

							((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.id("radio-1")));
							
						
							 
							
							Thread.sleep(3000);
							driver.findElement(By.id("radio-1")).sendKeys(Keys.PAGE_DOWN);
							//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/div[1]/input[1]")).click();
							
							driver.findElement(By.id("client_name")).sendKeys("test");
							Thread.sleep(5000);
							List<WebElement> autosearvh1=driver.findElements(By.className("ui-menu-item-wrapper"));
							
							 for(WebElement suggect1 : autosearvh1) {
								
								  if(suggect1.getText().equalsIgnoreCase("John Test")){
								  suggect1.click();
								 
								  break;
								  }
								  
							  }
							 WebElement uploadElement = driver.findElement(By.id("selectFilesFin"));
								uploadElement.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
								Thread.sleep(5000);
								driver.findElement(By.xpath("/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/div/form/div/div/div[2]/div[11]/div/input[2]")).click();
								Thread.sleep(10000);
								driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/div/div/div[2]/button")).click();*/
					
		
//Ticket Auto  Reassign
	
/*	Thread.sleep(3000);
	    driver.findElement(By.xpath("//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/span[2]/input[1]")).click();
	    Thread.sleep(3000);
		WebElement campaig2=driver.findElement(By.id("department_name"));
		Select select2 = new Select(campaig2);
		select2.selectByVisibleText("IT");
		Thread.sleep(3000);
		WebElement category=driver.findElement(By.id("Ticket_Category_Id"));
		Select select03 = new Select(category);
		select03.selectByVisibleText("Old WorkPoint Issue");
		Thread.sleep(3000);
		WebElement campaig3=driver.findElement(By.id("priority"));
		Select select3 = new Select(campaig3);
		select3.selectByVisibleText("Low");
			
			 Thread.sleep(3000);
				WebElement campaign=driver.findElement(By.id("subject"));
				Select select = new Select(campaign);
				
				select.selectByVisibleText("Investment Not Showing");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"subjectSubPointPopup\"]/div/div/div/div[2]/div/button")).click();
				
				driver.findElement(By.xpath("//*[@id=\"message\"]/div[2]/div[2]/div")).sendKeys("This Ticket only testing ");
				Thread.sleep(5000);
				driver.findElement(By.id("radio-1")).sendKeys(Keys.ENTER);
	            Actions actions = new Actions(driver);
				actions.moveToElement(driver.findElement(By.id("radio-1"))).click().perform();

				((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.id("radio-1")));
				
			
				 
				
				Thread.sleep(3000);
				driver.findElement(By.id("radio-1")).sendKeys(Keys.PAGE_DOWN);
				//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/div[1]/input[1]")).click();
				
				driver.findElement(By.id("client_name")).sendKeys("test");
				Thread.sleep(5000);
				List<WebElement> autosearvh1=driver.findElements(By.className("ui-menu-item-wrapper"));
				
				 for(WebElement suggect1 : autosearvh1) {
					
					  if(suggect1.getText().equalsIgnoreCase("John Test")){
					  suggect1.click();
					 
					  break;
					  }
					  
				  }
				 WebElement uploadElement = driver.findElement(By.id("selectFilesFin"));
					uploadElement.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@id=\"profileupdateBasic\"]/div/div/div[2]/div[11]/div/input[2]")).click();
					Thread.sleep(15000);
					driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
					Thread.sleep(5000);
					driver.findElement(By.id("deptOtherFlag")).click();
				
//Dept wise IT
					Thread.sleep(3000);
					WebElement deptD=driver.findElement(By.id("prefixDep"));
					Select it = new Select(deptD);
					
					it.selectByVisibleText("IT");	
					Thread.sleep(3000);
					WebElement open=driver.findElement(By.id("status"));
					Select select01 = new Select(open);
					
					select01.selectByVisibleText("OPEN");
					Thread.sleep(5000);
					String ticketID = driver.findElement(By.xpath("/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[1]/a")).getText();
		//compare
					Thread.sleep(3000);
					 List <WebElement> list=driver.findElements(By.id("dropdownMenuButton"));
					    list.get(0).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/a[1]")).click();

					Thread.sleep(3000);
					String text1= "Assign To";
					String bodyText1 = driver.findElement(By.tagName("body")).getText();
					Assert.assertTrue(bodyText1.contains(text1));
					Thread.sleep(3000);
					String text01= "Vivek Sharma";
					String bodyText01 = driver.findElement(By.tagName("body")).getText();
					Assert.assertTrue(bodyText01.contains(text01));
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"TicketHistoryId\"]/div/div/div[1]/button")).click();
//Log Out
					Thread.sleep(5000);
					driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
//Login Vivek Id
					Thread.sleep(5000);
					driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("vivek.sharma@fincart.com");
					driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("vIvek926");
					driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//Ticket button					
					 Thread.sleep(12000);
				 		driver.findElement(By.xpath("/html/body/app-root/app-workpoint-layout/div[1]/div/div/div[1]/app-sidebar/aside/div[2]/ul/li[2]/a")).click();
				 		 Thread.sleep(5000);
				    		driver.findElement(By.id("deptOtherFlag")).click();
				    		Thread.sleep(3000);
				    		driver.findElement(By.id("nav-home-tab")).click();
				  Thread.sleep(3000);	
				  driver.findElement(By.id("ticketId")).sendKeys(ticketID);
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("/html/body/app-root/app-workpoint-layout/div[1]/div/div/div[2]/ng-component/div[1]/div[2]/form/div/div/div[2]/div[10]/input")).click();
				//compare
					Thread.sleep(3000);
					String text= "testentry";
					String bodyText = driver.findElement(By.tagName("body")).getText();
					
					Assert.assertTrue(bodyText.contains(text));	*/
					
//**********************************************Auto TAT************************************************************	
		/*Thread.sleep(3000);
	    driver.findElement(By.xpath("//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/span[2]/input[1]")).click();
	    Thread.sleep(3000);
		WebElement campaig2=driver.findElement(By.id("department_name"));
		Select select2 = new Select(campaig2);
		select2.selectByVisibleText("IT");
		Thread.sleep(3000);
		WebElement category=driver.findElement(By.id("Ticket_Category_Id"));
		Select select03 = new Select(category);
		select03.selectByVisibleText("Other");
		Thread.sleep(3000);
		WebElement campaig3=driver.findElement(By.id("priority"));
		Select select3 = new Select(campaig3);
		select3.selectByVisibleText("Low");
			
			 Thread.sleep(3000);
				WebElement campaign=driver.findElement(By.id("subject"));
				Select select = new Select(campaign);
				
				select.selectByVisibleText("Folio Mapping");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[4]/div/div/div/div[2]/div/button")).click();
				
				driver.findElement(By.xpath("/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/div/form/div/div/div[2]/div[6]/ckeditor/div[2]/div[2]/div")).sendKeys("This Ticket only testing ");
				Thread.sleep(5000);
				driver.findElement(By.id("radio-1")).sendKeys(Keys.ENTER);
	            Actions actions = new Actions(driver);
				actions.moveToElement(driver.findElement(By.id("radio-1"))).click().perform();

				((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.id("radio-1")));
				Thread.sleep(3000);
				driver.findElement(By.id("radio-1")).sendKeys(Keys.PAGE_DOWN);
				
				
				driver.findElement(By.id("client_name")).sendKeys("test");
				Thread.sleep(5000);
				List<WebElement> autosearvh1=driver.findElements(By.className("ui-menu-item-wrapper"));
				
				 for(WebElement suggect1 : autosearvh1) {
					
					  if(suggect1.getText().equalsIgnoreCase("John Test")){
					  suggect1.click();
					 
					  break;
					  }
					  
				  }
				 WebElement uploadElement = driver.findElement(By.id("selectFilesFin"));
					uploadElement.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@id=\"profileupdateBasic\"]/div/div/div[2]/div[11]/div/input[2]")).click();
					Thread.sleep(15000);
					driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/div/div/div[2]/button")).click();
					Thread.sleep(5000);
					driver.findElement(By.id("deptOtherFlag")).click();
					  Thread.sleep(5000);
						driver.findElement(By.id("deptOtherFlag")).click();
			//Dept wise IT
								Thread.sleep(3000);
								WebElement deptD=driver.findElement(By.id("prefixDep"));
								Select it = new Select(deptD);
								
								it.selectByVisibleText("IT");	
								Thread.sleep(3000);
								WebElement open=driver.findElement(By.id("status"));
								Select select01 = new Select(open);
								
								select01.selectByVisibleText("OPEN");*/
//***********************************************************************************************************************************************************		
				
				//Add Comment
						driver.findElement(By.xpath("/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[1]/a")).click();
						Thread.sleep(5000);
						driver.findElement(By.xpath("//*[@id=\"Comment\"]/div[2]/div[2]/div")).sendKeys("this is only automation ticket testing purpose");
						Thread.sleep(5000);
						driver.findElement(By.xpath("//*[@id=\"commentTicketId\"]/div[3]/button")).click();
						
				   //compare
						Thread.sleep(3000);
						String text= "this is only automation ticket testing purpose";
						String bodyText = driver.findElement(By.tagName("body")).getText();
						
						Assert.assertTrue(bodyText.contains(text));
						Thread.sleep(8000);
						driver.findElement(By.xpath("//*[@id=\"ticketViewDetail\"]/div/div/div[1]/button")).click();
						


				
		
//**********************************Filter*************************************************************************************************************
		
 /*//Filter by Ticket in same Dept
		
		Thread.sleep(3000);
		WebElement copy1 =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/a[1]"));
		copy1.sendKeys(Keys.CONTROL);
		copy1.sendKeys("a");
		copy1.sendKeys(Keys.CONTROL);
		copy1.sendKeys("c");
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("ticketId")).sendKeys("SL02061");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[10]/input[1]")).click();
   //compare
		Thread.sleep(3000);
		String text= "SL02061";
		String bodyText = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText.contains(text));
		Thread.sleep(5000);
		driver.navigate().refresh();
		
//Filter by same dept status
	//Open
		Thread.sleep(3000);
		WebElement open=driver.findElement(By.id("status"));
		Select select = new Select(open);
		
		select.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
		 //compare
		Thread.sleep(3000);
		String text1= "Open";
		String bodyText1 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText1.contains(text1));
		Thread.sleep(5000);
		driver.navigate().refresh();
	//Close
				Thread.sleep(3000);
				WebElement close=driver.findElement(By.id("status"));
				Select select1 = new Select(close);
				
				select1.selectByVisibleText("CLOSE");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
				 //compare
				Thread.sleep(3000);
				String text2= "Close";
				String bodyText2 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText2.contains(text2));
				Thread.sleep(5000);
				driver.navigate().refresh();
		
	//Reopen
				Thread.sleep(3000);
				WebElement reopen=driver.findElement(By.id("status"));
				Select select3 = new Select(reopen);
				
				select3.selectByVisibleText("REOPEN");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
				 //compare
				Thread.sleep(3000);
				String text3= "ReOpen";
				String bodyText3 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText3.contains(text3));
				Thread.sleep(5000);
				driver.navigate().refresh();*/
		
//Filter by same dept Priority
	/*//High
		Thread.sleep(3000);
		WebElement high=driver.findElement(By.id("priority"));
		Select select4 = new Select(high);
		
		select4.selectByVisibleText("High");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
		 //compare
		Thread.sleep(3000);
		String text4= "High";
		String bodyText4 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText4.contains(text4));
		Thread.sleep(5000);
		driver.navigate().refresh();
	//Medium
				Thread.sleep(3000);
				WebElement Medium=driver.findElement(By.id("priority"));
				Select select5 = new Select(Medium);
				
				select5.selectByVisibleText("Medium");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
				 //compare
				Thread.sleep(3000);
				String text5= "Medium";
				String bodyText5 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText5.contains(text5));
				Thread.sleep(5000);
				driver.navigate().refresh();
	//Low
				Thread.sleep(3000);
				WebElement Low=driver.findElement(By.id("priority"));
				Select select6 = new Select(Low);
				
				select6.selectByVisibleText("Low");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
				 //compare
				Thread.sleep(3000);
				String text6= "Low";
				String bodyText6 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText6.contains(text6));
				Thread.sleep(5000);
				driver.navigate().refresh();*/
		
/*//Status Open Priority High
		Thread.sleep(3000);
		WebElement open=driver.findElement(By.id("status"));
		Select select = new Select(open);
		
		select.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		WebElement high=driver.findElement(By.id("priority"));
		Select select4 = new Select(high);
		
		select4.selectByVisibleText("High");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
		 //compare
		Thread.sleep(3000);
		String text4= "High";
		String bodyText4 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText4.contains(text4));
		 //compare
		Thread.sleep(3000);
		String text1= "Open";
		String bodyText1 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText1.contains(text1));
		Thread.sleep(5000);
		driver.navigate().refresh();
		
//Status Open Priority Medium	
		Thread.sleep(3000);
		WebElement opena=driver.findElement(By.id("status"));
		Select selecta = new Select(opena);
		
		selecta.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		WebElement Medium=driver.findElement(By.id("priority"));
		Select select5 = new Select(Medium);
		
		select5.selectByVisibleText("Medium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
		 //compare
		Thread.sleep(3000);
		String texta= "High";
		String bodyTexta = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue(bodyTexta.contains(texta));
		 //compare
		Thread.sleep(3000);
		String text5= "Medium";
		String bodyText5 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText5.contains(text5));
		Thread.sleep(5000);
		driver.navigate().refresh();
//Status Open Priority Low
		Thread.sleep(3000);
		WebElement openb=driver.findElement(By.id("status"));
		Select selectb = new Select(openb);
		
		selectb.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		WebElement Low=driver.findElement(By.id("priority"));
		Select select6 = new Select(Low);
		
		select6.selectByVisibleText("Low");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
		 //compare
		Thread.sleep(3000);
		String text6= "Low";
		String bodyText6 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText6.contains(text6));
		Thread.sleep(5000);
		driver.navigate().refresh();
		 //compare
		Thread.sleep(3000);
		String textb= "High";
		String bodyTextb = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyTextb.contains(textb));
		Thread.sleep(5000);
		driver.navigate().refresh();
		*/
		
/*//Status Close Priority High	
		Thread.sleep(3000);
		WebElement close=driver.findElement(By.id("status"));
		Select select1 = new Select(close);
		
		select1.selectByVisibleText("CLOSE");
		Thread.sleep(3000);
		WebElement high=driver.findElement(By.id("priority"));
		Select select4 = new Select(high);
		
		select4.selectByVisibleText("High");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
		
		 //compare
		Thread.sleep(3000);
		String textd= "High";
		String bodyTextd = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyTextd.contains(textd));
		//compare
		Thread.sleep(3000);
		String texte= "CLOSE";
		String bodyTexte = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyTexte.contains(texte));
		Thread.sleep(5000);
		driver.navigate().refresh();
//Status Close Priority Medium	
		Thread.sleep(3000);
		WebElement closec=driver.findElement(By.id("status"));
		Select selectc = new Select(closec);
		
		selectc.selectByVisibleText("CLOSE");
		Thread.sleep(3000);
		WebElement Medium=driver.findElement(By.id("priority"));
		Select select5 = new Select(Medium);
		
		select5.selectByVisibleText("Medium");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
		 //compare
		Thread.sleep(3000);
		String text5= "Medium";
		String bodyText5 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText5.contains(text5));
		Thread.sleep(5000);
		driver.navigate().refresh();
		
//Status Close Priority Low
		Thread.sleep(3000);
		WebElement closed=driver.findElement(By.id("status"));
		Select selectd = new Select(closed);
		
		selectd.selectByVisibleText("CLOSE");
		Thread.sleep(3000);
		WebElement Low=driver.findElement(By.id("priority"));
		Select select6 = new Select(Low);
		
		select6.selectByVisibleText("Low");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
		 //compare
		Thread.sleep(3000);
		String text6= "Low";
		String bodyText6 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText6.contains(text6));
		Thread.sleep(5000);
		driver.navigate().refresh();
		
//Status Reopen Priority High		
		Thread.sleep(3000);
		WebElement reopen=driver.findElement(By.id("status"));
		Select select3 = new Select(reopen);
		
		select3.selectByVisibleText("REOPEN");
		Thread.sleep(3000);
		WebElement higha=driver.findElement(By.id("priority"));
		Select select44 = new Select(higha);
		
		select44.selectByVisibleText("High");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]")).click();
		 //compare
		Thread.sleep(3000);
		String text4= "High";
		String bodyText4 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText4.contains(text4));
		Thread.sleep(3000);
		String text3= "ReOpen";
		String bodyText3 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText3.contains(text3));
		Thread.sleep(5000);
		driver.navigate().refresh();*/

//FilterBySameDeptSearchByClientName
		/*Thread.sleep(3000);
		driver.findElement(By.id("clientName")).sendKeys("anshuman");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[10]/input[1]")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();*/
		
//FilterBySameDeptSearchByDateWise		
	/*	Thread.sleep(3000);
		driver.findElement(By.id("fromDate")).sendKeys("01-01-2021");
		Thread.sleep(3000);
		WebElement toDate=driver.findElement(By.id("toDate"));
		toDate.sendKeys(Keys.SPACE);
		toDate.sendKeys(Keys.ENTER);
	    //toDate.sendKeys("2021-03-17");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[10]/input[1]")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();	*/
		
		
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
/*//Other Dept Serach By 
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();
		
//Dept wise IT
		Thread.sleep(3000);
		WebElement deptD=driver.findElement(By.id("prefixDep"));
		Select it = new Select(deptD);
		
		it.selectByVisibleText("IT");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]")).click();
		Thread.sleep(3000);
		String itComp= "IT01";
		String bodyit = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyit.contains(itComp));
		Thread.sleep(5000);
		driver.navigate().refresh();
//Dept wise Account
		//Other Dept Serach By 
				Thread.sleep(5000);
				driver.findElement(By.id("deptOtherFlag")).click();
				Thread.sleep(3000);
				WebElement deptAcco=driver.findElement(By.id("prefixDep"));
				Select Acco = new Select(deptAcco);
				
				Acco.selectByVisibleText("Accounts");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]")).click();
				Thread.sleep(3000);
				String AccoComp= "AC00";
				String bodyAcco = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyAcco.contains(AccoComp));
				Thread.sleep(5000);
				driver.navigate().refresh();
//Dept wise Operation
				//Other Dept Serach By 
						Thread.sleep(5000);
						driver.findElement(By.id("deptOtherFlag")).click();
						Thread.sleep(3000);
						WebElement deptOP=driver.findElement(By.id("prefixDep"));
						Select opp = new Select(deptOP);
						
						opp.selectByVisibleText("Operation");
						Thread.sleep(3000);
						driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]")).click();
						Thread.sleep(3000);
						String oppComp= "OP01";
						String bodyop = driver.findElement(By.tagName("body")).getText();
						
						Assert.assertTrue(bodyop.contains(oppComp));
						Thread.sleep(5000);
						driver.navigate().refresh();
//Dept wise HR
			//Other Dept Serach By 
								Thread.sleep(5000);
								driver.findElement(By.id("deptOtherFlag")).click();
								Thread.sleep(3000);
								WebElement deptHR=driver.findElement(By.id("prefixDep"));
								Select hr = new Select(deptHR);
								
								hr.selectByVisibleText("HR");
								Thread.sleep(3000);
								driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]")).click();
								Thread.sleep(3000);
								String hrComp= "HR00";
								String bodyhr = driver.findElement(By.tagName("body")).getText();
								
								Assert.assertTrue(bodyhr.contains(hrComp));
								Thread.sleep(5000);
								driver.navigate().refresh();*/
		
/*//Filter By other Dept IT+Open+High	
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();
		
		Thread.sleep(3000);
		WebElement deptD=driver.findElement(By.id("prefixDep"));
		Select it = new Select(deptD);
		
		it.selectByVisibleText("IT");
		
		
		Thread.sleep(3000);
		WebElement open=driver.findElement(By.id("status"));
		Select select = new Select(open);
		
		select.selectByVisibleText("OPEN");
		
				Thread.sleep(3000);
		WebElement high=driver.findElement(By.id("priority"));
		Select select4 = new Select(high);
		
		select4.selectByVisibleText("High");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]")).click();
		 //compare
		Thread.sleep(3000);
		String text1= "Open";
		String bodyText1 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText1.contains(text1));


		Thread.sleep(3000);
		String itComp= "IT01";
		String bodyit = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyit.contains(itComp));
		 //compare
		Thread.sleep(3000);
		String text4= "High";
		String bodyText4 = driver.findElement(By.tagName("body")).getText();
		
		Assert.assertTrue(bodyText4.contains(text4));
		Thread.sleep(5000);
		driver.navigate().refresh();
		
//Filter By other Dept IT+Open+Medium	
				Thread.sleep(5000);
				driver.findElement(By.id("deptOtherFlag")).click();
				
				Thread.sleep(3000);
				WebElement deptD1=driver.findElement(By.id("prefixDep"));
				Select it1 = new Select(deptD1);
				
				it1.selectByVisibleText("IT");
				
				
				Thread.sleep(3000);
				WebElement open1=driver.findElement(By.id("status"));
				Select select1 = new Select(open1);
				
				select1.selectByVisibleText("OPEN");
				
						Thread.sleep(3000);
				WebElement high1=driver.findElement(By.id("priority"));
				Select select11 = new Select(high1);
				
				select11.selectByVisibleText("Medium");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]")).click();
				 //compare
				Thread.sleep(3000);
				String text11= "Open";
				String bodyText11 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText11.contains(text11));


				Thread.sleep(3000);
				String itComp1= "IT01";
				String bodyit1 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyit1.contains(itComp1));
				 //compare
				Thread.sleep(3000);
				String text41= "Medium";
				String bodyText41 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText41.contains(text41));
				Thread.sleep(5000);
				driver.navigate().refresh();
				
//Filter By other Dept IT+Open+Low	
				Thread.sleep(5000);
				driver.findElement(By.id("deptOtherFlag")).click();
				
				Thread.sleep(3000);
				WebElement deptD2=driver.findElement(By.id("prefixDep"));
				Select it2 = new Select(deptD2);
				
				it2.selectByVisibleText("IT");
				
				
				Thread.sleep(3000);
				WebElement open2=driver.findElement(By.id("status"));
				Select select2 = new Select(open2);
				
				select2.selectByVisibleText("OPEN");
				
						Thread.sleep(3000);
				WebElement high2=driver.findElement(By.id("priority"));
				Select select12 = new Select(high2);
				
				select12.selectByVisibleText("Low");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]")).click();
				 //compare
				Thread.sleep(3000);
				String text12= "Open";
				String bodyText12 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText12.contains(text12));


				
				String itComp2= "IT01";
				String bodyit2 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyit2.contains(itComp2));
				 //compare
				;
				String text42= "Medium";
				String bodyText42 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText42.contains(text42));
				Thread.sleep(5000);
				driver.navigate().refresh();*/
//Filter By other Dept IT+Close+High	
			/*	Thread.sleep(5000);
				driver.findElement(By.id("deptOtherFlag")).click();
				
				Thread.sleep(3000);
				WebElement deptD=driver.findElement(By.id("prefixDep"));
				Select it = new Select(deptD);
				
				it.selectByVisibleText("IT");
				
				
				Thread.sleep(3000);
				WebElement open=driver.findElement(By.id("status"));
				Select select = new Select(open);
				
				select.selectByVisibleText("CLOSE");
				
						Thread.sleep(3000);
				WebElement high=driver.findElement(By.id("priority"));
				Select select4 = new Select(high);
				
				select4.selectByVisibleText("High");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]")).click();
				 //compare
				Thread.sleep(3000);
				String text1= "Close";
				String bodyText1 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText1.contains(text1));


				Thread.sleep(3000);
				String itComp= "IT01";
				String bodyit = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyit.contains(itComp));
				 //compare
				Thread.sleep(3000);
				String text4= "Close";
				String bodyText4 = driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyText4.contains(text4));
				Thread.sleep(5000);
				driver.navigate().refresh();
				
//Filter By other Dept IT+Close+Medium	
						Thread.sleep(5000);
						driver.findElement(By.id("deptOtherFlag")).click();
						
						Thread.sleep(3000);
						WebElement deptD1=driver.findElement(By.id("prefixDep"));
						Select it1 = new Select(deptD1);
						
						it1.selectByVisibleText("IT");
						
						
						Thread.sleep(3000);
						WebElement open1=driver.findElement(By.id("status"));
						Select select1 = new Select(open1);
						
						select1.selectByVisibleText("CLOSE");
						
								Thread.sleep(3000);
						WebElement high1=driver.findElement(By.id("priority"));
						Select select11 = new Select(high1);
						
						select11.selectByVisibleText("Medium");
						Thread.sleep(3000);
						driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]")).click();
						 //compare
						Thread.sleep(3000);
						String text11= "Close";
						String bodyText11 = driver.findElement(By.tagName("body")).getText();
						
						Assert.assertTrue(bodyText11.contains(text11));


						Thread.sleep(3000);
						String itComp1= "IT01";
						String bodyit1 = driver.findElement(By.tagName("body")).getText();
						
						Assert.assertTrue(bodyit1.contains(itComp1));
						 //compare
						Thread.sleep(3000);
						String text41= "Medium";
						String bodyText41 = driver.findElement(By.tagName("body")).getText();
						
						Assert.assertTrue(bodyText41.contains(text41));
						Thread.sleep(5000);
						driver.navigate().refresh();
						
//Filter By other Dept IT+Clsoe+Low	
						Thread.sleep(5000);
						driver.findElement(By.id("deptOtherFlag")).click();
						
						Thread.sleep(3000);
						WebElement deptD2=driver.findElement(By.id("prefixDep"));
						Select it2 = new Select(deptD2);
						
						it2.selectByVisibleText("IT");
						
						
						Thread.sleep(3000);
						WebElement open2=driver.findElement(By.id("status"));
						Select select2 = new Select(open2);
						
						select2.selectByVisibleText("CLOSE");
						
								Thread.sleep(3000);
						WebElement high2=driver.findElement(By.id("priority"));
						Select select12 = new Select(high2);
						
						select12.selectByVisibleText("Low");
						Thread.sleep(3000);
						driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]")).click();
						 //compare
						Thread.sleep(3000);
						String text12= "close";
						String bodyText12 = driver.findElement(By.tagName("body")).getText();
						
						Assert.assertTrue(bodyText12.contains(text12));


						
						String itComp2= "IT01";
						String bodyit2 = driver.findElement(By.tagName("body")).getText();
						
						Assert.assertTrue(bodyit2.contains(itComp2));
						 //compare
						;
						String text42= "Low";
						String bodyText42 = driver.findElement(By.tagName("body")).getText();
						
						Assert.assertTrue(bodyText42.contains(text42));
						Thread.sleep(5000);
						driver.navigate().refresh();	
		*/
		
		

		
		
				
		
		
		
		
//*************************************************************************************************************************************************************		

		
//Reopen Ticket IT deparment
	/*	 Thread.sleep(5000);
	  		driver.findElement(By.id("deptOtherFlag")).click();
	  		Thread.sleep(3000);
	  		WebElement deptD=driver.findElement(By.id("prefixDep"));
	  		Select it = new Select(deptD);
	  		
	  		it.selectByVisibleText("IT");
	  		WebElement deptE=driver.findElement(By.id("status"));
	  		Select status = new Select(deptE);
	  		
	  		status.selectByVisibleText("CLOSE");
	  		
	 		Thread.sleep(3000);
			driver.findElement(By.linkText("RE-OPEN TICKET")).sendKeys(Keys.PAGE_DOWN);
	 		 Thread.sleep(5000);
	 		 List <WebElement> list=driver.findElements(By.linkText("RE-OPEN"));
	 		    list.get(0).click();
	 		   driver.findElement(By.id("reasonToOpen")).sendKeys("This is only TEsting Automation ticket");
	 			Thread.sleep(3000);
	 			driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[7]/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
	 			Thread.sleep(12000);
	 			driver.findElement(By.xpath("//body/app-root[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();*/
}
}