package XMLwork;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class XMLUtility {
	
	public void readXML() throws JAXBException {
		
		File f = new File("testData.xml");
		JAXBContext j = JAXBContext.newInstance(RegData.class);
		Unmarshaller u = j.createUnmarshaller();
		RegData r = (RegData)u.unmarshal(f);
		List<DataXML> mydata = r.getUserdata();
		
		for(DataXML d:mydata) {
			
			System.out.println("FirstName"+d.getFirstName());
			System.out.println("LAstName"+d.getLastName());
		}
		
	}

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		XMLUtility x = new XMLUtility();
		x.readXML();
	}

}
