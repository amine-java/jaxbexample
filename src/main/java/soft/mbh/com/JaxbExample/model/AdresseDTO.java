package soft.mbh.com.JaxbExample.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
public class AdresseDTO {
	
	@XmlElement(name= "rueAdresse")
	private String rue ; 
	
	@XmlElement (name= "cdPostal")
	private String codePostal ; 
	
	@XmlElement (name="ligneAdresse")
	private String ligneAdresse ;

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getLigneAdresse() {
		return ligneAdresse;
	}

	public void setLigneAdresse(String ligneAdresse) {
		this.ligneAdresse = ligneAdresse;
	} 
	
	

}
