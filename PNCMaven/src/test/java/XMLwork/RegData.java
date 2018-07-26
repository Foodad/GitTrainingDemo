package XMLwork;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.crypto.Data;

@XmlRootElement(name= "RegistrationData")

public class RegData {

	private List<DataXML> regdata;

	@XmlElement()
	public void setUserdata(List<DataXML> d) {

		this.regdata =d;
	}

	public List<DataXML> getUserdata() {

		return regdata;
	}





}
