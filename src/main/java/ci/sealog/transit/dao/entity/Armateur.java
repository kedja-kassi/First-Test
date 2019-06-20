package ci.sealog.transit.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="armateur")

public class Armateur {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_armateur")
	private Integer idArmateur;


	@Column(name="code_armateur", nullable=false)
	private String codeArmateur;
	
	@Column(name="libelle", nullable=false)
	private String libelle;
	
	@Column(name="contact", nullable=false)
	private String contact;
	
	@Column(name="adresse1")
	private String adresse1;
	
	@Column(name="adresse2")
	private String adresse2;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="fax")
	private String fax;
	
	@Column(name="e_mail", nullable=false)
	private String eMail;
	
	@ManyToOne
	@JoinColumn(name="code_societe", referencedColumnName="code_societe")
	private Societe societe;
	
	
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

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	
	
	
	
	
	
	
	

}
