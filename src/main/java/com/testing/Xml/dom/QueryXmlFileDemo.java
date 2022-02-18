package com.testing.Xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class QueryXmlFileDemo {
    public static void main(String[] args) {
        try{
            File inputFile = new File("cars.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.print("Root element : ");
            System.out.println(doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("supercars");
            System.out.println("------------------------------");

            for(int temp = 0; temp < nList.getLength(); temp++){
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : ");
                System.out.print(nNode.getNodeName());

                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElment = (Element) nNode;
                    System.out.print("company : ");
                    System.out.println(eElment.getAttribute("company"));
                    NodeList carNameList = eElment.getElementsByTagName("carname");

                    for(int count = 0; count < carNameList.getLength(); count++){
                        Node node1 = carNameList.item(count);

                        if(node1.getNodeType() == Node.ELEMENT_NODE){
                            Element car = (Element) node1;
                            System.out.println("car name : "
                                    +car.getTextContent());
                            System.out.println("car type : "
                                    +car.getAttribute("type"));
                        }
                    }
                }
            }
        }catch (Exception e){

        }
    }
}
