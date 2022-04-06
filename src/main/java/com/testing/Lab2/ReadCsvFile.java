package com.testing.Lab2;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvFile {
    private static final String SAMPLE_CSV_FILE_PATH = "src/main/resources/date.csv";

    public static List<String> parserCSV () throws IOException {
        List<String> arrayarstring=new ArrayList<>();
        try (Reader reader=new BufferedReader(new FileReader(SAMPLE_CSV_FILE_PATH))) {
            try (CSVParser csvParser=new CSVParser(reader, CSVFormat.DEFAULT)) {
                for (CSVRecord csvRecord : csvParser) {

                    String date=csvRecord.get(0);
                    arrayarstring.add(date);

                    System.out.println("Record No - " + csvRecord.getRecordNumber());
                    System.out.println("---------------");
                    System.out.println("Number : " + date);
                    System.out.println("---------------\n\n");
                }
            }
        }
        for(String ar : arrayarstring){
            System.out.println(ar);
        }
        return arrayarstring;
    }
}
