package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;

import extentlisteners.ExtentListeners;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExcelReader;

public class BaseTest {

	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);

			return true;
		} catch (Throwable t) {

			return false;
		}

	}

	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\testdata.xlsx");
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger(BaseTest.class.getName());

	public static WebDriverWait wait;
	public static WebElement dropdown;

	public static void select(String locatorKey, String value) {

		if (locatorKey.endsWith("_XPATH")) {
			dropdown = driver.findElement(By.xpath(OR.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_ID")) {
			dropdown = driver.findElement(By.id(OR.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_CSS")) {
			dropdown = driver.findElement(By.cssSelector(OR.getProperty(locatorKey)));
		}

		Select select = new Select(dropdown);
		select.selectByVisibleText(value);

		log.info("Selecting from the Element : " + locatorKey + " selected the value as : " + value);

	}

	public static void click(String locatorKey) {

		if (locatorKey.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(locatorKey))).click();
		} else if (locatorKey.endsWith("_ID")) {
			driver.findElement(By.id(OR.getProperty(locatorKey))).click();
		} else if (locatorKey.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(locatorKey))).click();
		}

		log.info("Clicking on an Element : " + locatorKey);
		ExtentListeners.test.log(Status.INFO, "Clicking on an Element: " + locatorKey);

	}

	public static boolean isElementPresent(String locatorKey) {

		try {
			if (locatorKey.endsWith("_XPATH")) {
				driver.findElement(By.xpath(OR.getProperty(locatorKey)));
			} else if (locatorKey.endsWith("_ID")) {
				driver.findElement(By.id(OR.getProperty(locatorKey)));
			} else if (locatorKey.endsWith("_CSS")) {
				driver.findElement(By.cssSelector(OR.getProperty(locatorKey)));
			}
			log.info("Finding an Element : " + locatorKey);
			ExtentListeners.test.log(Status.INFO, "Finding an Element: " + locatorKey);

			return true;
		} catch (Throwable t) {
			log.info("Error while finding an Element : " + t.getMessage());
			ExtentListeners.test.log(Status.ERROR,
					"Error while finding an Element: " + locatorKey + "--Error log is :" + t.getMessage());

			return false;
		}

	}

	public static void type(String locatorKey, String value) {

		if (locatorKey.endsWith("_ID")) {
			driver.findElement(By.id(OR.getProperty(locatorKey))).sendKeys(value);
		} else if (locatorKey.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(locatorKey))).sendKeys(value);
		} else if (locatorKey.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(locatorKey))).sendKeys(value);
		}

		log.info("Typing in an element :  " + locatorKey + " entered the value as : " + value);
		ExtentListeners.test.log(Status.INFO,
				"Typing in an Element: " + locatorKey + " entered the value as : " + value);
	}

	public void openBrowser(String browserName) {

	}

	@BeforeSuite
	public void setUp() {

		if (driver == null) {

			Date d = new Date();
			System.setProperty("current.date", d.toString().replace(":", "_").replace(" ", "_"));

			PropertyConfigurator.configure(".//src//test//resources//properties//log4j.properties");

			try {
				fis = new FileInputStream(".//src//test//resources//properties//Config.properties");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				Config.load(fis);
				log.info("Config properties loaded !!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(".//src//test//resources//properties//OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				OR.load(fis);
				log.info("OR properties loaded !!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (Config.getProperty("browser").equals("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				log.info("Launching Firefox");

			} else if (Config.getProperty("browser").equals("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				log.info("Launching Chrome");

			} else if (Config.getProperty("browser").equals("edge")) {

				WebDriverManager.edgedriver().setup();
				driver = new InternetExplorerDriver();
				log.info("Launching edge");

			}

			driver.get(Config.getProperty("testsiteurl"));
			log.info("Navigating to : " + Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, Integer.parseInt(Config.getProperty("explicit.wait")));

		}

	}

}
