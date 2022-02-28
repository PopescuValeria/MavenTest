package com.testing.Excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;

public class PoiCalendarExample {
    public static void main(String[] args) {
        //Workbook wb = new XSSFWorkbook();
        Workbook wb = new HSSFWorkbook();
        CreationHelper creationHelper = wb.getCreationHelper();

        Sheet sheet = wb.createSheet("new sheet");

        // Create a row and put some cells in it. Rows are 0 based.
        Row row = sheet.createRow(0);

        // Create a cell and put a date value in it.  The first cell is not styled
        // as a date.
        Cell cell = row.createCell(0);
        cell.setCellValue(new Date());

        // we style the second cell as a date (and time).  It is important to
        // create a new cell style from the workbook otherwise you can end up
        // modifying the built in style and effecting not only this cell but other cells.
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("m/dd/yyy h:mm"));
        cell = row.createCell(1);
        cell.setCellValue(new Date());
        cell.setCellStyle(cellStyle);

        //you can also set date as java.util.Calendar
        cell = row.createCell(2);
        cell.setCellValue(Calendar.getInstance());
        cell.setCellStyle(cellStyle);

        Row row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue(1.1);
        row2.createCell(1).setCellValue(new Date());
        row2.createCell(2).setCellValue(Calendar.getInstance());
        row2.createCell(3).setCellValue("a string");
        row2.createCell(4).setCellValue(true);
        row2.createCell(5).setCellType(Cell.CELL_TYPE_ERROR);

        //write the output to a file
        try(OutputStream fileout = new FileOutputStream("workbookCalendar.xlsx")){
            wb.write(fileout);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
