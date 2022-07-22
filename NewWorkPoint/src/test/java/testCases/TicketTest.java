package testCases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Dashboard;
import pages.LoginPage;
import pages.Ticket;

public class TicketTest extends BaseTest {
	public static Ticket ticket = new Ticket();
	public static LoginPage lp = new LoginPage();
	public static Dashboard dashboard = new Dashboard();

	@Test(priority = 1)
	public void sameDepartmentRaiseTicket() throws InterruptedException {

		ticket.raiseATicketBtn();
		ticket.raiseTktSameDept();
		lp.signOut();

	}

	@Test(priority = 2)
	public void ticketTaTSameDept() throws InterruptedException {
		lp.rmLogin1();
		// dashboard.leftSlidBtn();
		ticket.raiseATicketBtn();
		ticket.tatSameDep();
		lp.signOut();
	}

	@Test(priority = 3)
	public void testTicketCommentSameDept() throws InterruptedException {
		lp.rmLogin();
		// dashboard.leftSlidBtn();
		ticket.raiseATicketBtn();
		ticket.sameDeptTktComment();
		lp.signOut();
	}

	@Test(priority = 4)
	public void testCloseTicketSameDept() throws InterruptedException {
		lp.rmLogin1();
		// dashboard.leftSlidBtn();
		ticket.raiseATicketBtn();
		ticket.closeTicketSameDept();
		lp.signOut();

	}

	@Test(priority = 5)
	public void ticketReopenSameDept() throws InterruptedException {
		lp.rmLogin();
		// dashboard.leftSlidBtn();
		ticket.raiseATicketBtn();
		ticket.ticketReopenSameDept();
	}

	@Test(priority = 6)
	public void otherDepartmentTicket() throws InterruptedException {

		ticket.raiseTktOtherDept();
		ticket.raiseTktOtherDept();
		lp.signOut();

	}

	@Test(priority = 7)
	public void assignTicketEmp() throws InterruptedException {
		lp.itAnshu();
		// dashboard.leftSlidBtn();
		ticket.itAssignTicketBtn();
		ticket.itAssignEmpTicket();

	}

	@Test(priority = 8)
	public void ticketTaTitDept() throws InterruptedException {

		ticket.tatITdept();

	}

	@Test(priority = 9)
	public void closeTicketITdept() throws InterruptedException {

		ticket.closeTicketITdept();
		lp.signOut();

	}

	@Test(priority = 10)
	public void reOpenTicketITdept() throws InterruptedException {
		lp.rmLogin();
		// dashboard.leftSlidBtn();
		ticket.raiseATicketBtn();
		ticket.reOpenTicketITdept();

		lp.signOut();

	}

//**********Filter Test**********************

	/*
	 * @Test(priority=11) public void filterSamedept() throws InterruptedException {
	 * lp.rmLogin(); ticket.raiseATicketBtn(); ticket.filterSameDept();
	 * 
	 * 
	 * }
	 * 
	 * @Test(priority=12) public void testfilterSamedeptStatusOpen() throws
	 * InterruptedException { ticket.filterSameDeptStatusOpen();
	 * 
	 * 
	 * }
	 * 
	 * @Test(priority=13) public void testfilterSameDeptStatusClose() throws
	 * InterruptedException { ticket.filterSameDeptStatusClose();
	 * 
	 * }
	 * 
	 * @Test(priority=14) public void filterSameDeptStatusReopne() throws
	 * InterruptedException { ticket.filterSameDeptStatusReopne();
	 * 
	 * }
	 * 
	 * @Test(priority=15) public void filterBysameDeptHighPriority() throws
	 * InterruptedException { ticket.filterBysameDeptHighPriority();
	 * 
	 * }
	 * 
	 * @Test(priority=16) public void filterBysameDeptMediumPriority() throws
	 * InterruptedException { ticket.filterBysameDeptMediumPriority();
	 * 
	 * }
	 * 
	 * @Test(priority=17) public void filterBysameDeptLowPriority() throws
	 * InterruptedException { ticket.filterBysameDeptLowPriority();
	 * 
	 * }
	 * 
	 * @Test(priority=18) public void filterBySameDeptStatusOpenPriorityHigh()
	 * throws InterruptedException {
	 * ticket.filterBySameDeptStatusOpenPriorityHigh();
	 * 
	 * }
	 * 
	 * @Test(priority=19) public void filterBySameDeptStatusOpenPriorityMedium()
	 * throws InterruptedException {
	 * ticket.filterBySameDeptStatusOpenPriorityMedium();
	 * 
	 * }
	 * 
	 * @Test(priority=20) public void filterBySameDeptStatusOpenPriorityLow() throws
	 * InterruptedException { ticket.filterBySameDeptStatusOpenPriorityLow();
	 * 
	 * }
	 * 
	 * @Test(priority=21) public void filterBySameDeptStatusClosePriorityHigh()
	 * throws InterruptedException {
	 * ticket.filterBySameDeptStatusClosePriorityHigh(); }
	 * 
	 * @Test(priority=22) public void filterBySameDeptStatusClosePriorityMedium()
	 * throws InterruptedException {
	 * ticket.filterBySameDeptStatusClosePriorityMedium(); }
	 * 
	 * @Test(priority=23) public void filterBySameDeptStatusClosePriorityLow()
	 * throws InterruptedException {
	 * ticket.filterBySameDeptStatusClosePriorityLow(); }
	 * 
	 * @Test(priority=24) public void filterSearchByDeptIT() throws
	 * InterruptedException { ticket.filterSearchByDeptIT(); }
	 * 
	 * @Test(priority=25) public void filterSearchByDeptAccount() throws
	 * InterruptedException { ticket.filterSearchByDeptAccount(); }
	 * 
	 * @Test(priority=26) public void filterSearchByDeptOperation() throws
	 * InterruptedException { ticket.filterSearchByDeptOperation(); }
	 * 
	 * @Test(priority=27) public void filterSearchByDeptHR() throws
	 * InterruptedException { ticket.filterSearchByDeptHR(); }
	 * 
	 * @Test(priority=28) public void filterByITdeptStatusOpenPriorityHigh() throws
	 * InterruptedException { ticket.filterByITdeptStatusOpenPriorityHigh(); }
	 * 
	 * @Test(priority=29) public void filterByITdeptStatusOpenPriorityMedium()
	 * throws InterruptedException {
	 * ticket.filterByITdeptStatusOpenPriorityMedium(); }
	 * 
	 * @Test(priority=30) public void filterByITdeptStatusOpenPriorityLow() throws
	 * InterruptedException { ticket.filterByITdeptStatusOpenPriorityLow(); }
	 * 
	 * @Test(priority=31) public void filterByITdeptStatusClosePriorityHigh() throws
	 * InterruptedException { ticket.filterByITdeptStatusClosePriorityHigh(); }
	 * 
	 * @Test(priority=32) public void filterBySameDeptStatusReopenPriorityHigh()
	 * throws InterruptedException {
	 * ticket.filterBySameDeptStatusReopenPriorityHigh(); }
	 * 
	 * @Test(priority=33) public void filterByITdeptStatusClosePriorityMedium()
	 * throws InterruptedException {
	 * ticket.filterByITdeptStatusClosePriorityMedium(); }
	 * 
	 * @Test(priority=34) public void filterByITdeptStatusClosePriorityLow() throws
	 * InterruptedException { ticket.filterByITdeptStatusClosePriorityLow(); }
	 */

}
