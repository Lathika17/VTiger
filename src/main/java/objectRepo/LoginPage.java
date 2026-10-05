
package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Login webpage POM class
 * @author lathu
 * @version 26-09-11
 */

public class LoginPage {
//1. Declaring the WebElements
	
	@FindBy(name = "user_name")
	private WebElement usernameTF;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTF;
	
	@FindBy(xpath = "//input[@id='submitButton']")
	private WebElement loginbtn;


//2.Initializing the WebElements
    public LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
//Getter Methods 
    public WebElement getusernameTxtfield() {
    	return usernameTF;
    }
    public WebElement getpasswordTxtfield() {
    	return passwordTF;
    }
    public WebElement getloginbutton() {
    	return loginbtn;
    }
    
//3.Utilizing the WebElements
    /**
     * This is a business library to perform login to application
     * @param UN
     * @param Pwd
     */
    
    public void loginToApplication(String UN, String Pwd) {
    	getusernameTxtfield().sendKeys(UN);
    	getpasswordTxtfield().sendKeys(Pwd);
    	getloginbutton().click();
     
    }
}