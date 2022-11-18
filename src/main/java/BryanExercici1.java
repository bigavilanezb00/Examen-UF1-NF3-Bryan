import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class BryanExercici1 {
    public static void main(String[] args) throws TransformerException, ParserConfigurationException, IOException, SAXException {


            File file = new File("filmsexamen.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);

            Element element = document.getDocumentElement();
            Element film = document.createElement("Film");
            element.appendChild(film);
            Attr atributo = document.createAttribute("produced");
            atributo.setNodeValue("1939");
            film.setAttributeNode(atributo);

            Element title = document.createElement("Title");
            title.appendChild(document.createTextNode("Cumbres Borrascosas"));
            film.appendChild(title);

            Element director = document.createElement("Director");
            director.appendChild(document.createTextNode("William Wyler"));
            film.appendChild(director);

            Element country = document.createElement("Country");
            country.appendChild(document.createTextNode("USA"));
            film.appendChild(country);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File("filmsexamen.xml"));
            transformer.transform(domSource, streamResult);
    }
}
