package pages;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseTest;

public class Activity extends BaseTest {

	public void addActivity() throws InterruptedException, AWTException {
//add activity
		Thread.sleep(5000);
		driver.findElement(By.id("record-activity")).click();
		try {
			if (driver.findElement(By.xpath("//*[@id=\"recordActivityStatus\"]/div/div/div/div[3]/input"))

					.isDisplayed()) {

				Thread.sleep(3000);
				List<WebElement> list1 = driver.findElements(By.id("recordActivityStatus"));
				list1.get(0).click();
				driver.findElement(By.xpath("//*[@id=\"recordActivityStatus\"]/option[2]")).click();
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

				Thread.sleep(5000);
				actions.sendKeys(tommorowsDate);

				Thread.sleep(3000);
				actions.sendKeys(Keys.TAB);
				;
				actions.sendKeys("04:00AM");
				actions.build().perform();

				driver.findElement(By.id("recordactivityreason")).sendKeys("I will Call This client in evening");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"recordActivityStatus\"]/div/div/div/div[3]/input")).click();
				Thread.sleep(8000);
				driver.switchTo().activeElement();

				Thread.sleep(8000);
				driver.navigate().refresh();

			}

		} catch (Exception e) {
			Thread.sleep(3000);
			List<WebElement> list1 = driver.findElements(By.id("recordActivityStatus"));
			list1.get(0).click();
			driver.findElement(By.xpath("//*[@id=\"recordActivityStatus\"]/option[2]")).click();
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

			Thread.sleep(5000);
			actions.sendKeys(tommorowsDate);

			Thread.sleep(3000);
			actions.sendKeys(Keys.TAB);

			actions.sendKeys("04:00AM");
			actions.build().perform();

			driver.findElement(By.id("recordactivityreason")).sendKeys("This is first Activity");
			driver.findElement(By.id("activityDate")).click();

			// Actions actions = new Actions(driver);
			actions.sendKeys(Keys.TAB);

			Thread.sleep(5000);

			driver.findElement(By.id("recordactivitycomment")).sendKeys("This last activity");
			driver.findElement(By.xpath("//*[@id=\"recordActivityStatus\"]/div/div/div/div[4]/input")).click();
			Thread.sleep(8000);
			Actions actions1 = new Actions(driver);
			actions1.sendKeys(Keys.TAB);
			actions1.sendKeys(Keys.ENTER);
			actions1.build().perform();

			Thread.sleep(3000);
			driver.navigate().refresh();

		}
	}

}
