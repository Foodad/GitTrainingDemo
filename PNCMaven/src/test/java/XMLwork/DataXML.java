package XMLwork;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Data")
public class DataXML {
	
	private String firstname;
	private String Lastname;
	
	@XmlElement(name ="firstname")
	public void setFirstName(String f) {
		this.firstname=f;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	@XmlElement(name ="LastName")
	public void setLastName(String l) {
		this.Lastname=l;
	}
	
	public String getLastName() {
		return Lastname;
	}

}
