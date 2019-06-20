package ci.sealog.transit.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;



@Entity
@Table(name="navire")

public class Navire {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_navire",nullable=false)
	private Integer idNavire;
	
	
	@Column(name="code_navire", nullable=false)
	private String codeNavire;
	
	@Column(name="libelle_navire", nullable=false)
	private String libelleNavire;
	
	@ManyToOne
	@JoinColumn(name="code_arma", referencedColumnName="code_armateur")
	private Armateur armateur;
	
	@ManyToOne
	@JoinColumn(name="port_arr", referencedColumnName="code_port")
	private Port portArr;
	
	
	@ManyToOne
	@JoinColumn(name="port_dep", referencedColumnName="code_port")
	private Port portDep;


	public Integer getIdNavire() {
		return idNavire;
	}


	public void setIdNavire(Integer idNavire) {
		this.idNavire = idNavire;
	}


	public String getCodeNavire() {
		return codeNavire;
	}


	public void setCodeNavire(String codeNavire) {
		this.codeNavire = codeNavire;
	}


	public String getLibelleNavire() {
		return libelleNavire;
	}


	public void setLibelleNavire(String libelleNavire) {
		this.libelleNavire = libelleNavire;
	}


	public Armateur getArmateur() {
		return armateur;
	}


	public void setArmateur(Armateur armateur) {
		this.armateur = armateur;
	}


	public Port getPortArr() {
		return portArr;
	}


	public void setPortArr(Port portArr) {
		this.portArr = portArr;
	}


	public Port getPortDep() {
		return portDep;
	}


	public void setPortDep(Port portDep) {
		this.portDep = portDep;
	}
	
	
	
	
	

	
}
