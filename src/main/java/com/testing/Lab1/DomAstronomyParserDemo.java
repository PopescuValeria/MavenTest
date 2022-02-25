package com.testing.Lab1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DomAstronomyParserDemo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("astronomy.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Node rootElement = doc.getFirstChild();
            System.out.println("Root element : " + rootElement.getNodeName());

            NodeList firstChildRoot = doc.getElementsByTagName("celestial-objects");
            System.out.printf("   First element of root element : " + firstChildRoot.item(0).getNodeName());

            NodeList firstChildCelestial = doc.getElementsByTagName("solar-system");
            System.out.println("      First element of celestial-objects element : " + firstChildCelestial.item(0).getNodeName());

            NodeList celestialObjects = doc.getElementsByTagName("celestial-object");
            System.out.println();

            for (int i = 0; i < celestialObjects.getLength(); i++) {
                Node celestialObject = celestialObjects.item(i);
                if (celestialObject.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) celestialObject;
                    System.out.println("         Type of celestial object " + (i + 1) + " : "
                            + element.getAttribute("type"));

                    if (element.getAttribute("type").equals("planets")) {
                        NodeList planets = doc.getElementsByTagName("planets");
                        System.out.println("            --------- " + planets.item(0).getNodeName() + " ---------");

                        NodeList bigPlanets = doc.getElementsByTagName("big-planets");
                        System.out.println("            a. " + bigPlanets.item(0).getNodeName());

                        NodeList planetsList = doc.getElementsByTagName("planet");
                        for (int j = 0; j < planetsList.getLength(); j++) {
                            Node planetNode = planetsList.item(j);
                            if (planetNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element ePlanet = (Element) planetNode;
                                if(ePlanet.getAttribute("satellites") == ""){

                                }else{
                                    System.out.print("               " + (j + 1) + " planet : " + ePlanet.getTextContent());
                                    System.out.println(" --> satellites : "
                                            + ePlanet.getAttribute("satellites") + " and type : "
                                            + ePlanet.getAttribute("type"));
                                }
                            }
                        }
                            System.out.println();
                            NodeList dwarfPlanets = doc.getElementsByTagName("dwarf-planets");
                            System.out.println("            b. " + dwarfPlanets.item(0).getNodeName());

                            for (int x = 0; x < planetsList.getLength(); x++) {
                                Node planet1Node = planetsList.item(x);
                                if (planet1Node.getNodeType() == Node.ELEMENT_NODE) {
                                    Element ePlanet = (Element) planet1Node;
                                    if(ePlanet.getAttribute("satellites") == ""){
                                        System.out.println("               " + (x + 1) + " planet : " + ePlanet.getTextContent());
                                    }
                                }
                            }
                        System.out.println();
                        }

                    //System.out.println();
                    if (element.getAttribute("type").equals("nebulae")) {
                        NodeList nebulaeList = doc.getElementsByTagName("nebula");
                        System.out.println("            --------- nebulae ---------");
                        for (int z = 0; z < nebulaeList.getLength(); z++) {
                            Node nebulaNode = nebulaeList.item(z);
                            if (nebulaNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element eNebula = (Element) nebulaNode;
                                System.out.println("               "+(z+1)+". "+eNebula.getTextContent());
                            }
                        }
                        System.out.println();
                    }

                    if (element.getAttribute("type").equals("asteroids")) {
                        NodeList asteroidList = doc.getElementsByTagName("asteroid");
                        System.out.println("            --------- asteroids ---------");
                        for (int a = 0; a < asteroidList.getLength(); a++) {
                            Node asteroidNode = asteroidList.item(a);
                            if (asteroidNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element eAsteroid = (Element) asteroidNode;
                                System.out.println("               "+(a+1)+". "+eAsteroid.getTextContent());
                                System.out.println("                  diameter-percent-of-the-moon : "
                                        +eAsteroid.getAttribute("diameter-percent-of-the-moon"));
                                System.out.println("                  orbital-radius : "
                                        +eAsteroid.getAttribute("orbital-radius"));

                            }
                        }
                        System.out.println();
                    }

                    if (element.getAttribute("type").equals("comets")) {
                        NodeList cometList = doc.getElementsByTagName("comet");
                        System.out.println("            --------- comets ---------");
                        for (int b = 0; b < cometList.getLength(); b++) {
                            Node cometNode = cometList.item(b);
                            if (cometNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element eComet = (Element) cometNode;
                                System.out.println("               "+(b+1)+". "+eComet.getTextContent());
                                System.out.println("                  cycle : "
                                        +eComet.getAttribute("cycle"));
                                System.out.println("                  date-of-discovery : "
                                        +eComet.getAttribute("date-of-discovery"));
                                System.out.println("                  last-appearance : "
                                        +eComet.getAttribute("last-appearance"));

                            }
                        }
                        System.out.println();
                    }

                }

            }


                System.out.println();
                NodeList secondChildCelestial = doc.getElementsByTagName("deep-sky-objects");
                System.out.println("      Second element of celestial-objects element : " + secondChildCelestial.item(0).getNodeName());
                NodeList deepSkyObject = doc.getElementsByTagName("deep-sky-object");
            System.out.println("         First element of deep-sky-object : " + deepSkyObject.item(0).getNodeName());
            System.out.println("         Second element of deep-sky-object : " + deepSkyObject.item(1).getNodeName());

                System.out.println();
                NodeList secondChildRoot = doc.getElementsByTagName("celestial-phenomena");
                System.out.println("   Second element of root element : " + secondChildRoot.item(0).getNodeName());
                NodeList childPhenomenon = doc.getElementsByTagName("celestial-phenomenon");
                System.out.println("      First element of celestial-phenomena element : " + childPhenomenon.item(0).getTextContent());
                System.out.println("      Second element of celestial-phenomena element : " + childPhenomenon.item(1).getTextContent());

            }catch(Exception e){
                e.printStackTrace();
            }

    }
}
