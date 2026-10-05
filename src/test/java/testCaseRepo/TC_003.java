package testCaseRepo;       //22.09.26 leave

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass{
        @Test(groups = {"Regression","Smoke"})
		public void LE_003() throws EncryptedDocumentException, IOException {
			HomePage hp = new HomePage(driver);
			hp.clickOnLeadsMenu();
			LeadsPage lp = new LeadsPage(driver);
			lp.clickOnCreateNewleadIcon();
			String lastName = eu.getDataFromExcel("Leads", 7, 1);
			String company = eu.getDataFromExcel("Leads", 7, 2);
			String mobile = eu.getDataFromExcel("Leads", 7, 3);
			String email = eu.getDataFromExcel("Leads", 7, 4);
			String city = eu.getDataFromExcel("Leads", 7, 5);
			String state = eu.getDataFromExcel("Leads", 7, 6);
			String country = eu.getDataFromExcel("Leads", 7, 7);
			CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
			cnlp.createNewLead(lastName, company, mobile, email, city, state, country);
		}

	}



