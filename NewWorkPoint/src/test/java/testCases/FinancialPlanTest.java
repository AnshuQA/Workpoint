package testCases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Dashboard;
import pages.FinancialPlan;
import pages.LeadTracking;

public class FinancialPlanTest extends BaseTest{
	public static Dashboard dashboard = new Dashboard();
	public static LeadTracking leadTracking = new LeadTracking();
	public static FinancialPlan fp = new FinancialPlan();
	
	@Test(priority=1)
	public void addNewFinancialPlan() throws InterruptedException {
		leadTracking.leadTrackingbtn();
		fp.financialPlanBtn();
		
	}
	@Test(priority=2)
	public void basicDetailsTest() throws InterruptedException {
		fp.basicDetails();
	}
	@Test(priority=3)
	public void fpGoalAddTest() throws InterruptedException {
		fp.fpGoalAdd();
	}
	@Test(priority=4)
	public void incomeTest() throws InterruptedException {
		fp.income();
	}
	@Test(priority=5)
	public void netAssetEntryTest() throws InterruptedException {
		fp.netAssetEntryBtn();
		fp.mfOffline();
		fp.addInsurance();
		fp.otherAsset();
		fp.loan();
		
	}
	@Test(priority=6)
	public void expenceTest() throws InterruptedException {
		fp.expence();
	}
	@Test(priority=7)
	public void netAllocationTest() throws InterruptedException {
		fp.netAllocation();
	}
	@Test(priority=8)
	public void netCashFlowAllocationTest() throws InterruptedException {
		fp.netCashFlowAllocation();
	}
	@Test(priority=9)
	public void genrateFincincialPlanTest() throws InterruptedException {
		fp.genrateFincincialPlan();
	}
	@Test(priority=10)
	public void summeryViewTest() throws InterruptedException {
		fp.summeryView();
	}
	@Test(priority=11)
	public void viewFincialPlanTest() throws InterruptedException {
		fp.viewFincialPlan();
	}
	@Test(priority=12)
	public void executePlanTest() throws InterruptedException {
		fp.executePlan();
	}
	
	
}
