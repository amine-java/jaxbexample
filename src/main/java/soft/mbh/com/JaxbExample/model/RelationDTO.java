package soft.mbh.com.JaxbExample.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class RelationDTO {
	
	
	private String cdRelation ; 
	
	private String cpRelation ;

	public String getCdRelation() {
		return cdRelation;
	}

	public void setCdRelation(String cdRelation) {
		this.cdRelation = cdRelation;
	}

	public String getCpRelation() {
		return cpRelation;
	}

	public void setCpRelation(String cpRelation) {
		this.cpRelation = cpRelation;
	} 
	
	

}
