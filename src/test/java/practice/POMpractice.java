package practice; //10.09.26 leave

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class POMpractice {
	public static void main(String[] args) throws IOException {
		SeleniumUtility su = new SeleniumUtility();
		PropertiesUtility pu = new PropertiesUtility();
		WebDriver driver = new ChromeDriver();
		su.maximizeWindow(driver);
		su.implicitWait(driver, 15);
		String URL = pu.getDataFromProperties("url");
		su.accessApplication(driver, URL);
//  	WebElement nameTF = driver.findElement(By.xpath("//input[@type='text']"));
		String un = pu.getDataFromProperties("username");
		String pwd = pu.getDataFromProperties("password");
//		nameTF.sendKeys(UN);
//		su.refreshWebpage(driver);
//		nameTF.sendKeys(UN);
//		AccessVTigerPractice a = new AccessVTigerPractice(driver);
//		a.usernameTF.sendKeys(un);
//		a.passwordTF.sendKeys(pwd);
//		a.loginButton.click();
		LoginPage l = new LoginPage(driver);
		l.loginToApplication(un, pwd);
		HomePage h = new HomePage(driver);
		h.logoutOperation(driver);
			}
}
