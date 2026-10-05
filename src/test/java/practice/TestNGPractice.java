package practice;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {
	
	@Test(priority=1)
	public void lathuWakes() {
     //   Assert.fail();
		System.out.println("drink tea");
	}
	
	@Test(priority=2, dependsOnMethods = {"lathuWakes"})
	public void lathuChats() {
		System.out.println("hi mummy");
	}
	
	@Ignore
	@Test(priority='a' /*, enables=false*/)
	public void lathuEats() {
		System.out.println("i like curd rice");
	}
	
	@Test(priority=-4, invocationCount = 2)
	public void lathuOut() {
		System.out.println("i like visit food shops");
	}
}


