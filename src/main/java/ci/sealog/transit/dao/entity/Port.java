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
@Table(name="port")
public class Port {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_port", nullable=false)
	private Integer idPort;
	
	
	@Column(name="code_port", nullable=false)
	private String codePort;
	
	@Column(name="libelle_port", nullable=false)
	private String libellePort;
	
	@ManyToOne
	@JoinColumn(name="code_societe", referencedColumnName="code_societe")
	private Societe societe;
	
	public Integer getIdPort() {
		return idPort;
	}

	public void setIdPort(Integer idPort) {
		this.idPort = idPort;
	}

	public String getCodePort() {
		return codePort;
	}

	public void setCodePort(String codePort) {
		this.codePort = codePort;
	}

	public String getLibellePort() {
		return libellePort;
	}

	public void setLibellePort(String libellePort) {
		this.libellePort = libellePort;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	
	
	
	
	
	
	
}
