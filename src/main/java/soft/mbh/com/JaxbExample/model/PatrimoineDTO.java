package soft.mbh.com.JaxbExample.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class PatrimoineDTO {
	
	@XmlElement(name="patrimoine")
	private String mtPatrimoine ; 
	
	@XmlElement(name="assedic")
	private String mtAssedic ;

	public String getMtPatrimoine() {
		return mtPatrimoine;
	}

	public void setMtPatrimoine(String mtPatrimoine) {
		this.mtPatrimoine = mtPatrimoine;
	}

	public String getMtAssedic() {
		return mtAssedic;
	}

	public void setMtAssedic(String mtAssedic) {
		this.mtAssedic = mtAssedic;
	} 
	
	

}
