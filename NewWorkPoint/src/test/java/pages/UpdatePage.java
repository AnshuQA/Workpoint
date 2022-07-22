package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class UpdatePage extends BaseTest {
	public void updateButton() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
	}

}
