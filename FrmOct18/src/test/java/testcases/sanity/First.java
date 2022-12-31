package testcases.sanity;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.TestBase;

public class First extends TestBase {

	@Test
	public void m1() {
		test.log(Status.INFO, "Executing m1 test");
		System.out.println("m1 test passed!!");

	}

	@Test
	public void m2() {
		test.log(Status.INFO, "Executing m2 test");
		Assert.assertTrue(false);
		
		System.out.println("m1 test passed!!");

	}

	@Test
	public void m3() {
		test.log(Status.INFO, "Executing m3 test");
		Assert.assertTrue(false);
		System.out.println("m3 test passed!!");

	}
	
	@Test
	public void m4() {
		Assert.assertTrue(false);
		System.out.println("m4 test passed!!");

	}
	
	@Test
	public void m5() {
		Assert.assertTrue(false);
		System.out.println("m5 test passed!!");

	}
	

}
