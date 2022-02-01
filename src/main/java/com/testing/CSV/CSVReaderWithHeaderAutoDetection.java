package com.testing.CSV;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
//reset test
public class CSVReaderWithHeaderAutoDetection {
    private static final String SAMPLE_CSV_FILE_PATH = "employee.csv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = new BufferedReader(new FileReader(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());
        ) {
            for (CSVRecord csvRecord : csvParser) {
                String username = csvRecord.get(0);
                String identifier = csvRecord.get(1);
                String password = csvRecord.get(2);
                String code = csvRecord.get(3);
                String firstName = csvRecord.get(4);
                String lastName = csvRecord.get(5);
                String department = csvRecord.get(6);
                String location = csvRecord.get(7);

                System.out.println("----------------");
                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("----------------------------");
                System.out.printf("%15s%s\n", "Username : ", username);
                System.out.printf("%15s%s\n", "Identifier : ", identifier);
                System.out.printf("%15s%s\n", "Password : ", password);
                System.out.printf("%15s%s\n", "Code : ", code);
                System.out.printf("%15s%s\n", "First Name : ", firstName);
                System.out.printf("%15s%s\n", "Last Name : ", lastName);
                System.out.printf("%15s%s\n", "Department : ", department);
                System.out.printf("%15s%s\n", "Location : ", location);
                System.out.println("----------------------------\n\n");
            }
        }
    }
}