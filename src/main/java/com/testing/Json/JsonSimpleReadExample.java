package com.testing.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JsonSimpleReadExample {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try{
            Object obj = parser.parse(new FileReader("test2.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("name");
            System.out.println("Name - "+name);

            long age = (long) jsonObject.get("age");
            System.out.println("Age - "+age);

            //loop array
            JSONArray msg = (JSONArray) jsonObject.get("messages");
            Iterator<String> iterator = msg.iterator();
            System.out.print("List of messages: ");
            while (iterator.hasNext()){
                System.out.print(iterator.next()+" | ");
            }

            System.out.println();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
