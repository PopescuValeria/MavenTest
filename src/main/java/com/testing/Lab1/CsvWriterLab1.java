package com.testing.Lab1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CsvWriterLab1 {
    private static final String SAMPLE_CSV_FILE = "employees-table.csv";
    public static void main(String[] args) {

        try(
                BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE), StandardOpenOption.CREATE_NEW);
                CSVPrinter csvPrinter = new CSVPrinter(bufferedWriter, CSVFormat.DEFAULT
                        .withHeader("id", "first_name", "last_name", "email", "phone_number", "hire_date", "job_id", "salary", "department_id"))
        ){
            csvPrinter.printRecord("100", "Steven", "King", "SKING", "515.123.4567", "17-JUN-03"
                    , "AD_PRES", "24000", "90");
            csvPrinter.printRecord("101", "Neena", "Kochar", "NKOCHAR", "515.123.4568",
                    "21-SEP-05" , "AD_VP", "17000", "90");
            csvPrinter.printRecord("102", "Lex", "De Haan", "LDEHAAN", "515.123.4569",
                    "13-JAN-01" , "AD_VP", "17000", "90");
            csvPrinter.printRecord("103", "Alexander", "Hunold", "AHUNOLD", "590.423.4567",
                    "03_JAN-06" , "IT_PROG", "9000", "60");
            csvPrinter.printRecord("104", "Bruce", "Ernst", "BERNST", "590.423.4568",
                    "21-MAY-07" , "IT_PROG", "6000", "60");
            csvPrinter.printRecord("105", "Daniel", "Faviet", "DFAVIET", "515.124.4169",
                    "02-JUN-03" , "FI_ACCOUNT", "9000", "100");
            csvPrinter.printRecord("106", "John", "Chen", "JCHEN", "515.124.4269",
                    "28-SEP-05" , "FI_ACCOUNT", "9000", "100");

            csvPrinter.flush();


        }catch (Exception e){

        }
    }
}
