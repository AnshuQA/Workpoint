package rough;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadTrackingR {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 */

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://workpoint.fincart.com/");
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
		driver.get("https://workpoint.fincart.com/lead");

//Filter by Date
		Thread.sleep(15000);
		WebElement teamMem = driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		Select select = new Select(teamMem);
		select.selectByVisibleText("By Date");

//Primary Filter By Name
		// searchByname

		/*
		 * driver.findElement(By.id("searchLead")).sendKeys("Kewal Sharma");
		 * 
		 * Thread.sleep(5000); List<WebElement>
		 * autosearvh=driver.findElements(By.className("ui-menu-item-wrapper"));
		 * 
		 * for(WebElement suggect : autosearvh) {
		 * 
		 * if(suggect.getText().
		 * equalsIgnoreCase("Kewal Sharma Test(test22junweb@gmail.com)")){
		 * Thread.sleep(4000); suggect.click();
		 * 
		 * break; }
		 * 
		 * }
		 * 
		 * Thread.sleep(4000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div[2]/form/div[7]/input"
		 * )).click(); Thread.sleep(5000); String email= "test22junweb@gmail.com";
		 * String bodyemail = driver.findElement(By.tagName("body")).getText();
		 * 
		 * Assert.assertTrue(bodyemail.contains(email)); Thread.sleep(5000);
		 * driver.navigate().refresh();
		 */

//Primary Filter By date
		/*
		 * Thread.sleep(8000); driver.findElement(By.id("from_Date")).click();
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//body/div[@id='ui-datepicker-div']/div[1]/a[1]/span[1]")).click();
		 * Thread.sleep(3000); driver.findElement(By.linkText("1")).click();
		 * Thread.sleep(3000); driver.findElement(By.id("to_Date")).click();
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//body/div[@id='ui-datepicker-div']/div[1]/a[1]/span[1]")).click();
		 * Thread.sleep(3000); driver.findElement(By.linkText("30")).click();
		 * Thread.sleep(4000); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div[2]/form/div[7]/input"
		 * )).click(); Thread.sleep(5000); driver.navigate().refresh();
		 */

//Primary Lead Filter By Team Member
		/*
		 * Thread.sleep(5000); WebElement teamMem=driver.findElement(By.xpath(
		 * "//*[@id=\"searchFilterSubmit\"]/div[5]/select")); Select select = new
		 * Select(teamMem);
		 * 
		 * select.selectByVisibleText("testentry1"); Thread.sleep(5000);
		 * driver.navigate().refresh();
		 */
//Primary Lead Filter By Sub Brokar
		/*
		 * Thread.sleep(5000); WebElement subBrokar=driver.findElement(By.xpath(
		 * "//*[@id=\"searchFilterSubmit\"]/div[6]/select")); Select selectSub = new
		 * Select(subBrokar);
		 * 
		 * selectSub.selectByVisibleText("Anshuman Test Sub Broker");
		 * Thread.sleep(5000); driver.navigate().refresh();
		 */
//*******************************************************************************************************************************************************************

// CAF download
		/*
		 * WebElement filterBy=driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[3]/div/div/div/div[2]/div/div[1]/div[2]/div/div/select"
		 * )); Select select1 = new Select(filterBy);
		 * 
		 * select1.selectByVisibleText("CAF"); Thread.sleep(5000);
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div/span/div/div/div/a[1]"
		 * )).click(); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//tbody/tr[2]/td[2]/a[1]/i[1]/img[1]")).click();
		 * Thread.sleep(15000);
		 * driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
		 */

//****************************************************************************************************************************************

// Goal
		Thread.sleep(8000);
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

}
