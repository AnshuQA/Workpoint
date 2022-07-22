package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.BaseTest;

public class Dashboard extends BaseTest {

	public void globalSearchByNameLeads() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("searchByNameMobile")).sendKeys("mudra");
		Thread.sleep(3000);
		List<WebElement> autosearchName = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearchName) {
			Thread.sleep(3000);
			if (suggect.getText().equalsIgnoreCase("Mudra Goel(dayamudra@gmail.com)")) {
				suggect.click();

				break;
			}

		}
		Thread.sleep(5000);
		String name = "Mudra Goel(dayamudra@gmail.com)";
		String bodyName = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyName.contains(name));

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Go to page')]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
	}

	public void globalSearchByEmailLeads() throws InterruptedException {
		Thread.sleep(20000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("searchByNameMobile")).sendKeys("kevsharma.sharma@gmail.com");
		Thread.sleep(5000);
		List<WebElement> autosearchEmail = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearchEmail) {

			if (suggect.getText().equalsIgnoreCase("KEWAL SHARMA(kevsharma.sharma@gmail.com)")) {
				suggect.click();

				break;
			}

		}
		Thread.sleep(5000);
		String email = "KEWAL SHARMA(kevsharma.sharma@gmail.com)";
		String bodyemail = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyemail.contains(email));
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'Go to page')]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
	}

	public void globalSearchByMobile() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.id("searchByNameMobile")).sendKeys("8800433");
		Thread.sleep(5000);
		List<WebElement> autosearchmobile = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearchmobile) {

			if (suggect.getText().equalsIgnoreCase("ANJALI SUSAN BISWAS(anjalibiswas448@gmail.com)")) {
				suggect.click();

				break;
			}

		}
		Thread.sleep(5000);
		String mobile = "ANJALI SUSAN BISWAS(anjalibiswas448@gmail.com)";
		String bodymobile = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodymobile.contains(mobile));

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Go to page')]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
	}

	public void notification() throws InterruptedException {
		Thread.sleep(20000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/img[1]")).click();
		WebElement list = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-homepage-layout[1]/app-header[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/div[1]/h3[1]"));
		String itemsCount = list.getText();
		System.out.println("Total Notication Count is:  " + itemsCount);
		/*
		 * WebElement TxtBoxContent = driver.findElement(By.xpath(
		 * "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/h3[1]"
		 * )); String xyz=TxtBoxContent.getText(); System.out.println(xyz);
		 */

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'Birthday')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h4[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h4[1]/a[1]"))
				.sendKeys(Keys.PAGE_DOWN);
	}

	public void task() throws InterruptedException {
		Thread.sleep(5000);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
		WebElement list1 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-homepage-layout[1]/app-header[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/div[1]/h3[1]"));
		String itemsCount1 = list1.getText();
		System.out.println("Total Task Count is:  " + itemsCount1);

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]"))
				.sendKeys(Keys.PAGE_DOWN);

// Take Action
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]"))
				.click();
		driver.findElement(By.id("navActivityComment")).sendKeys("I want to close this activty");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[2]/form[1]/div[2]/div[1]/input[1]"))
				.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();

	}

	public void leftSlidBtn() throws InterruptedException {
		Thread.sleep(20000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//body/app-root[1]/app-homepage-layout[1]/app-newdashboard[1]/div[1]/a[1]/i[1]"))
				.click();
	}

	public void marketingPopUp() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"remarketingPopup\"]/div/div/div[1]/button")).click();

	}

}
