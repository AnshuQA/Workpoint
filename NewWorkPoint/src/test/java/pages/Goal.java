package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;

public class Goal extends BaseTest {

	public void goalButton() throws InterruptedException {

		Thread.sleep(15000);
		driver.findElements(By.linkText("Goals")).get(0).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add A GOAL')]")).sendKeys(Keys.PAGE_UP);
	}

	public void addGoal() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Add A GOAL')]")).click();
		driver.findElement(By.id("present_Value")).sendKeys("1500000");
		WebElement inflation = driver.findElement(By.id("inflation_Rate"));
		Select select2 = new Select(inflation);

		select2.selectByVisibleText("6%");
		Thread.sleep(4000);
		WebElement fdate = driver.findElement(By.id("startDate"));
		fdate.click();
		fdate.sendKeys("02-02-2021");
		driver.findElement(By.id("endDate")).sendKeys("02-02-2031");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"profileupdateBasic\"]/div/div/div[2]/div[8]/div/input[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'CONFIRM & SAVE')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
	}

	public void updateGoal() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div/div[2]/ng-component/div[1]/div[2]/div/div/div/table/tbody/tr[1]/td[7]/a[1]/i"))
				.click();
		WebElement pvalue = driver.findElement(By.id("present_Value"));
		pvalue.clear();
		pvalue.sendKeys("1200000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"profileupdateBasic\"]/div/div/div[2]/div[8]/div/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'CONFIRM & UPDATE')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();

	}

	public void deleteGoal() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/table/tbody/tr[1]/td[7]/a[2]/i"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"deletePopup\"]/div/div/div/div/div[2]/button[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
	}

	public void checkGoalWebsite() {

	}

}
