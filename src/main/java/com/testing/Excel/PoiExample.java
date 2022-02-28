package com.testing.Excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.WorkbookUtil;

public class PoiExample {
    public static void main(String[] args) {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet1 = wb.createSheet("new sheet");

        String safeName = WorkbookUtil.createSafeSheetName("[O'Brien's sales*?]"); // returns " O'Brien's sales   "
        Sheet sheet3 = wb.createSheet(safeName);

        CreationHelper createHelper = wb.getCreationHelper();

        // Create a row and put some cells in it. Rows are 0 based.
        Row row = sheet1.createRow(0);
//        // Create a cell and put a value in it.
        Cell cell = row.createCell(0);
        cell.setCellValue(1);

        // Or do it on one line.
        row.createCell(1).setCellValue(1.2);
        row.createCell(2).setCellValue(
                createHelper.createRichTextString("This is a string \n \n"));
    }
}
