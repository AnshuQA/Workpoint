package testCases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddLeads;
import pages.Dashboard;
import pages.KYCandCaF;
import pages.LeadTracking;
import utilities.DataUtil;

public class KycCafWorkpointTest extends BaseTest {
	public static KYCandCaF kyc = new KYCandCaF();
	public static LeadTracking leadracking = new LeadTracking();
	public static AddLeads addlead = new AddLeads();
	public static Dashboard dashboard = new Dashboard();

	@Test(priority = 1, dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void indivisualKYCTest(String leadName, String leadMobilenumber, String leadEmail, String pannumber)
			throws InterruptedException, AWTException {

		leadracking.leadTrackingbtn();

		addlead.addNewLeadsbtn();
		addlead.addLreadDirectReg(leadName, leadMobilenumber, leadEmail);

		kyc.updateBtn();
		kyc.indivisualKYC(pannumber);

	}

	@Test(priority = 2, dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void nriKYCTest(String leadName, String leadMobilenumber, String leadEmail, String pannumber)
			throws InterruptedException {
		leadracking.leadTrackingbtn();
		Thread.sleep(10000);

		addlead.addNewLeadsbtn();
		addlead.addLreadDirectReg(leadName, leadMobilenumber, leadEmail);
		kyc.updateBtn();
		kyc.nriKYC(pannumber);

	}

	@Test(priority = 3, dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void minorKYCTest(String leadName, String leadMobilenumber, String leadEmail, String pannumber)
			throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'+ ADD A LEAD')]")).sendKeys(Keys.PAGE_UP);
		addlead.addNewLeadsbtn();
		addlead.addLreadDirectReg(leadName, leadMobilenumber, leadEmail);
		kyc.updateBtn();
		kyc.minorKYC(pannumber);

	}

	@Test(priority = 4, dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void hufKYCTest(String leadName, String leadMobilenumber, String leadEmail, String pannumber)
			throws InterruptedException {
		leadracking.leadTrackingbtn();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'+ ADD A LEAD')]")).sendKeys(Keys.PAGE_UP);
		addlead.addNewLeadsbtn();
		addlead.addLreadDirectReg(leadName, leadMobilenumber, leadEmail);
		kyc.updateBtn();
		kyc.hufKYC(pannumber);

	}

}
