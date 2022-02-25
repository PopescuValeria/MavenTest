package com.testing.Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvReaderLab1Scanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("employees-table.csv"));
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
