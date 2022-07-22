package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;

public class MIS extends BaseTest {
	public void misAndRevenuBtn() throws InterruptedException {

		Thread.sleep(10000);
		driver.get("https://workpoint.fincart.com/mis-revenue");
	}

	public void filterByName() throws InterruptedException {
		WebElement search = driver.findElement(By.id("searchLead"));

		driver.findElement(By.id("searchLead")).sendKeys("Test 5");

		Thread.sleep(5000);
		List<WebElement> autosearvh = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearvh) {

			if (suggect.getText().equalsIgnoreCase("Test 5 Feb(test5feb21@gmail.com)")) {
				Thread.sleep(4000);
				suggect.click();

				break;
			}

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[8]/input"))
				.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

	public void filterByTeamMember() throws InterruptedException {
		Thread.sleep(12000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[7]/a"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hirarckeyPopupId\"]/div/div/div[2]/div[2]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(8000);
		driver.navigate().refresh();
	}

	public void filterBySubBroker() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[7]/a"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hirarckeyPopupId\"]/div/div/div[2]/div[2]/ul/li[2]/ul/li[1]/ul/li[1]/a"))
				.click();
		Thread.sleep(8000);
		driver.navigate().refresh();
	}

	public void addAssetBtn() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(text(),'+ ADD ASSET')]")).click();
	}

	public void addMFOffline() throws InterruptedException {
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.id("assetClient"));

		search.sendKeys("Minor KYC");
		Thread.sleep(3000);
		search.sendKeys(Keys.BACK_SPACE);

		Thread.sleep(5000);
		List<WebElement> mfoffline1 = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement mfsuggect1 : mfoffline1) {

			if (mfsuggect1.getText().equalsIgnoreCase("Minor KYC Test(minortest@gmail.com)")) {
				Thread.sleep(4000);
				mfsuggect1.click();

				break;
			}

		}

		Thread.sleep(3000);
		WebElement offline = driver.findElement(By.id("userGoalID"));
		Select select = new Select(offline);

		select.selectByVisibleText("Car");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'SAVE & NEXT')]")).click();
		// Page
		driver.findElement(By.id("currentValue")).sendKeys("5000");

		Thread.sleep(3000);
		driver.findElement(By.id("schemeName")).sendKeys(Keys.PAGE_DOWN);
		WebElement trType = driver.findElement(By.id("transType"));
		Select seltrType = new Select(trType);

		seltrType.selectByVisibleText("Lumpsum");
		driver.findElement(By.id("lumpSumValue")).sendKeys("1000");
		driver.findElement(By.id("folioNo")).sendKeys("64646454644");
		driver.findElement(By.id("schemeName")).sendKeys("Axi");
		;
		Thread.sleep(5000);

		List<WebElement> scheme = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement schemesuggect : scheme) {

			if (schemesuggect.getText().equalsIgnoreCase("Axis - Dynamic Equity Fund Reg (G)")) {
				Thread.sleep(4000);

				schemesuggect.click();

				break;
			}

		}

		WebElement payType = driver.findElement(By.id("closeMode"));
		Select selectMode = new Select(payType);

		selectMode.selectByVisibleText("Online Mode - Debit Card");
		driver.findElement(By.id("createdDate")).sendKeys("12-01-2015");
		driver.findElement(By.id("remarks")).sendKeys("Anshu Tester");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/div[3]/div/div/form/fieldset[2]/div[2]/a[2]"))
				.click();
		Thread.sleep(8000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	}

	public void mfPunch() throws InterruptedException {
		driver.findElement(By.id("searchLead")).sendKeys("Minor KYC");

		Thread.sleep(5000);
		List<WebElement> autosearvh = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearvh) {

			if (suggect.getText().equalsIgnoreCase("Minor KYC Test(minortest@gmail.com)")) {
				Thread.sleep(4000);
				suggect.click();

				break;
			}

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[8]/input"))
				.click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.linkText("PUNCH"));
		list.get(0).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"updatePunchsubmit\"]/div/div/div/div/div[2]/button[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();

	}

	public void addInsurance() throws InterruptedException {
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.id("INS")));
		WebElement search = driver.findElement(By.id("assetClient")); // Thread.sleep(5000);
		search.sendKeys("Test DGS");

		Thread.sleep(5000);
		List<WebElement> mfoffline1 = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement mfsuggect1 : mfoffline1) {

			if (mfsuggect1.getText().equalsIgnoreCase("Mahadev Test DGS(mahadev3@fincart.com)")) {
				Thread.sleep(4000);
				mfsuggect1.click();

				break;
			}

		}

		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(),'SAVE & NEXT')]")).click();
		// Form

		// This will scroll the page till the element is found

		// jse.executeScript("scroll(0, 850);");
		Thread.sleep(4000);
		WebElement down = driver.findElement(By.id("insurance_Frequency"));
		Thread.sleep(8000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollTop = arguments[1];", driver.findElement(By.id("remarks")), 800);
		// driver.findElement(By.id("step2_id")).sendKeys(Keys.PAGE_DOWN);
		WebElement insuComp = driver.findElement(By.id("ins_Partner"));
		Select selectInsu = new Select(insuComp);

		selectInsu.selectByVisibleText("TATA AIA Life Insurance Co. Ltd.");

		Thread.sleep(3000);
		WebElement insType = driver.findElement(By.id("assetName"));
		Select ins = new Select(insType);

		ins.selectByVisibleText("Term Insurance");
		Thread.sleep(3000);
		WebElement policyname = driver.findElement(By.id("policy_Name"));
		Select policy = new Select(policyname);

		policy.selectByVisibleText("Tata AIA Life Insurance Sampoorna Raksha Plus");
		WebElement reNewType = driver.findElement(By.id("renewalType"));
		Select reNew = new Select(reNewType);

		reNew.selectByVisibleText("New");
		driver.findElement(By.id("start_Date")).sendKeys("01-01-2016");
		driver.findElement(By.id("policy_Issue_Date")).sendKeys("01-05-2017");
		driver.findElement(By.id("premium")).sendKeys("68900");
		Thread.sleep(3000);
		WebElement closeMode = driver.findElement(By.id("close_Mode"));
		Select mode = new Select(closeMode);

		mode.selectByVisibleText("Online Mode - Net Banking");
		Thread.sleep(3000);
		WebElement Element = driver.findElement(By.id("remarks"));
		js.executeScript("arguments[0].scrollTop = arguments[1];", driver.findElement(By.id("remarks")), 900);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		WebElement insFreq = driver.findElement(By.id("insurance_Frequency"));
		Select Freq = new Select(insFreq);
		Freq.selectByVisibleText("Yearly");

		Thread.sleep(3000);
		WebElement insstatus = driver.findElement(By.id("Status"));
		Select status = new Select(insstatus);
		Thread.sleep(3000);

		status.selectByVisibleText("Active");
		driver.findElement(By.id("sum_Assured")).sendKeys("51000");
		driver.findElement(By.id("policy_Term")).sendKeys("15");
		driver.findElement(By.id("pP_Term")).sendKeys("25000");
		Thread.sleep(3000);
		WebElement puchase = driver.findElement(By.id("purchasedBy"));
		Select puchased = new Select(puchase);

		puchased.selectByVisibleText("Policy Bazaar");
		driver.findElement(By.id("maturity_Date")).sendKeys("01-05-2025");
		driver.findElement(By.id("nominee")).sendKeys("Vivek");
		driver.findElement(By.id("txnNo")).sendKeys("52043091267");
		driver.findElement(By.id("revenue")).sendKeys("18");
		driver.findElement(By.id("applicationId")).sendKeys("235455");

		driver.findElement(By.id("remarks")).sendKeys("Anshuman Singh Tester");
		WebElement uploadElement = driver.findElement(By.id("selectedInsFiles"));
		uploadElement.sendKeys("E:\\SeleniumCodeFile\\testPan.png");

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/div[3]/div/div/form/fieldset[2]/div[2]/a[2]"))
				.click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

	public void insurancePunch() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.id("searchLead")).sendKeys("Test DGS");

		Thread.sleep(5000);
		List<WebElement> autosearvh = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearvh) {

			if (suggect.getText().equalsIgnoreCase("Mahadev Test DGS(mahadev3@fincart.com)")) {
				Thread.sleep(4000);
				suggect.click();

				break;
			}

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[8]/input"))
				.click();
		Thread.sleep(3000);
		WebElement assetType = driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[4]/select"));
		Select puchased = new Select(assetType);

		puchased.selectByVisibleText("Insurance");

		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.linkText("PUNCH"));
		list.get(0).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"updatePunchsubmit\"]/div/div/div/div/div[2]/button[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();

	}

	public void addLoan() throws InterruptedException {

		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.id("LNO")));
		WebElement search = driver.findElement(By.id("assetClient"));
		search.sendKeys("test12");

		Thread.sleep(5000);
		List<WebElement> mfoffline = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement mfsuggect : mfoffline) {

			if (mfsuggect.getText().equalsIgnoreCase("Test12jan User (test12jan1@gmail.com)")) {
				Thread.sleep(4000);
				mfsuggect.click();

				break;
			}

		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'SAVE & NEXT')]")).click();
		// Form
		Thread.sleep(3000);
		WebElement loanSch = driver.findElement(By.id("schemeName"));
		Select selectSch = new Select(loanSch);

		selectSch.selectByVisibleText("Hdfc Housing Finance_Aditya");
		Thread.sleep(3000);
		WebElement typeIns = driver.findElement(By.id("transType"));
		Select selectIns = new Select(typeIns);

		selectIns.selectByVisibleText("Home Loan");
		driver.findElement(By.id("trxn_Amount")).sendKeys("7877876");
		Thread.sleep(3000);
		WebElement payMode = driver.findElement(By.id("closeMode"));
		Select selectPay = new Select(payMode);

		selectPay.selectByVisibleText("Online Mode - Net Banking");
		driver.findElement(By.id("start_Date")).sendKeys("07-08-2018");
		driver.findElement(By.id("revenue")).sendKeys("8");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("remarks"));
		js.executeScript("arguments[0].scrollTop = arguments[1];", driver.findElement(By.id("remarks")), 900);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/div[3]/div/div/form/fieldset[2]/div[2]/a[2]"))
				.click();
		Thread.sleep(8000);
		Actions actions1 = new Actions(driver);
		actions1.sendKeys(Keys.TAB);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void loanPunch() throws InterruptedException {
		driver.findElement(By.id("searchLead")).sendKeys("test12");

		Thread.sleep(5000);
		List<WebElement> autosearvh = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearvh) {

			if (suggect.getText().equalsIgnoreCase("Test12jan User (test12jan1@gmail.com)")) {
				Thread.sleep(4000);
				suggect.click();

				break;
			}

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[8]/input"))
				.click();
		Thread.sleep(3000);
		WebElement assetType = driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[4]/select"));
		Select puchased = new Select(assetType);

		puchased.selectByVisibleText("Loan");

		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.linkText("PUNCH"));
		list.get(0).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"updatePunchsubmit\"]/div/div/div/div/div[2]/button[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();

		Thread.sleep(5000);
		driver.navigate().refresh();

	}

	public void addOtherAsset() throws InterruptedException {

		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.id("OTA")));
		WebElement search = driver.findElement(By.id("SearchByEmailAsset"));
		Thread.sleep(3000);
		search.sendKeys("Anshu");

		Thread.sleep(5000);
		List<WebElement> mfoffline = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement mfsuggect : mfoffline) {

			if (mfsuggect.getText().equalsIgnoreCase("Anshu Auto Test(testindivsual05feb224@gmail.com)")) {
				Thread.sleep(4000);
				mfsuggect.click();

				break;
			}

		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'SAVE & NEXT')]")).click();
		// Form
		Thread.sleep(3000);
		WebElement loanSch = driver.findElement(By.id("schemeName"));
		Select selectSch = new Select(loanSch);

		selectSch.selectByVisibleText("Kotak PMS");
		Thread.sleep(3000);
		WebElement typeIns = driver.findElement(By.id("transType"));
		Select selectIns = new Select(typeIns);

		selectIns.selectByVisibleText("PMS");
		driver.findElement(By.id("trxn_Amount")).sendKeys("7877876");
		Thread.sleep(3000);
		WebElement payMode = driver.findElement(By.id("closeMode"));
		Select selectPay = new Select(payMode);

		selectPay.selectByVisibleText("Online Mode - Net Banking");
		driver.findElement(By.id("start_Date")).sendKeys("07-08-2018");
		driver.findElement(By.id("revenue")).sendKeys("8");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("remarks"));
		js.executeScript("arguments[0].scrollTop = arguments[1];", driver.findElement(By.id("remarks")), 900);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/div[3]/div/div/form/fieldset[2]/div[2]/a[2]"))
				.click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

	public void otherAssetPunch() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("searchLead")).sendKeys("test12");

		Thread.sleep(5000);
		List<WebElement> autosearvh = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearvh) {

			if (suggect.getText().equalsIgnoreCase("Test12jan User (test12jan1@gmail.com)")) {
				Thread.sleep(4000);
				suggect.click();

				break;
			}

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[8]/input"))
				.click();
		Thread.sleep(3000);
		WebElement assetType = driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[4]/select"));
		Select puchased = new Select(assetType);

		puchased.selectByVisibleText("Other");

		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.linkText("PUNCH"));
		list.get(0).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"updatePunchsubmit\"]/div/div/div/div/div[2]/button[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
		Thread.sleep(8000);
		driver.navigate().refresh();

	}

	public void feeEntry() throws InterruptedException {

		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.id("FEES")));
		WebElement search = driver.findElement(By.id("assetClient"));
		search.sendKeys("Test26-Sep");

		Thread.sleep(5000);
		List<WebElement> mfoffline = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement mfsuggect : mfoffline) {

			if (mfsuggect.getText().equalsIgnoreCase("Test26-Sep(dubait1123@gmail.com)")) {
				Thread.sleep(4000);
				mfsuggect.click();

				break;
			}

		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'SAVE & NEXT')]")).click();
		// Form
		Thread.sleep(3000);
		WebElement feeAsset = driver.findElement(By.id("assetType_Id"));
		Select selectAsset = new Select(feeAsset);

		selectAsset.selectByVisibleText("Tax Planning");
		Thread.sleep(3000);
		WebElement feeType = driver.findElement(By.id("fee_Type"));
		Select selectfee = new Select(feeType);

		selectfee.selectByVisibleText("New");
		Thread.sleep(3000);
		WebElement payMode = driver.findElement(By.id("close_Mode"));
		Select selectpay = new Select(payMode);

		selectpay.selectByVisibleText("Online Mode - Debit Card");
		driver.findElement(By.id("trxn_No")).sendKeys("54098");
		driver.findElement(By.id("start_Date")).sendKeys("05-02-2021");
		driver.findElement(By.id("end_Date")).sendKeys("05-02-2022");
		driver.findElement(By.id("amount")).sendKeys("8");
		driver.findElement(By.id("revenue")).sendKeys("8");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("remarks"));
		js.executeScript("arguments[0].scrollTop = arguments[1];", driver.findElement(By.id("remarks")), 900);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.id("client_Location")).sendKeys("New Ashok Nagar");
		driver.findElement(By.id("remarks")).sendKeys("Anshuman Automation Fee Test");
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/div[3]/div/div/form/fieldset[2]/div[1]/div[12]/div/input"))
				.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/div[3]/div/div/form/fieldset[2]/div[2]/a[2]"))
				.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'SUBMIT')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/div/div/div[2]/button")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

	public void clickFeeLink() throws InterruptedException {
		driver.findElement(By.id("searchLead")).sendKeys("Test5");

		Thread.sleep(5000);
		List<WebElement> autosearvh = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearvh) {

			if (suggect.getText().equalsIgnoreCase("Test 5 Feb(test5feb21@gmail.com)")) {
				Thread.sleep(4000);
				suggect.click();

				break;
			}

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[8]/input"))
				.click();
		Thread.sleep(3000);
		WebElement assetType = driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[4]/select"));
		Select puchased = new Select(assetType);

		puchased.selectByVisibleText("Fee");

		Thread.sleep(3000);
		driver.findElement(By.linkText("View fee link")).click();
		Thread.sleep(15000);

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}

}
