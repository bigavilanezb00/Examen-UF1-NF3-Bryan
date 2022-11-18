import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class BryanExercici2 {
    public static void main(String[] args) {

        try {
            File file = new File("filmsexamen.xml");

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler handler = new UserHandler();
            saxParser.parse(file, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
