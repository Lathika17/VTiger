package practice;

import org.testng.Assert;

public class HardAssertion {
	
	public void hardAssertion() {
		String expectedName = "lathika";
		String actualName = "likitha";
		System.out.println("HardAssertion starts");
		Assert.assertEquals(actualName, expectedName);
		System.out.println("HardAssertion middle");
		Assert.assertFalse(actualName.equals(expectedName));
		System.out.println("HardAssertion ends");
	}
}
