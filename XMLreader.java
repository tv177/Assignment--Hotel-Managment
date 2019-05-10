import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


public class XMLreader {

//This Class serves the purpose of reading the XML File "apartment"	
	
public static void main(String argv[]) {

	    try {

		File input = new File("/H:/eclipse/workspace/Assignment/apartment.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(input);
		doc.getDocumentElement().normalize();
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("apartment");
				

		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);	
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
					
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				System.out.println("Apartment id : " + eElement.getAttribute("id"));
				System.out.println("Name of the Apartment: " + eElement.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("The Price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
				System.out.println("The Enddate : " + eElement.getElementsByTagName("enddate").item(0).getTextContent());
				System.out.println("Max number of Guests : " + eElement.getElementsByTagName("maxguests").item(0).getTextContent());
				System.out.println("Number of bedrooms : " + eElement.getElementsByTagName("bedroom").item(0).getTextContent());
				System.out.println("Separate Living Room Or Not : " + eElement.getElementsByTagName("livingroom").item(0).getTextContent());
				System.out.println("Number of bathrooms : " + eElement.getElementsByTagName("bathroom").item(0).getTextContent());
			}
		}
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	  }

}
	

