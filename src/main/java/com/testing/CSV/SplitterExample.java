package com.testing.CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SplitterExample {
    public static void main(String[] args)
    {
        //Input file which needs to be parsed
        String fileToParse = "scanner_ex.csv";
        BufferedReader fileReader = null;

        //Delimiter used in CSV file
        final String DELIMITER = "\\|";
        try
        {
            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileToParse));

            //Read the file line by line
            while ((line = fileReader.readLine()) != null)
            {
                //Get all tokens available in line
                String[] tokens = line.split(DELIMITER);
                for(String token : tokens)
                {
                    //Print all tokens
                    System.out.println(token);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            System.err.println("IOException - primul catch");
        }catch (NullPointerException ex){
            ex.toString();
        }
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
