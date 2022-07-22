package testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Client;
import pages.Dashboard;
import pages.LoginPage;

public class ClientTest extends BaseTest {
	public static Dashboard dashboard = new Dashboard();
	public static Client client = new Client();
	public static LoginPage lp = new LoginPage();

	@Test(priority = 1, groups = "high")
	public void testFilterByClientEmailID() throws InterruptedException {

		client.clientBtn();
		client.filterByClientEmailID();
	}

	@Test(priority = 2)
	public void activityTest() throws InterruptedException, AWTException {
		client.otherClint();
		client.updateBtn();
		client.finacialPlanRecordActivity();

	}

	@Test(priority = 3)
	public void clientGoalTest() throws InterruptedException {
		client.otherClint();
		client.clientGoals();

	}

	@Test(priority = 4)
	public void clientCAFdownload() throws InterruptedException {
		lp.signOut();
		lp.tanwirSirid();
		client.clientPortFolio();
		client.cafDownload();

	}

	@Test(priority = 5)
	public void testClientPortFolio() throws InterruptedException {

		client.clientPortFolioBtn();
		client.liquiLoan();
		client.pms();
		client.insurance();
		client.transactionMF();

	}

	@Test(priority = 6)
	public void gainReport() throws InterruptedException {
		client.reportRealizedGain();
		client.reportUnRealizedGain();
		client.schemeWiseGain();
		client.reportPortFolioSum();

	}

	@Test(priority = 7)
	public void dashBoardRedirect() throws InterruptedException {
		client.threeDOTbtn();
		client.dashBoardRedirect();

	}

	@Test(priority = 8)
	public void refarall() throws InterruptedException, AWTException {

		client.threeDOTbtn();
		client.refarall();

	}

	@Test(priority = 9)
	public void viewTicket() throws InterruptedException {

		client.threeDOTbtn();
		client.viewTicket();

	}

	/*
	 * @Test(priority = 10) public void sipMandateTest() throws InterruptedException
	 * { lp.signOut(); lp.rmLogin(); dashboard.leftSlidBtn(); client.clientBtn();
	 * client.otherClint(); client.kycFilter(); client.threeDOTbtn();
	 * client.sipMandate();
	 * 
	 * }
	 * 
	 * @Test(priority = 11) public void investMentAcc() throws InterruptedException
	 * { client.kycFilter(); client.threeDOTbtn(); client.investmentAccount(); }
	 */
}
