package ci.sealog.transit.helper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import ci.sealog.transit.dao.entity.Armateur;
import ci.sealog.transit.dao.entity.Port;

@JsonInclude(Include.NON_NULL)

public class NavireDto {

	private Integer idNavire;
	private String codeNavire;
	private String libelleNavire;
	private Armateur armateur;
	private Port portArr;
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
