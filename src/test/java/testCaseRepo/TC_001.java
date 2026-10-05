package testCaseRepo;   //22.09.26 leave

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_001 extends BaseClass{
	@Test(groups = {"Regression"})
	public void LE_001() throws EventException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewleadIcon();
		String firstName = eu.getDataFromExcel("Leads", 1, 1);
		String lastName = eu.getDataFromExcel("Leads", 1, 2);
		String company = eu.getDataFromExcel("Leads", 1, 3);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(firstName, lastName, company);
	}

}



