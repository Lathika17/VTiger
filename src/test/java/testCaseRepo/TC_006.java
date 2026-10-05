package testCaseRepo;  //22.09.26 leave 

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_006 extends BaseClass{
	@Test(groups= {"Smoke"}, retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
	public void CON_003() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		Assert.fail();
		cp.clickOnCreateNewContactIcon();
		String lastName = eu.getDataFromExcel("Contacts", 7, 1);
		String title = eu.getDataFromExcel("Contacts", 7, 2);
		String email = eu.getDataFromExcel("Contacts", 7, 3);
		String mailingCity = eu.getDataFromExcel("Contacts", 7, 4);
		String mailingState = eu.getDataFromExcel("Contacts", 7, 5);
		String mailingCountry = eu.getDataFromExcel("Contacts", 7, 6);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lastName, title, email, mailingCity, mailingState, mailingCountry);
	}



@Test
public void m1() {
	System.out.println("lathu");
	
	
}

}

