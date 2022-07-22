package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class KYCandCaF extends BaseTest {

	public static boolean isAlertPresent() {

		try {
			driver.switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	}

	public void updateBtn() throws InterruptedException {
		Thread.sleep(8000);
		WebElement filterBy = driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		Select select1 = new Select(filterBy);

		select1.selectByVisibleText("By Date");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();

	}

	public void kycBtn() throws InterruptedException {

		Thread.sleep(5000);

		driver.findElement(By.id("kyc")).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.getElementById('notice-popup').remove();");
	}

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void indivisualKYC(String pannumber) throws InterruptedException, AWTException {
		Thread.sleep(8000);

		driver.findElement(By.id("kyc")).click();
		Thread.sleep(4000);
		int size1 = driver.findElements(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/table/tr[1]/td[2]/button"))
				.size();
		if (size1 > 0) {
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/table/tr[1]/td[2]/button"))
					.click();
			Thread.sleep(5000);
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.TAB);
			actions.sendKeys(Keys.TAB);
			actions.sendKeys(Keys.ENTER);
			actions.build().perform();

		}

		/*
		 * Thread.sleep(5000); int size01 =
		 * driver.findElements(By.id("pannumber")).size(); if(size01>0)
		 */
		else {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("return document.getElementById('notice-popup').remove();");
		}
		/*
		 * Thread.sleep(5000);
		 * driver.findElement(By.id("pannumber")).sendKeys("TEEPT6473O");
		 */
		Thread.sleep(5000);
		driver.findElement(By.id("pannumber")).sendKeys(pannumber);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED')]")).click();
		// Basic Details page
		Thread.sleep(3000);
		WebElement mobile = driver.findElement(By.id("Mobile"));
		mobile.clear();
		mobile.sendKeys("9718205589");

		// Without OTP button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"step-3\"]/div[5]/button[3]")).click();
		// Upload Pan

		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("selectedFiles"));

		element.sendKeys("E:\\SeleniumCodeFile\\testPan.png");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'NEXT')]")).click();
		WebElement pan1 = driver.findElement(By.id("clientName"));
		pan1.clear();
		pan1.sendKeys("Anshu Auto Test");

		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"step-6\"]/div[5]/button[2]")).click();

// upload aadhar
		int size02 = driver.findElements(By.id("selectedAddressFiles")).size();
		if (size02 > 0) {
			Thread.sleep(3000);
			WebElement uploadadharF = driver.findElement(By.id("selectedAddressFiles"));
			uploadadharF.sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
			Thread.sleep(3000);
			WebElement uploadadharB = driver.findElement(By.id("selectedBackFiles"));
			uploadadharB.sendKeys("E:\\SeleniumCodeFile\\adharBack.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step-7\"]/div[3]/button[2]")).click();
			WebElement aadhar = driver.findElement(By.id("uId"));
			aadhar.clear();
			aadhar.sendKeys("109377836540");
			driver.findElement(By.id("district")).sendKeys(Keys.DOWN);

			Thread.sleep(20000);
			driver.findElement(By.xpath("//button[contains(text(),'NEXT')]")).click();
		}

		// Personal Details Page
		driver.findElements(By.id("gender")).size();

		Thread.sleep(8000);
		WebElement gender = driver.findElement(By.id("gender"));
		Select male = new Select(gender);
		male.selectByVisibleText("Male");
		Thread.sleep(3000);
		WebElement maritalStatus = driver.findElement(By.id("MaritalStatus"));
		Select unMarrid = new Select(maritalStatus);
		unMarrid.selectByVisibleText("Un-Married");
		Thread.sleep(3000);
		driver.findElement(By.id("MotherName")).sendKeys("Shiv Kumari");
		Thread.sleep(3000);
		WebElement occupation = driver.findElement(By.id("Occupation"));
		Select privateSector = new Select(occupation);
		privateSector.selectByVisibleText("Private Sector");
		Thread.sleep(3000);
		WebElement addressType = driver.findElement(By.id("AddressType"));
		Select office = new Select(addressType);
		office.selectByVisibleText("Registered office");
		Thread.sleep(3000);
		WebElement annualIncome = driver.findElement(By.id("AnnualIncome"));
		Select salary = new Select(annualIncome);
		salary.selectByVisibleText("100000-500000");
		Thread.sleep(3000);
		WebElement sourceOfIncome = driver.findElement(By.id("SourceOfIncome"));
		Select income = new Select(sourceOfIncome);
		income.selectByVisibleText("Salary");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("SourceOfIncome"));
		js.executeScript("arguments[0].scrollTop = arguments[1];", driver.findElement(By.id("SourceOfIncome")), 900);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		// Add Nominee
		Thread.sleep(3000);
		int sizea = driver.findElements(By.id("Nominee_Name0")).size();
		if (sizea > 0) {

			driver.findElement(By.id("Nominee_Name0")).sendKeys("Automation Nominee");
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Thread.sleep(3000);
			actions.sendKeys(Keys.TAB);
			Thread.sleep(4000);
			actions.sendKeys("07/10/1996");
			actions.build().perform();

			driver.findElement(By.id("Relation0")).sendKeys("Automation Tester");
			Thread.sleep(3000);
			driver.findElement(By.id("Nominee_Percent0")).sendKeys("100");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'NEXT')]")).click();

		} else {
			Thread.sleep(5000);
			driver.findElement(By.id("isSelected")).click();

			driver.findElement(By.id("Nominee_Name0")).sendKeys("Automation Nominee");
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Thread.sleep(3000);
			actions.sendKeys(Keys.TAB);
			Thread.sleep(4000);
			actions.sendKeys("07/10/1996");
			actions.build().perform();

			driver.findElement(By.id("Relation0")).sendKeys("Automation Tester");

			driver.findElement(By.id("Nominee_Percent0")).sendKeys("100");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'NEXT')]")).click();
		}

		// Bank Amount
		/*
		 * Thread.sleep(8000); driver.findElement(By.xpath(
		 * "//*[@id=\"raise-ticket-form\"]/div[2]/div[3]/div[2]/div/div[2]/table/tr[5]/td[2]/button"
		 * )).click();
		 */

		Thread.sleep(5000);
		driver.findElement(By.id("ifsc")).sendKeys("HDFC0001069");
		Thread.sleep(5000);
		WebElement accountType = driver.findElement(By.id("AccountType"));
		Select saving = new Select(accountType);
		saving.selectByVisibleText("Saving");
		Thread.sleep(3000);
		driver.findElement(By.id("accountnumber")).sendKeys("50100370135211");
		Thread.sleep(3000);
		driver.findElement(By.id("nameasperbank")).sendKeys("Sandeep Kumar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"step-11\"]/div[11]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"bankDetailsConfirmationPopup\"]/div/div/div[2]/div/div[2]/button"))
				.click();
		Thread.sleep(5000);

		double val1 = 1.01;

		for (int i = 0; i < 13; i++) {
			driver.findElement(By.id("Amount")).sendKeys(String.valueOf(val1));
			driver.findElement(By.xpath("//*[@id=\"step-12\"]/div/div[2]/button[2]")).click();
			Thread.sleep(5000);
			try {

				if (isAlertPresent()) {
					// error
					driver.switchTo().alert().accept();
					driver.findElement(By.id("Amount")).clear();

					val1 = val1 + 0.01;
				} else {
					// success
					System.out.print("Mahdev");
					break;
				}
			} catch (Exception e) {
				System.out.print("Mahdev");
				break;

			}

		}

		// Signature
		Thread.sleep(3000);
		WebElement uploadSign = driver.findElement(By.id("selectedClientSignFiles"));
		uploadSign.sendKeys("E:\\SeleniumCodeFile\\sign.jpg");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/div/div[2]/button[2]"))
				.click();
		/*
		 * Thread.sleep(3000); Actions actions = new Actions(driver);
		 * actions.sendKeys(Keys.TAB); actions.sendKeys(Keys.ENTER);
		 * actions.build().perform();
		 */

		// Confirm KYC & Account Creation Details

		Thread.sleep(10000);
		driver.findElement(
				By.xpath("//*[@id=\"raise-ticket-form\"]/div[2]/div[3]/div[2]/div/div[2]/table/tr[7]/td[2]/button"))
				.click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id=\"step-13\"]/div/div[2]/button[1]")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/div/div[2]/button[2]"))
				.click();
		Thread.sleep(9000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[19]/div/div/div/div/div[2]/button"))
				.click();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	/*
	 * //Reset All step Thread.sleep(5000); driver.findElement(By.xpath(
	 * "//*[@id=\"raise-ticket-form\"]/div[2]/div[3]/div[2]/div/div[2]/table/tr[1]/td[2]/button"
	 * )).click(); Thread.sleep(5000); driver.findElement(By.xpath(
	 * "//*[@id=\"restConfirMationPopup\"]/div/div/div[2]/div/div[2]/button")).click
	 * ();
	 */

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void minorKYC(String pannumber) throws InterruptedException {

		Thread.sleep(5000);

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
			driver.findElement(By.id("Minor")).click();
		} else {
			Thread.sleep(5000);
			int size01 = driver.findElements(By.id("pannumber")).size();
			if (size01 > 0) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("return document.getElementById('notice-popup').remove();");
				Thread.sleep(3000);
				driver.findElement(By.id("Minor")).click();
			}
		}
		Thread.sleep(5000);
		driver.findElement(By.id("pannumber")).sendKeys(pannumber);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click();
		// Basic Details
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("02/03/2015");
		actions.build().perform();

		Thread.sleep(3000);
		driver.findElement(By.id("Guardname")).sendKeys("Anshuman Test Guard");
		Thread.sleep(3000);
		// Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);

		actions.sendKeys("02/03/1996");
		actions.build().perform();
		Thread.sleep(3000);
		WebElement gendar = driver.findElement(By.id("Geneder"));
		Select male2 = new Select(gendar);
		male2.selectByVisibleText("Male");
		Thread.sleep(3000);
		driver.findElement(By.id("Mobile")).sendKeys("9718205589");
		Thread.sleep(3000);
		driver.findElement(By.id("aadhar")).sendKeys("540373726540");
		Thread.sleep(3000);
		WebElement occupation2 = driver.findElement(By.id("occupation"));
		Select student2 = new Select(occupation2);
		student2.selectByVisibleText("Student");
		Thread.sleep(3000);
		WebElement income = driver.findElement(By.id("annIncome"));
		Select income1 = new Select(income);
		income1.selectByVisibleText("1000000-2500000");
		Thread.sleep(3000);
		WebElement clientPhoto = driver.findElement(By.id("clientPhotoFiles"));
		clientPhoto.sendKeys("E:\\SeleniumCodeFile\\clientPhoto.jpeg");
		Thread.sleep(3000);
		WebElement idProof = driver.findElement(By.id("birthCertificateFiles"));
		idProof.sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
		Thread.sleep(3000);
		WebElement aadharFront = driver.findElement(By.id("aadharFrontFiles"));
		aadharFront.sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
		Thread.sleep(3000);
		WebElement aadharBackFiles = driver.findElement(By.id("aadharBackFiles"));
		aadharBackFiles.sendKeys("E:\\SeleniumCodeFile\\adharBack.jpeg");
		Thread.sleep(3000);
		WebElement signature2 = driver.findElement(By.id("panPhotoFiles"));

		signature2.sendKeys("E:\\SeleniumCodeFile\\testPan.png");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a"))
				.click();

// Add address
		Thread.sleep(12000);
		driver.findElement(By.id("address1")).sendKeys("A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.id("country"));
		Select country1 = new Select(country);
		country1.selectByVisibleText("India");
		driver.findElement(By.id("pin")).sendKeys("201301");
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
		account1.selectByVisibleText("Saving");
		Thread.sleep(3000);

		driver.findElement(By.id("Acc_No")).sendKeys("7827827722");
		driver.findElement(By.id("NameAsPerBank")).sendKeys("Anshuman Test");

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"))
				.click();
		// Nominee
		Thread.sleep(5000);
		int sizea = driver.findElements(By.id("Nominee_Name0")).size();
		if (sizea > 0) {
			driver.findElement(By.id("Nominee_Name0")).sendKeys("Automation Nominee");
			Thread.sleep(3000);
			// Actions actions = new Actions(driver);
			actions.sendKeys(Keys.TAB);

			Thread.sleep(3000);
			actions.sendKeys("01/01/1996");
			actions.build().perform();

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
			Thread.sleep(3000);
			// Actions actions = new Actions(driver);
			actions.sendKeys(Keys.TAB);

			Thread.sleep(4000);
			actions.sendKeys("01/01/1996");
			actions.build().perform();

			driver.findElement(By.id("Relation0")).sendKeys("Automation Tester");
			driver.findElement(By.id("Nom_Percent0")).sendKeys("100");
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[3]/a[3]"))
					.click();
		}

		// FATCA
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[3]/a[2]"))
				.click();
		// Upload Sign
		Thread.sleep(3000);
		WebElement uploadSign = driver.findElement(By.id("selectedClientSignFiles"));
		uploadSign.sendKeys("E:\\SeleniumCodeFile\\sign.jpg");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"))
				.click();

		// Confirm Page
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"step-13\"]/div/div[2]/button[2]")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div/div/div/div[2]/button[2]"))
				.click();
		Thread.sleep(20000);
		Actions actions1 = new Actions(driver);
		actions1.sendKeys(Keys.TAB);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void hufKYC(String pannumber) throws InterruptedException {
		// Update Button

		Thread.sleep(5000);

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
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.TAB);
			actions.sendKeys(Keys.TAB);
			actions.sendKeys(Keys.ENTER);
			actions.build().perform();
			Thread.sleep(6000);
			driver.findElement(By.id("HUF")).click();
		} else {
			Thread.sleep(5000);
			int size01 = driver.findElements(By.id("pannumber")).size();
			if (size01 > 0) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("return document.getElementById('notice-popup').remove();");
				Thread.sleep(3000);
				driver.findElement(By.id("HUF")).click();
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("pannumber")).sendKeys(pannumber);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click();
		// Basic Details

		Thread.sleep(5000);
		driver.findElement(By.id("Date_of_Birth")).sendKeys("13-04-1996");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("bankStmtFiles"));
		js.executeScript("arguments[0].scrollTop = arguments[1];", driver.findElement(By.id("bankStmtFiles")), 900);
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
		driver.findElement(By.id("aadhar")).sendKeys("123456789012");
		Thread.sleep(3000);
		WebElement uploadadharF1 = driver.findElement(By.id("aadharFrontFiles"));
		uploadadharF1.sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
		Thread.sleep(3000);
		WebElement uploadadharB1 = driver.findElement(By.id("aadharBackFiles"));
		uploadadharB1.sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");

		WebElement birthCertificateFiles = driver.findElement(By.id("bankStmtFiles"));
		birthCertificateFiles.sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
		Thread.sleep(3000);
		WebElement signature2 = driver.findElement(By.id("panPhotoFiles"));
		signature2.sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a"))
				.click();
		// Add address
		Thread.sleep(12000);
		driver.findElement(By.id("address1")).sendKeys("A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.id("country"));
		Select country1 = new Select(country);
		country1.selectByVisibleText("India");
		driver.findElement(By.id("pin")).sendKeys("201301");
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
		account1.selectByVisibleText("Saving");
		Thread.sleep(3000);

		driver.findElement(By.id("Acc_No")).sendKeys("7827827722");
		driver.findElement(By.id("NameAsPerBank")).sendKeys("Anshuman Test");

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"))
				.click();
		// Nominee
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
		// FATCA
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
		uploadSign.sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"))
				.click();

		// Confirm Page
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"step-13\"]/div/div[2]/button[2]")).sendKeys(Keys.PAGE_DOWN);

	}

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void nriKYC(String pannumber) throws InterruptedException {
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

		} else {
			Thread.sleep(5000);
			int size01 = driver.findElements(By.id("pannumber")).size();
			if (size01 > 0) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("return document.getElementById('notice-popup').remove();");
			}
			Thread.sleep(3000);
			driver.findElement(By.id("NRI")).click();

		}
		Thread.sleep(5000);
		driver.findElement(By.id("pannumber")).sendKeys(pannumber);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pancardvalidate\"]/input[2]")).click();
		// Basic Details

		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("01/01/1996");
		actions.build().perform();

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
		WebElement clientPhoto = driver.findElement(By.id("clientPhotoFiles"));
		clientPhoto.sendKeys("E:\\SeleniumCodeFile\\clientPhoto.jpeg");
		Thread.sleep(3000);
		WebElement overseasAddrsFiles = driver.findElement(By.id("overseasAddrsFiles"));
		overseasAddrsFiles.sendKeys("E:\\SeleniumCodeFile\\testPan.png");
		Thread.sleep(3000);
		WebElement panPhoto = driver.findElement(By.id("panPhotoFiles"));
		panPhoto.sendKeys("E:\\SeleniumCodeFile\\testPan.png");
		Thread.sleep(3000);
		WebElement passportFiles = driver.findElement(By.id("passportFiles"));
		passportFiles.sendKeys("E:\\SeleniumCodeFile\\testPan.png");
		Thread.sleep(3000);
		WebElement birthCertificateFiles = driver.findElement(By.id("birthCertificateFiles"));
		birthCertificateFiles.sendKeys("E:\\SeleniumCodeFile\\testPan.png");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a"))
				.click();

		// Add address
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
		Thread.sleep(8000);
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
		// Nominee
		Thread.sleep(5000);
		int sizea = driver.findElements(By.id("Nominee_Name0")).size();
		if (sizea > 0) {
			driver.findElement(By.id("Nominee_Name0")).sendKeys("Automation Nominee");
			Thread.sleep(3000);
			// Actions actions = new Actions(driver);
			actions.sendKeys(Keys.TAB);

			Thread.sleep(3000);
			actions.sendKeys("01/01/1996");
			actions.build().perform();

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
			Thread.sleep(3000);
			// Actions actions = new Actions(driver);
			actions.sendKeys(Keys.TAB);

			Thread.sleep(4000);
			actions.sendKeys("01/01/1996");
			actions.build().perform();

			driver.findElement(By.id("Relation0")).sendKeys("Automation Tester");
			driver.findElement(By.id("Nom_Percent0")).sendKeys("100");
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[3]/a[3]"))
					.click();
		}
		// FATCA
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
		uploadSign.sendKeys("E:\\SeleniumCodeFile\\sign.jpg");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div[2]/a[2]"))
				.click();

		// Confirm Page
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"step-13\"]/div/div[2]/button[2]")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[2]/div/div/div[2]/div[3]/div[2]/div/form/fieldset/div/div/div/div[2]/button[2]"))
				.click();
		Thread.sleep(20000);
		Actions actions1 = new Actions(driver);
		actions1.sendKeys(Keys.TAB);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

}
