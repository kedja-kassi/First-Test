package ci.sealog.transit.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="societe")

public class Societe {
	
	@Id
	@Column(name="code_societe",unique=true)
	private String codeSociete;
	
	@Column(name="nom_societe")
	private String nomSociete;
	
	@Column(name="adresse_geo")
	private String adresseGeo;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="responsable")
	private String responsable;
	
	
	@Column(name="contact_responsable")
	private String contactResponsable;
	
	
	public String getCodeSociete() {
		return codeSociete;
	}


	public void setCodeSociete(String codeSociete) {
		this.codeSociete = codeSociete;
	}


	public String getNomSociete() {
		return nomSociete;
	}


	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}


	public String getAdresseGeo() {
		return adresseGeo;
	}


	public void setAdresseGeo(String adresseGeo) {
		this.adresseGeo = adresseGeo;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getResponsable() {
		return responsable;
	}


	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}


	public String getContactResponsable() {
		return contactResponsable;
	}


	public void setContactResponsable(String contactResponsable) {
		this.contactResponsable = contactResponsable;
	}
	
	
	
	
}
