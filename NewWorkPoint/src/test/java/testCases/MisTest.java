package testCases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Dashboard;
import pages.LoginPage;
import pages.MIS;

public class MisTest extends BaseTest {
	public static MIS mis = new MIS();
	public static Dashboard dashboard = new Dashboard();
	public static LoginPage lp = new LoginPage();

	@Test(priority = 1)
	public void filterTest() throws InterruptedException {

		mis.misAndRevenuBtn();

		// mis.filterByName();
		lp.signOut();
		lp.raviid(); // dashboard.leftSlidBtn();
		mis.misAndRevenuBtn();
		mis.filterByTeamMember();
		mis.filterBySubBroker();
		lp.signOut();
		lp.rmLogin(); // dashboard.leftSlidBtn();
		mis.misAndRevenuBtn();

	}

	@Test(priority = 2)
	public void testMFoffline() throws InterruptedException {
		mis.addAssetBtn();
		mis.addMFOffline();
		mis.mfPunch();

	}

	@Test(priority = 3)
	public void testInsurance() throws InterruptedException {
		mis.addAssetBtn();
		mis.addInsurance();
		mis.insurancePunch();

	}

	@Test(priority = 4)

	public void testLoan() throws InterruptedException {
		mis.addAssetBtn();
		mis.addLoan();
		mis.loanPunch();

	}

	@Test(priority = 5)
	public void testotherAsset() throws InterruptedException {
		mis.addAssetBtn();
		mis.addOtherAsset();
		mis.otherAssetPunch();

	}

	@Test(priority = 6)
	public void testFee() throws InterruptedException {
		mis.addAssetBtn();
		mis.feeEntry();
		mis.clickFeeLink();
	}

}
