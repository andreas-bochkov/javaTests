import org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Attr;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class DOMNodesOrder {

public static void main(String args[]) {

String xml="<r><a n='1'><a n='2'/></a><a n='3'/></r>";

System.out.println("100");
NodeList nodeList = convertStringToDocument(xml).getDocumentElement().getElementsByTagName("*");
for (int i = 0; i < nodeList.getLength(); i++) {
System.out.println(((Element)nodeList.item(i)).getAttributeNode("n").getValue());
}
}
private static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        try  
        {  
            builder = factory.newDocumentBuilder();  
            Document doc = builder.parse( new InputSource( new StringReader( xmlStr ) ) ); 
            return doc;
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        return null;
    }

}
