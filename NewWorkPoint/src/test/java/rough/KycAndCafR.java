package rough;

import static org.testng.Assert.assertEquals;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KycAndCafR {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://103.139.58.87:8090/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("testentry@fincart.com");
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
//LeadsTrackingButton
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[1]/app-sidebar/aside/div[2]/ul/li[2]/a")).click();
		
//Update Button
		Thread.sleep(10000);
		driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
		

		
		
//KYC Button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id='reason']")).sendKeys("Jai Shree Ram!!!");
		     
				Thread.sleep(5000);
				
				driver.findElement(By.id("kyc")).click();
				Thread.sleep(5000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("return document.getElementById('notice-popup').remove();");
				
//indivisual KYC
				Thread.sleep(3000);
				driver.findElement(By.id("pannumber")).sendKeys("TEEPT6473O");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"raise-ticket-form\"]/div[2]/div[3]/div[2]/div/div[2]/button[2]")).click();
				
//1.Basic Details	
				Thread.sleep(3000);
				driver.findElement(By.id("clientName")).sendKeys("Anshu Auto Test");
				Thread.sleep(3000);
				
				WebElement DOB=driver.findElement(By.id("Date_of_Birth"));
				DOB.click();
				DOB.sendKeys("10");
				DOB.sendKeys("07");
				DOB.sendKeys("1996");
				


				driver.findElement(By.id("update-lead")).sendKeys(Keys.PAGE_DOWN);
				//driver.findElement(By.id("Email")).sendKeys("anshuautotest13jan@fincart.com");
				//driver.findElement(By.id("Mobile")).sendKeys("9000000001");
				Thread.sleep(3000);
				WebElement uploadElement = driver.findElement(By.id("clientPhotoFiles"));
				uploadElement.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
				Thread.sleep(3000);
				WebElement uploadElement1 = driver.findElement(By.id("aadharFrontFiles"));
				uploadElement1.sendKeys("C:\\Users\\SINGH\\Downloads\\Document\\adharFront.jpg");
				Thread.sleep(3000);
				WebElement uploadElement2 = driver.findElement(By.id("aadharBackFiles"));
				uploadElement2.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
				Thread.sleep(3000);
				WebElement uploadElement3 = driver.findElement(By.id("panPhotoFiles"));
				uploadElement3.sendKeys("C:\\Users\\SINGH\\Downloads\\Document\\testPan.jpg");
				
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//Add address
				Thread.sleep(12000);
				driver.findElement(By.id("address1")).sendKeys("Address: A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
				driver.findElement(By.id("pin")).sendKeys("229206");
				Thread.sleep(3000);
				driver.findElement(By.id("update-lead")).sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(12000);
				driver.findElement(By.id("sameAddressYes")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//Bank address	
				Thread.sleep(5000);			
				driver.findElement(By.id("ifsc")).sendKeys("HDFC0000011");
				Thread.sleep(5000);
				WebElement campaign=driver.findElement(By.id("Acc_Type"));
				Select select = new Select(campaign);
				select.selectByVisibleText(" Saving");
				driver.findElement(By.id("Acc_No")).sendKeys("1800180129383");
				driver.findElement(By.id("NameAsPerBank")).sendKeys("Anshuman Bank Test");
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//Nominee Details
				Thread.sleep(5000);
				driver.findElement(By.id("Nominee_Name")).sendKeys("Vivek Kumar Shukla");
				Thread.sleep(5000);
				WebElement DOB1=driver.findElement(By.id("Nominee_Dob"));
				
				//DOB.click();
				
				DOB1.sendKeys("10");
				
				DOB1.sendKeys("07");
				DOB1.sendKeys("2002");
				
				driver.findElement(By.id("Relation")).sendKeys("Business");
				driver.findElement(By.id("Nom1_percent")).sendKeys("100");
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//FATCA
				Thread.sleep(5000);
				driver.findElement(By.id("place_of_Birth")).sendKeys("Indian");
				driver.findElement(By.id("pol_Exp_PersonN")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("SUBMIT")).click();
				
				Thread.sleep(10000);
				driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
//################################################################################################################################				
				
//Minor
				/*
				Thread.sleep(5000);
				driver.findElement(By.id("Minor")).click();	
				Thread.sleep(3000);
				driver.findElement(By.id("pannumber")).sendKeys("TEEPT6473B");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click();
//1.Basic Details	
				Thread.sleep(3000);
				driver.findElement(By.id("clientName")).sendKeys("Anshu Auto Test");
				Thread.sleep(3000);
				
				WebElement DOB=driver.findElement(By.id("Date_of_Birth"));
				DOB.click();
				DOB.sendKeys("10");
				DOB.sendKeys("07");
				DOB.sendKeys("2005");
				Thread.sleep(3000);
				driver.findElement(By.id("Guardname")).sendKeys("Anshu Guardname");
              Thread.sleep(3000);
				
				WebElement DOB2=driver.findElement(By.id("guardian_DOB"));
				DOB2.click();
				DOB2.sendKeys("10");
				DOB2.sendKeys("07");
				DOB2.sendKeys("1980");


				driver.findElement(By.id("update-lead")).sendKeys(Keys.PAGE_DOWN);
				driver.findElement(By.id("Email")).sendKeys("anshuautotest13jan@fincart.com");
				driver.findElement(By.id("Mobile")).sendKeys("9000000001");
				driver.findElement(By.id("aadhar")).sendKeys("540373764740");
				Thread.sleep(3000);
				WebElement uploadElement = driver.findElement(By.id("clientPhotoFiles"));
				uploadElement.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
				Thread.sleep(3000);
				WebElement uploadElement3 = driver.findElement(By.id("birthCertificateFiles"));
				uploadElement3.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
				Thread.sleep(3000);
				WebElement uploadElement1 = driver.findElement(By.id("aadharFrontFiles"));
				uploadElement1.sendKeys("C:\\Users\\SINGH\\Downloads\\Document\\adharFront.jpg");
				Thread.sleep(3000);
				WebElement uploadElement2 = driver.findElement(By.id("aadharBackFiles"));
				uploadElement2.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
				Thread.sleep(3000);
				WebElement uploadElement4 = driver.findElement(By.id("panPhotoFiles"));
				uploadElement4.sendKeys("C:\\Users\\SINGH\\Downloads\\Document\\testPan.jpg");
				
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
//Add address
				Thread.sleep(12000);
				driver.findElement(By.id("address1")).sendKeys("Address: A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
				driver.findElement(By.id("pin")).sendKeys("229206");
				Thread.sleep(3000);
				driver.findElement(By.id("update-lead")).sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(12000);
				driver.findElement(By.id("sameAddressYes")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//Bank address	
				Thread.sleep(5000);			
				driver.findElement(By.id("ifsc")).sendKeys("HDFC0000011");
				Thread.sleep(5000);
				WebElement campaign=driver.findElement(By.id("Acc_Type"));
				Select select = new Select(campaign);
				select.selectByVisibleText(" Saving");
				driver.findElement(By.id("Acc_No")).sendKeys("1800180129383");
				driver.findElement(By.id("NameAsPerBank")).sendKeys("Anshuman Bank Test");
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//Nominee Details
				Thread.sleep(5000);
				driver.findElement(By.id("Nominee_Name")).sendKeys("Vivek Kumar Shukla");
				Thread.sleep(5000);
				WebElement DOB1=driver.findElement(By.id("Nominee_Dob"));
				
				//DOB.click();
				
				DOB1.sendKeys("10");
				
				DOB1.sendKeys("07");
				DOB1.sendKeys("2002");
				
				driver.findElement(By.id("Relation")).sendKeys("Business");
				driver.findElement(By.id("Nom1_percent")).sendKeys("100");
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//FATCA
				Thread.sleep(5000);
				driver.findElement(By.id("place_of_Birth")).sendKeys("Indian");
				driver.findElement(By.id("pol_Exp_PersonN")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("SUBMIT")).click();
				
				Thread.sleep(10000);
				driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
*/
//########################################################################################################################	
				
				
//HUF KYC
			/*	Thread.sleep(5000);
				driver.findElement(By.id("HUF")).click();	
				Thread.sleep(3000);
				driver.findElement(By.id("pannumber")).sendKeys("TEEHT6473B");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click();
//1.Basic Details	
				Thread.sleep(3000);
				driver.findElement(By.id("clientName")).sendKeys("Anshu Auto Test");
				Thread.sleep(3000);
				
				WebElement DOB=driver.findElement(By.id("Date_of_Birth"));
				DOB.click();
				DOB.sendKeys("10");
				DOB.sendKeys("07");
				DOB.sendKeys("2005");
				Thread.sleep(3000);
				


				driver.findElement(By.id("update-lead")).sendKeys(Keys.PAGE_DOWN);
				
				
				driver.findElement(By.id("aadhar")).sendKeys("540373764740");
				Thread.sleep(3000);
				WebElement uploadElement1 = driver.findElement(By.id("aadharFrontFiles"));
				uploadElement1.sendKeys("C:\\Users\\SINGH\\Downloads\\Document\\adharFront.jpg");
				Thread.sleep(3000);
				WebElement uploadElement2 = driver.findElement(By.id("aadharBackFiles"));
				uploadElement2.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");

				Thread.sleep(3000);
				WebElement uploadElement = driver.findElement(By.id("bankStmtFiles"));
				uploadElement.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
				
				Thread.sleep(3000);
				WebElement uploadElement4 = driver.findElement(By.id("panPhotoFiles"));
				uploadElement4.sendKeys("C:\\Users\\SINGH\\Downloads\\Document\\testPan.jpg");
				
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
//Add address
				Thread.sleep(12000);
				driver.findElement(By.id("address1")).sendKeys("Address: A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
				driver.findElement(By.id("pin")).sendKeys("229206");
				Thread.sleep(3000);
				driver.findElement(By.id("update-lead")).sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(12000);
				driver.findElement(By.id("sameAddressYes")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//Bank address	
				Thread.sleep(5000);			
				driver.findElement(By.id("ifsc")).sendKeys("HDFC0000011");
				Thread.sleep(5000);
				WebElement campaign=driver.findElement(By.id("Acc_Type"));
				Select select = new Select(campaign);
				select.selectByVisibleText(" Saving");
				driver.findElement(By.id("Acc_No")).sendKeys("1800180129383");
				driver.findElement(By.id("NameAsPerBank")).sendKeys("Anshuman Bank Test");
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//Nominee Details
				Thread.sleep(5000);
				driver.findElement(By.id("Nominee_Name")).sendKeys("Vivek Kumar Shukla");
				Thread.sleep(5000);
				WebElement DOB1=driver.findElement(By.id("Nominee_Dob"));
				
				//DOB.click();
				
				DOB1.sendKeys("10");
				
				DOB1.sendKeys("07");
				DOB1.sendKeys("2002");
				
				driver.findElement(By.id("Relation")).sendKeys("Business");
				driver.findElement(By.id("Nom1_percent")).sendKeys("100");
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//FATCA
				
				Thread.sleep(5000);
				driver.findElement(By.id("place_of_Birth")).sendKeys("Indian");
				driver.findElement(By.id("pol_Exp_PersonN")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("SUBMIT")).click();
				
				Thread.sleep(10000);
				driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/div[2]/ng-component/div[3]/div/div/div/div/div[2]/button")).click();*/
//##########################################################################################################################################################
				
/*//NRI KYC				
					Thread.sleep(5000);
				driver.findElement(By.id("NRI")).click();	
				Thread.sleep(3000);
				driver.findElement(By.id("pannumber")).sendKeys("TNEPT6473B");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click();
//1.Basic Details	
				Thread.sleep(3000);
				driver.findElement(By.id("clientName")).sendKeys("Anshu Auto Test");
				Thread.sleep(3000);
				
				WebElement DOB=driver.findElement(By.id("Date_of_Birth"));
				DOB.click();
				DOB.sendKeys("10");
				DOB.sendKeys("07");
				DOB.sendKeys("2005");
				Thread.sleep(3000);
				


				driver.findElement(By.id("update-lead")).sendKeys(Keys.PAGE_DOWN);
				
				
				driver.findElement(By.id("aadhar")).sendKeys("540373764740");
				Thread.sleep(3000);
				WebElement uploadElement = driver.findElement(By.id("clientPhotoFiles"));
				uploadElement.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
				Thread.sleep(3000);
				WebElement uploadElement3 = driver.findElement(By.id("overseasAddrsFiles"));
				uploadElement3.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");
				Thread.sleep(3000);
				WebElement uploadElement4 = driver.findElement(By.id("panPhotoFiles"));
				uploadElement4.sendKeys("C:\\Users\\SINGH\\Downloads\\Document\\testPan.jpg");
				Thread.sleep(3000);
				WebElement uploadElement5 = driver.findElement(By.id("passportFiles"));
				uploadElement5.sendKeys("C:\\Users\\SINGH\\Downloads\\Document\\testPan.jpg");
				Thread.sleep(3000);
				WebElement uploadElement6 = driver.findElement(By.id("birthCertificateFiles"));
				uploadElement6.sendKeys("C:\\Users\\SINGH\\Downloads\\Document\\testPan.jpg");
				Thread.sleep(3000);
				WebElement uploadElement1 = driver.findElement(By.xpath("//*[@id=\"step1_id\"]/div[1]/div/div[11]/div/input"));
				uploadElement1.sendKeys("C:\\Users\\SINGH\\Downloads\\Document\\adharFront.jpg");
				Thread.sleep(3000);
				WebElement uploadElement2 = driver.findElement(By.xpath("//*[@id=\"step1_id\"]/div[1]/div/div[12]/div/input"));
				uploadElement2.sendKeys("C:\\Users\\SINGH\\Downloads\\Anshuman.jpg");

				
				
				
				
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
//Add address
				Thread.sleep(12000);
				driver.findElement(By.id("address1")).sendKeys("Address: A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
				driver.findElement(By.id("pin")).sendKeys("229206");
				Thread.sleep(3000);
				driver.findElement(By.id("update-lead")).sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(12000);
				driver.findElement(By.id("sameAddressYes")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//Bank address	
				Thread.sleep(5000);			
				driver.findElement(By.id("ifsc")).sendKeys("HDFC0000011");
				Thread.sleep(5000);
				WebElement campaign=driver.findElement(By.id("Acc_Type"));
				Select select = new Select(campaign);
				select.selectByVisibleText(" Saving");
				driver.findElement(By.id("Acc_No")).sendKeys("1800180129383");
				driver.findElement(By.id("NameAsPerBank")).sendKeys("Anshuman Bank Test");
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//Nominee Details
				Thread.sleep(5000);
				driver.findElement(By.id("Nominee_Name")).sendKeys("Vivek Kumar Shukla");
				Thread.sleep(5000);
				WebElement DOB1=driver.findElement(By.id("Nominee_Dob"));
				
				//DOB.click();
				
				DOB1.sendKeys("10");
				
				DOB1.sendKeys("07");
				DOB1.sendKeys("2002");
				
				driver.findElement(By.id("Relation")).sendKeys("Business");
				driver.findElement(By.id("Nom1_percent")).sendKeys("100");
				Thread.sleep(5000);
				driver.findElement(By.linkText("NEXT")).click();
				
//FATCA
				
				Thread.sleep(5000);
				driver.findElement(By.id("place_of_Birth")).sendKeys("Indian");
				driver.findElement(By.id("pol_Exp_PersonN")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("SUBMIT")).click();
				
				Thread.sleep(15000);
				driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/div[2]/ng-component/div[3]/div/div/div/div/div[2]/button")).click();*/
				
//******************************************************************************************************************************************************
				

				  
				  
	}
	

}
