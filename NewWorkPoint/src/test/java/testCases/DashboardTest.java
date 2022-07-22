package testCases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Dashboard;
import pages.LoginPage;

public class DashboardTest extends BaseTest {
	public static Dashboard dashboard = new Dashboard();
	public static LoginPage lp = new LoginPage();

	@Test(priority = 1)
	public void globalSearchByName() throws InterruptedException {
		lp.tanwirSirid();
		dashboard.marketingPopUp();
		dashboard.globalSearchByNameLeads();

	}

	@Test(priority = 2)
	public void globalSearchByEamild() throws InterruptedException {
		dashboard.globalSearchByEmailLeads();

	}

	@Test(priority = 3)
	public void globalSearchByPhone() throws InterruptedException {
		dashboard.globalSearchByMobile();

	}

	@Test(priority = 4)
	public void allNotification() throws InterruptedException {
		lp.signOut();
		lp.rmLogin();
		dashboard.notification();

	}

	@Test(priority = 5)
	public void assignTask() throws InterruptedException {
		dashboard.task();

	}
}