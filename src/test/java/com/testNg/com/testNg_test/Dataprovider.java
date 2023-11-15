package com.testNg.com.testNg_test;


import org.testng.annotations.Test;

public class Dataprovider extends DataProviderTest{
	

	@Test(dataProvider="dataProvider1", dataProviderClass=DataProviderTest.class)
	public void test1(String p1, String p2, String p3) {
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("#########################");
	}
	

	
}
