package soft.mbh.com.JaxbExample.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "infosPers")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonneDTO {
	
	private String nom ; 
	
	private String prenom ; 
	
	@XmlElement(name = "lieuNais")
	private String lieuNaissance ; 
	
	@XmlTransient
	private String paysNaissance ; 
	
	@XmlElement(name="")
	private AdresseDTO adresseFiscal ; 
	
	@XmlElement(name="relation")
	private List<RelationDTO> relations ; 
	

	private PatrimoineDTO patrimoine ;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public String getPaysNaissance() {
		return paysNaissance;
	}

	public void setPaysNaissance(String paysNaissance) {
		this.paysNaissance = paysNaissance;
	}

	public AdresseDTO getAdresseFiscal() {
		return adresseFiscal;
	}

	public void setAdresseFiscal(AdresseDTO adresseFiscal) {
		this.adresseFiscal = adresseFiscal;
	}

	public List<RelationDTO> getRelations() {
		return relations;
	}

	public void setRelations(List<RelationDTO> relations) {
		this.relations = relations;
	}

	public PatrimoineDTO getPatrimoine() {
		return patrimoine;
	}

	public void setPatrimoine(PatrimoineDTO patrimoine) {
		this.patrimoine = patrimoine;
	} 
	
	

}
