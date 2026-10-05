 package genericUtility;  //21.09.26 leave

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass { 


	public SeleniumUtility su = new SeleniumUtility();
	public PropertiesUtility pu = new PropertiesUtility();
	public ExcelUtility eu = new ExcelUtility();
	public WebDriver driver;
	public static WebDriver sDriver;      //used for Listeners

	@BeforeSuite(alwaysRun = true)
	public void bsconfig() {
		System.out.println("DB connection created");
	}

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void bcConfig(@Optional("chrome") String BROWSER) throws IOException  {
		 
		String browser = System.getProperty("browser");
		if(browser!=null) {
			BROWSER = browser;
	}
		if(BROWSER.equals("chrome"))
			driver = new ChromeDriver();
		else if(BROWSER.equals("edge"))
			driver = new EdgeDriver();
		else if(BROWSER.equals("firefox"))
			driver = new FirefoxDriver();
		else if(BROWSER.equals("safari"))
			driver = new SafariDriver();
		else
			driver = new ChromeDriver();
		sDriver=driver;      //used for Listeners
		su.maximizeWindow(driver); 
		su.implicitWait(driver, 15);
		String url=pu.getDataFromProperties("url");
		su.accessApplication(driver, url);
		System.out.println("Browser launch successfully");
	}

	@BeforeMethod(alwaysRun = true)
	public void bmConfig() throws IOException { 
		String UN=pu.getDataFromProperties("username");
		String PWD=pu.getDataFromProperties("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		System.out.println("login done successfully");
	}

	@AfterMethod(alwaysRun = true)
	public void amConfig() {
		HomePage hp=new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("logout done successfully");
	}

	@AfterClass(alwaysRun = true)
	public void acConfig() {
		su.closeBrowser(driver);
		System.out.println("Browser closed successfully");
	}

	@AfterSuite(alwaysRun = true)
	public void asConfig() {
		System.out.println("DB connection closed");
	}


}
