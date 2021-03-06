package com.gl.automation.resources;
/*
 * author : Mohit Bhatt
 * Date : 
 */

public class Constants {
	public static final String Dir = System.getProperty("user.dir");
    public static final String URL = "http://gmail.com";
    public static final String Path_TestData = Dir+"/src/main/java/DataEngine.xlsx";
    public static final String File_TestData = "DataEngine.xlsx";
    public static final String Path_OR = Dir+"/src/main/java/com/gl/automation/resources/OR.properties";
    public static final String Path_GECKO = Dir+"/geckodriver";
    public static final String Path_IEDRIVER = "";
    public static final String Path_CHROMEDRIVER = Dir+"/ChromeDriver.exe";

    // List of Data Sheet Column Numbers
    public static final int Col_TestCaseID = 0;
    public static final int Col_TestScenarioID = 1;
    public static final int Col_ActionKeyword = 3;
    public static final int Col_PageObject = 4;

    // List of Data Engine Excel sheets
    public static final String Sheet_TestSteps = "DataEngine";

    // List of Test Data
    public static final String UserName = "testuser_3";
    public static final String Password = "Test@123";

}