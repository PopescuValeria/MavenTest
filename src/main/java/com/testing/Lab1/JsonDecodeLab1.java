package com.testing.Lab1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonDecodeLab1 {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try{
            Object obj = parser.parse(new FileReader("lab1.json"));
            JSONObject obj1 = (JSONObject) obj;
            System.out.println(obj);

            String tag1 = (String) obj1.get("tag1");
            System.out.println("The second "+tag1);

        }catch (ParseException | FileNotFoundException pe){
            pe.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
