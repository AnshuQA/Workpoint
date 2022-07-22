package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;

public class FinancialPlan extends BaseTest {
  public void financialPlanBtn() throws InterruptedException {
		Thread.sleep(15000);
		 driver.findElement(By.xpath("//*[@id=\"nav-home\"]/div[2]/div/div[3]/a")).click();
		    
		   Thread.sleep(5000);
           ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
           driver.switchTo().window(tabs.get(1));
           
//If plan Already Added 
          int size1 = driver.findElements(By.xpath("//a[contains(text(),'Delete')]")).size();
           if(size1>0) {
           	Thread.sleep(5000);
           	driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
           	driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
           }
          
           Thread.sleep(3000);
		    
	driver.findElement(By.id("planName")).sendKeys("Anshu Automation Plan"); 
	Thread.sleep(3000);
	driver.findElement(By.id("btnCreateNewPlan")).click();
	
//Edit Button
	Thread.sleep(6000);
	driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	}
	
	public void basicDetails() throws InterruptedException {
//Pop Handel
	 	int sizea = driver.findElements(By.id("IsAddedInFP0")).size();
        if(sizea>0) {
       	 
       	Thread.sleep(3000);
		WebElement recRelation=driver.findElement(By.id("recRelation"));
		Select  brother= new Select(recRelation);
		 brother.selectByVisibleText("brother");
			Thread.sleep(3000);
			WebElement recRelation1=driver.findElement(By.id("recRelation0"));
			Select  brother1= new Select(recRelation1);
			 brother1.selectByVisibleText("Yes");
			 driver.findElement(By.id("IsAddedInFP0")).click();
			 Thread.sleep(5000);
   	 	driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[16]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
   	 	
        }
	
// Basic Details
		 //Marital Status
		 	Thread.sleep(3000);
			driver.findElement(By.id("empdob")).sendKeys("10-07-1996");
			 int size01 = driver.findElements(By.id("male")).size();
	         if(size01>0) {
	        	 Thread.sleep(3000);
	    	 	WebElement male= driver.findElement(By.id("male"));
	    	 	male.sendKeys(Keys.ARROW_RIGHT);
	    		Thread.sleep(3000);
	    		male.sendKeys(Keys.ENTER);
	    		
	    		Thread.sleep(3000);
	    		male.sendKeys(Keys.ARROW_LEFT);
	    		Thread.sleep(3000);
	    		male.sendKeys(Keys.ENTER);
	         }
		 	 
		 	Thread.sleep(3000);
				WebElement marrige=driver.findElement(By.id("isMarried"));
				Select single= new Select(marrige);
				single.selectByVisibleText("Married");
		    Thread.sleep(3000);
			WebElement compmantName=driver.findElement(By.id("companyName"));
			compmantName.clear();
		   compmantName.sendKeys("Fincart Financial Planner");	
			Thread.sleep(3000);
			WebElement companyProfile=driver.findElement(By.id("designation"));
			companyProfile.clear();
			companyProfile.sendKeys("Software Tester");
			Thread.sleep(3000);
			driver.findElement(By.id("wifeclientName")).sendKeys("G Mishra");
			Thread.sleep(3000);
			driver.findElement(By.id("wifedob")).sendKeys("10-10-1995");
			Thread.sleep(3000);
			driver.findElement(By.id("wifedob")).sendKeys(Keys.PAGE_DOWN);
			
	//Children Details
			
			Thread.sleep(3000);
			driver.findElement(By.id("isChildExistY")).click();
			int size2 = driver.findElements(By.id("childclientName0")).size();
	        if(size2>0) {
	        	Thread.sleep(3000);
	    		
	    		driver.findElement(By.id("childclientName0")).sendKeys("Diya");
	    		Thread.sleep(3000);
	    		driver.findElement(By.id("childdob0")).sendKeys("10-08-2005");
	        	
	        }
	        else {
	        	Thread.sleep(3000);
	    		driver.findElement(By.xpath("//a[@id='append-child-form']")).click();
	           Thread.sleep(3000);
	    		
	    		driver.findElement(By.id("childclientName0")).sendKeys("Diya");
	    		Thread.sleep(3000);
	    		driver.findElement(By.id("childdob0")).sendKeys("10-08-2005");
	        }
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id='append-child-form']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.id("childclientName1")).sendKeys("Subh");
			Thread.sleep(3000);
			driver.findElement(By.id("childage1")).sendKeys("15");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[6]/span[1]/input[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id='append-child-form']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.id("childclientName2")).sendKeys("raman");
			Thread.sleep(3000);
			driver.findElement(By.id("childage2")).sendKeys("20");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div[7]/span[1]/img[1]")).click();
			
	//Financial Dependents Detail
			Thread.sleep(3000);
			driver.findElement(By.id("wifedob")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='isDependentExistY']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/div[1]/ng-component/section[2]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("wifedob")).sendKeys(Keys.PAGE_DOWN);
			int size02 = driver.findElements(By.id("guardianclientName0")).size();
	        if(size02>0) {
	        	Thread.sleep(5000);
	    		//
	    		driver.findElement(By.id("guardianclientName0")).sendKeys("Shitla Prasad Singh");
	    		Thread.sleep(3000);
	    		driver.findElement(By.id("guardiandob0")).sendKeys("10-08-1970");
	    		 Thread.sleep(3000);
	    			WebElement father=driver.findElement(By.id("guardiandobRelation0"));
	    			Select div= new Select(father);
	    			div.selectByVisibleText("father");
	    			Thread.sleep(3000);
	    			driver.findElement(By.xpath("/html/body/app-root/div[1]/ng-component/section[2]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/a")).click();
	        }
			
			  Thread.sleep(3000);
				driver.findElement(By.id("guardianclientName1")).sendKeys("Shiv Kumari");
				Thread.sleep(3000);
				driver.findElement(By.id("guardiandob1")).sendKeys("10-08-1975");
				 Thread.sleep(3000);
					WebElement mother=driver.findElement(By.id("guardiandobRelation1"));
					Select div1= new Select(mother);
					div1.selectByVisibleText("mother");
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@id=\"useBasicDetailsId\"]/div[4]/a")).click();
}
	public void fpGoalAdd() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("profile-tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("present_Value")).sendKeys("50000");
		Thread.sleep(3000);
		driver.findElement(By.id("startDate")).sendKeys("10-08-2022");
		Thread.sleep(3000);
		driver.findElement(By.id("endDate")).sendKeys("10-08-2026");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'add')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"goalDetailssubmit\"]/div/div/div/div/button[2]")).click();

//Retairment Goal
		 Thread.sleep(5000);
			WebElement mother2=driver.findElement(By.id("goal_Code"));
			Select div2= new Select(mother2);
			
			div2.selectByVisibleText("Retirement");
			Thread.sleep(3000);
			driver.findElement(By.id("retirementAge")).sendKeys("55");
			Thread.sleep(3000);
			driver.findElement(By.id("currentAge_RetdFund")).sendKeys("26");
			Thread.sleep(3000);
			WebElement life=driver.findElement(By.id("lifeExpentency_OnlyRetd"));
			Select lige= new Select(life);
			lige.selectByVisibleText("80 year");
			Thread.sleep(3000);
			driver.findElement(By.id("present_Value")).sendKeys("12000");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'add')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"goalDetailssubmit\"]/div/div/div/div/button[2]")).click();
			
//Child Study
			 Thread.sleep(5000);
				WebElement child=driver.findElement(By.id("goal_Code"));
				Select study= new Select(child);
				
				study.selectByVisibleText("Child Study");
				 Thread.sleep(3000);
					WebElement childn=driver.findElement(By.id("childName"));
					Select studyn= new Select(childn);
					
					studyn.selectByVisibleText("Diya");
					Thread.sleep(3000);
					driver.findElement(By.id("present_Value")).sendKeys("12000");
					Thread.sleep(3000);
					driver.findElement(By.id("startDate")).sendKeys("10-08-2022");
					Thread.sleep(3000);
					driver.findElement(By.id("endDate")).sendKeys("10-08-2026");
					Thread.sleep(3000);
					driver.findElement(By.xpath("//a[contains(text(),'add')]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"goalDetailssubmit\"]/div/div/div/div/button[2]")).click();
//Other Goal
					
					/* Thread.sleep(5000);
						WebElement other=driver.findElement(By.id("goal_Code"));
						Select otherg= new Select(other);
						
						otherg.selectByVisibleText("Other");
						Thread.sleep(3000);
						driver.findElement(By.id("otherGoal")).sendKeys("AK-47 GUN11");
						Thread.sleep(3000);
						Thread.sleep(3000);
						driver.findElement(By.id("present_Value")).sendKeys("150000");
						driver.findElement(By.id("startDate")).sendKeys("10-08-2025");
						Thread.sleep(3000);
						driver.findElement(By.id("endDate")).sendKeys("10-08-2030");
						Thread.sleep(3000);
						driver.findElement(By.xpath("//a[contains(text(),'add')]")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@id=\"goalDetailssubmit\"]/div/div/div/div/button[2]")).click();*/
	}
	public void income() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		
		Thread.sleep(5000);
		WebElement incomeSource=driver.findElement(By.id("inflowTypeId"));
		Select salary= new Select(incomeSource);
		salary.selectByVisibleText("Salary");
		Thread.sleep(3000);
		driver.findElement(By.id("amount")).sendKeys("30000");
		Thread.sleep(3000);
		WebElement frequency=driver.findElement(By.id("frequencyTypeId"));
		Select monthly= new Select(frequency);
		monthly.selectByVisibleText("Monthly");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(5000);
		WebElement incomeSource1=driver.findElement(By.id("inflowTypeId"));
		Select ssalary= new Select(incomeSource1);
		ssalary.selectByVisibleText("Spouse Income");
		Thread.sleep(3000);
		driver.findElement(By.id("amount")).sendKeys("15000");
		Thread.sleep(3000);
		WebElement frequency1=driver.findElement(By.id("frequencyTypeId"));
		Select monthly1= new Select(frequency1);
		monthly1.selectByVisibleText("Monthly");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(5000);
		WebElement incomeSource2=driver.findElement(By.id("inflowTypeId"));
		Select other1= new Select(incomeSource2);
		other1.selectByVisibleText("Salary");
		Thread.sleep(3000);
		driver.findElement(By.id("amount")).sendKeys("300000");
		Thread.sleep(3000);
		WebElement frequency3=driver.findElement(By.id("frequencyTypeId"));
		Select monthly3= new Select(frequency3);
		monthly3.selectByVisibleText("Yearly");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	}
	public void netAssetEntryBtn() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
	}
	public void mfOffline() throws InterruptedException {
		Thread.sleep(3000);
		WebElement investmentType=driver.findElement(By.id("mfInvestType"));
		Select sip= new Select(investmentType);
		sip.selectByVisibleText("SIP");
		WebElement search=driver.findElement(By.id("schemeName"));
		 search.sendKeys("Mira");
		 
	    
		List<WebElement> mfoffline=driver.findElements(By.className("ui-menu-item-wrapper"));
		
		 for(WebElement mfsuggect : mfoffline) {
			
			  if(mfsuggect.getText().equalsIgnoreCase("Mirae - Asset Savings Fund Regular Savings Reg (B)")){
				  Thread.sleep(4000);
				  mfsuggect.click();
			 
			  break;
			  }
			  
		  }
		 Thread.sleep(3000);
		 driver.findElement(By.id("sipAmount")).sendKeys("1000");
		 Thread.sleep(3000);
		 driver.findElement(By.id("folioNo")).sendKeys("6758765768");
		 Thread.sleep(3000);
		 driver.findElement(By.id("currentValue")).sendKeys("20000");
		 Thread.sleep(3000);
			WebElement transactionSource=driver.findElement(By.id("trxnSource"));
			Select fromUs= new Select(transactionSource);
			fromUs.selectByVisibleText("From Us");
			Thread.sleep(3000);
			WebElement frequencya=driver.findElement(By.id("frequencyTypeId"));
			Select monthlya= new Select(frequencya);
			monthlya.selectByVisibleText("Monthly");
			Thread.sleep(3000);
			WebElement liquidityType=driver.findElement(By.id("liquidityType"));
			Select High= new Select(liquidityType);
			High.selectByVisibleText("High");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
			
//MF offline(LUMPSUM)	
			Thread.sleep(3000);
			WebElement investmentType1=driver.findElement(By.id("mfInvestType"));
			Select lumpsum= new Select(investmentType1);
			lumpsum.selectByVisibleText("Lumpsum");
			WebElement scheme=driver.findElement(By.id("schemeName"));
			scheme.sendKeys("HDFC - Regular");
			 
			Thread.sleep(5000);
			List<WebElement> mfoffline1=driver.findElements(By.className("ui-menu-item-wrapper"));
			
			 for(WebElement mfsuggect1 : mfoffline1) {
				
				  if(mfsuggect1.getText().equalsIgnoreCase("HDFC - Regular Savings Fund (M) (D)")){
					  Thread.sleep(4000);
					  mfsuggect1.click();
				 
				  break;
				  }
				  
			  }
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("folioNo")).sendKeys("6758765111");
			 Thread.sleep(3000);
			 driver.findElement(By.id("currentValue")).sendKeys("2000045");
			 Thread.sleep(3000);
				WebElement transactionSource1=driver.findElement(By.id("trxnSource"));
				Select external= new Select(transactionSource1);
				external.selectByVisibleText("External");
				Thread.sleep(3000);
				WebElement frequencyb=driver.findElement(By.id("frequencyTypeId"));
				Select oneTime= new Select(frequencyb);
				oneTime.selectByVisibleText("OneTime");
				Thread.sleep(3000);
				WebElement liquidityType1=driver.findElement(By.id("liquidityType"));
				Select low= new Select(liquidityType1);
				low.selectByVisibleText("Low");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
				
				
				Thread.sleep(5000);
                driver.navigate().refresh();
                Thread.sleep(10000);
        		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
	}
	public void addInsurance() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Insurance')]")).click();
		
		  WebElement insuranceType=driver.findElement(By.id("assetTypeId"));
			Select selectInsu = new Select(insuranceType);
			
			selectInsu.selectByVisibleText("Term Insurance");
			
			Thread.sleep(3000);
			WebElement policyProvider=driver.findElement(By.id("policyPartnerId"));
			Select ins =new Select(policyProvider);
			
			ins.selectByVisibleText("HDFC Standard Life Insurance Co. Ltd.");
			Thread.sleep(3000);
			WebElement transactionSourcea=driver.findElement(By.id("trxnSource"));
			Select policy = new Select(transactionSourcea);
			
			policy.selectByVisibleText("From Us");
			Thread.sleep(3000);
			WebElement schemea=driver.findElement(By.id("insuranceassetName"));
			schemea.sendKeys("HDFC");
			 
			Thread.sleep(5000);
			List<WebElement> mfofflinea=driver.findElements(By.className("ui-menu-item-wrapper"));
			
			 for(WebElement mfsuggect1 : mfofflinea) {
				
				  if(mfsuggect1.getText().equalsIgnoreCase("HDFC Click2Protect Plus")){
					  Thread.sleep(4000);
					  mfsuggect1.click();
				 
				  break;
				  }
				  
			  }
			
			
			driver.findElement(By.id("policyNo")).sendKeys("76454546");
			driver.findElement(By.id("policyIssueDate")).sendKeys("01-05-2017");
			driver.findElement(By.id("policyPremium")).sendKeys("68900");
			driver.findElement(By.id("policyTerm")).sendKeys("25");
			driver.findElement(By.id("ppTerm")).sendKeys("50");
			driver.findElement(By.id("policySumAssured")).sendKeys("50000");
			Thread.sleep(3000);
			WebElement closeMode=driver.findElement(By.id("frequencyTypeId"));
			Select mode =new Select(closeMode);
			
			mode.selectByVisibleText("Yearly");
			Thread.sleep(3000);
			WebElement insFreq=driver.findElement(By.id("liquidityType"));
			Select Freq =new Select(insFreq);
			
			Freq.selectByVisibleText("High");
			Thread.sleep(3000);
			WebElement policyOwner=driver.findElement(By.id("policyOwnerBasicId"));
			Select Freq1 =new Select(policyOwner);
			Freq1.selectByVisibleText("Shiv Kumari");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
			
	}
	public void otherAsset() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Other assets')]")).click();
		Thread.sleep(3000);
		WebElement closeMode1=driver.findElement(By.id("assetTypeId"));
		Select mode1 =new Select(closeMode1);
		
		mode1.selectByVisibleText("PMS");
		WebElement scheme1=driver.findElement(By.id("otherAssetName"));
		scheme1.sendKeys("Motilal");
		 
		Thread.sleep(5000);
		List<WebElement> mfofflineb=driver.findElements(By.className("ui-menu-item-wrapper"));
		
		 for(WebElement mfsuggect1 : mfofflineb) {
			
			  if(mfsuggect1.getText().equalsIgnoreCase("Motilal Oswal PMS")){
				  Thread.sleep(4000);
				  mfsuggect1.click();
			 
			  break;
			  }
			  
		  }
			Thread.sleep(3000);
			WebElement liquidityType2=driver.findElement(By.id("liquidityType"));
			Select high =new Select(liquidityType2);
			
			high.selectByVisibleText("High");
			Thread.sleep(3000);
			WebElement lockInDuration=driver.findElement(By.id("lockInDuration"));
			lockInDuration.clear();
			lockInDuration.sendKeys("10");
			Thread.sleep(3000);
			WebElement lockInInterest=driver.findElement(By.id("lockInInterest"));
			lockInInterest.clear();
			lockInInterest.sendKeys("10");
			driver.findElement(By.id("currentValue")).sendKeys("75000");
			driver.findElement(By.id("loanEmiAmount")).sendKeys("2500");
			Thread.sleep(3000);
			WebElement policyOwner01=driver.findElement(By.id("policyOwnerBasicId"));
			Select Freq01 =new Select(policyOwner01);
			Freq01.selectByVisibleText("Shiv Kumari");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	}
	public void loan() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Loan')]")).click();
		Thread.sleep(3000);
		WebElement closeMode01=driver.findElement(By.id("assetTypeId"));
		Select mode01 =new Select(closeMode01);
		
		mode01.selectByVisibleText("Home Loan");
		WebElement scheme01=driver.findElement(By.id("LoanAssetName"));
		scheme01.sendKeys("hdfc");
		
		Thread.sleep(5000);
		List<WebElement> mfoffline02=driver.findElements(By.className("ui-menu-item-wrapper"));
		
		 for(WebElement mfsuggect1 : mfoffline02) {
			
			  if(mfsuggect1.getText().equalsIgnoreCase("Hdfc Housing Finance_Aditya")){
				  Thread.sleep(4000);
				  mfsuggect1.click();
			 
			  break;
			  }
			  
		  }
		 driver.findElement(By.id("loanPrincipalAmount")).sendKeys("75000");
		 driver.findElement(By.id("loanInterest")).sendKeys("10");
		 driver.findElement(By.id("loanStartDate")).sendKeys("01-05-2015");
		 driver.findElement(By.id("loanEndDate")).sendKeys("01-05-2025");
		 driver.findElement(By.id("loanEmiAmount")).sendKeys("1700");
		 driver.findElement(By.id("loanOutstandAmount")).sendKeys("25500");
		 Thread.sleep(3000);
			WebElement transactionSource03=driver.findElement(By.id("trxnSource"));
			Select external03 =new Select(transactionSource03);
			
			external03.selectByVisibleText("External");
			Thread.sleep(3000);
			WebElement frequency03=driver.findElement(By.id("frequencyTypeId"));
			Select  monthly03 =new Select(frequency03);
			
			 monthly03.selectByVisibleText("Monthly");
			Thread.sleep(3000);
			WebElement liquidityType03=driver.findElement(By.id("liquidityType"));
			Select low03 =new Select(liquidityType03);
			
			low03.selectByVisibleText("Low");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	}
	public void expence() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(3000);
		WebElement liquidityType04=driver.findElement(By.id("expenseTypeId"));
		Select low04 =new Select(liquidityType04);
		low04.selectByVisibleText("Fixed");
		Thread.sleep(3000);
		WebElement expense =driver.findElement(By.id("outFlowTypeId"));
		Select  household =new Select(expense);
		household.selectByVisibleText("Household");
		driver.findElement(By.id("expenseAmount")).sendKeys("8000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		
		Thread.sleep(5000);
		WebElement lifestyle =driver.findElement(By.id("outFlowTypeId"));
		Select  household1 =new Select(lifestyle);
		household1.selectByVisibleText("Lifestyle");
		driver.findElement(By.id("expenseAmount")).sendKeys("5000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		
		Thread.sleep(5000);
		WebElement lifestyle2 =driver.findElement(By.id("outFlowTypeId"));
		Select  household2 =new Select(lifestyle2);
		household2.selectByVisibleText("Dependent");
		driver.findElement(By.id("expenseAmount")).sendKeys("5000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		
		Thread.sleep(5000);
		WebElement lifestyle3 =driver.findElement(By.id("outFlowTypeId"));
		Select  household3 =new Select(lifestyle3);
		household3.selectByVisibleText("Transport Expenses");
		driver.findElement(By.id("expenseAmount")).sendKeys("2000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		Thread.sleep(5000);
		WebElement lifestyle4 =driver.findElement(By.id("outFlowTypeId"));
		Select  household4 =new Select(lifestyle4);
		household4.selectByVisibleText("Other");
		driver.findElement(By.id("outFlowTypeName")).sendKeys("Personal Expence");
		driver.findElement(By.id("expenseAmount")).sendKeys("5000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	}
	public void netAllocation() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
		Thread.sleep(3000);
      	List <WebElement> list1=driver.findElements(By.xpath("//input[@id='userGoalName']"));
   	    list1.get(0).click();
   	    driver.findElement(By.xpath("//td[contains(text(),'Bike')]")).click();
   	   Thread.sleep(3000);
    	List <WebElement> list2=driver.findElements(By.id("assetIdName"));
	    list2.get(0).click();
	    driver.findElement(By.xpath("//td[contains(text(),'Mirae - Asset Savings Fund Regular Savings Reg (B)')]")).click();
	     WebElement amount=driver.findElement(By.id("assetAllocationamount"));
	     amount.clear();
	     amount.sendKeys("1000");
	     Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[11]/div[1]/div[1]/div[2]/div[4]/input[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		
	    Thread.sleep(5000);
      	List <WebElement> list3=driver.findElements(By.xpath("//input[@id='userGoalName']"));
   	    list3.get(0).click();
   	    driver.findElement(By.xpath("//td[contains(text(),'Retirement')]")).click();
   	   Thread.sleep(3000);
    	List <WebElement> list4=driver.findElements(By.id("assetIdName"));
	    list4.get(0).click();
	    driver.findElement(By.xpath("//td[contains(text(),'Mirae - Asset Savings Fund Regular Savings Reg (B)')]")).click();
	     WebElement amount1=driver.findElement(By.id("assetAllocationamount"));
	     amount1.clear();
	     amount1.sendKeys("1200");
	     Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[11]/div[1]/div[1]/div[2]/div[4]/input[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		 Thread.sleep(5000);
	      	List <WebElement> list5=driver.findElements(By.xpath("//input[@id='userGoalName']"));
	   	    list5.get(0).click();
	   	    driver.findElement(By.xpath("//td[contains(text(),\"Diya's Study\")]")).click();
	   	   Thread.sleep(3000);
	    	List <WebElement> list6=driver.findElements(By.id("assetIdName"));
		    list6.get(0).click();
		    driver.findElement(By.xpath("//td[contains(text(),'HDFC - Regular Savings Fund (M) (D)')]")).click();
		     WebElement amount2=driver.findElement(By.id("assetAllocationamount"));
		     amount2.clear();
		     amount2.sendKeys("12000");
		     Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[11]/div[1]/div[1]/div[2]/div[4]/input[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
			
		    Thread.sleep(5000);
	      	List <WebElement> list7=driver.findElements(By.xpath("//input[@id='userGoalName']"));
	   	    list7.get(0).click();
	   	    driver.findElement(By.xpath("//td[contains(text(),'Retirement')]")).click();
	   	   Thread.sleep(3000);
	    	List <WebElement> list8=driver.findElements(By.id("assetIdName"));
		    list8.get(0).click();
		    driver.findElement(By.xpath("//td[contains(text(),'Motilal Oswal PMS')]")).click();
		     WebElement amount4=driver.findElement(By.id("assetAllocationamount"));
		     amount4.clear();
		     amount4.sendKeys("1100");
		     Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[11]/div[1]/div[1]/div[2]/div[4]/input[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	}
	public void netCashFlowAllocation() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
	 	
	 	
//Goal Deficit & Scheme Selection	 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Goal Deficit & Scheme Selection')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("schemeuserGoalName")).click();
		Thread.sleep(3000);
      	List <WebElement> list05=driver.findElements(By.xpath("//td[contains(text(),'Bike')]"));
   	    list05.get(0).click();
   	 Thread.sleep(3000);
		WebElement lifestyle05 =driver.findElement(By.id("mfTrxnType"));
		Select  household05 =new Select(lifestyle05);
		household05.selectByVisibleText("SIP");
		Thread.sleep(3000);
		WebElement lifestyle5 =driver.findElement(By.id("assetCategory"));
		Select  household5 =new Select(lifestyle5);
		household5.selectByVisibleText("Mutual Fund");
		WebElement scheme05=driver.findElement(By.xpath("//input[@id='schemeName']"));
		scheme05.sendKeys("kotak");
		
		Thread.sleep(5000);
		List<WebElement> mfoffline05=driver.findElements(By.className("ui-menu-item-wrapper"));
		
		 for(WebElement mfsuggect1 : mfoffline05) {
			
			  if(mfsuggect1.getText().equalsIgnoreCase("Kotak - Bluechip Fund (G)")){
				  Thread.sleep(4000);
				  mfsuggect1.click();
			 
			  break;
			  }
			  
		  }
		 WebElement sipAmoun =driver.findElement(By.id("schemeamount"));
		 sipAmoun.clear();
				 sipAmoun.sendKeys("100");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Add')]")).click();
		
//Risk Recommendation
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Risk Recommendation')]")).click();
		Thread.sleep(3000);
		 WebElement insuranceType06=driver.findElement(By.id("riskassetTypeId"));
			Select selectInsu06 = new Select(insuranceType06);
			selectInsu06.selectByVisibleText("ULIP");
			Thread.sleep(3000);
			 WebElement policyProvide=driver.findElement(By.id("riskpolicyPartnerId"));
				Select selectInsu1 = new Select(policyProvide);
				selectInsu1.selectByVisibleText("Aditya Birla Sun Life Insurance Co. Ltd.");
				WebElement scheme06=driver.findElement(By.id("insuranceassetName"));
				scheme06.sendKeys("ad");
				
				Thread.sleep(5000);
				List<WebElement> mfoffline07=driver.findElements(By.className("ui-menu-item-wrapper"));
				
				 for(WebElement mfsuggect1 : mfoffline07) {
					
					  if(mfsuggect1.getText().equalsIgnoreCase("BSLI Platinum Advantage Plan")){
						  Thread.sleep(4000);
						  mfsuggect1.click();
					 
					  break;
					  }
					  
				  }
				 driver.findElement(By.id("riskpolicyPremium")).sendKeys("5000");
				 driver.findElement(By.id("riskpolicyTerm")).sendKeys("50");
				 driver.findElement(By.id("riskppTerm")).sendKeys("50");
				 driver.findElement(By.id("rsikpolicySumAssured")).sendKeys("50000");
				 Thread.sleep(3000);
					
					 Thread.sleep(3000);
						WebElement policyStatus =driver.findElement(By.id("policyStatus"));
						Select  new1 =new Select(policyStatus);
						new1.selectByVisibleText("New");
						 Thread.sleep(3000);
							WebElement liquidityType08 =driver.findElement(By.id("liquidityType"));
							Select  high08 =new Select(liquidityType08);
							high08.selectByVisibleText("High");
							 Thread.sleep(3000);
								WebElement frequencyTypeId =driver.findElement(By.id("frequencyTypeId"));
								Select   oneTime08 =new Select(frequencyTypeId);
								oneTime08.selectByVisibleText("OneTime");
								Thread.sleep(3000);
								WebElement policyOwner08 =driver.findElement(By.id("riskpolicyOwnerBasicId"));
								Select  father08 =new Select(policyOwner08);
								father08.selectByVisibleText("Shitla Prasad Singh");

							     JavascriptExecutor js = (JavascriptExecutor) driver;
							     js.executeScript("scroll(0, 800)");
								Thread.sleep(5000);
								
								JavascriptExecutor je = (JavascriptExecutor) driver;
								WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Add')]"));
								je.executeScript("arguments[0].scrollIntoView(true);",element);
								element.click();
	}
	public void genrateFincincialPlan() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	     js1.executeScript("scroll(0, 1000)");
	     Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"myTabContent\"]/div[2]/div/a")).click();
	}
	public void summeryView() throws InterruptedException {
		 Thread.sleep(5000);
         ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
         driver.switchTo().window(tabs1.get(2));
//Risk
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='nav-profile-tab']")).click();
		

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='nav-Goals-tab']")).click();
		
		

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='nav-Retirement-tab']")).click();
		

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='nav-Estate-tab']")).click();
	}
	
	public void viewFincialPlan() throws InterruptedException{

		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(),'VIEW FULL FINANCIAL PLAN')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("scroll(0, 800)");
		
//Cash Inflow & Outflow
		Thread.sleep(8000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		 
	     js.executeScript("scroll(0, 800)");
	     
//Available Resoureces
			Thread.sleep(8000);
			driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[3]/a[1]")).click();
			 
		     js.executeScript("scroll(0, 800)");
		     
//Way Forword
				Thread.sleep(8000);
				driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[4]/a[1]")).click();
				 
			     js.executeScript("scroll(0, 800)");
			     
//revised-cash-inflow-outflow
			     
					Thread.sleep(8000);
					driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[5]/a[1]")).click();
					
				     js.executeScript("scroll(0, 800)");
				     
//scheme-selection
				     
						Thread.sleep(8000);
						driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[6]/a[1]")).click();
						 
					     js.executeScript("scroll(0, 800)");
					     
//plan-assumptions
					     
							Thread.sleep(8000);
							driver.findElement(By.xpath("//body/app-root[1]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/ul[1]/li[7]/a[1]")).click();
							
						     js.executeScript("scroll(0, 800)");
		
	}
	public void executePlan() throws InterruptedException {
	     
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(),'EXECUTE MY PLAN')]")).click();
	}
}
