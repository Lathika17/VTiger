package practice;  //04.09.26

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class Orangehrm {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		PropertiesUtility pu = new PropertiesUtility ();
		String URL = pu.getDataFromProperties("url");
		driver.get(URL);
		String Un = pu.getDataFromProperties("username");
		String Pwd = pu.getDataFromProperties("password");
		driver.findElement(By.name("username")).sendKeys("username",Keys.TAB,"password",Keys.ENTER);
		
	}

}
