package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is a Utility class which has functionality from Selenium library
 * @author Lathu
 * @version 26-09-09
 */
public class SeleniumUtility {
	/**
	 * This is a generic method to access a web application
	 * @param driver
	 * @param url
	 */
	
	public void accessApplication(WebDriver driver, String url) {
		driver.get(url);
	}
	
	/**
	 * This is a generic method to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 *This is a generic method to refresh a web page 
	 * @param driver
	 */
	public void refreshWebpage(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	/**
	 * This is a generic method to close the browser
	 * @param driver
	 */
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	/**
	 * This is a generic method to provide implicit wait
	 * @param driver
	 * @param maximumTime
	 */
	public void implicitWait(WebDriver driver, int maximumTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maximumTime));
	}
	
                  ////////////**Handling DropDown***/////////
	
	/**
	 * This is a generic method to select an option in dropdown using value attribute
	 * @param dropdownEle
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropdownEle, String value){
		Select s = new Select(dropdownEle);
		s.selectByValue(value);
	}
	
	/**
	 * This is a generic method to select an option in dropdown using index
	 * @param dropdownEle
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownEle, int index){
		Select s = new Select(dropdownEle);
		s.selectByIndex(index);
	}
	
	/**
	 * This is a generic method to select an option in dropdown using visible text
	 * @param dropdownEle
	 * @param value
	 */
	public void selectOptionByVisibleText(WebElement dropdownEle, String visibleText){
		Select s = new Select(dropdownEle);
		s.selectByVisibleText(visibleText); 
	}
	
	            ////////*****Handling Mouse Actions******///////////
	 
	/**
	 * This is a generic method to perform mouse hovering action
	 * @param driver
	 * @param element
	 */
	public void mouseaHoveringAction(WebDriver driver, WebElement element) {
		new Actions(driver).moveToElement(element).perform();
	}
	
	/**
	 * This is a generic method to perform right click action
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver, WebElement element) {
		new Actions(driver).contextClick(element).perform();
	}
	
	/**
	 * This is a generic method to perform drag and drop Element
	 * @param driver
	 * @param dragEle
	 * @param dropEle
	 */
	public void dragandDropAction(WebDriver driver, WebElement dragEle, WebElement dropEle) {
		new Actions(driver).dragAndDrop(dragEle, dropEle).perform();
	}
	
	         ////////////*******Handling Alert Popup********////////////
	
	/**
	 * This is a generic method to accept alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This is a generic method to cancle alert popup
	 * @param driver
	 */
	public void cancleAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	            ///////////***Handling Frames***////////////////
	/**
	 * This is a generic method to switch to a frame using frame index            
	 * @param driver
	 * @param index
	 */
	public void switchToFrameUsingIndex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * This is a generic method to switch to a frame using frame webelement         
	 * @param driver
	 * @param frameEle
	 */
	public void switchToFrameUsingFrameElement(WebDriver driver, WebElement frameEle) {
		driver.switchTo().frame(frameEle);
	}
	
	         //////////*************Take WebPage Screenshot*************/////////////
	     
	/**
	 * This is a generic method to capture a webpage screenshot
	 * @param driver
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	 public String takeWebpageScreenshot(WebDriver driver, String fileName) throws IOException  {
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File(".\\Screenshots\\"+fileName+".png");
		 Files.copy(src, dest);
		 return dest.getAbsolutePath();   //used for listeners
	 }
	
	
	
  
	













}
	
	
