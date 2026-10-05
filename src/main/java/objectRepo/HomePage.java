package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

/**
 * This is a HomePage webpage POM class
 * @author lathu
 * @version 26-09-11
 */

public class HomePage {
//1. Declaring the WebElements
	
	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsMenu;
	 
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutOption;
	
	
//2.Initializing the WebElements
	
    public HomePage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
 //Getter methods
	public WebElement getLeadsMenu() {
		return leadsMenu;
	}
	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountIcon() {
		return accountIcon;
	}
	public WebElement getSignoutOption() {
		return signoutOption;
	}

//3.Utilizing the WebElements
	
	/**
	 * This is a business library click on LeadsMenu
	 */
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	/**
	 * This is a business library click on ContactsMenu
	 */
	public void clickOnContactsMenu() {
		getContactsMenu().click();
	}
	/**
	 * This is a business library to perform logout operation
	 * @param driver
	 */
	public void logoutOperation(WebDriver driver) {
		new SeleniumUtility().mouseaHoveringAction(driver, getAccountIcon());
		getSignoutOption().click();
	}
}
