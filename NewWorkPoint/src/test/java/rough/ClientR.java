package rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClientR {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		/*
		 * WebDriverManager.firefoxdriver().setup(); WebDriver driver = new
		 * FirefoxDriver();
		 */

		driver.get("http://103.139.58.87:8094");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
				.sendKeys("testentry@fincart.com");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
				.sendKeys("fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(20000);
		driver.get("http://103.139.58.87:8094/clients");

//Filter by Client Email Id

		/*
		 * driver.findElement(By.id("searchLead")).sendKeys("pan.anshu2017@gmail.com");
		 * 
		 * Thread.sleep(5000); List<WebElement>
		 * autosearvh=driver.findElements(By.className("ui-menu-item-wrapper"));
		 * 
		 * for(WebElement suggect : autosearvh) {
		 * 
		 * if(suggect.getText().equalsIgnoreCase("John Due(pan.anshu2017@gmail.com)")){
		 * Thread.sleep(4000); suggect.click();
		 * 
		 * break; }
		 * 
		 * } Thread.sleep(4000);
		 * driver.findElement(By.xpath("//*[@id=\"searchFilterSubmit\"]/div[5]/input")).
		 * click(); Thread.sleep(5000); driver.navigate().refresh();
		 */

//***********************************************************************************************************
//Other Button
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div[1]/nav/div/a[6]"))
				.click();

//Update

		//
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/span[2]/b[1]"))
				.click();

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

//	***********************************************************************************************

//Transaction (Mutual Fund)
//Other Button
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div[1]/nav/div/a[6]"))
				.click();
//Client PortFolio Button
		Thread.sleep(6000);
		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/span[3]/b[1]"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"nav-mutualfund-tab\"]")).click();
		Thread.sleep(50000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		driver.navigate().back();

		// Insurance

		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/span[3]/div/div/button"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-home\"]/div[2]/div/div[2]/div/span[3]/div/div/div/a[2]")).click();
		Thread.sleep(20000);

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		driver.navigate().refresh();

//******************************************************************************************************************

		// Report Realized Gain

		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/span[4]/div/div/button"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/span[4]/div/div/div/a[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.id("report_from_date")).sendKeys("01-01-2015");
		Thread.sleep(5000);
		driver.findElement(By.id("report_to_date")).sendKeys("01-31-2021");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/form/div/div[3]/div/input"))
				.click();
		Thread.sleep(20000);

		ArrayList<String> tabs001 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs001.get(1));
		driver.close();
		driver.switchTo().window(tabs001.get(0));
		driver.navigate().refresh();

		// UnRealized Gain

		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/span[4]/div/div/button"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/span[4]/div/div/div/a[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.id("report_from_date")).sendKeys("01-01-2015");

		driver.findElement(By.id("report_to_date")).sendKeys("01-31-2021");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"DownloadrEportId\"]/div/div[3]/div/input")).click();

		Thread.sleep(20000);

		ArrayList<String> tabs20 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs20.get(1));
		driver.close();
		driver.switchTo().window(tabs20.get(0));
		driver.navigate().refresh();

		// Scheme Wise Gain

		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/span[4]/div/div/button"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/span[4]/div/div/div/a[3]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.id("report_from_date")).sendKeys("01-01-2015");

		driver.findElement(By.id("report_to_date")).sendKeys("01-31-2021");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/form/div/div[3]/div/input"))
				.click();
		Thread.sleep(20000);
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
		driver.close();
		driver.switchTo().window(tabs3.get(0));
		driver.navigate().refresh();

		// PortFolio Sum
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/span[4]/div/div/button"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/span[4]/div/div/div/a[4]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.id("report_from_date")).sendKeys("01-01-2015");

		driver.findElement(By.id("report_to_date")).sendKeys("01-31-2021");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[3]/div/div/div[2]/form/div/div[3]/div/input"))
				.click();
		Thread.sleep(20000);
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(1));
		driver.close();
		driver.switchTo().window(tabs4.get(0));
		driver.navigate().refresh();

//*****************************************************************************************************************************************		

//Go To Dashboard Button

		// Three Dots button
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div/button"))
				.click();

//Dashboard Redirect

		driver.findElement(By.linkText("Go To Dashboard")).click();
		Thread.sleep(50000);
		ArrayList<String> tabs009 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs009.get(1));
		driver.close();
		driver.switchTo().window(tabs009.get(0));

		// Three Dots button

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[1]"))
				.click();

//Refrerall

		driver.findElement(By.linkText("View Referral Link")).click();
		Thread.sleep(3000);
		WebElement copy1 = driver.findElement(By.xpath("//button[contains(text(),'Copy Link')]"));
		copy1.click();
		Robot robot = new Robot(); // Opening new tab
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

//View Ticket
		/*
		 * driver.findElement(By.linkText("View Tickets")).click(); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		 */

		// View Member

		Thread.sleep(5000);
		WebElement filterBy = driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]"));
		Select select1 = new Select(filterBy);

		select1.selectByVisibleText("KYC"); // Three Dots button Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div/button"))
				.click();
		driver.findElement(By.linkText("View Members")).click();
		Thread.sleep(5000);
		driver.navigate().back();

// SIP Mandates

		Thread.sleep(5000);
		WebElement filterBy009 = driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]"));
		Select select01 = new Select(filterBy009);
		select01.selectByVisibleText("KYC"); // Three Dots button Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div/button"))
				.click();
		driver.findElement(By.linkText("SIP Mandate's")).click();
		Thread.sleep(5000); // Add new mandate
		Thread.sleep(5000);
		WebElement filterBy1 = driver.findElement(By.id("manDateType"));
		Select select009 = new Select(filterBy1);
		Thread.sleep(5000);
		select009.selectByVisibleText("New Physical Mandate");
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[17]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mandatePopup\"]/div/div/div[3]/button[1]")).click();
		Thread.sleep(15000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

		// Download physical mandate Thread.sleep(10000);
		driver.findElement(By.linkText("Download")).click(); // with sign
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Download With Signature')]")).click();

		// without sign
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[contains(text(),'Download Without Signature')]")).click();

		Thread.sleep(20000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[21]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		// Update Sign Thread.sleep(25000);
		driver.findElement(By.linkText("Update Signature")).click();

		WebElement sign = driver.findElement(By.xpath("//input[@id='selectedClientSignFiles']"));
		sign.sendKeys("D:\\AutomationDocument\\sign.jpeg");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'UPDATE')]")).click();
		Thread.sleep(20000);

		// View Sign

		Thread.sleep(25000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[16]/div/div/div[2]/div/div[4]/div[2]/table/tbody/tr[1]/td[1]/a"))
				.click();
		Thread.sleep(5000);
		ArrayList<String> tabs008 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs008.get(1));
		driver.close();
		driver.switchTo().window(tabs008.get(0));

		// Delete Mandate

		Thread.sleep(5000);
		driver.findElement(By.linkText("DELETE")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"))
				.click();
		Thread.sleep(12000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"))
				.click();

		// close popup
		Thread.sleep(25000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[16]/div[1]/div[1]/div[1]/button[1]"))
				.click();

//**************************************************************************************************************************************

		// Investment Account Thread.sleep(5000);
		driver.findElement(By.linkText("Investment Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD INVESTMENT ACCOUNT')]")).click();

		// add Joint account Thread.sleep(5000); WebElement
		filterBy1 = driver.findElement(By.id("holdingMode"));
		Select select66 = new Select(filterBy1);
		Thread.sleep(8000);
		select66.selectByVisibleText("Joint");
		WebElement filterBy02 = driver.findElement(By.id("SecondApplBasicId"));
		Select select02 = new Select(filterBy02);
		Thread.sleep(5000);
		select02.selectByVisibleText("Anshuman");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'SUBMIT')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"))
				.click();

		// Delete manadte Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[4]/td[7]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[24]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[17]/div[1]/div[1]/div[1]/button[1]"))
				.click();

//*************************************************************************************************
//LiquiLoan
		/*
		 * Thread.sleep(5000); driver.findElement(By.linkText("Liquiloan's")).click();
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[12]/div[1]/div[1]/div[1]/button[1]"
		 * )).click();
		 */

	}

}
