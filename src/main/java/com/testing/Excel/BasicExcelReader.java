package com.testing.Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;


public class BasicExcelReader {
    private static final String SAMPLE_EXCEL_FILE_PATH = "userExcel.xlsx";
    public static void main(String[] args) {
        try {
            File file = new File(SAMPLE_EXCEL_FILE_PATH);
            //obtaining input bytes from a file
            FileInputStream fileInputStream = new FileInputStream(file);
            //Creating workbook instance that refers to xls file
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

            Iterator<Row> rowIterator = xssfSheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue());
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t\t\t");
                            break;
                    }
                }
                System.out.println("");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
