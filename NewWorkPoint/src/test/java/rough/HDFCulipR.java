package rough;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HDFCulipR {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://workpoint.fincart.com/login");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
				.sendKeys("testentry@fincart.com");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
				.sendKeys("fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(8000);
		driver.get("https://workpoint.fincart.com/lead");
//Update Button
		Thread.sleep(6000);
		WebElement teamMem = driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		Select select = new Select(teamMem);
		select.selectByVisibleText("By Date");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[contains(text(),'Portfolio')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='nav-insurance-tab']")).click();
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).isDisplayed()) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
		}
		Thread.sleep(3000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		// Thread.sleep(3000);
		WebElement Partner = driver.findElement(By.id("Partner_Search"));
		Select select1 = new Select(Partner);
		select1.selectByVisibleText("HDFC Standard Life Insurance Co. Ltd.");
		WebElement Policy = driver.findElement(By.id("AssetName_Search"));
		Select select2 = new Select(Policy);
		select2.selectByVisibleText("ULIP");
		WebElement product = driver.findElement(By.id("Product_Search"));
		Select select3 = new Select(product);
		select3.selectByVisibleText("HDFC Click 2 Invest");
		driver.findElement(By.id("btnStart")).click();
//1.Basic Details		
		Thread.sleep(3000);
		driver.findElement(By.id("PAN")).sendKeys("TNEPT3738x");
		WebElement name = driver.findElement(By.id("Name"));
		name.clear();
		Thread.sleep(3000);
		name.sendKeys("Test User");
		driver.findElement(By.id("DOB")).click();
		for (int i = 1; i < 27; i++) {
			driver.findElement(By.xpath(
					"//a[@class='dtp-select-year-before']//i[@class='material-icons'][normalize-space()='chevron_left']"))
					.click();
		}
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button[4]")).click();
		driver.findElement(By.id("FatherName")).sendKeys("Test Father");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
//2.Mode
		// MySelf
		Thread.sleep(3000);
		driver.findElement(By.id("btnMyself")).click();
		WebElement Occupation = driver.findElement(By.id("Occupation"));
		Select select4 = new Select(Occupation);
		select4.selectByVisibleText("Salaried");
		Thread.sleep(3000);
		driver.findElement(By.id("State")).sendKeys("uttar");
		Thread.sleep(3000);
		List<WebElement> autosearvh = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearvh) {

			if (suggect.getText().equalsIgnoreCase("Uttar Pradesh")) {
				suggect.click();

				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("City")).sendKeys("kanp");
		Thread.sleep(3000);
		List<WebElement> city = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : city) {

			if (suggect.getText().equalsIgnoreCase("Kanpur")) {
				suggect.click();

				break;
			}
		}
		driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
//3.Investment
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.id("Gender_stage3"));
		Select male = new Select(gender);
		male.selectByVisibleText("Male");
		WebElement time = driver.findElement(By.id("Investment_duration"));
		Select select5 = new Select(time);
		select5.selectByVisibleText("for 10 years");
		driver.findElement(By.id("Invst_Amt")).sendKeys("20000");
		WebElement frequency = driver.findElement(By.id("frequency"));
		Select month = new Select(frequency);
		month.selectByVisibleText("Per month");
		driver.findElement(By.id("policyterm_year")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"steps-uid-0\"]/div[3]/ul/li[2]/a")).click();
//4.Rider
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"steps-uid-0\"]/div[3]/ul/li[2]/a")).click();
//5.Fund allocation
		Thread.sleep(3000);
		WebElement risk = driver.findElement(By.id("RiskTolerance_AmountCntrlMode"));
		Select select6 = new Select(risk);
		select6.selectByVisibleText("Maximising Gains");
		Thread.sleep(3000);
		WebElement investe = driver.findElement(By.id("RiskTolerance_Mrkt_Fluct"));
		Select select7 = new Select(investe);
		select7.selectByVisibleText("Keep Invested");
		driver.findElement(By.id("fund_Alloc_6__Percentage")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\"steps-uid-0\"]/div[3]/ul/li[2]/a")).click();
//6.Finilize	
		Thread.sleep(3000);
		driver.findElement(By.id("AcceptDeclaration")).click();
		driver.findElement(By.xpath("//*[@id=\"steps-uid-0\"]/div[3]/ul/li[3]/a")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();

//Send client email id
		Thread.sleep(8000);

		WebElement email = driver.findElement(By.id("Fee_Sent_Email"));
		email.clear();
		Thread.sleep(3000);
		email.sendKeys("anshuman@fincart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"Main_Content_Quotation\"]/div[3]/div[2]/div/div[2]/div/div/div/section/div[2]/div[2]/div[2]/a"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Popup_Send_Paymentlink\"]/div/div/div[2]/div/div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[7]/div[7]/div/button")).click();
	}

}
