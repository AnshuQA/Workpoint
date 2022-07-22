package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.DataUtil;

public class LoginTest extends BaseTest{
	
	
	public static  LoginPage lp =  new LoginPage();

		
		
	
	@Test(dataProviderClass = DataUtil.class, dataProvider="dp")
	public void loginTest(String username, String password) {
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(username);
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	
	}
	
}
