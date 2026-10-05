package testCaseRepo;  //22.09.26 leave

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002 extends BaseClass{

	@Test(groups = {"Smoke"})
	public void LE_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewleadIcon();
		String lastName = eu.getDataFromExcel("Leads", 4, 1);
		String company = eu.getDataFromExcel("Leads", 4, 2);
		String title = eu.getDataFromExcel("Leads", 4, 3);
		String leadSource = eu.getDataFromExcel("Leads", 4, 4);
		String noOfEmp = eu.getDataFromExcel("Leads", 4, 5);
		CreatingNewLeadPage cnlp =new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lastName, company, title, leadSource, noOfEmp);
	}

}




