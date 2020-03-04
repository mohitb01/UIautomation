package com.gl.automation.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gl.automation.resources.Constants;

public class ExcelUtils {
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row = null;

    public static void setExcelFile(String Path) throws Exception {
        FileInputStream ExcelFile = new FileInputStream(Path);
        ExcelWBook = new XSSFWorkbook(ExcelFile);
    }

    public static String getCellData(int RowNum, int ColNum, String SheetName)
            throws Exception {
        ExcelWSheet = ExcelWBook.getSheet(SheetName);
        try {
            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
            String CellData = Cell.getStringCellValue();
            return CellData;
        } catch (Exception e) {
            return "";
        }
    }

    public static int getRowCount(String SheetName) {
        ExcelWSheet = ExcelWBook.getSheet(SheetName);
        int number = ExcelWSheet.getLastRowNum() + 1;
        return number;
    }

    public static int getRowContains(String sTestCaseName, int colNum,
            String SheetName) throws Exception {
        int i;
        ExcelWSheet = ExcelWBook.getSheet(SheetName);
        int rowCount = ExcelUtils.getRowCount(SheetName);
        for (i = 0; i < rowCount; i++) {
            if (ExcelUtils.getCellData(i, colNum, SheetName)
                    .equalsIgnoreCase(sTestCaseName)) {
                break;
            }
        }
        return i;
    }

    public static int getTestStepsCount(String SheetName, String sTestCaseID,
            int iTestCaseStart) throws Exception {
        for (int i = iTestCaseStart; i <= ExcelUtils
                .getRowCount(SheetName); i++) {
            if (!sTestCaseID.equals(ExcelUtils.getCellData(i,
                    Constants.Col_TestCaseID, SheetName))) {
                int number = i;
                return number;
            }
        }
        ExcelWSheet = ExcelWBook.getSheet(SheetName);
        int number = ExcelWSheet.getLastRowNum() + 1;
        return number;
    }

    public static int getRows() {
        System.out.println(ExcelWSheet.getLastRowNum());
        return ExcelWSheet.getLastRowNum();
    }

    public static int getColumns() {
        return Row.getLastCellNum();

    }

}
