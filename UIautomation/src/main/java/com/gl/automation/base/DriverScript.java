package com.gl.automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.gl.automation.keywords.ActionKeywords;
import com.gl.automation.resources.Constants;

public class DriverScript {

    public static ActionKeywords actionKeywords;
    public static String sActionKeyword;
    public static String sPageObject;
    public static Method[] method;
    public static Properties OR;
    static String Path_OR;

    /*
     * public DriverScript() throws NoSuchMethodException, SecurityException,
     * IOException { actionKeywords = new ActionKeywords(); method =
     * actionKeywords.getClass().getMethods();
     * 
     * Path_OR = Constants.Path_OR; FileInputStream fs = new
     * FileInputStream(Path_OR); OR = new Properties(System.getProperties());
     * OR.load(fs); }
     */

    /*
     * public static void main(String[] args) throws Exception { new
     * DriverScript();
     * 
     * // String sPath = Constants.Path_TestData;
     * 
     * ExcelUtils.setExcelFile(Constants.Path_TestData);
     * 
     * for (int iRow = 1; iRow <= ExcelUtils
     * .getRowCount(Constants.Sheet_TestSteps); iRow++) { sActionKeyword =
     * ExcelUtils.getCellData(iRow, Constants.Col_ActionKeyword,
     * Constants.Sheet_TestSteps); sPageObject = ExcelUtils.getCellData(iRow,
     * Constants.Col_PageObject, Constants.Sheet_TestSteps); execute_Actions();
     * } }
     */

    protected static void execute_Actions() throws Exception {
        for (Method method : method) {
            if (method.getName().equals(sActionKeyword)) {
                method.invoke(actionKeywords, sPageObject);
                break;
            }
        }
    }

    static {
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    private static synchronized void init()
            throws NoSuchMethodException, SecurityException, IOException {
        actionKeywords = new ActionKeywords();
        method = actionKeywords.getClass().getMethods();

        Path_OR = Constants.Path_OR;
        FileInputStream fs = new FileInputStream(Path_OR);
        OR = new Properties(System.getProperties());
        OR.load(fs);
    }
}