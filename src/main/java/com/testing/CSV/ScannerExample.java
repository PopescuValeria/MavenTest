package com.testing.CSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("scanner_ex.csv"));
        scanner.useDelimiter("\\|"); // \\|
        while (scanner.hasNext()){
            System.out.print(scanner.next());
        }

        scanner.close();
    }
}
