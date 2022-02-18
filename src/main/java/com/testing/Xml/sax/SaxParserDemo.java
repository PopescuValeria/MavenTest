package com.testing.Xml.sax;

import org.w3c.dom.UserDataHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParserDemo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("studentSax.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler userHandler = new UserHandler();
            saxParser.parse(inputFile, userHandler);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class UserHandler extends DefaultHandler{
    boolean bFirstName = false;
    boolean bLastName = false;
    boolean bNickName = false;
    boolean bMarks = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equalsIgnoreCase("student")){
            String rollNo = attributes.getValue("rollno");
            System.out.println("Roll No : "+rollNo);
        }else if (qName.equalsIgnoreCase("firstname")){
            bFirstName = true;
        }else if (qName.equalsIgnoreCase("lastname")){
            bLastName = true;
        }else if (qName.equalsIgnoreCase("nickname")){
            bNickName = true;
        }else if (qName.equalsIgnoreCase("marks")){
            bMarks = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equalsIgnoreCase("student")){
            System.out.println("End element : "+ qName);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(bFirstName){
            System.out.println("First name: "+new String(ch, start, length));
            bFirstName = false;
        }else if (bLastName){
            System.out.println("Last name: "+new String(ch, start, length));
            bLastName = false;
        }else if (bNickName){
            System.out.println("Nick name: "+new String(ch, start, length));
            bNickName = false;
        }else if (bMarks){
            System.out.println("Marks: "+new String(ch, start, length));
            bMarks = false;
        }
    }
}
