package com.testing.Lab1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CsvReaderLab1CommonCsv {
    private static final String SAMPLE_CSV_FILE = "employees-table.csv";

    public static void main(String[] args) {
        try(
                Reader reader = new BufferedReader(new FileReader(SAMPLE_CSV_FILE));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim())
                ){
            for(CSVRecord csvRecord : csvParser){
                int id = Integer.parseInt(csvRecord.get(0));
                String firstName = csvRecord.get(1);
                String lastName = csvRecord.get(2);
                String email = csvRecord.get(3);
                String phone = csvRecord.get(4);
                String hireDate = csvRecord.get(5);
                String jobId = csvRecord.get(6);
                int salary = Integer.parseInt(csvRecord.get(7));
                int departmentId = Integer.parseInt(csvRecord.get(8));

                System.out.println("--------------------------------");
                System.out.println("Record No - "+csvRecord.getRecordNumber());
                System.out.println("Employee id : "+id);
                System.out.println("First name : "+firstName);
                System.out.println("Last name : "+lastName);
                System.out.println("E-mail : "+email);
                System.out.println("Phone number : "+phone);
                System.out.println("Hire date : "+hireDate);
                System.out.println("Job id : "+jobId);
                System.out.println("Salary : "+salary);
                System.out.println("Department id : "+departmentId);
                System.out.println("--------------------------------\n\n");
            }

        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
}
