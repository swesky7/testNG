package com.testNg.com.testNg_test;

import org.testng.annotations.DataProvider;


public class DataProviderTest {
 

  @DataProvider
  public Object[][] dataProvider1() {
	  
	  ReadExcelLib excel = new ReadExcelLib();
	  String file = "D:\\Automation\\testNg-test\\TestData\\TestData.xlsx";
	  return excel.Get_Excel_Data(file, "Sheet1", 3);
   
  }
  
  
}
