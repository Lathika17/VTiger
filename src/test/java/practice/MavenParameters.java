package practice;

import org.testng.annotations.Test;

public class MavenParameters {
	@Test
	public void sample() {
		String value  = System.getProperty("phone");
		System.out.println(value);
	}

}
