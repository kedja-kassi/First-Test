package ci.sealog.transit.helper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)

public class ArmateurDto {
	
	private Integer idArmateur;
	private String codeArmateur;
	private String libelle;
	private String contact;
	private String adresse1;
	private String adresse2;
	private String telephone;
	private String fax;
	private String eMail;
	private String codeSociete;
	
	public Integer getIdArmateur() {
		return idArmateur;
	}
	public void setIdArmateur(Integer idArmateur) {
		this.idArmateur = idArmateur;
	}
	public String getCodeArmateur() {
		return codeArmateur;
	}
	public void setCodeArmateur(String codeArmateur) {
		this.codeArmateur = codeArmateur;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAdresse1() {
		return adresse1;
	}
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}
	public String getAdresse2() {
		return adresse2;
	}
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getCodeSociete() {
		return codeSociete;
	}
	public void setCodeSociete(String codeSociete) {
		this.codeSociete = codeSociete;
	}
	
	
	
	
	
	
	
	
	
	
	
}
