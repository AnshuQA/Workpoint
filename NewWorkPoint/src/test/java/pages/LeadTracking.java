package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseTest;

public class LeadTracking extends BaseTest {
	public void leadTrackingbtn() throws InterruptedException {
		Thread.sleep(8000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

		Thread.sleep(10000);
		driver.get("https://workpoint.fincart.com/lead");

	}

	public void sortBy() throws InterruptedException {
		Thread.sleep(8000);
		WebElement teamMem = driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		Select select = new Select(teamMem);
		select.selectByVisibleText("By Date");

	}

	public void searchByName() throws InterruptedException {
		driver.findElement(By.id("searchLead")).sendKeys("Test indivisual08jun21");

		Thread.sleep(5000);
		List<WebElement> autosearvh = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearvh) {

			if (suggect.getText().equalsIgnoreCase("Test indivisual08jun21(testindivisual14sep21@gmail.com)")) {
				Thread.sleep(4000);
				suggect.click();

				break;
			}

		}

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"searchFilterSubmit\"]/div[6]/input")).click();
		Thread.sleep(5000);
		String email = "testindivisual14sep21@gmail.com";
		String bodyemail = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyemail.contains(email));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void searchByDate() throws InterruptedException {

		Thread.sleep(8000);
		driver.findElement(By.id("from_Date")).sendKeys("01/01/2019");

		Thread.sleep(3000);
		WebElement todate = driver.findElement(By.id("to_Date"));
		todate.click();
		todate.sendKeys(Keys.SPACE);
		todate.sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		driver.navigate().refresh();

	}

	public void filterByTeamMember() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[5]/a[1]"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[21]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(10000);

		WebElement list = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/h2[1]"));
		String itemsCount = list.getText();
		System.out.println("Total primary Leads " + itemsCount);
		WebElement list01 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[1]"));
		String itemsCount01 = list01.getText();
		System.out.println("Total Assign leads " + itemsCount01);
		WebElement list02 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[2]"));
		String itemsCount02 = list02.getText();
		System.out.println("Total fellowup " + itemsCount02);
		WebElement list03 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[3]"));
		String itemsCount03 = list03.getText();
		System.out.println("Total Inprocess :  " + itemsCount03);
		WebElement list04 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[4]"));
		String itemsCount04 = list04.getText();
		System.out.println("Total On Hold :  " + itemsCount04);
		WebElement list05 = driver.findElement(By.xpath("//a[@id='Junk Leads']"));
		String itemsCount05 = list05.getText();
		System.out.println("Total Junk leads :  " + itemsCount05);

	}

	public void filterBySubBroker() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[5]/a[1]"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[21]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]"))
				.click();
		Thread.sleep(10000);
		System.out.println("SubBroker Leads");
		WebElement list = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/h2[1]"));
		String itemsCount = list.getText();
		System.out.println("Total primary Leads " + itemsCount);
		WebElement list01 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[1]"));
		String itemsCount01 = list01.getText();
		System.out.println("Total Assign leads " + itemsCount01);
		WebElement list02 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[2]"));
		String itemsCount02 = list02.getText();
		System.out.println("Total fellowup " + itemsCount02);
		WebElement list03 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[3]"));
		String itemsCount03 = list03.getText();
		System.out.println("Total Inprocess :  " + itemsCount03);
		WebElement list04 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[4]"));
		String itemsCount04 = list04.getText();
		System.out.println("Total On Hold :  " + itemsCount04);
		WebElement list05 = driver.findElement(By.xpath("//a[@id='Junk Leads']"));
		String itemsCount05 = list05.getText();
		System.out.println("Total Junk leads :  " + itemsCount05);
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
