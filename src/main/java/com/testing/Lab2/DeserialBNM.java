package com.testing.Lab2;

import com.thoughtworks.xstream.XStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeserialBNM {
    public static ValCurs main() {
        XStream xstream = new XStream();
        xstream.processAnnotations(ValCurs.class);
        xstream.processAnnotations(Valute.class);

        String ValCursXmlString = null;
        try {
            ValCursXmlString = new String(Files.readAllBytes(Paths.get("XMLValutes2.xml")), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        ValCurs convertedValute =(ValCurs)xstream.fromXML( ValCursXmlString );
        System.out.println(convertedValute);
        for (Valute val:convertedValute.getList())
            System.out.println(val);
        return convertedValute;
    }
}