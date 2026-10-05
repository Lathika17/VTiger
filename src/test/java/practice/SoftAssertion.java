package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void softAssertion() {
		String expectedCity = "Bangalore";
		String actualCity = "Bengaluru";
		System.out.println("SoftAssertion starts");
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualCity, expectedCity);
		System.out.println("SoftAssertion middle");
		s.assertTrue(actualCity.contains(expectedCity));
		System.out.println("SoftAssertion ends");
		s.assertAll();
		

}
}