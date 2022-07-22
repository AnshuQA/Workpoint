package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import utilities.DataUtil;

public class AddLeads extends BaseTest {

	public void addNewLeadsbtn() throws InterruptedException {

		Thread.sleep(6000);
		WebElement productcategories = driver.findElement(By.xpath("//a[contains(text(),'+ ADD A LEAD')]"));

		SoftAssert asert = new SoftAssert();
		asert.assertEquals(productcategories.getText(), "+ ADD A LEAD");
		asert.assertAll();
		Thread.sleep(6000);
		productcategories.click();
	}

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void addLreadDirectReg(String leadName, String leadMobilenumber, String leadEmail)
			throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys(leadName);
		Thread.sleep(3000);
		driver.findElement(By.id("mobile")).sendKeys(leadMobilenumber);
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(leadEmail);
		Thread.sleep(3000);
		WebElement campaign = driver.findElement(By.id("campaign"));
		Select select = new Select(campaign);
		select.selectByVisibleText("Direct Registration");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/div/form/div/div/div[3]/div[6]/div/input[2]"))
				.click();
		Thread.sleep(8000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

	}

}
