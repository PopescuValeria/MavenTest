package com.testing.Xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DomParserDemo {
    public static void main(String[] args) {
        try{
            File inputFile = new File("students.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuider = dbFactory.newDocumentBuilder();
            Document doc = dBuider.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element : "+doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println("-------------------------------");

            for(int temp = 0; temp < nList.getLength(); temp++){
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : "+nNode.getNodeName());

                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    System.out.println("Student roll no : "
                            +eElement.getAttribute("rollno"));
                    System.out.println("First name : "
                            +eElement
                            .getElementsByTagName("firstname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Last name : "
                            +eElement
                            .getElementsByTagName("lastname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Nick name : "
                            +eElement
                            .getElementsByTagName("nickname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Marks : "
                            +eElement
                            .getElementsByTagName("marks")
                            .item(0)
                            .getTextContent());

                    if(eElement.getElementsByTagName("status").getLength() > 0){
                        System.out.println("Status : "
                                +eElement.getElementsByTagName("status")
                                .item(0)
                                .getTextContent());
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
