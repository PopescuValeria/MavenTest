package com.testing.Xml.dom;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateAstronomyXMLDom {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.newDocument();

            Element rootElement = doc.createElement("universe");
            doc.appendChild(rootElement);

            // 1 child of document
            Element celestialObjects = doc.createElement("celestial-objects");
            rootElement.appendChild(celestialObjects);

                // 1 child of celestialObjects
                Element solarSystem = doc.createElement("solar-system");
                celestialObjects.appendChild(solarSystem);

                    // 1 child of solarSystem
                    Element celestialObject1 = doc.createElement("celestial-object");
                    // setting attribute to celestial object 1
                    Attr attr1 = doc.createAttribute("type");
                    attr1.setValue("moon");
                    celestialObject1.setAttributeNode(attr1);
                    celestialObject1.appendChild(doc.createTextNode("Moon"));
                    solarSystem.appendChild(celestialObject1);


                    // 2 child of solarSystem
                    Element celestialObject2 = doc.createElement("celestial-object");
                    // setting attribute to celestial object 2
                    Attr attr2 = doc.createAttribute("type");
                    attr2.setValue("planets");
                    celestialObject2.setAttributeNode(attr2);
                    solarSystem.appendChild(celestialObject2);

                        // 1 child of celestialObject2
                        Element planets = doc.createElement("planets");
                        celestialObject2.appendChild(planets);

                            // 1 child of planets
                            Element bigPlanet = doc.createElement("big-planets");
                            planets.appendChild(bigPlanet);

                                // 1 child of bigPlanet
                                Element planet1 = doc.createElement("planet");
                                Attr attrP1 = doc.createAttribute("satellites");
                                attrP1.setValue("0");
                                planet1.setAttributeNode(attrP1);
                                Attr attrP11 = doc.createAttribute("type");
                                attrP11.setValue("telluric planet");
                                planet1.setAttributeNode(attrP11);
                                planet1.appendChild(doc.createTextNode("Mercury"));
                                bigPlanet.appendChild(planet1);

                                // 2 child of bigPlanet
                                Element planet2 = doc.createElement("planet");
                                Attr attrP2 = doc.createAttribute("satellites");
                                attrP2.setValue("0");
                                planet2.setAttributeNode(attrP2);
                                Attr attrP22 = doc.createAttribute("type");
                                attrP22.setValue("telluric planet");
                                planet2.setAttributeNode(attrP22);
                                planet2.appendChild(doc.createTextNode("Venus"));
                                bigPlanet.appendChild(planet2);

                                // 3 child of bigPlanet
                                Element planet3 = doc.createElement("planet");
                                Attr attrP3 = doc.createAttribute("satellites");
                                attrP3.setValue("1");
                                planet3.setAttributeNode(attrP3);
                                Attr attrP33 = doc.createAttribute("type");
                                attrP33.setValue("telluric planet");
                                planet3.setAttributeNode(attrP33);
                                planet3.appendChild(doc.createTextNode("Earth"));
                                bigPlanet.appendChild(planet3);

                                // 4 child of bigPlanet
                                Element planet4 = doc.createElement("planet");
                                Attr attrP4 = doc.createAttribute("satellites");
                                attrP4.setValue("2");
                                planet4.setAttributeNode(attrP4);
                                Attr attrP44 = doc.createAttribute("type");
                                attrP44.setValue("telluric planet");
                                planet4.setAttributeNode(attrP44);
                                planet4.appendChild(doc.createTextNode("Mars"));
                                bigPlanet.appendChild(planet4);

                                // 5 child of bigPlanet
                                Element planet5 = doc.createElement("planet");
                                Attr attrP5 = doc.createAttribute("satellites");
                                attrP5.setValue("79");
                                planet5.setAttributeNode(attrP5);
                                Attr attrP55 = doc.createAttribute("type");
                                attrP55.setValue("gas giants");
                                planet5.setAttributeNode(attrP55);
                                planet5.appendChild(doc.createTextNode("Jupiter"));
                                bigPlanet.appendChild(planet5);

                                // 6 child of bigPlanet
                                Element planet6 = doc.createElement("planet");
                                Attr attrP6 = doc.createAttribute("satellites");
                                attrP6.setValue("82");
                                planet6.setAttributeNode(attrP6);
                                Attr attrP66 = doc.createAttribute("type");
                                attrP66.setValue("gas giant");
                                planet6.setAttributeNode(attrP66);
                                planet6.appendChild(doc.createTextNode("Saturn"));
                                bigPlanet.appendChild(planet6);

                                // 7 child of bigPlanet
                                Element planet7 = doc.createElement("planet");
                                Attr attrP7 = doc.createAttribute("satellites");
                                attrP7.setValue("27");
                                planet7.setAttributeNode(attrP7);
                                Attr attrP77 = doc.createAttribute("type");
                                attrP77.setValue("ice giant");
                                planet7.setAttributeNode(attrP77);
                                planet7.appendChild(doc.createTextNode("Uranus"));
                                bigPlanet.appendChild(planet7);

                                // 8 child of bigPlanet
                                Element planet8 = doc.createElement("planet");
                                Attr attrP8 = doc.createAttribute("satellites");
                                attrP8.setValue("14");
                                planet8.setAttributeNode(attrP8);
                                Attr attrP88 = doc.createAttribute("type");
                                attrP88.setValue("ice giant");
                                planet8.setAttributeNode(attrP88);
                                planet8.appendChild(doc.createTextNode("Neptune"));
                                bigPlanet.appendChild(planet8);

                            // 2 child of planets
                            Element dwarfPlanet = doc.createElement("dwarf-planets");
                            planets.appendChild(dwarfPlanet);

                                // 1 child of dwarfPlanet
                                Element planet9 = doc.createElement("planet");
                                planet9.appendChild(doc.createTextNode("Ceres"));
                                dwarfPlanet.appendChild(planet9);

                                // 2 child of dwarfPlanet
                                Element planet10 = doc.createElement("planet");
                                planet10.appendChild(doc.createTextNode("Pluto"));
                                dwarfPlanet.appendChild(planet10);

                                // 3 child of dwarfPlanet
                                Element planet11 = doc.createElement("planet");
                                planet11.appendChild(doc.createTextNode("Eris"));
                                dwarfPlanet.appendChild(planet11);

                    // 3 child of solarSystem
                    Element celestialObject3 = doc.createElement("celestial-object");
                    // setting attribute to celestial object 2
                    Attr attr3 = doc.createAttribute("type");
                    attr3.setValue("nebulae");
                    celestialObject3.setAttributeNode(attr3);
                    solarSystem.appendChild(celestialObject3);

                        // 1 child of celestialObject3
                        Element nebulae = doc.createElement("nebulae");
                        celestialObject3.appendChild(nebulae);

                            // 1 child of nebulae
                            Element nebula1 = doc.createElement("nebula");
                            nebula1.appendChild(doc.createTextNode("Omega Nebula"));
                            nebulae.appendChild(nebula1);

                            // 2 child of nebulae
                            Element nebula2 = doc.createElement("nebula");
                            nebula2.appendChild(doc.createTextNode("Horsehead nebula"));
                            nebulae.appendChild(nebula2);

                            // 3 child of nebulae
                            Element nebula3 = doc.createElement("nebula");
                            nebula3.appendChild(doc.createTextNode("Cat's Eye Nebula"));
                            nebulae.appendChild(nebula3);

                            // 4 child of nebulae
                            Element nebula4 = doc.createElement("nebula");
                            nebula4.appendChild(doc.createTextNode("Red Rectangle Nebula"));
                            nebulae.appendChild(nebula4);

                    // 4 child of solarSystem
                    Element celestialObject4 = doc.createElement("celestial-object");
                    // setting attribute to celestial object 4
                    Attr attr4 = doc.createAttribute("type");
                    attr4.setValue("asteroids");
                    celestialObject4.setAttributeNode(attr4);
                    celestialObject4.appendChild(doc.createTextNode("Asteroids"));
                    solarSystem.appendChild(celestialObject4);

                        // 1 child of celestialObject4
                        Element asteroid1 = doc.createElement("asteroid");
                        // setting attribute to celestial object 4
                        Attr attr41 = doc.createAttribute("orbital-radius");
                        attr41.setValue("2.36");
                        asteroid1.setAttributeNode(attr41);
                        Attr attr42 = doc.createAttribute("diameter-percent-of-the-moon");
                        attr42.setValue("15%");
                        asteroid1.setAttributeNode(attr42);
                        asteroid1.appendChild(doc.createTextNode("Vesta"));
                        celestialObject4.appendChild(asteroid1);

                        // 2 child of celestialObject4
                        Element asteroid2 = doc.createElement("asteroid");
                        // setting attribute to celestial object 4
                        Attr attr43 = doc.createAttribute("orbital-radius");
                        attr43.setValue("2.77");
                        asteroid2.setAttributeNode(attr43);
                        Attr attr44 = doc.createAttribute("diameter-percent-of-the-moon");
                        attr44.setValue("28%");
                        asteroid2.setAttributeNode(attr44);
                        asteroid2.appendChild(doc.createTextNode("Ceres"));
                        celestialObject4.appendChild(asteroid2);

                        // 3 child of celestialObject4
                        Element asteroid3 = doc.createElement("asteroid");
                        // setting attribute to celestial object 4
                        Attr attr45 = doc.createAttribute("orbital-radius");
                        attr45.setValue("2.77");
                        asteroid3.setAttributeNode(attr45);
                        Attr attr46 = doc.createAttribute("diameter-percent-of-the-moon");
                        attr46.setValue("16%");
                        asteroid3.setAttributeNode(attr46);
                        asteroid3.appendChild(doc.createTextNode("Pallas"));
                        celestialObject4.appendChild(asteroid3);

                        // 4 child of celestialObject4
                        Element asteroid4 = doc.createElement("asteroid");
                        // setting attribute to  asteroid4
                        Attr attr47 = doc.createAttribute("orbital-radius");
                        attr47.setValue("3.14");
                        asteroid4.setAttributeNode(attr47);
                        Attr attr48 = doc.createAttribute("diameter-percent-of-the-moon");
                        attr48.setValue("12%");
                        asteroid4.setAttributeNode(attr48);
                        asteroid4.appendChild(doc.createTextNode("Hygiea"));
                        celestialObject4.appendChild(asteroid4);


                    // 5 child of solarSystem
                    Element celestialObject5 = doc.createElement("celestial-object");
                    // setting attribute to celestial object 5
                    Attr attr5 = doc.createAttribute("type");
                    attr5.setValue("comets");
                    celestialObject5.setAttributeNode(attr5);
                    celestialObject5.appendChild(doc.createTextNode("Comets"));
                    solarSystem.appendChild(celestialObject5);

                        // 1 child of celestialObject5
                        Element comet1 = doc.createElement("comet");
                        // setting attribute to comet1
                        Attr attr511 = doc.createAttribute("date-of-discovery");
                        attr511.setValue("239 av.J.-C.");
                        comet1.setAttributeNode(attr511);
                        Attr attr512 = doc.createAttribute("cycle");
                        attr512.setValue("76 years");
                        comet1.setAttributeNode(attr512);
                        Attr attr513 = doc.createAttribute("last-appearance");
                        attr513.setValue("1986");
                        comet1.setAttributeNode(attr513);
                        comet1.appendChild(doc.createTextNode("Halley Comet"));
                        celestialObject5.appendChild(comet1);

                        // 2 child of celestialObject5
                        Element comet2 = doc.createElement("comet");
                        // setting attribute to comet2
                        Attr attr521 = doc.createAttribute("date-of-discovery");
                        attr521.setValue("44 av.J.-C.");
                        comet2.setAttributeNode(attr521);
                        Attr attr522 = doc.createAttribute("cycle");
                        attr522.setValue("?");
                        comet2.setAttributeNode(attr522);
                        Attr attr523 = doc.createAttribute("last-appearance");
                        attr523.setValue("44 av.J.-C.");
                        comet2.setAttributeNode(attr523);
                        comet2.appendChild(doc.createTextNode("Caesar's Comet"));
                        celestialObject5.appendChild(comet2);

                        // 3 child of celestialObject5
                        Element comet3 = doc.createElement("comet");
                        // setting attribute to comet3
                        Attr attr531 = doc.createAttribute("date-of-discovery");
                        attr531.setValue("1786");
                        comet3.setAttributeNode(attr531);
                        Attr attr532 = doc.createAttribute("cycle");
                        attr532.setValue("3.3 years");
                        comet3.setAttributeNode(attr532);
                        Attr attr533 = doc.createAttribute("last-appearance");
                        attr533.setValue("2016");
                        comet3.setAttributeNode(attr533);
                        comet3.appendChild(doc.createTextNode("Encke"));
                        celestialObject5.appendChild(comet3);

                        // 4 child of celestialObject5
                        Element comet4 = doc.createElement("comet");
                        // setting attribute to comet3
                        Attr attr541 = doc.createAttribute("date-of-discovery");
                        attr541.setValue("1862");
                        comet4.setAttributeNode(attr541);
                        Attr attr542 = doc.createAttribute("cycle");
                        attr542.setValue("133.28 years");
                        comet4.setAttributeNode(attr542);
                        Attr attr543 = doc.createAttribute("last-appearance");
                        attr543.setValue("1992");
                        comet4.setAttributeNode(attr543);
                        comet4.appendChild(doc.createTextNode("Swift-Tuttle"));
                        celestialObject5.appendChild(comet4);

                        // 5 child of celestialObject5
                        Element comet5 = doc.createElement("comet");
                        // setting attribute to comet5
                        Attr attr551 = doc.createAttribute("date-of-discovery");
                        attr551.setValue("1995");
                        comet5.setAttributeNode(attr551);
                        Attr attr552 = doc.createAttribute("cycle");
                        attr552.setValue("18000 years");
                        comet5.setAttributeNode(attr552);
                        Attr attr553 = doc.createAttribute("last-appearance");
                        attr553.setValue("1997");
                        comet5.setAttributeNode(attr553);
                        comet5.appendChild(doc.createTextNode("Hale-Bopp"));
                        celestialObject5.appendChild(comet5);

                        // 6 child of celestialObject5
                        Element comet6 = doc.createElement("comet");
                        // setting attribute to comet6
                        Attr attr561 = doc.createAttribute("date-of-discovery");
                        attr561.setValue("1996");
                        comet6.setAttributeNode(attr561);
                        Attr attr562 = doc.createAttribute("cycle");
                        attr562.setValue("14000 years");
                        comet6.setAttributeNode(attr562);
                        Attr attr563 = doc.createAttribute("last-appearance");
                        attr563.setValue("1996");
                        comet6.setAttributeNode(attr563);
                        comet6.appendChild(doc.createTextNode("Hyakutake"));
                        celestialObject5.appendChild(comet6);

                    // 6 child of solarSystem
                    Element celestialObject6 = doc.createElement("celestial-object");
                    // setting attribute to celestial object 6
                    Attr attr6 = doc.createAttribute("type");
                    attr6.setValue("meteorites");
                    celestialObject6.setAttributeNode(attr6);
                    celestialObject6.appendChild(doc.createTextNode("Meteorites"));
                    solarSystem.appendChild(celestialObject6);

                // 2 child of celestialObjects
                Element deepSkyObjects = doc.createElement("deep-sky-objects");
                celestialObjects.appendChild(deepSkyObjects);

                    Element deepSkyObject1 = doc.createElement("deep-sky-object");
                    deepSkyObject1.appendChild(doc.createTextNode("Double stars"));
                    deepSkyObjects.appendChild(deepSkyObject1);

                    Element deepSkyObject2 = doc.createElement("deep-sky-object");
                    deepSkyObject2.appendChild(doc.createTextNode("Space satellites"));
                    deepSkyObjects.appendChild(deepSkyObject2);

            // 2 child document
            Element celestialPhenomena = doc.createElement("celestial-phenomena");
            rootElement.appendChild(celestialPhenomena);

                Element celestialPhenomenon1 = doc.createElement("celestial-phenomenon");
                celestialPhenomenon1.appendChild(doc.createTextNode("Eclipses"));
                celestialPhenomena.appendChild(celestialPhenomenon1);

                Element celestialPhenomenon2 = doc.createElement("celestial-phenomenon");
                celestialPhenomenon2.appendChild(doc.createTextNode("Occultations"));
                celestialPhenomena.appendChild(celestialPhenomenon2);


            //write content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("astronomy.xml"));
            transformer.transform(source, result);

            //output to console for testing
            //StreamResult condoleResult = new StreamResult(System.out);
            //transformer.transform(source, condoleResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
