package utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import base.BaseTest;

public class DataUtil extends BaseTest {

	public static String fileName;

	@DataProvider(name="dp")
	public static Object[][] getData(Method m) {
		String sheetName = m.getName();
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
	
		Object[][] data = new Object[rowCount-1][colCount];
	
		
		for(int rows=2;rows<=rowCount;rows++) {
			
			for(int cols=0; cols<colCount; cols++) {
				
				data[rows-2][cols]=excel.getCellData(sheetName, cols, rows);
				
			}
			
		}
		
		
		return data;
		
	}

	

	/*public static void captureScreenshot() throws IOException {

		Date d = new Date();
		fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".\\target\\surefire-reports\\html\\" + fileName));
//Seleium/AppFincart/test-output
	}*/

}
