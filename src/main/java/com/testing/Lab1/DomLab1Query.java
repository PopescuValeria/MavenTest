package com.testing.Lab1;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DomLab1Query {
    public static void main(String[] args) {
        try{
            File inputFile = new File("lab1.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.print("Root element : ");
            System.out.println(doc.getDocumentElement().getNodeName());




        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
