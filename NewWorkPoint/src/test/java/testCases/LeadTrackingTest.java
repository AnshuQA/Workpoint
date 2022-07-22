package testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Activity;
import pages.AddLeads;
import pages.Dashboard;
import pages.Goal;
import pages.KYCandCaF;
import pages.LeadTracking;
import pages.LoginPage;
import pages.UpdatePage;

public class LeadTrackingTest extends BaseTest {
	public static LeadTracking leadracking = new LeadTracking();
	public static AddLeads addlead = new AddLeads();
	public static KYCandCaF kyc = new KYCandCaF();
	public static UpdatePage update = new UpdatePage();
	public static Goal goal = new Goal();
	public static Activity activity = new Activity();
	public static LeadTracking leadTrack = new LeadTracking();
	public static Dashboard dashboard = new Dashboard();
	public static LoginPage lp = new LoginPage();

	@Test(priority = 1)
	public void addGoalTest() throws InterruptedException {

		leadTrack.leadTrackingbtn();

		leadTrack.sortBy();
		// goal.goalButton();
		// goal.addGoal();

	}

	@Test(priority = 2)
	public void updateGoalTest() throws InterruptedException {
		/*
		 * goal.updateGoal(); goal.deleteGoal(); driver.navigate().back();
		 */

	}

	@Test(priority = 3)
	public void leadsActivityTest() throws InterruptedException, AWTException {
		update.updateButton();
		activity.addActivity();
	}

	@Test(priority = 4)
	public void emailSearchTest() throws InterruptedException {
		leadTrack.searchByName();
		leadTrack.searchByDate();
		lp.signOut();
		lp.raviid();
		dashboard.leftSlidBtn();
		leadTrack.leadTrackingbtn();
		leadTrack.filterByTeamMember();
		leadTrack.filterBySubBroker();
		lp.signOut();
		lp.rmLogin();
	}

}
