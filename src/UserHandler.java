import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {
    boolean title = false;
    boolean director = false;
    boolean country = false;
    int contador = 1;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("Film")) {
            String atributo = attributes.getValue("produced");
            System.out.println("Film " + contador);
            contador++;
            System.out.println("Any: " + atributo);
        } else if (qName.equalsIgnoreCase("Title")) {
            title = true;
        } else if (qName.equalsIgnoreCase("Director")) {
            director = true;
        } else if (qName.equalsIgnoreCase("Country")) {
            country = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Film")) {
            System.out.println("-----------------------------------");
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (title) {
            System.out.println("Titol: " + new String(ch, start, length));
            title = false;
        } else if (director) {
            System.out.println("Director: " + new String(ch,start,length));
            director = false;
        } else if (country) {
            System.out.println("Pais: "+ new String(ch, start, length));
            country = false;
        }
    }
}
