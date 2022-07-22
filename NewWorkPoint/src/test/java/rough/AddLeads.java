package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddLeads {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://103.139.58.87:8094/login");
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
		driver.get("http://103.139.58.87:8094/lead");
//Add Lead Button
		Thread.sleep(8000);
		WebElement productcategories = driver.findElement(By.xpath("//a[contains(text(),'+ ADD A LEAD')]"));

		SoftAssert asert = new SoftAssert();
		asert.assertEquals(productcategories.getText(), "+ ADD A LEAD");
		asert.assertAll();
		Thread.sleep(6000);
		productcategories.click();
		Thread.sleep(3000);
//Direct Registration		

		driver.findElement(By.id("name")).sendKeys("Test 15 Jan ");
		Thread.sleep(3000);
		driver.findElement(By.id("mobile")).sendKeys("9210000009");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("test12apr22@gmail.com");
		Thread.sleep(3000);
		WebElement campaign = driver.findElement(By.id("campaign"));
		Select select = new Select(campaign);
		select.selectByVisibleText("Direct Registration");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"profileupdateBasic\"]/div/div/div[3]/div[6]/div/input[2]")).click();

		Thread.sleep(8000);
		Actions actions1 = new Actions(driver);
		actions1.sendKeys(Keys.TAB);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();

//Email Marketing			
		/*
		 * driver.findElement(By.id("name")).sendKeys("Test Email Marketing User ");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("mobile")).sendKeys("9210000009");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("email")).sendKeys("test15janemail@gmail.com");
		 * Thread.sleep(3000); WebElement
		 * campaignEmail=driver.findElement(By.id("campaign")); Select select1 = new
		 * Select(campaignEmail); select1.selectByVisibleText("Email Marketing");
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[7]/div[1]/input[2]"
		 * )).click(); Thread.sleep(8000); driver.findElement(By.xpath(
		 * "//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/strong[1]"
		 * )).click();
		 */

//Facebook
		/*
		 * driver.findElement(By.id("name")).sendKeys("Test Email Marketing User ");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("mobile")).sendKeys("9212000009");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("email")).sendKeys("test15janfacebook@gmail.com");
		 * Thread.sleep(3000); WebElement
		 * campaignEmail=driver.findElement(By.id("campaign")); Select select1 = new
		 * Select(campaignEmail); select1.selectByVisibleText("FaceBook");
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[7]/div[1]/input[2]"
		 * )).click(); Thread.sleep(8000); driver.findElement(By.xpath(
		 * "//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
		 */

//Sub-broker		
		/*
		 * driver.findElement(By.id("name")).sendKeys("Test SubBroker ");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("mobile")).sendKeys("9210520009");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("email")).sendKeys("test15jansubbroker1@gmail.com");
		 * Thread.sleep(3000); WebElement
		 * campaign=driver.findElement(By.id("campaign")); Select select = new
		 * Select(campaign); select.selectByVisibleText("Direct Registration");
		 * 
		 * Thread.sleep(3000); WebElement campaign1=driver.findElement(By.xpath(
		 * "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[6]/select[1]"
		 * )); Select select1 = new Select(campaign1);
		 * select1.selectByVisibleText("Anshuman Test Sub Broker");
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[7]/div[1]/input[2]"
		 * )).click(); Thread.sleep(8000); driver.findElement(By.xpath(
		 * "//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
		 */

//Reffrall
		/*
		 * driver.findElement(By.id("name")).sendKeys("Test SubBroker ");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("mobile")).sendKeys("9210526009");
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("email")).sendKeys("test15janreffral1@gmail.com");
		 * Thread.sleep(3000); WebElement
		 * campaign=driver.findElement(By.id("campaign")); Select select = new
		 * Select(campaign); select.selectByVisibleText("Referral"); Thread.sleep(3000);
		 * driver.findElement(By.id("referring_Client_Email")).sendKeys("Test Mail");
		 * //driver.findElement(By.xpath("//input[@id='AssignToName']")).sendKeys("ank")
		 * ;
		 * 
		 * Thread.sleep(5000); List<WebElement>
		 * autosearvh=driver.findElements(By.className("ui-menu-item-wrapper"));
		 * 
		 * for(WebElement suggect : autosearvh) {
		 * 
		 * if(suggect.getText().
		 * equalsIgnoreCase("Test Mail TO Secondary (Testmail191@gmail.com)")){
		 * suggect.click();
		 * 
		 * break; }
		 * 
		 * }
		 * 
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[8]/div[1]/input[2]"
		 * )).click(); Thread.sleep(8000); driver.findElement(By.xpath(
		 * "//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
		 */

//******************************************************************************************************************************************************

//Member

		// Add Member
		/*
		 * Thread.sleep(3000); driver.findElement(By.id("SecondaryLead")).click();
		 * driver.findElement(By.id("rmName")).sendKeys("Minor KYC Test");
		 * 
		 * Thread.sleep(5000); List<WebElement>
		 * autosearvh=driver.findElements(By.className("ui-menu-item-wrapper"));
		 * 
		 * for(WebElement suggect : autosearvh) {
		 * 
		 * if(suggect.getText().equalsIgnoreCase("Minor KYC Test (minortest@gmail.com)")
		 * ){ suggect.click();
		 * 
		 * break; }
		 * 
		 * } driver.findElement(By.id("name")).sendKeys("test auto member");
		 * driver.findElement(By.id("email")).sendKeys("testautomember@gmail.com");
		 * driver.findElement(By.id("mobile")).sendKeys("1100000090");
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[2]"
		 * )).click(); Thread.sleep(12000); driver.findElement(By.xpath(
		 * "//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
		 */
	}

}
