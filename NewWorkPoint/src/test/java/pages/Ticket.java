package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseTest;

public class Ticket extends BaseTest {

	public void raiseATicketBtn() throws InterruptedException {
		Thread.sleep(8000);
		driver.get("https://workpoint.fincart.com/raise-a-ticket");
	}

	public void raiseTktSameDept() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'RAISE A TICKET')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("AssignToName")).sendKeys("Test");
		Thread.sleep(5000);
		List<WebElement> autosearvh = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect : autosearvh) {

			if (suggect.getText().equalsIgnoreCase("testentry1")) {
				suggect.click();

				break;
			}

		}
		Thread.sleep(3000);
		WebElement campaig = driver.findElement(By.id("priority"));
		Select select1 = new Select(campaig);
		select1.selectByVisibleText("Medium");
		Thread.sleep(3000);
		WebElement campaign = driver.findElement(By.id("subject"));
		Select select = new Select(campaign);

		select.selectByVisibleText("HDFC ULIP & TERM MODIFICATION");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[4]/div/div/div/div[2]/div/button"))
				.click();

		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[5]/ckeditor[1]/div[2]/div[2]/div[1]/p[1]"))
				.sendKeys("This Ticket only testing ");
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.id("radio-1")));

		Thread.sleep(3000);
		driver.findElement(By.id("radio-1")).sendKeys(Keys.PAGE_DOWN);
		// driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/div[1]/input[1]")).click();

		driver.findElement(By.id("client_name")).sendKeys("test");
		Thread.sleep(5000);
		List<WebElement> autosearvh1 = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect1 : autosearvh1) {

			if (suggect1.getText().equalsIgnoreCase("John Test")) {
				Thread.sleep(5000);
				suggect1.click();

				break;
			}

		}
		WebElement uploadElement = driver.findElement(By.id("selectFilesFin"));
		uploadElement.sendKeys("E:\\SeleniumCodeFile\\testPan.png");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/div/form/div/div/div[2]/div[10]/div/input[2]"))
				.click();
		Thread.sleep(12000);
		Actions actions1 = new Actions(driver);
		actions1.sendKeys(Keys.TAB);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
	}

	public void raiseTktOtherDept() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'RAISE A TICKET')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/span[2]/input[1]"))
				.click();
		Thread.sleep(3000);
		WebElement campaig2 = driver.findElement(By.id("department_name"));
		Select select2 = new Select(campaig2);
		select2.selectByVisibleText("IT");

		Thread.sleep(3000);
		WebElement campaign = driver.findElement(By.id("subject"));
		Select select = new Select(campaign);

		select.selectByVisibleText("Investment Not Showing");
		Thread.sleep(3000);
		WebElement priority = driver.findElement(By.id("priority"));
		Select high = new Select(priority);
		high.selectByVisibleText("Low");
		Thread.sleep(3000);
		WebElement campaign1 = driver.findElement(By.id("Ticket_Category_Id"));
		Select select1 = new Select(campaign1);
		select1.selectByVisibleText("CAF");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"subjectSubPointPopup\"]/div/div/div/div[2]/div/button")).click();

		driver.findElement(By.xpath("//*[@id=\"message\"]/div[2]/div[2]/div")).sendKeys("This Ticket only testing ");
		Thread.sleep(5000);
		driver.findElement(By.id("radio-1")).sendKeys(Keys.ENTER);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("radio-1"))).click().perform();

		((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.id("radio-1")));

		Thread.sleep(3000);
		driver.findElement(By.id("radio-1")).sendKeys(Keys.PAGE_DOWN);
		// driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/div[1]/input[1]")).click();

		driver.findElement(By.id("client_name")).sendKeys("test");
		Thread.sleep(5000);
		List<WebElement> autosearvh1 = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement suggect1 : autosearvh1) {

			if (suggect1.getText().equalsIgnoreCase("John Test")) {
				suggect1.click();

				break;
			}

		}
		WebElement uploadElement = driver.findElement(By.id("selectFilesFin"));
		uploadElement.sendKeys("E:\\SeleniumCodeFile\\testPan.png");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[1]/div/form/div/div/div[2]/div[11]/div/input[2]"))
				.click();
		Thread.sleep(12000);
		Actions actions1 = new Actions(driver);
		actions1.sendKeys(Keys.TAB);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
	}

	public void sameDeptTktComment() throws InterruptedException {

		// Add Comment
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[1]/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[1]/a"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Comment\"]/div[2]/div[2]/div"))
				.sendKeys("this is only automation ticket testing purpose");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"commentTicketId\"]/div[3]/button")).click();

//compare
		Thread.sleep(3000);
		String text = "this is only automation ticket testing purpose";
		String bodyText = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText.contains(text));
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"ticketViewDetail\"]/div/div/div[1]/button")).click();
	}

	public void otherDeptTktComment() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();
		Thread.sleep(3000);
		WebElement deptD = driver.findElement(By.id("prefixDep"));
		Select it = new Select(deptD);

		it.selectByVisibleText("IT");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ckeditor[1]/div[2]/div[2]/div[1]"))
				.sendKeys("this is only automation ticket testing purpose");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]"))
				.click();

//compare
		Thread.sleep(3000);
		String text = "this is only automation ticket testing purpose";
		String bodyText = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText.contains(text));
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[9]/div[1]/div[1]/div[1]/button[1]"))
				.click();
	}

	public void ticketReopenSameDept() throws InterruptedException {
		Thread.sleep(5000);
		WebElement closed = driver.findElement(By.id("status"));
		Select selectd = new Select(closed);

		selectd.selectByVisibleText("CLOSE");
		Thread.sleep(3000);
		driver.findElement(By.id("dropdownMenuButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"countDownTickets\"]/tr[1]/td[9]/div/div/a[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reasonToOpen")).sendKeys("I have Reopen Ticket only Automation Testing purpose");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div[1]/div[2]/ng-component/div[7]/div/div/div/div[2]/button[2]"))
				.click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/div/div/div[2]/button")).click();

	}

	public void ticketReopenOtherDept() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();
		Thread.sleep(3000);
		WebElement deptD = driver.findElement(By.id("prefixDep"));
		Select it = new Select(deptD);

		it.selectByVisibleText("IT");
		Thread.sleep(3000);
		WebElement closed = driver.findElement(By.id("status"));
		Select selectd = new Select(closed);
		selectd.selectByVisibleText("CLOSE");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/a[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("reasonToOpen")).sendKeys("I have Reopen Ticket only Automation Testing purpose");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[7]/div[1]/div[1]/div[1]/div[2]/button[2]"))
				.click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//body/app-root[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();

	}

	public void tatSameDep() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("nav-home-tab")).click();
		Thread.sleep(3000);
		WebElement deptD = driver.findElement(By.id("status"));
		Select it = new Select(deptD);

		it.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		driver.findElement(By.id("dropdownMenuButton")).click();
		driver.findElement(By.xpath("//*[@id=\"countDownTickets\"]/tr[1]/td[9]/div/div/a[1]")).click();
		Thread.sleep(3000);
		WebElement dateBox = driver.findElement(By.id("tatDate"));
		dateBox.sendKeys(Keys.SPACE);
		Thread.sleep(5000);
		dateBox.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(3000);
		dateBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"TATTicketSubmit\"]/div/div/div[2]/div[2]/div/button[1]")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();
	}

	public void closeTicketSameDept() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("nav-home-tab")).click();
		Thread.sleep(3000);
		WebElement campaig2 = driver.findElement(By.id("status"));
		Select select2 = new Select(campaig2);
		select2.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.id("dropdownMenuButton"));
		list.get(0).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"countDownTickets\"]/tr[1]/td[9]/div/div/a[1]")).click();
		driver.findElement(By.id("reasonToOpen")).sendKeys("This is only TEsting Automation ticket");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div/div[2]/ng-component/div[7]/div/div/div/div[2]/button[2]"))
				.click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/div/div/div[2]/button")).click();
	}

	public void itAssignTicketBtn() throws InterruptedException {
		Thread.sleep(8000);
		driver.get("https://workpoint.fincart.com/raise-a-ticket");
	}

	public void itAssignEmpTicket() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nav-home-tab")).click();
		Thread.sleep(3000);
		WebElement Low = driver.findElement(By.id("priority"));
		Select select6 = new Select(Low);

		select6.selectByVisibleText("Low");
		Thread.sleep(3000);
		WebElement status = driver.findElement(By.id("status"));
		Select select06 = new Select(status);

		select06.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/i[1]")).click();

		driver.findElement(By.linkText("RE-ASSIGN")).click();
		WebElement search = driver.findElement(By.id("AssignToName"));
		search.sendKeys("viv");
		Thread.sleep(5000);
		search.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(5000);
		List<WebElement> mfoffline = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement mfsuggect : mfoffline) {

			if (mfsuggect.getText().equalsIgnoreCase("Test Virtual Opertor")) {
				Thread.sleep(4000);
				mfsuggect.click();

				break;
			}

		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"reAssignTicketId\"]/div[2]/div/button[1]")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"changesubmit\"]/div/div/div/div/div[2]/button")).click();

	}

	public void tatITdept() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nav-home-tab")).click();
		Thread.sleep(3000);
		WebElement status = driver.findElement(By.id("status"));
		Select OPEN = new Select(status);
		OPEN.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		WebElement Low = driver.findElement(By.id("priority"));
		Select select6 = new Select(Low);
		select6.selectByVisibleText("Low");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.id("dropdownMenuButton"));
		list.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("TAT")).click();

		Thread.sleep(3000);
		WebElement dateBox = driver.findElement(By.id("tatDate"));

		dateBox.sendKeys(Keys.SPACE);
		Thread.sleep(5000);
		dateBox.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(3000);
		dateBox.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-workpoint-layout/div[1]/div/div/div[2]/ng-component/div[6]/div/div/div[2]/div[2]/div/button[1]"))
				.click();
		Thread.sleep(12000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

	}

	public void closeTicketITdept() throws InterruptedException {
		/*
		 * Thread.sleep(3000); WebElement status=driver.findElement(By.id("status"));
		 * Select select06 = new Select(status);
		 * 
		 * select06.selectByVisibleText("OPEN");
		 */
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.id("dropdownMenuButton"));
		list.get(0).click();

		Thread.sleep(3000);
		driver.findElement(By.linkText("CLOSE TICKET")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("reasonToOpen")).sendKeys("This is only TEsting Automation ticket");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"reOpenTicketSubmit\"]/div/div/div/div[2]/button[2]")).click();

		Thread.sleep(12000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

	}

	public void reOpenTicketITdept() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();
		Thread.sleep(3000);
		WebElement deptD = driver.findElement(By.id("prefixDep"));
		Select it = new Select(deptD);

		it.selectByVisibleText("IT");
		WebElement deptE = driver.findElement(By.id("status"));
		Select status = new Select(deptE);

		status.selectByVisibleText("CLOSE");

		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.id("dropdownMenuButton"));
		list.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"countDownTickets\"]/tr[1]/td[9]/div/div/a[1]")).click();
		driver.findElement(By.id("reasonToOpen")).sendKeys("This is only TEsting Automation ticket");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[7]/div[1]/div[1]/div[1]/div[2]/button[2]"))
				.click();
		Thread.sleep(12000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

	}

	public void filterSameDept() throws InterruptedException {
		Thread.sleep(3000);
		WebElement copy1 = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/a[1]"));
		copy1.sendKeys(Keys.CONTROL);
		copy1.sendKeys("a");
		copy1.sendKeys(Keys.CONTROL);
		copy1.sendKeys("c");

		Thread.sleep(3000);
		driver.findElement(By.id("ticketId")).sendKeys("SL02061");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[10]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text = "SL02061";
		String bodyText = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText.contains(text));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterSameDeptStatusOpen() throws InterruptedException {
		Thread.sleep(3000);
		WebElement open = driver.findElement(By.id("status"));
		Select select = new Select(open);

		select.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text1 = "Open";
		String bodyText1 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText1.contains(text1));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterSameDeptStatusClose() throws InterruptedException {

		Thread.sleep(3000);
		WebElement close = driver.findElement(By.id("status"));
		Select select1 = new Select(close);

		select1.selectByVisibleText("CLOSE");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text2 = "Close";
		String bodyText2 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText2.contains(text2));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterSameDeptStatusReopne() throws InterruptedException {

		Thread.sleep(3000);
		WebElement reopen = driver.findElement(By.id("status"));
		Select select3 = new Select(reopen);

		select3.selectByVisibleText("REOPEN");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text3 = "ReOpen";
		String bodyText3 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText3.contains(text3));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterBysameDeptHighPriority() throws InterruptedException {

		Thread.sleep(3000);
		WebElement high = driver.findElement(By.id("priority"));
		Select select4 = new Select(high);

		select4.selectByVisibleText("High");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text4 = "High";
		String bodyText4 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText4.contains(text4));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterBysameDeptMediumPriority() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Medium = driver.findElement(By.id("priority"));
		Select select5 = new Select(Medium);

		select5.selectByVisibleText("Medium");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text5 = "Medium";
		String bodyText5 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText5.contains(text5));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterBysameDeptLowPriority() throws InterruptedException {

		Thread.sleep(3000);
		WebElement Low = driver.findElement(By.id("priority"));
		Select select6 = new Select(Low);

		select6.selectByVisibleText("Low");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text6 = "Low";
		String bodyText6 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText6.contains(text6));
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

	public void filterBySameDeptStatusOpenPriorityHigh() throws InterruptedException {
		Thread.sleep(3000);
		WebElement open = driver.findElement(By.id("status"));
		Select select = new Select(open);

		select.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		WebElement high = driver.findElement(By.id("priority"));
		Select select4 = new Select(high);

		select4.selectByVisibleText("High");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text4 = "High";
		String bodyText4 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText4.contains(text4));
		// compare
		Thread.sleep(3000);
		String text1 = "Open";
		String bodyText1 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText1.contains(text1));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterBySameDeptStatusOpenPriorityMedium() throws InterruptedException {
		Thread.sleep(3000);
		WebElement opena = driver.findElement(By.id("status"));
		Select selecta = new Select(opena);

		selecta.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		WebElement Medium = driver.findElement(By.id("priority"));
		Select select5 = new Select(Medium);

		select5.selectByVisibleText("Medium");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String texta = "High";
		String bodyTexta = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue(bodyTexta.contains(texta));
		// compare
		Thread.sleep(3000);
		String text5 = "Medium";
		String bodyText5 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText5.contains(text5));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterBySameDeptStatusOpenPriorityLow() throws InterruptedException {

		Thread.sleep(3000);
		WebElement openb = driver.findElement(By.id("status"));
		Select selectb = new Select(openb);

		selectb.selectByVisibleText("OPEN");
		Thread.sleep(3000);
		WebElement Low = driver.findElement(By.id("priority"));
		Select select6 = new Select(Low);

		select6.selectByVisibleText("Low");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text6 = "Low";
		String bodyText6 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText6.contains(text6));
		Thread.sleep(5000);
		driver.navigate().refresh();
		// compare
		Thread.sleep(3000);
		String textb = "High";
		String bodyTextb = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyTextb.contains(textb));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterBySameDeptStatusClosePriorityHigh() throws InterruptedException {
		Thread.sleep(3000);
		WebElement close = driver.findElement(By.id("status"));
		Select select1 = new Select(close);

		select1.selectByVisibleText("CLOSE");
		Thread.sleep(3000);
		WebElement high = driver.findElement(By.id("priority"));
		Select select4 = new Select(high);

		select4.selectByVisibleText("High");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();

		// compare
		Thread.sleep(3000);
		String textd = "High";
		String bodyTextd = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyTextd.contains(textd));
		// compare
		Thread.sleep(3000);
		String texte = "CLOSE";
		String bodyTexte = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyTexte.contains(texte));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterBySameDeptStatusClosePriorityMedium() throws InterruptedException {
		Thread.sleep(3000);
		WebElement closec = driver.findElement(By.id("status"));
		Select selectc = new Select(closec);

		selectc.selectByVisibleText("CLOSE");
		Thread.sleep(3000);
		WebElement Medium = driver.findElement(By.id("priority"));
		Select select5 = new Select(Medium);

		select5.selectByVisibleText("Medium");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text5 = "Medium";
		String bodyText5 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText5.contains(text5));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterBySameDeptStatusClosePriorityLow() throws InterruptedException {

		Thread.sleep(3000);
		WebElement closed = driver.findElement(By.id("status"));
		Select selectd = new Select(closed);

		selectd.selectByVisibleText("CLOSE");
		Thread.sleep(3000);
		WebElement Low = driver.findElement(By.id("priority"));
		Select select6 = new Select(Low);

		select6.selectByVisibleText("Low");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text6 = "Low";
		String bodyText6 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText6.contains(text6));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterBySameDeptStatusReopenPriorityHigh() throws InterruptedException {
		Thread.sleep(3000);
		WebElement reopen = driver.findElement(By.id("status"));
		Select select3 = new Select(reopen);

		select3.selectByVisibleText("REOPEN");
		Thread.sleep(3000);
		WebElement higha = driver.findElement(By.id("priority"));
		Select select44 = new Select(higha);

		select44.selectByVisibleText("High");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[5]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text4 = "High";
		String bodyText4 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText4.contains(text4));
		Thread.sleep(3000);
		String text3 = "ReOpen";
		String bodyText3 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText3.contains(text3));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterSearchByDeptIT() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();

//Dept wise IT
		Thread.sleep(3000);
		WebElement deptD = driver.findElement(By.id("prefixDep"));
		Select it = new Select(deptD);

		it.selectByVisibleText("IT");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]"))
				.click();
		Thread.sleep(3000);
		String itComp = "IT01";
		String bodyit = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyit.contains(itComp));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterSearchByDeptAccount() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();
		Thread.sleep(3000);
		WebElement deptAcco = driver.findElement(By.id("prefixDep"));
		Select Acco = new Select(deptAcco);

		Acco.selectByVisibleText("Accounts");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]"))
				.click();
		Thread.sleep(3000);
		String AccoComp = "AC00";
		String bodyAcco = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyAcco.contains(AccoComp));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterSearchByDeptOperation() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();
		Thread.sleep(3000);
		WebElement deptOP = driver.findElement(By.id("prefixDep"));
		Select opp = new Select(deptOP);

		opp.selectByVisibleText("Operation");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div/div[2]/ng-component/div[1]/div[2]/form/div/div/div[2]/div[11]/input"))
				.click();
		Thread.sleep(3000);
		String oppComp = "OP01";
		String bodyop = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyop.contains(oppComp));
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

	public void filterSearchByDeptHR() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();
		Thread.sleep(3000);
		WebElement deptHR = driver.findElement(By.id("prefixDep"));
		Select hr = new Select(deptHR);

		hr.selectByVisibleText("HR");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]"))
				.click();
		Thread.sleep(3000);
		String hrComp = "HR00";
		String bodyhr = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyhr.contains(hrComp));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterByITdeptStatusOpenPriorityHigh() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.id("deptOtherFlag")).click();

		Thread.sleep(3000);
		WebElement deptD = driver.findElement(By.id("prefixDep"));
		Select it = new Select(deptD);

		it.selectByVisibleText("IT");

		Thread.sleep(3000);
		WebElement open = driver.findElement(By.id("status"));
		Select select = new Select(open);

		select.selectByVisibleText("OPEN");

		Thread.sleep(3000);
		WebElement high = driver.findElement(By.id("priority"));
		Select select4 = new Select(high);

		select4.selectByVisibleText("High");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[11]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text1 = "Open";
		String bodyText1 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText1.contains(text1));

		Thread.sleep(3000);
		String itComp = "IT0";
		String bodyit = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyit.contains(itComp));
		// compare
		Thread.sleep(3000);
		String text4 = "High";
		String bodyText4 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText4.contains(text4));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterByITdeptStatusOpenPriorityMedium() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();

		Thread.sleep(3000);
		WebElement deptD1 = driver.findElement(By.id("prefixDep"));
		Select it1 = new Select(deptD1);

		it1.selectByVisibleText("IT");

		Thread.sleep(3000);
		WebElement open1 = driver.findElement(By.id("status"));
		Select select1 = new Select(open1);

		select1.selectByVisibleText("OPEN");

		Thread.sleep(3000);
		WebElement high1 = driver.findElement(By.id("priority"));
		Select select11 = new Select(high1);

		select11.selectByVisibleText("Medium");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[11]/input[1]"))
				.click();
		// compare
		/*
		 * Thread.sleep(3000); String text11= "Open"; String bodyText11 =
		 * driver.findElement(By.tagName("body")).getText();
		 * 
		 * Assert.assertTrue(bodyText11.contains(text11));
		 * 
		 * 
		 * Thread.sleep(3000); String itComp1= "IT0"; String bodyit1 =
		 * driver.findElement(By.tagName("body")).getText();
		 * 
		 * Assert.assertTrue(bodyit1.contains(itComp1)); //compare Thread.sleep(3000);
		 * String text41= "Medium"; String bodyText41 =
		 * driver.findElement(By.tagName("body")).getText();
		 * 
		 * Assert.assertTrue(bodyText41.contains(text41));
		 */
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

	public void filterByITdeptStatusOpenPriorityLow() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();

		Thread.sleep(3000);
		WebElement deptD2 = driver.findElement(By.id("prefixDep"));
		Select it2 = new Select(deptD2);

		it2.selectByVisibleText("IT");

		Thread.sleep(3000);
		WebElement open2 = driver.findElement(By.id("status"));
		Select select2 = new Select(open2);

		select2.selectByVisibleText("OPEN");

		Thread.sleep(3000);
		WebElement high2 = driver.findElement(By.id("priority"));
		Select select12 = new Select(high2);

		select12.selectByVisibleText("Low");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text12 = "Open";
		String bodyText12 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText12.contains(text12));

		String itComp2 = "IT";
		String bodyit2 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyit2.contains(itComp2));
		// compare
		;
		String text42 = "Low";
		String bodyText42 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText42.contains(text42));
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

	public void filterByITdeptStatusClosePriorityHigh() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();

		Thread.sleep(3000);
		WebElement deptD = driver.findElement(By.id("prefixDep"));
		Select it = new Select(deptD);

		it.selectByVisibleText("IT");

		Thread.sleep(3000);
		WebElement open = driver.findElement(By.id("status"));
		Select select = new Select(open);

		select.selectByVisibleText("CLOSE");

		Thread.sleep(3000);
		WebElement high = driver.findElement(By.id("priority"));
		Select select4 = new Select(high);

		select4.selectByVisibleText("High");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text1 = "Close";
		String bodyText1 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText1.contains(text1));

		Thread.sleep(3000);
		String itComp = "IT01";
		String bodyit = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyit.contains(itComp));
		// compare
		Thread.sleep(3000);
		String text4 = "Close";
		String bodyText4 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText4.contains(text4));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void filterByITdeptStatusClosePriorityMedium() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();

		Thread.sleep(3000);
		WebElement deptD1 = driver.findElement(By.id("prefixDep"));
		Select it1 = new Select(deptD1);

		it1.selectByVisibleText("IT");

		Thread.sleep(3000);
		WebElement open1 = driver.findElement(By.id("status"));
		Select select1 = new Select(open1);

		select1.selectByVisibleText("CLOSE");

		Thread.sleep(3000);
		WebElement high1 = driver.findElement(By.id("priority"));
		Select select11 = new Select(high1);

		select11.selectByVisibleText("Medium");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]"))
				.click();
		// compare
		Thread.sleep(3000);
		String text11 = "Close";
		String bodyText11 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText11.contains(text11));

		Thread.sleep(3000);
		String itComp1 = "IT01";
		String bodyit1 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyit1.contains(itComp1));
		// compare
		Thread.sleep(3000);
		String text41 = "Medium";
		String bodyText41 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText41.contains(text41));
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

	public void filterByITdeptStatusClosePriorityLow() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("deptOtherFlag")).click();

		Thread.sleep(3000);
		WebElement deptD2 = driver.findElement(By.id("prefixDep"));
		Select it2 = new Select(deptD2);

		it2.selectByVisibleText("IT");

		Thread.sleep(3000);
		WebElement open2 = driver.findElement(By.id("status"));
		Select select2 = new Select(open2);

		select2.selectByVisibleText("CLOSE");

		Thread.sleep(3000);
		WebElement high2 = driver.findElement(By.id("priority"));
		Select select12 = new Select(high2);

		select12.selectByVisibleText("Low");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div/div[2]/ng-component/div[1]/div[2]/form/div/div/div[2]/div[11]/input"))
				.click();
		// compare
		Thread.sleep(3000);
		String text12 = "Close";
		String bodyText12 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText12.contains(text12));

		String itComp2 = "IT";
		String bodyit2 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyit2.contains(itComp2));
		// compare
		;
		String text42 = "Low";
		String bodyText42 = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText42.contains(text42));
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
}
