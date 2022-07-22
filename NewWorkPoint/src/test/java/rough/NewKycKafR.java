package rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewKycKafR {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://workpoint.fincart.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
				.sendKeys("testentry@fincart.com");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
				.sendKeys("fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

//LeadsTrackingButton
		Thread.sleep(15000);
		driver.get("https://workpoint.fincart.com/lead");

		/*
		 * WebElement search=driver.findElement(By.id("searchLead"));
		 * search.sendKeys("test15may21"); Thread.sleep(10000);
		 * //search.sendKeys(Keys.PAGE_DOWN); search.sendKeys(Keys.ARROW_DOWN);
		 * search.sendKeys(Keys.ENTER); Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"searchFilterSubmit\"]/div[7]/input")).
		 * click();
		 * 
		 * 
		 * //Update Button Thread.sleep(10000);
		 * driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
		 * 
		 * 
		 * 
		 * 
		 * //KYC Button
		 * 
		 * Thread.sleep(8000);
		 * 
		 * driver.findElement(By.id("kyc")).click(); Thread.sleep(4000); int size1 =
		 * driver.findElements(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/table/tr[1]/td[2]/button"
		 * )).size(); if(size1>0) { Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/table/tr[1]/td[2]/button"
		 * )).click(); Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[8]/div/div/div[2]/div/div[2]/button"
		 * )).click(); Thread.sleep(5000); driver.findElement(By.id("Minor")).click();
		 * Thread.sleep(3000); driver.findElement(By.id("kyc")).click(); }
		 * 
		 * Thread.sleep(5000); int size01 =
		 * driver.findElements(By.id("pannumber")).size(); if(size01>0) {
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("return document.getElementById('notice-popup').remove();");
		 * }
		 * 
		 * //indivisual KYC already done KYC other platform without OTP
		 * 
		 * 
		 * Thread.sleep(5000);
		 * driver.findElement(By.id("pannumber")).sendKeys("TEEPT6473O");
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click()
		 * ; Thread.sleep(3000);
		 * driver.findElement(By.xpath("//button[contains(text(),'PROCEED')]")).click();
		 * // Basic Details page Thread.sleep(3000); WebElement
		 * mobile=driver.findElement(By.id("Mobile")); mobile.clear();
		 * mobile.sendKeys("9718205589"); //Click to OTP button Thread.sleep(3000);
		 * driver.findElement(By.xpath("//button[contains(text(),'SEND OTP')]")).click()
		 * ; Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"step-4\"]/div/div[3]/button[1]")).
		 * click(); // Without OTP button Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"step-3\"]/div[5]/button[3]")).click();
		 * //Upload Pan Thread.sleep(3000); WebElement
		 * uploadPpan=driver.findElement(By.id("selectedFiles"));
		 * uploadPpan.sendKeys("D:\\AutomationDocument\\Pan.png"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"step-5\"]/div[2]/button[2]")).click();
		 * WebElement pan = driver.findElement(By.id("clientName")); pan.clear();
		 * pan.sendKeys("Anshu Auto Test");
		 * 
		 * Thread.sleep(40000);
		 * driver.findElement(By.xpath("//*[@id=\"step-6\"]/div[5]/button[2]")).click();
		 * 
		 * 
		 * //upload aadhar int size02 =
		 * driver.findElements(By.id("selectedAddressFiles")).size(); if(size02>0) {
		 * Thread.sleep(3000); WebElement
		 * uploadadharF=driver.findElement(By.id("selectedAddressFiles"));
		 * uploadadharF.sendKeys("D:\\AutomationDocument\\adharFront.jpg");
		 * Thread.sleep(3000); WebElement
		 * uploadadharB=driver.findElement(By.id("selectedBackFiles"));
		 * uploadadharB.sendKeys("D:\\AutomationDocument\\adharBack.jpg");
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"step-7\"]/div[3]/button[2]")).click();
		 * Thread.sleep(50000);
		 * driver.findElement(By.xpath("//*[@id=\"step-8\"]/div[7]/button[2]")).click();
		 * }
		 * 
		 * //Proof Of Address int size2 =
		 * driver.findElements(By.xpath("//button[contains(text(),'Add')]")).size();
		 * if(size2>0) { //add Button Thread.sleep(3000);
		 * driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		 * //upload aadhar Thread.sleep(3000); WebElement
		 * uploadadharF1=driver.findElement(By.id("selectedAddressFiles"));
		 * uploadadharF1.sendKeys("D:\\AutomationDocument\\adharFront.jpg");
		 * Thread.sleep(3000); WebElement
		 * uploadadharB1=driver.findElement(By.id("selectedBackFiles"));
		 * uploadadharB1.sendKeys("D:\\AutomationDocument\\adharBack.jpg");
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"step-7\"]/div[3]/button[2]")).click();
		 * Thread.sleep(40000);
		 * driver.findElement(By.xpath("//*[@id=\"step-8\"]/div[7]/button[2]")).click();
		 * }
		 * 
		 * //Personal Details
		 * 
		 * //Personal Details Page driver.findElements(By.id("gender")).size();
		 * 
		 * Thread.sleep(8000); WebElement gender=driver.findElement(By.id("gender"));
		 * Select male = new Select(gender); male.selectByVisibleText("Male");
		 * Thread.sleep(3000); WebElement
		 * maritalStatus=driver.findElement(By.id("MaritalStatus")); Select unMarrid =
		 * new Select(maritalStatus); unMarrid.selectByVisibleText("Un-Married");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("MotherName")).sendKeys("Shiv Kumari");
		 * Thread.sleep(3000); WebElement
		 * occupation=driver.findElement(By.id("Occupation")); Select privateSector =
		 * new Select(occupation); privateSector.selectByVisibleText("Private Sector");
		 * Thread.sleep(3000); WebElement
		 * addressType=driver.findElement(By.id("AddressType")); Select office = new
		 * Select(addressType); office.selectByVisibleText("Registered office");
		 * Thread.sleep(3000); WebElement
		 * annualIncome=driver.findElement(By.id("AnnualIncome")); Select salary = new
		 * Select(annualIncome); salary.selectByVisibleText("100000-500000");
		 * Thread.sleep(3000); WebElement
		 * sourceOfIncome=driver.findElement(By.id("SourceOfIncome")); Select income =
		 * new Select(sourceOfIncome); income.selectByVisibleText("Salary"); //Add
		 * Nominee Thread.sleep(3000);
		 * driver.findElement(By.id("isSelected")).sendKeys(Keys.PAGE_DOWN);
		 * 
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("Nominee_Name0")).sendKeys("Raman Singh");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("Nominee_DOB0")).sendKeys("13-04-1995");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("Relation0")).sendKeys("Brother");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("Nominee_Percent0")).sendKeys("100");
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"step-9\"]/div[10]/button[2]")).click()
		 * ;
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //Bank Amount Thread.sleep(8000); driver.findElement(By.xpath(
		 * "//*[@id=\"raise-ticket-form\"]/div[2]/div[3]/div[2]/div/div[2]/table/tr[5]/td[2]/button"
		 * )).click();
		 * 
		 * Thread.sleep(5000);
		 * driver.findElement(By.id("ifsc")).sendKeys("HDFC0001069");
		 * Thread.sleep(5000); WebElement
		 * accountType=driver.findElement(By.id("AccountType")); Select saving = new
		 * Select(accountType); saving.selectByVisibleText("Saving");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("accountnumber")).sendKeys("50100370135211");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("nameasperbank")).sendKeys("Sandeep Kumar");
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"step-11\"]/div[11]/button[2]")).click(
		 * ); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//*[@id=\"bankDetailsConfirmationPopup\"]/div/div/div[2]/div/div[2]/button")
		 * ).click(); Thread.sleep(5000);
		 * 
		 * 
		 * double val1 = 1.01;
		 * 
		 * for(int i=0; i < 13; i++) {
		 * driver.findElement(By.id("Amount")).sendKeys(String.valueOf(val1));
		 * driver.findElement(By.xpath("//*[@id=\"step-12\"]/div/div[2]/button[2]")).
		 * click(); Thread.sleep(5000); try {
		 * 
		 * if(isAlertPresent()) { //error driver.switchTo().alert().accept();
		 * driver.findElement(By.id("Amount")).clear();
		 * 
		 * val1 = val1 + 0.01; } else { //success System.out.print("Mahdev"); break; } }
		 * catch(Exception e) { System.out.print("Mahdev"); break;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * //Signature Thread.sleep(8000); WebElement
		 * signature=driver.findElement(By.id("selectedClientSignFiles"));
		 * signature.sendKeys("D:\\AutomationDocument\\sign.jpeg"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"step-13\"]/div/div[2]/button[2]")).
		 * click();
		 * 
		 * 
		 * 
		 * //Confirm KYC & Account Creation Details
		 * 
		 * Thread.sleep(10000); driver.findElement(By.xpath(
		 * "//*[@id=\"raise-ticket-form\"]/div[2]/div[3]/div[2]/div/div[2]/table/tr[7]/td[2]/button"
		 * )).click();
		 * 
		 * Thread.sleep(10000);
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"step-13\"]/div/div[2]/button[1]")).
		 * sendKeys(Keys.PAGE_DOWN); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"step-13\"]/div/div[2]/button[1]")).
		 * click();
		 */
		/*
		 * //Reset All step Thread.sleep(5000); driver.findElement(By.xpath(
		 * "//*[@id=\"raise-ticket-form\"]/div[2]/div[3]/div[2]/div/div[2]/table/tr[1]/td[2]/button"
		 * )).click(); Thread.sleep(5000); driver.findElement(By.xpath(
		 * "//*[@id=\"restConfirMationPopup\"]/div/div/div[2]/div/div[2]/button")).click
		 * ();
		 */

//********************************** Minor******************************************************************************************	
		/*
		 * WebElement search=driver.findElement(By.id("searchLead"));
		 * search.sendKeys("testminor30jun21"); Thread.sleep(5000);
		 * //search.sendKeys(Keys.PAGE_DOWN); search.sendKeys(Keys.ARROW_DOWN);
		 * search.sendKeys(Keys.ENTER); Thread.sleep(8000);
		 * driver.findElement(By.xpath("//*[@id=\"searchFilterSubmit\"]/div[7]/input")).
		 * click(); //Update Button Thread.sleep(5000);
		 * driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.id("kyc")).click();
		 * 
		 * Thread.sleep(4000); int size1 = driver.findElements(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div/table/tr[1]/td[2]/button"
		 * )).size(); if(size1>0) { Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div/table/tr[1]/td[2]/button"
		 * )).click(); Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[8]/div/div/div[2]/div/div[2]/button"
		 * )).click(); Thread.sleep(3000);
		 * driver.findElement(By.id("Individual")).click(); Thread.sleep(6000);
		 * driver.findElement(By.id("Minor")).click(); } else { Thread.sleep(5000); int
		 * size01 = driver.findElements(By.id("pannumber")).size(); if(size01>0) {
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("return document.getElementById('notice-popup').remove();");
		 * Thread.sleep(3000); driver.findElement(By.id("Minor")).click(); } }
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("pannumber")).sendKeys("TNEPT6390l");
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click()
		 * ; //Basic Details Thread.sleep(5000);
		 * driver.findElement(By.id("clientName")).sendKeys("Anshuman Test Minor");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("Date_of_Birth")).sendKeys("13-04-2005");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("Guardname")).sendKeys("Anshuman Test Guard");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("guardian_DOB")).sendKeys("10-07-1996");
		 * Thread.sleep(3000); WebElement gendar=driver.findElement(By.id("Geneder"));
		 * Select male2 = new Select(gendar); male2.selectByVisibleText("Male");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("Mobile")).sendKeys("9718205589");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("aadhar")).sendKeys("540373726540");
		 * Thread.sleep(3000); WebElement
		 * occupation2=driver.findElement(By.id("occupation")); Select student2 = new
		 * Select(occupation2); student2.selectByVisibleText("Student");
		 * Thread.sleep(3000); WebElement income=driver.findElement(By.id("annIncome"));
		 * Select income1 = new Select(income);
		 * income1.selectByVisibleText("1000000-2500000"); Thread.sleep(3000);
		 * WebElement clientPhoto=driver.findElement(By.id("clientPhotoFiles"));
		 * clientPhoto.sendKeys("D:\\AutomationDocument\\clientPhoto.jpg");
		 * Thread.sleep(3000); WebElement
		 * idProof=driver.findElement(By.id("birthCertificateFiles"));
		 * idProof.sendKeys("D:\\AutomationDocument\\document.pdf"); Thread.sleep(3000);
		 * WebElement aadharFront=driver.findElement(By.id("aadharFrontFiles"));
		 * aadharFront.sendKeys("D:\\AutomationDocument\\adharFront.jpg");
		 * Thread.sleep(3000); WebElement
		 * aadharBackFiles=driver.findElement(By.id("aadharBackFiles"));
		 * aadharBackFiles.sendKeys("D:\\AutomationDocument\\adharBack.jpg");
		 * Thread.sleep(3000); WebElement
		 * signature2=driver.findElement(By.id("panPhotoFiles"));
		 * 
		 * signature2.sendKeys("D:\\AutomationDocument\\Pan.png"); Thread.sleep(5000);
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a"
		 * )).click();
		 * 
		 * //Add address Thread.sleep(12000); driver.findElement(By.id("address1")).
		 * sendKeys("A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
		 * Thread.sleep(3000); WebElement country=driver.findElement(By.id("country"));
		 * Select country1 = new Select(country); country1.selectByVisibleText("India");
		 * driver.findElement(By.id("pin")).sendKeys("201301"); Thread.sleep(5000);
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"
		 * )).click(); //Bank address Thread.sleep(5000);
		 * driver.findElement(By.id("ifsc")).sendKeys("HDFC0001069");
		 * Thread.sleep(3000); WebElement account=driver.findElement(By.id("Acc_Type"));
		 * Select account1 = new Select(account);
		 * account1.selectByVisibleText("Saving"); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.id("Acc_No")).sendKeys("7827827722");
		 * driver.findElement(By.id("NameAsPerBank")).sendKeys("Anshuman Test");
		 * 
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"
		 * )).click(); //Nominee
		 * if(driver.findElement(By.id("Nominee_Name0")).isDisplayed()) {
		 * driver.findElement(By.id("Nominee_Name0")).sendKeys("Automation Nominee");
		 * driver.findElement(By.id("Nominee_Dob0")).sendKeys("10/07/1996");
		 * driver.findElement(By.id("Relation0")).sendKeys("Automation Tester");
		 * driver.findElement(By.id("Nom_Percent0")).sendKeys("100");
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[3]/a[3]"
		 * )).click();
		 * 
		 * } else { Thread.sleep(5000); driver.findElement(By.id("isSelected")).click();
		 * driver.findElement(By.id("Nominee_Name0")).sendKeys("Automation Nominee");
		 * driver.findElement(By.id("Nominee_Dob0")).sendKeys("10/07/1996");
		 * driver.findElement(By.id("Relation0")).sendKeys("Automation Tester");
		 * driver.findElement(By.id("Nom_Percent0")).sendKeys("100");
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[3]/a[3]"
		 * )).click(); }
		 * 
		 * //FATCA Thread.sleep(5000);
		 * driver.findElement(By.id("place_of_Birth")).sendKeys("UttarPradesh");
		 * Thread.sleep(3000); WebElement
		 * country001=driver.findElement(By.id("country_of_Birth")); Select country002 =
		 * new Select(country001); country002.selectByVisibleText("India");
		 * Thread.sleep(3000); WebElement
		 * source_Wealth=driver.findElement(By.id("source_Wealth")); Select salary = new
		 * Select(source_Wealth); salary.selectByVisibleText("Salary");
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[3]/a[2]"
		 * )).click(); // Upload Sign Thread.sleep(3000); WebElement
		 * uploadSign=driver.findElement(By.id("selectedClientSignFiles"));
		 * uploadSign.sendKeys("D:\\AutomationDocument\\sign.jpeg"); Thread.sleep(5000);
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"
		 * )).click();
		 * 
		 * //Confirm Page Thread.sleep(15000);
		 * driver.findElement(By.xpath("//*[@id=\"step-13\"]/div/div[2]/button[2]")).
		 * sendKeys(Keys.PAGE_DOWN);
		 */

//********************************** NRI******************************************************************************************	
		Thread.sleep(10000);
		WebElement teamMem = driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		Select select = new Select(teamMem);
		select.selectByVisibleText("By Date");

		// Update Button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
		Thread.sleep(8000);

		driver.findElement(By.id("kyc")).click();

		Thread.sleep(4000);
		int size1 = driver.findElements(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div/table/tr[1]/td[2]/button"))
				.size();
		if (size1 > 0) {
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div/table/tr[1]/td[2]/button"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[8]/div/div/div[2]/div/div[2]/button"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.id("Individual")).click();
			Thread.sleep(6000);
			driver.findElement(By.id("NRI")).click();
		} else {
			Thread.sleep(5000);
			int size01 = driver.findElements(By.id("pannumber")).size();
			if (size01 > 0) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("return document.getElementById('notice-popup').remove();");
				Thread.sleep(3000);
				driver.findElement(By.id("NRI")).click();
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("pannumber")).sendKeys("TNEPT8383S");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click();
//Basic Details

		Thread.sleep(3000);
		driver.findElement(By.id("Date_of_Birth")).sendKeys("13-04-1996");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("birthCertificateFiles"));
		js.executeScript("arguments[0].scrollTop = arguments[1];", driver.findElement(By.id("birthCertificateFiles")),
				900);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(3000);
		WebElement mobile = driver.findElement(By.id("Mobile"));
		mobile.clear();
		mobile.sendKeys("9718205589");
		Thread.sleep(3000);
		WebElement gendar = driver.findElement(By.id("occupation"));
		Select male2 = new Select(gendar);
		male2.selectByVisibleText("Service");
		Thread.sleep(3000);
		WebElement annIncome = driver.findElement(By.id("annIncome"));
		Select income = new Select(annIncome);
		income.selectByVisibleText("2500000-10000000");

		Thread.sleep(3000);
		driver.findElement(By.id("aadhar")).sendKeys("540373726540");

		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("clientPhotoFiles"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		Robot robot = new Robot();
		robot.setAutoDelay(3000);
		StringSelection sel = new StringSelection("E:\\SeleniumCodeFile\\testPan.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement idProof = driver.findElement(By.id("overseasAddrsFiles"));
		idProof.sendKeys("D:\\AutomationDocument\\nriadd.jpg");
		Thread.sleep(3000);
		WebElement signature2 = driver.findElement(By.id("panPhotoFiles"));
		signature2.sendKeys("D:\\AutomationDocument\\Pan.png");
		Thread.sleep(3000);
		WebElement passportFiles = driver.findElement(By.id("passportFiles"));
		passportFiles.sendKeys("D:\\AutomationDocument\\passport.jpg");
		Thread.sleep(3000);
		WebElement birthCertificateFiles = driver.findElement(By.id("birthCertificateFiles"));
		birthCertificateFiles.sendKeys("D:\\AutomationDocument\\indAdds.jpg");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a"))
				.click();

//Add address
		Thread.sleep(20000);

		driver.findElement(By.id("address1")).sendKeys("A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.id("country"));
		Select country1 = new Select(country);
		country1.selectByVisibleText("India");
		driver.findElement(By.id("pin")).sendKeys("201301");
		Thread.sleep(12000);
		driver.findElement(By.id("commaddress1")).sendKeys("A-44, Block A, Sector 4,California");
		Thread.sleep(3000);
		WebElement commcountry = driver.findElement(By.id("commcountry"));
		Select commcountry1 = new Select(commcountry);
		commcountry1.selectByVisibleText("United States");
		driver.findElement(By.id("commpin")).sendKeys("201301");
		driver.findElement(By.id("commcity")).sendKeys("california");
		driver.findElement(By.id("commstate")).sendKeys("USA");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"))
				.click();
		// Bank address
		Thread.sleep(5000);
		driver.findElement(By.id("ifsc")).sendKeys("HDFC0001069");
		Thread.sleep(3000);
		WebElement account = driver.findElement(By.id("Acc_Type"));
		Select account1 = new Select(account);
		account1.selectByVisibleText("NRE");
		Thread.sleep(3000);

		driver.findElement(By.id("Acc_No")).sendKeys("7827827722");
		driver.findElement(By.id("NameAsPerBank")).sendKeys("Anshuman Test");

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"))
				.click();
//Nominee
		int sizea = driver.findElements(By.id("Nominee_Name0")).size();
		if (sizea > 0) {
			driver.findElement(By.id("Nominee_Name0")).sendKeys("Automation Nominee");
			driver.findElement(By.id("Nominee_Dob0")).sendKeys("10/07/1996");
			driver.findElement(By.id("Relation0")).sendKeys("Automation Tester");
			driver.findElement(By.id("Nom_Percent0")).sendKeys("100");
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[3]/a[3]"))
					.click();

		} else {
			Thread.sleep(5000);
			driver.findElement(By.id("isSelected")).click();
			driver.findElement(By.id("Nominee_Name0")).sendKeys("Automation Nominee");
			driver.findElement(By.id("Nominee_Dob0")).sendKeys("10/07/1996");
			driver.findElement(By.id("Relation0")).sendKeys("Automation Tester");
			driver.findElement(By.id("Nom_Percent0")).sendKeys("100");
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[3]/a[3]"))
					.click();
		}
//FATCA     
		Thread.sleep(5000);
		driver.findElement(By.id("place_of_Birth")).sendKeys("UttarPradesh");
		Thread.sleep(3000);
		WebElement country001 = driver.findElement(By.id("country_of_Birth"));
		Select country002 = new Select(country001);
		country002.selectByVisibleText("India");
		Thread.sleep(3000);
		WebElement source_Wealth = driver.findElement(By.id("source_Wealth"));
		Select salary = new Select(source_Wealth);
		salary.selectByVisibleText("Salary");
		driver.findElement(By.id("isTaxOtherYes")).click();
		Thread.sleep(3000);
		WebElement taxResidencyCountry0 = driver.findElement(By.id("tax_Residency_Country0"));
		Select salary01 = new Select(taxResidencyCountry0);
		salary01.selectByVisibleText("United States");
		Thread.sleep(3000);
		WebElement tax_Identification_Type0 = driver.findElement(By.id("tax_Identification_Type0"));
		Select salary02 = new Select(tax_Identification_Type0);
		salary02.selectByVisibleText("PassPort");
		driver.findElement(By.id("tax_Identification_No0")).sendKeys("676AA0323443");
		driver.findElement(By.id("tax_Identification_No0")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[5]/a[2]"))
				.click();
// Upload Sign
		Thread.sleep(3000);
		WebElement uploadSign = driver.findElement(By.id("selectedClientSignFiles"));
		uploadSign.sendKeys("D:\\AutomationDocument\\sign.jpeg");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"))
				.click();

//Confirm Page
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"step-13\"]/div/div[2]/button[2]")).sendKeys(Keys.PAGE_DOWN);

//*****************************************HUF*******************************************************************************	
		/*
		 * WebElement search=driver.findElement(By.id("searchLead"));
		 * search.sendKeys("testHUF01jun21"); Thread.sleep(5000);
		 * //search.sendKeys(Keys.PAGE_DOWN); search.sendKeys(Keys.ARROW_DOWN);
		 * search.sendKeys(Keys.ENTER); Thread.sleep(8000);
		 * driver.findElement(By.xpath("//*[@id=\"searchFilterSubmit\"]/div[7]/input")).
		 * click(); //Update Button Thread.sleep(5000);
		 * driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.id("kyc")).click();
		 * 
		 * Thread.sleep(4000); int size1 = driver.findElements(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div/table/tr[1]/td[2]/button"
		 * )).size(); if(size1>0) { Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div/table/tr[1]/td[2]/button"
		 * )).click(); Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[8]/div/div/div[2]/div/div[2]/button"
		 * )).click(); Thread.sleep(3000);
		 * driver.findElement(By.id("Individual")).click(); Thread.sleep(6000);
		 * driver.findElement(By.id("HUF")).click(); } else { Thread.sleep(5000); int
		 * size01 = driver.findElements(By.id("pannumber")).size(); if(size01>0) {
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("return document.getElementById('notice-popup').remove();");
		 * Thread.sleep(3000); driver.findElement(By.id("HUF")).click(); } }
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("pannumber")).sendKeys("TNEHT6390l");
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click()
		 * ; //Basic Details
		 * 
		 * Thread.sleep(5000);
		 * driver.findElement(By.id("Date_of_Birth")).sendKeys("13-04-1996");
		 * JavascriptExecutor js = (JavascriptExecutor) driver; WebElement Element =
		 * driver.findElement(By.id("bankStmtFiles"));
		 * js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(
		 * By.id("bankStmtFiles")), 900);
		 * js.executeScript("arguments[0].scrollIntoView();", Element);
		 * Thread.sleep(3000); WebElement mobile=driver.findElement(By.id("Mobile"));
		 * mobile.clear(); mobile.sendKeys("9718205589"); Thread.sleep(3000); WebElement
		 * gendar=driver.findElement(By.id("occupation")); Select male2 = new
		 * Select(gendar); male2.selectByVisibleText("Service"); Thread.sleep(3000);
		 * WebElement annIncome=driver.findElement(By.id("annIncome")); Select income =
		 * new Select(annIncome); income.selectByVisibleText("2500000-10000000");
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("aadhar")).sendKeys("540373726540");
		 * Thread.sleep(3000); WebElement
		 * uploadadharF1=driver.findElement(By.id("aadharFrontFiles"));
		 * uploadadharF1.sendKeys("D:\\AutomationDocument\\adharFront.jpg");
		 * Thread.sleep(3000); WebElement
		 * uploadadharB1=driver.findElement(By.id("aadharBackFiles"));
		 * uploadadharB1.sendKeys("D:\\AutomationDocument\\adharBack.jpg");
		 * 
		 * WebElement birthCertificateFiles=driver.findElement(By.id("bankStmtFiles"));
		 * birthCertificateFiles.sendKeys("D:\\AutomationDocument\\indianAddress.jpg");
		 * Thread.sleep(3000); WebElement
		 * signature2=driver.findElement(By.id("panPhotoFiles"));
		 * signature2.sendKeys("D:\\AutomationDocument\\Pan.png"); Thread.sleep(5000);
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a"
		 * )).click(); //Add address Thread.sleep(12000);
		 * driver.findElement(By.id("address1")).
		 * sendKeys("A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
		 * Thread.sleep(3000); WebElement country=driver.findElement(By.id("country"));
		 * Select country1 = new Select(country); country1.selectByVisibleText("India");
		 * driver.findElement(By.id("pin")).sendKeys("201301"); Thread.sleep(5000);
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"
		 * )).click(); //Bank address Thread.sleep(5000);
		 * driver.findElement(By.id("ifsc")).sendKeys("HDFC0001069");
		 * Thread.sleep(3000); WebElement account=driver.findElement(By.id("Acc_Type"));
		 * Select account1 = new Select(account);
		 * account1.selectByVisibleText("Saving"); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.id("Acc_No")).sendKeys("7827827722");
		 * driver.findElement(By.id("NameAsPerBank")).sendKeys("Anshuman Test");
		 * 
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"
		 * )).click(); //Nominee int sizea =
		 * driver.findElements(By.id("Nominee_Name0")).size(); if(sizea>0) {
		 * driver.findElement(By.id("Nominee_Name0")).sendKeys("Automation Nominee");
		 * driver.findElement(By.id("Nominee_Dob0")).sendKeys("10/07/1996");
		 * driver.findElement(By.id("Relation0")).sendKeys("Automation Tester");
		 * driver.findElement(By.id("Nom_Percent0")).sendKeys("100");
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[3]/a[3]"
		 * )).click();
		 * 
		 * } else{ Thread.sleep(5000); driver.findElement(By.id("isSelected")).click();
		 * driver.findElement(By.id("Nominee_Name0")).sendKeys("Automation Nominee");
		 * driver.findElement(By.id("Nominee_Dob0")).sendKeys("10/07/1996");
		 * driver.findElement(By.id("Relation0")).sendKeys("Automation Tester");
		 * driver.findElement(By.id("Nom_Percent0")).sendKeys("100");
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[3]/a[3]"
		 * )).click(); } //FATCA Thread.sleep(5000);
		 * driver.findElement(By.id("place_of_Birth")).sendKeys("UttarPradesh");
		 * Thread.sleep(3000); WebElement
		 * country001=driver.findElement(By.id("country_of_Birth")); Select country002 =
		 * new Select(country001); country002.selectByVisibleText("India");
		 * Thread.sleep(3000); WebElement
		 * source_Wealth=driver.findElement(By.id("source_Wealth")); Select salary = new
		 * Select(source_Wealth); salary.selectByVisibleText("Salary");
		 * driver.findElement(By.id("isTaxOtherYes")).click(); Thread.sleep(3000);
		 * WebElement
		 * taxResidencyCountry0=driver.findElement(By.id("tax_Residency_Country0"));
		 * Select salary01 = new Select(taxResidencyCountry0);
		 * salary01.selectByVisibleText("United States"); Thread.sleep(3000); WebElement
		 * tax_Identification_Type0=driver.findElement(By.id("tax_Identification_Type0")
		 * ); Select salary02 = new Select(tax_Identification_Type0);
		 * salary02.selectByVisibleText("PassPort");
		 * driver.findElement(By.id("tax_Identification_No0")).sendKeys("676AA0323443");
		 * driver.findElement(By.id("tax_Identification_No0")).sendKeys(Keys.PAGE_DOWN);
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[5]/a[2]"
		 * )).click(); // Upload Sign Thread.sleep(3000); WebElement
		 * uploadSign=driver.findElement(By.id("selectedClientSignFiles"));
		 * uploadSign.sendKeys("D:\\AutomationDocument\\sign.jpeg"); Thread.sleep(5000);
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"
		 * )).click();
		 * 
		 * //Confirm Page Thread.sleep(15000);
		 * driver.findElement(By.xpath("//*[@id=\"step-13\"]/div/div[2]/button[2]")).
		 * sendKeys(Keys.PAGE_DOWN);
		 */

	}

	public static boolean isAlertPresent() {

		try {
			driver.switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	} // isAlertPresent()
}
