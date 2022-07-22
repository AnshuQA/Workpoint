package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseTest;

public class Client extends BaseTest {

	public void clientBtn() throws InterruptedException {
		Thread.sleep(20000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

		Thread.sleep(3000);
		driver.get("https://workpoint.fincart.com/clients");
	}

	public void updateBtn() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/span[2]/b[1]"))
				.click();
	}

	public void clientPortFolioBtn() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/span[3]/b[1]"))
				.click();

	}

	public void otherClint() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div[1]/nav/div/a[6]"))
				.click();
	}

	public void threeDOTbtn() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]"))
				.click();
	}

	public void kycFilter() throws InterruptedException {
		Thread.sleep(5000);
		WebElement filterBy = driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/select[1]"));
		Select select1 = new Select(filterBy);

		select1.selectByVisibleText("SIGNATURE");
	}

	public void filterByClientEmailID() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("SearchByName")).click();

		driver.findElement(By.id("searchLead")).sendKeys("john");

		Thread.sleep(5000);
		List<WebElement> autosearvh = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearvh) {

			if (suggect.getText().equalsIgnoreCase("John Due(pan.anshu2017@gmail.com)")) {
				Thread.sleep(4000);
				suggect.click();

				break;
			}

		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"searchFilterSubmit\"]/div[5]/input")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void finacialPlanRecordActivity() throws InterruptedException, AWTException {
		// Record Activity
		Thread.sleep(5000);
		try {
			if (driver.findElement(By.xpath(
					"/html/body/app-root/app-workpoint-layout/div[1]/div/div/div[2]/ng-component/div[2]/div/div/div[2]/div[6]/form/div/div/div/div[3]/input"))
					.isDisplayed()) {
				Thread.sleep(3000);
				WebElement dateBox = driver.findElement(By.id("activityDate"));
				dateBox.sendKeys(Keys.SPACE);
				Thread.sleep(5000);
				dateBox.sendKeys(Keys.ARROW_RIGHT);
				Thread.sleep(3000);
				dateBox.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				WebElement time = driver.findElement(By.id("leadtime"));
				time.sendKeys(Keys.SPACE);
				Thread.sleep(3000);
				time.sendKeys(Keys.DOWN);
				time.sendKeys(Keys.DOWN);

				time.sendKeys(Keys.TAB);
				time.sendKeys(Keys.DOWN);
				time.sendKeys(Keys.DOWN);
				time.sendKeys(Keys.DOWN);
				time.sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				driver.findElement(By.id("recordactivityreason")).sendKeys("This is frist activity");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"recordActivityStatus\"]/div/div/div/div[3]/input")).click();

				Thread.sleep(8000);
				Actions actions1 = new Actions(driver);
				actions1.sendKeys(Keys.TAB);
				actions1.sendKeys(Keys.ENTER);
				actions1.build().perform();

				Thread.sleep(3000);
				driver.navigate().refresh();

			}
		} catch (

		Exception e) {
			Thread.sleep(3000);
			Date dt = new Date();

			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dt);
			calendar.add(Calendar.DATE, 1);
			dt = calendar.getTime();

			String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
			System.out.println(tommorowsDate);
// this buttone may be unique

			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.TAB);
			actions.sendKeys(Keys.TAB);
			actions.sendKeys(Keys.TAB);

			Thread.sleep(5000);
			actions.sendKeys(tommorowsDate);

			Thread.sleep(3000);
			actions.sendKeys(Keys.TAB);
			;
			actions.sendKeys("04:00AM");
			actions.build().perform();
			driver.findElement(By.id("recordactivityreason")).sendKeys("New Automation Client Activity ");
			Thread.sleep(3000);
			driver.findElement(By.id("recordactivitycomment")).sendKeys("Close Automation Client Activity ");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"recordActivityStatus\"]/div/div/div/div[4]/input")).click();
			Thread.sleep(8000);
			Actions actions1 = new Actions(driver);
			actions1.sendKeys(Keys.TAB);
			actions1.sendKeys(Keys.ENTER);
			actions1.build().perform();
			Thread.sleep(5000);
			driver.navigate().refresh();

		}

	}

	public void clientGoals() throws InterruptedException {

// Goal

		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@id=\"nav-home\"]/div[1]/div/div[1]/div/span/div/div/div/a[2]"))
				.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.findElements(By.linkText("Goals")).get(0).click();
		;
		driver.findElement(By.xpath("//a[contains(text(),'Add A GOAL')]")).sendKeys(Keys.PAGE_UP);
// Add Goal
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(),'Add A GOAL')]")).click();
		driver.findElement(By.id("present_Value")).sendKeys("1500000");
		WebElement inflation = driver.findElement(By.id("inflation_Rate"));
		Select select2 = new Select(inflation);

		select2.selectByVisibleText("6%");
		Thread.sleep(3000);
		Date dt = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 0);
		dt = calendar.getTime();

		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		System.out.println(tommorowsDate);

		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.TAB);

		Thread.sleep(3000);
		actions.sendKeys(tommorowsDate);

		actions.sendKeys(Keys.TAB);

		actions.sendKeys("02-02-2031");
		actions.build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"profileupdateBasic\"]/div/div/div[2]/div[8]/div/input[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'CONFIRM & SAVE')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();

// Update Goal
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div/div[2]/ng-component/div[1]/div[2]/div/div/div/table/tbody/tr[1]/td[7]/a[1]/i"))
				.click();
		WebElement pvalue = driver.findElement(By.id("present_Value"));
		Thread.sleep(3000);
		pvalue.clear();
		pvalue.sendKeys("1200000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"profileupdateBasic\"]/div/div/div[2]/div[8]/div/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'CONFIRM & UPDATE')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();

// Delete Goal

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/table/tbody/tr[1]/td[7]/a[2]/i"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"deletePopup\"]/div/div/div/div/div[2]/button[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
		Thread.sleep(8000);
		driver.navigate().back();

	}

	public void cafDownload() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"nav-home\"]/div[1]/div/div[1]/div/span/div/div/div/a[2]"))
				.sendKeys(Keys.PAGE_DOWN);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"nav-home\"]/div/div/div[1]/div/span/div/div/div/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/a[1]/i[1]/img[1]")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
		driver.navigate().refresh();
	}

	public void transactionMF() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-mutualfund-tab\"]")).click();
		Thread.sleep(50000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		driver.navigate().back();

	}

	public void liquiLoan() throws InterruptedException {
		// Page up
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[contains(text(),'Show Details')]")).sendKeys(Keys.PAGE_UP);
		// LiquiLoan Page
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Show Details')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Show Dashboard')]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[contains(text(),'Show Live Investments')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Show Passbook')]")).click();

	}

	public void pms() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("PMS")).click();
	}

	public void insurance() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.linkText("Insurance")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("dob")).sendKeys("04/27/1962");
		driver.findElement(By.xpath("//button[contains(text(),'Show Policy Details')]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[1]/button[1]"))
				.click();
	}

	public void reportRealizedGain() throws InterruptedException {

		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Report')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Realized Gain")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("report_from_date")).sendKeys("01-01-2015");
		Thread.sleep(5000);
		driver.findElement(By.id("report_to_date")).click();
		driver.findElement(By.id("report_to_date")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("report_to_date")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/form/div/div[3]/div/input"))
				.click();
		Thread.sleep(20000);

		driver.navigate().refresh();
	}

	public void reportUnRealizedGain() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Report')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Un-Realized Gain")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("report_from_date")).sendKeys("01-01-2015");
		Thread.sleep(5000);
		driver.findElement(By.id("report_to_date")).click();
		driver.findElement(By.id("report_to_date")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("report_to_date")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"DownloadrEportId\"]/div/div[3]/div/input")).click();

		Thread.sleep(20000);

		driver.navigate().refresh();
	}

	public void schemeWiseGain() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Report')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Scheme Wise Gain")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("report_from_date")).sendKeys("01-01-2015");
		driver.findElement(By.id("report_to_date")).click();
		driver.findElement(By.id("report_to_date")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("report_to_date")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/form/div/div[3]/div/input"))
				.click();
		Thread.sleep(20000);

		driver.navigate().refresh();
	}

	public void reportPortFolioSum() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Report')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Portfolio Sum")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("report_from_date")).sendKeys("01-01-2015");
		driver.findElement(By.id("report_to_date")).click();
		driver.findElement(By.id("report_to_date")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("report_to_date")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/form/div/div[3]/div/input"))
				.click();
		Thread.sleep(20000);

		driver.navigate().refresh();
	}

	public void dashBoardRedirect() throws InterruptedException {
		driver.findElement(By.linkText("Go To Dashboard")).click();
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));

	}

	public void refarall() throws InterruptedException, AWTException {
		driver.findElement(By.linkText("View Referral Link")).click();
		Thread.sleep(3000);
		WebElement copy1 = driver.findElement(By.xpath("//button[contains(text(),'Copy Link')]"));
		copy1.click();
		Robot robot = new Robot();
		// Opening new tab
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Pasting the copied content to the address bar
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Clicking enter after pasting the url in browser address bar
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		driver.close();
		driver.switchTo().window(tabs1.get(0));
	}

	public void viewTicket() throws InterruptedException {
		driver.findElement(By.linkText("View Tickets")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();

	}

	public void viewMember() throws InterruptedException {

		driver.findElement(By.linkText("View Members")).click();
		Thread.sleep(5000);
		driver.navigate().back();
	}

	public void sipMandate() throws InterruptedException {
		driver.findElement(By.linkText("SIP Mandate's")).click();
		Thread.sleep(5000);
		// Add new mandate
		Thread.sleep(5000);
		WebElement filterBy1 = driver.findElement(By.id("manDateType"));
		Select select01 = new Select(filterBy1);
		Thread.sleep(5000);
		select01.selectByVisibleText("New Physical Mandate");
		driver.findElement(By.xpath("//*[@id=\"fin-select-invester-id\"]/div[4]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mandatePopup\"]/div/div/div[3]/button[1]")).click();
		Thread.sleep(15000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

		// Download physical mandate
		Thread.sleep(10000);
		driver.findElement(By.linkText("Download")).click();
		// with sign
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Download With Signature')]")).click();

		// without sign
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[contains(text(),'Download Without Signature')]")).click();

		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"downloadMandatePopup\"]/div/div/div[1]/button")).click();

		// Update Sign
		Thread.sleep(25000);
		driver.findElement(By.linkText("Update Signature")).click();

		WebElement sign = driver.findElement(By.xpath("//input[@id='selectedClientSignFiles']"));
		sign.sendKeys("E:\\SeleniumCodeFile\\sign.jpg");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'UPDATE')]")).click();

		// View Sign

		Thread.sleep(25000);
		driver.findElement(By.xpath("//*[@id=\"fin-select-invester-id\"]/div[5]/div[2]/table/tbody/tr[1]/td[1]/a"))
				.click();
		Thread.sleep(5000);
		/*
		 * ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 * driver.switchTo().window(tabs.get(1)); driver.close();
		 * driver.switchTo().window(tabs.get(0));
		 */

		// Delete Mandate
		Thread.sleep(5000);

		driver.findElement(By.linkText("DELETE")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"deleteMandatePopup\"]/div/div/div/div/div[2]/button[1]")).click();
		Thread.sleep(15000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
		// close popup
		Thread.sleep(25000);
		driver.findElement(By.xpath("//*[@id=\"mandatePopup\"]/div/div/div[1]/button")).click();
	}

	public void investmentAccount() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Investment Account")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD INVESTMENT ACCOUNT')]")).click();

		// add Joint account
		Thread.sleep(5000);
		WebElement filterBy1 = driver.findElement(By.id("holdingMode"));
		Select select01 = new Select(filterBy1);
		Thread.sleep(8000);
		select01.selectByVisibleText("Joint");
		WebElement filterBy02 = driver.findElement(By.id("SecondApplBasicId"));
		Select select02 = new Select(filterBy02);
		Thread.sleep(5000);
		select02.selectByVisibleText("Anshuman");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'SUBMIT')]")).click();
		Thread.sleep(15000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

// Delete investment account
		Thread.sleep(5000);
		driver.findElement(By.linkText("DELETE")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"deleteInvesterAccountPopup\"]/div/div/div/div/div[2]/button[1]"))
				.click();

		Thread.sleep(8000);
		Actions actions1 = new Actions(driver);
		actions1.sendKeys(Keys.TAB);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"investmentAccountPopup\"]/div/div/div[1]/button")).click();
	}

	/*
	 * public void liquiloan() throws InterruptedException { Thread.sleep(10000);
	 * driver.findElement(By.xpath(
	 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/span[3]/div/div/button"
	 * )).click(); Thread.sleep(5000);
	 * driver.findElement(By.linkText("Liquiloan's")).click(); Thread.sleep(5000);
	 * driver.findElement(By.xpath(
	 * "//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[12]/div[1]/div[1]/div[1]/button[1]"
	 * )).click(); }
	 */
	public void clientPortFolio() throws InterruptedException {
		Thread.sleep(40000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		Thread.sleep(5000);
		driver.findElement(By.id("searchByNameMobile")).sendKeys("SANJAY SHRIVASTAVA");
		Thread.sleep(5000);
		List<WebElement> autosearchName = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearchName) {

			if (suggect.getText().equalsIgnoreCase("SANJAY SHRIVASTAVA(Sanjay.shrivastava2704@gmail.com)")) {
				suggect.click();

				break;
			}

		}
		Thread.sleep(5000);
		String name = "SANJAY SHRIVASTAVA(Sanjay.shrivastava2704@gmail.com)";
		String bodyName = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyName.contains(name));

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Go to page')]")).click();

	}

}
