package com.testNg.com.testNg_test;

import static org.testng.Assert.fail;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependson {
	@Test(dependsOnMethods = {"test2","test3"})//,alwaysRun=true
	public void test1() {
		System.out.println("Test1 Executed");
		System.out.println("--------------------------");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 Executed");
		System.out.println("--------------------------");
		//fail("Test 2 fails");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3 Executed");
		System.out.println("--------------------------");
	}
	
	@Test
	public void test4() {
		System.out.println("Test4 Executed");
		System.out.println("--------------------------");
	}
	
	@Test @Ignore
	public void test5() {
		System.out.println("Test5 Executed");
		System.out.println("--------------------------");
	}
	
	/*
	 * @Test(dataProvider = "dataProvider1", dataProviderClass =
	 * DataProviderTest.class) public void test5(String p1, String p2, String p3) {
	 * System.out.println(p1); System.out.println(p2); System.out.println(p3);
	 * System.out.println("--------------"); }
	 */
}
